package com.dxc.mit.iam.controller;

import java.security.Principal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.WebUtils;
import com.dxc.mit.iam.configuration.FreemarkerClassPathTldsLoader;
import com.dxc.mit.iam.model.IdPUserResponse;
import com.dxc.mit.iam.model.IdPUserUpdate;
import com.dxc.mit.iam.model.pcsi.utente.PrgIps;
import com.dxc.mit.iam.model.pcsi.utente.PrgPosAna;
import com.dxc.mit.iam.model.pcsi.utente.Tcpi1ipf;
import com.dxc.mit.iam.model.pcsi.utente.UtentePln;
import com.dxc.mit.iam.util.URLUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializable.Base;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
// @RequestMapping("/custom-login")
public class LoginController extends BaseController {

    @Autowired
    private ObjectMapper objectMapper;

    private static final Logger log = LoggerFactory.getLogger(com.dxc.mit.iam.controller.LoginController.class);

    /*
     * Controller pagina home con i pulsanti spid/spid aziende/cie.
     * Il path di chiamata e la tipologia di chiamata HTTP è definita
     * nell'annotazione @RequestoMapping.
     * 
     */
    @RequestMapping(value = { "/", "/login" }, method = { RequestMethod.GET })
    public ModelAndView loginSpid(Principal p,
            @RequestParam(required = false, name = "${sso.targetUrl.param}") String targetUrl,
            HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();

        log.debug("loginSpid method");

        // Recupero del cookie di sessione
        Cookie cookie = WebUtils.getCookie(request, this.config.getCookieName());
        Cookie cookieJwt = WebUtils.getCookie(request, this.config.getJwtCookieName());

        // Controllo della validità del cookie solo se esiste
        if (cookie != null && cookieJwt == null) {
            log.debug("Found token {}= {}", cookie.getName(), cookie.getValue());

            // TODO verificare che la gestione per l'applicazione IPATENTE serva per il
            // porto di messina
            log.debug("------------ MODIFICA PER IPATENTE - INIZIO ------------");

            // Metodo deprecato "isEmpty", sostituito con ObjectUtilis
            // String gotoParamFromSession =
            // !StringUtils.isEmpty(request.getSession().getAttribute(this.config.getTargetUrlParam()))
            // ? (String)request.getSession().getAttribute(this.config.getTargetUrlParam())
            // : null;

            String gotoParamFromSession = !ObjectUtils
                    .isEmpty(request.getSession().getAttribute(this.config.getTargetUrlParam()))
                            ? (String) request.getSession().getAttribute(this.config.getTargetUrlParam())
                            : null;
            log.debug("gotoParamFromSession: " + gotoParamFromSession);

            if (gotoParamFromSession == null) {
                log.debug("gotoParamFromSession == null");
                log.debug("getForgerockIdpInitiatedUrl: " + this.config.getForgerockIdpInitiatedUrl());
                log.debug("SET IN SESSIONE IL PARAMETRO GOTO STATICO");
                request.getSession().setAttribute(this.config.getTargetUrlParam(), this.config
                        .getForgerockIdpInitiatedUrl());
            }

            log.debug("------------ MODIFICA PER IPATENTE - FINE ------------");
            String goTo = targetUrl;
            if (StringUtils.hasText(goTo)) {
                log.debug("Found goTo {}", goTo);
                if (URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern())) {
                    log.debug("URL VALID");
                    response.setHeader("Location", goTo);
                    response.setStatus(302);
                    return null;
                }
                log.debug("URL NOT VALID");
            }
        }

        // Condizione se il cookie non esiste
        if (StringUtils.hasText(targetUrl)) {
            log.debug("Found goto: " + targetUrl);
            request.getSession().setAttribute(this.config.getTargetUrlParam(), targetUrl);
        }

        if (p != null) {
            log.debug("User already authenticated");
            String goTo = (String) request.getSession().getAttribute(this.config.getTargetUrlParam());
            if (StringUtils.hasText(goTo) && URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern())) {
                log.debug("Redirect to goTo parameter: " + goTo);
                response.setHeader("Location", goTo);
                response.setStatus(302);
                return null;
            }
            if (StringUtils.hasText(this.config.getTargetUrlDefault())) {
                log.debug("Redirect to targetUrlDefault: " + this.config.getTargetUrlDefault());
                response.setHeader("Location", this.config.getTargetUrlDefault());
                response.setStatus(302);
                return null;
            }
            log.debug("Redirect to /authenticated");
            redirect("/authenticated");
        } else {

            log.debug("idpListUrl" + this.config.getIdpListUrl());
            log.debug("spInitiatedBaseUrl" + this.config.getSpInitiatedBaseUrl());
            log.debug("spInitiatedBaseUrlAzienda" + this.config.getSpInitiatedBaseUrlAzienda());

            // Variabile per spid cittadino
            modelAndView.addObject("spInitiatedBaseUrl", this.config.getSpInitiatedBaseUrl());

            // Variabile per spid aziende
            modelAndView.addObject("spInitiatedBaseUrlAzienda", this.config.getSpInitiatedBaseUrlAzienda());

            // Variabile per la list univoca degli idp
            modelAndView.addObject("idpListUrl", this.config.getIdpListUrl());
            modelAndView.setViewName("/sso/login");
        }
        return modelAndView;
    }

    /**
     * Controller che gestisce la logica della fase di post-login.
     * 
     * @param headers  Mappa contenente gli header HTTP inviati dal client
     * @param request  Oggetto che rappresenta la richiesta HTTP
     * @param response Oggetto che rappresenta la risposta HTTP
     * @return La pagina in base alla situazione di login dell'utente
     * @throws ParseException
     * @throws JsonProcessingException
     */
    @RequestMapping(value = { "/postlogin" }, method = { RequestMethod.GET })
    public ModelAndView postLogin(@RequestHeader Map<String, String> headers, HttpServletRequest request,
            HttpServletResponse response) throws ParseException, JsonProcessingException {
        ModelAndView modelAndView = new ModelAndView();

        log.debug("post login method");

        // Recupera la goTo dalla sessione l'URL di destinazione dopo il login (se
        // esiste)
        String goTo = (String) request.getSession().getAttribute(this.config.getTargetUrlParam());
        log.debug("Found goTo parameter: " + goTo);

        /*
         * Controlla se nell'header è presente l'attributo "isfirstaccess" e se è
         * valorizzato, altrimenti di default attributisce il valore a "yes".
         */
        String isFirstAccessHeader = Optional.<String>ofNullable(headers.get(this.config.getHeaderParamNamePostLogin()))
                .orElse("yes");
        log.debug("Found MIMSpostLogin parameter: " + isFirstAccessHeader);

        for (Map.Entry<String, String> entry : headers.entrySet()) {
            log.debug("HEADERS [" + entry.getKey() + ": " + entry.getValue() + "]");
        }

        /*
         * Recupera dati utente dagli header HTTP:
         * 
         * idUtente: Identificativo dell'utente.
         * minAge: Età minima richiesta per accedere.
         * nascitaData: Data di nascita dell'utente.
         * dateFormat: Formato della data di nascita.
         */
        String idUtente = headers.get(this.config.getHeaderParamNameUserId());
        // int minAge = this.config.getMinAge();
        // log.debug("Found minAge parameter: " + minAge);
        // String nascitaData =
        // headers.get(this.config.getHeaderParamNameDataNascita());
        // log.debug("Found nascitaData parameter: " + nascitaData);
        // String dateFormat = this.config.getDataNascitaFormat();
        // log.debug("Found dateFormat parameter: " + minAge);
        log.debug("UTENTE-------------------: " + idUtente);

        /*
         * Controlla se l'ID utente è nullo o vuoto e in caso reindirizza alla pagina di
         * errore.
         * La pagina di errore è settata nella variabile del file yml --->
         * "${sso.pdtRedirectUrl}"
         */
        if (!StringUtils.hasText(idUtente)) {
            modelAndView.setView((View) redirect(this.config.getPdtRedirectUrl(), false));
            return modelAndView;
        }

        /*
         * Controlla se l'utente è maggiorenne e in caso reindirizza alla pagina di
         * errore.
         * La pagina di errore è settata nella variabile del file yml --->
         * "${sso.pdtRedirectUrl}"
         */
        /*
         * if (checkAge(nascitaData, dateFormat, minAge)) {
         * log.debug("age <18");
         * modelAndView.setView((View) redirect(this.config.getPdtRedirectUrl(),
         * false));
         * return modelAndView;
         * }
         */

        /*
         * Vengono recuperati i dati dell'utente attraverso il metodo getIdpUser.
         * Il metodo getIdpUser accetta come parametro la request dell'IDP e l'headers
         * della request, da cui elabora ed estrarre i dati per costruire l'oggetto
         * idpUser.
         * In caso di fallimento viene restituita la pagina di errore
         * "/postlogin/errorLogout".
         */
        IdPUserResponse idpUser = new IdPUserResponse();
        log.debug("Recupero utente su IDP");
        try {
            log.debug("header passata ad utente = " + headers.toString());
            idpUser = getIdpUser(request, headers);
        } catch (Exception e) {
            log.error("Errore su recupero utente = " + e.getCause());
            return getErrorModelAndView(modelAndView, "postlogin.generic.error.message",
                    this.config.getRedirectTimeout(), null, "/postlogin/errorLogout");
        }
        log.debug("Utente recuperato correttamente");

        /*
         * Controlla se l'utente sta già impersonando un altro account.
         * In caso affermativo viene restituita la pagina di errore
         * "/postlogin/errorLogout".
         */
        Boolean isImpersonate = Boolean.valueOf(
                ((List) Optional.<List>ofNullable(idpUser.getIsImpersonate()).orElse(Collections.emptyList())).stream()
                        .anyMatch(y -> ((String) y).equalsIgnoreCase("YES")));
        log.debug("Utente ha gia' sessione di impersonate attiva {}", isImpersonate);
        if (Boolean.TRUE.equals(isImpersonate))
            return getErrorModelAndView(modelAndView, "postlogin.select.profile.error.already-impersonating",
                    this.config
                            .getRedirectTimeout(),
                    this.config.getPdtRedirectUrl(), "/postlogin/errorLogout");
        log.debug("Recupero Matricole attive per l'utente e abilitate all'accesso SPID");

        /*
         * Vengono recuperate le matricole attive per l'utente che ha acceduto.
         * Le matricole vengono recuperate utilizzando il CODICE FISCALE dell'utente che
         * ha acceduto.
         * Se non ci sono matricole attive, viene resettato l'employeeNumber e
         * reindirizzato l'utente alla "/postlogin/logout".
         * In caso di errore viene restituita la pagina di errore
         * "/postlogin/errorLogout".
         */
        List<UtentePln> elencoMatricoleUtentePln = Collections.emptyList();
        try {
            UtentePln utente = new UtentePln();
            utente.setPrgNodoAdsp(new Integer(this.config.getNodoAdsp()));
            utente.setDesNomUte("");
            utente.setTcpi1ipf(new Tcpi1ipf());
            utente.getTcpi1ipf().setPrgPosAna(new PrgPosAna());
            utente.getTcpi1ipf().getPrgPosAna().setCodFisPerFsc(headers.getOrDefault(this.config.getHeaderName(), ""));
            utente.getTcpi1ipf().getPrgPosAna().setDesNomPerFis("");
            utente.getTcpi1ipf().getPrgPosAna().setDesCogPerFis("");
            utente.getTcpi1ipf().setPrgIps(new PrgIps());
            utente.getTcpi1ipf().getPrgIps().setDesDenIps("");
            utente.getTcpi1ipf().getPrgIps().setCodParIvaIps("");
            elencoMatricoleUtentePln = this.userService.findUtentiByCodiceFiscale(utente);
        } catch (Exception e) {
            log.error(e.getMessage());
            return getErrorModelAndView(modelAndView, "postlogin.generic.error.message",
                    this.config.getRedirectTimeout(), null, "/postlogin/errorLogout");
        }
        log.debug("Matricole attive per l'utente e abilitate all'accesso SPID recuperate: {}",
                Integer.valueOf(elencoMatricoleUtentePln.size()));
        if (CollectionUtils.isEmpty(elencoMatricoleUtentePln)) {
            log.debug("Nessuna matricola trovata, resetto per sicurezza l'attributo employeenumber");
            IdPUserUpdate idPUser = new IdPUserUpdate();
            idPUser.setEmployeeNumber(Collections.emptyList());
            try {
                updateIdpUser(idPUser, request, headers);
                log.debug("employeeNumber resettato correttamente");
                modelAndView.addObject("error_msg", "postlogin.generic.error.message");
                modelAndView.setView((View) redirect("/postlogin/logout"));
            } catch (Exception e) {
                log.error(e.getMessage());
                return getErrorModelAndView(modelAndView, "postlogin.generic.error.message",
                        this.config.getRedirectTimeout(), null, "/postlogin/errorLogout");
            }
            modelAndView.addObject("nomeEcognome", getNomeEcognomeUtenteConnesso(headers));
            return modelAndView;
        }
        request.getSession().setAttribute("elencoMatricoleUtente", elencoMatricoleUtentePln);

        /*
         * Controllo l'accettazione della privacy.
         * Se è il primo accesso e quindi isFirstAccessHeader è "yes", allora mostra la
         * pagina di privacy.
         * Altrimenti completa la login(Utente già acceduto in precedenza).
         */
        log.debug("Utente ha gia' accettato la privacy {}", isFirstAccessHeader);
        if ("yes".equalsIgnoreCase(isFirstAccessHeader)) {
            modelAndView.addObject("nomeEcognome", getNomeEcognomeUtenteConnesso(headers));
            modelAndView.setViewName("/postlogin/privacy");
            modelAndView.addObject("logoutTimeout", Integer.valueOf(300000));
        } else {
            modelAndView = acceptPrivacy(headers, request, response);
        }
        return modelAndView;
    }

    /**
     * Controller che gestisce la fase di post accept privacy dell'utente; viene
     * chiamato dopo il login dell'utente quando accetta l'informativa sulla
     * privacy.
     * Dopo l'accettazione, l'utente viene reindirizzato alla selezione del profilo.
     * 
     * @param headers  Mappa che contiene gli header HTTP della richiesta
     * @param request  Oggetto che rappresenta la richiesta HTTP
     * @param response Oggetto che rappresenta la risposta HTTP
     * @return la pagina di selezione dei profili post login
     * @throws JsonProcessingException
     */
    @RequestMapping(value = { "/postlogin/accept-privacy" }, method = { RequestMethod.POST })
    public ModelAndView acceptPrivacy(@RequestHeader Map<String, String> headers, HttpServletRequest request,
            HttpServletResponse response) throws JsonProcessingException {

        ModelAndView modelAndView = new ModelAndView();

        // Memorizzazione nella sessione dell'utente l'attributo privacy a true
        request.getSession().setAttribute("privacy", Boolean.TRUE);

        /*
         * Recupero delle matricole associate all'utente che ha acceduto.
         * Cerca nella sessione la lista delle matricole e controlla se sono presenti,
         * altrimenti restituisce una lista vuota.
         */
        List<UtentePln> elencoMatricoleUtente = Optional
                .<List<UtentePln>>ofNullable(
                        (List<UtentePln>) request.getSession().getAttribute("elencoMatricoleUtente"))
                .orElse(Collections.emptyList());

        /*
         * Costruzione dei dati del modello da passare nella view.
         * L'utente ha un time massimo di 3 minuti d'inattività prima di essere
         * disconnesso dalla sessione.
         */
        modelAndView.addObject("nomeEcognome", getNomeEcognomeUtenteConnesso(headers));
        modelAndView.addObject("elencoMatricoleUtente", this.objectMapper.writeValueAsString(elencoMatricoleUtente));
        modelAndView.setViewName("/postlogin/select-profile");
        modelAndView.addObject("logoutTimeout", Integer.valueOf(180000));
        return modelAndView;
    }

    /**
     * Controller pagina post logout richiamata quando un'utenza, già acceduta,
     * vuole disconnetersi.
     * 
     * @return La pagina di logout
     */
    @RequestMapping(value = { "/postlogout" }, method = { RequestMethod.GET })
    public ModelAndView logout() {
        log.debug("Request logout page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/sso/logout");
        return modelAndView;
    }

    /**
     * Controller pagina logout richiamata quando non viene accettata la privacy
     * durante la creazione dell'utenza spid.
     * 
     * @param headers Mappa che contiene gli header HTTP della richiesta
     * @param request Oggetto che rappresenta la richiesta HTTP ricevuta
     * @param goTo    Parametro della query string opzionale, specifica la URL di
     *                destinazione dopo il logout; il nome del parametro viene preso
     *                dalla variabile nel file yml.
     * @return La pagina di logout
     */
    @RequestMapping(value = { "/postlogin/logout" }, method = { RequestMethod.GET })
    public ModelAndView redirectToLogout(@RequestHeader Map<String, String> headers, HttpServletRequest request,
            @RequestParam(required = false, name = "${sso.targetUrl.param}") String goTo) {
        log.debug("entrato in metodo logout per setting isImpersonate a NO");
        ModelAndView modelAndView = new ModelAndView();

        // Oggetto redirect per reindirizzare l'utente all'endpoint /logout
        RedirectView redirect = new RedirectView("/logout");

        /*
         * Creazione dell'oggetto model IdPUserUpdate per poi richiamare i metodi
         * per settare employeeNumber e impersonate nuovi.
         * Questo oggetto poi verra utilizzato come sostituto all'oggetto stesso
         * presente,ma con i parametri vecchi, nel metodo di aggiornamento
         * updateIdpUser.
         */
        IdPUserUpdate idPUser = new IdPUserUpdate();
        idPUser.setEmployeeNumber(Collections.emptyList());
        idPUser.setIsImpersonate("NO");
        try {
            updateIdpUser(idPUser, request, headers);
            log.debug("employeeNumber resettato correttamente ed isImpersonate settato a NO");
        } catch (Exception e) {
            log.error("ERRORE IN METODO redirectToLogout");
            log.error(e.getMessage());
        }

        /*
         * Indica che la redirezione è relativa al contesto dell'applicazione(true).
         * ES: Se il contesto dell'app è /customlogin, e la redirezione è su /home,
         * l'utente sarà reindirizzato a: http://localhost:8080/customlogin/home
         */
        redirect.setContextRelative(true);

        /*
         * Permette di esporre le variabili di percorso nella URL di redirezione.
         * ES: Se l'URL di redirezione contiene qualcosa come /utente/{id}, allora {id}
         * sarà disponibile come variabile nel modello; allora nel modello potremmo
         * accedere a {id} con il suo valore.
         */
        redirect.setExposePathVariables(true);

        // Permette di mantenere gli attributi dell'oggetto model dopo la redirezione
        redirect.setExposeModelAttributes(true);

        modelAndView.setView((View) redirect);

        /*
         * Se la goTo è null o vuota usa un valore di default preso da
         * this.config.getUndoLogoutRedirectUrl() che è il valore preso dalla variabile
         * del file yml di configurazione ---> "${sso.undoLogoutRedirectUrl}".
         * Altrimenti verrà mantenuto il valore originale della goTo passata come
         * parametro nella richiesta GET.
         * Controlla il formato della goTo attraverso la regola recuperata dalla
         * variabile del file yml di configurazione ---> "${sso.targetUrl.pattern}".
         * Se è valido, il goTo viene aggiunto come attributo al model.
         */
        goTo = Optional.<String>ofNullable(goTo).orElse(this.config.getUndoLogoutRedirectUrl());
        if (URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern()))
            modelAndView.addObject("goto", goTo);

        // log.info("Url modelAndView ---> " + modelAndView.getViewName());

        return modelAndView;
    }

    /**
     * TODO da verificare che sia utilizzata
     * 
     * @param headers Mappa che contiene gli header HTTP della richiesta
     * @param request Oggetto che rappresenta la richiesta HTTP ricevuta
     * @param goTo    Parametro della query string opzionale, specifica la URL di
     *                destinazione dopo il logout; il nome del parametro viene preso
     *                dalla variabile nel file yml.
     * @return La pagina di logout
     */
    @RequestMapping(value = { "/apacs-logout" }, method = { RequestMethod.GET })
    public ModelAndView apacsLogout(@RequestHeader Map<String, String> headers, HttpServletRequest request,
            @RequestParam(required = false, name = "${sso.targetUrl.param}") String goTo) {
        ModelAndView modelAndView = new ModelAndView();
        RedirectView redirect = new RedirectView("/logout");
        IdPUserUpdate idPUser = new IdPUserUpdate();
        idPUser.setEmployeeNumber(Collections.emptyList());
        idPUser.setIsImpersonate("NO");
        try {
            updateIdpUser(idPUser, request, headers);
            log.debug("employeeNumber resettato correttamente ed isImpersonate settato a NO");
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        redirect.setContextRelative(true);
        redirect.setExposePathVariables(true);
        redirect.setExposeModelAttributes(true);
        modelAndView.setView((View) redirect);
        goTo = Optional.<String>ofNullable(goTo).orElse(this.config.getLogoutRedirectUrl());
        if (URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern()))
            modelAndView.addObject("goto", goTo);
        return modelAndView;
    }

    /**
     * Controller che richiama la pagina di errore not-found.
     * 
     * @return la pagina di errore not-found
     */
    @RequestMapping(value = { "/not-found" }, method = { RequestMethod.GET })
    public ModelAndView notFound() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error/not-found");
        return modelAndView;
    }

    @RequestMapping(value = { "/provaselectprofile" }, method = { RequestMethod.GET })
    public ModelAndView provaSelectProfile() {
        ModelAndView modelAndView = new ModelAndView();

        UtentePln utente = new UtentePln();
        UtentePln utenteDue = new UtentePln();

        List<UtentePln> elencoMatricoleUtentePln = Collections.emptyList();

        List<UtentePln> elencoMatricoleUtente = new ArrayList<>();

        utente.setPrgNodoAdsp(new Integer(this.config.getNodoAdsp()));
        utente.setDesNomUte("Mario Bianchi");
        utente.setTcpi1ipf(new Tcpi1ipf());
        utente.getTcpi1ipf().setPrgPosAna(new PrgPosAna());
        utente.getTcpi1ipf().getPrgPosAna().setCodFisPerFsc("BNCMRA00A01F205L");
        utente.getTcpi1ipf().getPrgPosAna().setDesNomPerFis("Mario");
        utente.getTcpi1ipf().getPrgPosAna().setDesCogPerFis("Bianchi");
        utente.getTcpi1ipf().setPrgIps(new PrgIps());
        utente.getTcpi1ipf().getPrgIps().setDesDenIps("");
        utente.getTcpi1ipf().getPrgIps().setCodParIvaIps("12345678901");
        utente.getTcpi1ipf().getPrgIps().setDesRagSocIps("TechNova Solutions S.r.l.");

        utenteDue.setPrgNodoAdsp(new Integer(this.config.getNodoAdsp()));
        utenteDue.setDesNomUte("Mario Rossi");
        utenteDue.setTcpi1ipf(new Tcpi1ipf());
        utenteDue.getTcpi1ipf().setPrgPosAna(new PrgPosAna());
        utenteDue.getTcpi1ipf().getPrgPosAna().setCodFisPerFsc("RSSMRA00A01F205F");
        utenteDue.getTcpi1ipf().getPrgPosAna().setDesNomPerFis("Mario");
        utenteDue.getTcpi1ipf().getPrgPosAna().setDesCogPerFis("Rossi");
        utenteDue.getTcpi1ipf().setPrgIps(new PrgIps());
        utenteDue.getTcpi1ipf().getPrgIps().setDesDenIps("");
        utenteDue.getTcpi1ipf().getPrgIps().setCodParIvaIps("12345678902");
        utenteDue.getTcpi1ipf().getPrgIps().setDesRagSocIps("Vantea Solutions S.r.l.");

        elencoMatricoleUtente.add(utente);
        elencoMatricoleUtente.add(utenteDue);

        if (elencoMatricoleUtente.size() > 0)
            elencoMatricoleUtentePln = elencoMatricoleUtente;

        try {
            if (!CollectionUtils.isEmpty(elencoMatricoleUtentePln)) {
                modelAndView.addObject("elencoMatricoleUtente",
                        this.objectMapper.writeValueAsString(elencoMatricoleUtentePln));
            }
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        modelAndView.setViewName("/postlogin/select-profile");
        return modelAndView;
    }

    @RequestMapping(value = { "/provaprivacy" }, method = { RequestMethod.GET })
    public ModelAndView provaPrivacy() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/postlogin/privacy");
        return modelAndView;
    }

    @RequestMapping(value = { "/provaerrorlogout" }, method = RequestMethod.GET)
    public ModelAndView provaErrorLogout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error_msg", "postlogin.generic.error.message");
        modelAndView.setViewName("/postlogin/errorLogout");
        return modelAndView;
    }

    /**
     * Metodo che recupera il nome e cognome dell'utente dai valori degli header
     * HTTP e li formatta in una stringa.
     * 
     * @param headers Mappa che contiene gli header HTTP ricevuti nella richiesta
     * @return la stringa nome e cognome dell'utente connesso
     */
    private String getNomeEcognomeUtenteConnesso(Map<String, String> headers) {
        /*
         * Recupero dall'header,attraverso l'attrivbuto apacs-name e apacs-surname, il
         * nome e cognome dell'utente
         * connession, altrimenti se non sono presenti restituisce una stringa vuota.
         * La stringa viene formattata e restituita.
         */
        return String.format("%s %s",
                new Object[] { headers.getOrDefault("apacs-name", ""), headers.getOrDefault("apacs-surname", "") })
                .trim();
    }

}
