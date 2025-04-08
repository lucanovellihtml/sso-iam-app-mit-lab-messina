package com.dxc.mit.iam.service.impl;

import com.dxc.mit.iam.configuration.SSOConfiguration;
import com.dxc.mit.iam.model.AuthenticateResponse;
import com.dxc.mit.iam.model.IdPUserResponse;
import com.dxc.mit.iam.model.IdPUserUpdate;
import com.dxc.mit.iam.model.TokenRequest;
import com.dxc.mit.iam.model.msutenze.AggiornaDataUltimaConnessioneRequest;
import com.dxc.mit.iam.model.msutenze.DettaglioUtente;
import com.dxc.mit.iam.model.pcsi.utente.UtentePln;
import com.dxc.mit.iam.security.exceptions.GenericException;
import com.dxc.mit.iam.service.UserService;
import com.dxc.mit.iam.util.TokenSingleton;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

/*
 * La classe UserServiceImpl estende SSOAbstractService e implementa UserService.
 * 
 * Fornisce metodi per: 
 *  - Gestire utenti in un Identity Provider (IdP) → Recupero e aggiornamento degli utenti;
 *  - Autenticare e gestire sessioni con il provider ForgeRock;
 *  - Ottenere informazioni sugli utenti in base al codice fiscale;
 *  - Aggiornare la data dell'ultimo accesso di un utente;
 */
@Service
public class UserServiceImpl extends SSOAbstractService implements UserService {
  @Autowired
  SSOConfiguration config;

  @Autowired
  ObjectMapper objectMapper;

  @Autowired
  RestTemplate restTemplate;

  private static final Logger log = LoggerFactory.getLogger(com.dxc.mit.iam.service.impl.UserServiceImpl.class);

  public void updateIdPUser(String uid, IdPUserUpdate userToUdpate) {
    String method = "[updateIdPUser]::";
    String token = authenticate();
    try {
      String url = this.config.getForgerockBaseUrl() + "/json/realms/idpusers/users/"
          + uid;
      String json = this.objectMapper.writeValueAsString(userToUdpate);
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      headers.set(this.config.getCookieName(), token);
      headers.set("Accept-API-Version", "protocol=2.1,resource=3.0");
      headers.set("If-Match", "*");
      HttpEntity<String> request = new HttpEntity(json, (MultiValueMap) headers);
      log.debug(method + "chiamata update idp user con token : " + token);
      log.debug(method + "[" + json + "]");
      ResponseEntity<String> responseEntity = this.restTemplate.exchange(url, HttpMethod.PUT, request, String.class,
          new Object[0]);
      if (responseEntity.getStatusCode() != HttpStatus.OK) {
        log.error(method + "errore chiamata update idp user con token : " + token);
        log.error(method + (String) responseEntity.getBody());
      }
    } catch (Exception e) {
      log.error(method + "errore chiamata update ido user con token : " + token);
      log.error(method + e.getMessage());
    }
  }

  public IdPUserResponse getIdPUser(String uid) {
    String method = "[getIdpUser]::";
    IdPUserResponse idPUserResponse = null;
    String token = authenticate();
    try {
      String url = this.config.getForgerockBaseUrl() + "/json/realms/idpusers/users/"
          + uid;
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      headers.set(this.config.getCookieName(), token);
      headers.set("Accept-API-Version", "protocol=2.1,resource=3.0");
      HttpEntity<String> request = new HttpEntity((MultiValueMap) headers);
      idPUserResponse = (IdPUserResponse) this.restTemplate
          .exchange(url, HttpMethod.GET, request, IdPUserResponse.class, new Object[0]).getBody();
    } catch (Exception e) {
      log.error(method + "Errore getUser=" + e.getCause(), e);
    }
    return idPUserResponse;
  }

  // TODO da ricontrollare il funzionamento
  public List<DettaglioUtente> getSedeOperativaUtenteByCodiceFiscale(String cf) {
    ResponseEntity<List<DettaglioUtente>> response = null;
    List<DettaglioUtente> result = Collections.emptyList();
    String url = String.format("%s?codiceFiscale=%s&statoUtente=A&abilitazioneAccessoSpid=S&abilitazioneAccessoSpid=H",
        new Object[] { this.config.getElencoSediUtenteUrl(), cf });
    log.debug("CHIAMATA PER RECUPERO MATRICOLE" + url);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.set("Content-Type", "application/json");
    headers.set("uid", "SYSTEM_DT");
    HttpEntity<String> request = new HttpEntity(null, (MultiValueMap) headers);
    if (StringUtils.hasText(cf)) {
      try {
        response = this.restTemplate.exchange(url, HttpMethod.GET, request, (ParameterizedTypeReference) new Object(),
            new Object[0]);
        result = (List<DettaglioUtente>) ((List) response.getBody()).stream()
            .filter(x -> ((DettaglioUtente) x).getClasseDiUtenza().getContestiApplicativi().stream().anyMatch(null))
            .collect(Collectors.toList());
      } catch (org.springframework.web.client.HttpClientErrorException.NotFound e) {
        log.error(String.format("Nessuna matricola attiva abilitata all'accesso con SPID per il codice fiscale %s",
            new Object[] { cf }));
      } catch (Exception e) {
        log.error(e.getMessage(), e);
        throw new GenericException("errore", e);
      }
    } else {
      log.error(String.format("Codice Fiscale non valorizzato", new Object[] { cf }));
    }
    return result;
  }

  public String authenticate() {
    String method = "[authenticate]::";
    try {
      log.debug(method + "token singleton=" + TokenSingleton.getToken());
      log.debug(method + "token singleton valid session=" + isSessionValid(TokenSingleton.getToken()));
      if (TokenSingleton.getToken() == null || !isSessionValid(TokenSingleton.getToken())) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-OpenAM-Username", this.config.getForgerockAdminUsername());
        headers.set("X-OpenAM-Password", this.config.getForgerockAdminPassword());
        headers.set("Accept-API-Version", "resource=2.0");
        HttpEntity<String> request = new HttpEntity((MultiValueMap) headers);
        log.debug(method + "start authenticate idp: " + this.config.getForgerockAdminAuthenticate());
        ResponseEntity<AuthenticateResponse> responseEntity = this.restTemplate.exchange(
            this.config.getForgerockAdminAuthenticate(), HttpMethod.POST, request, AuthenticateResponse.class,
            new Object[0]);
        String token = ((AuthenticateResponse) responseEntity.getBody()).getTokenId();
        TokenSingleton.setToken(token);
        log.debug(method + "end authenticate idp: " + this.config.getForgerockAdminAuthenticate());
        log.debug(method + "token di autenticazione=" + token);
        return token;
      }
      return TokenSingleton.getToken();
    } catch (HttpStatusCodeException ex) {
      log.debug(method + "error authenticate idp: " + ex.getStatusCode() + " " + ex.getMessage());
      return TokenSingleton.getToken();
    } catch (Exception e) {
      log.error(method + "" + e + " " + e);
      throw new GenericException(
          method + "Impossibile contattare l'url: " + this.config.getForgerockAdminAuthenticate() + e);
    }
  }

  private boolean isSessionValid(String token) {
    try {
      TokenRequest tokenRequest = new TokenRequest();
      tokenRequest.setTokenId(token);
      String json = this.objectMapper.writeValueAsString(tokenRequest);
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      headers.set("Accept-API-Version", "protocol=2.1,resource=3.0");
      headers.set(this.config.getCookieName(), token);
      HttpEntity<String> request = new HttpEntity(json, (MultiValueMap) headers);
      ResponseEntity<String> responseEntity = this.restTemplate.exchange(this.config
          .getForgerockBaseUrl() + "/json/realms/root/realms/idpusers/sessions?_action=validate", HttpMethod.POST,
          request, String.class, new Object[0]);
      log.error((String) responseEntity.getBody());
      if (((String) responseEntity.getBody()).contains("false")) {
        log.error("sessione non valida pe ril token: " + token);
        return false;
      }
      log.error("sessione valida pe ril token: " + token);
      return true;
    } catch (HttpStatusCodeException ex) {
      log.error("" + ex.getStatusCode() + " " + ex.getStatusCode());
      log.error("errore servizio verifica sessione : " + token);
      return false;
    } catch (Exception e) {
      log.error("" + e + " " + e);
      throw new GenericException("Impossibile contattare l'url: " + this.config.getForgerockAdminAuthenticate() + e);
    }
  }

  public void updateLastLogin(String idUtente, AggiornaDataUltimaConnessioneRequest payload) {
    ResponseEntity<Void> response = null;
    String url = this.config.getAggiornaDataUltimaConnessioneUrl();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.set("Content-Type", "application/json");
    headers.set("uid", "SYSTEM_DT");
    HttpEntity<AggiornaDataUltimaConnessioneRequest> request = new HttpEntity(payload, (MultiValueMap) headers);
    try {
      response = this.restTemplate.exchange(url, HttpMethod.POST, request, Void.class, new Object[0]);
    } catch (Exception e) {
      log.error(e.getMessage(), e);
    }
  }

  public List<UtentePln> findUtentiByCodiceFiscale(UtentePln utente) {
    String method = "[findUtentiByCodiceFiscale]::";
    ResponseEntity<List<UtentePln>> response = null;
    List<UtentePln> result = Collections.emptyList();
    String url = this.config.getElencoSediUtenteUrl();
    ObjectMapper mapper = new ObjectMapper();
    log.debug(method + "CHIAMATA PER RECUPERO MATRICOLE: " + url);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.set("Content-Type", "application/json");
    try {
      HttpEntity<String> request = new HttpEntity(mapper.writeValueAsString(utente), (MultiValueMap) headers);
      log.debug(method + "REQUEST:------------------------- " + request);
      result = Arrays
          .asList((UtentePln[]) this.restTemplate.postForObject(url, request, UtentePln[].class, new Object[0]));
    } catch (org.springframework.web.client.HttpClientErrorException.NotFound e) {
      log.error(String.format(method
          + "Nessuna matricola attiva abilitata all'accesso con SPID per la ricerca",
          new Object[] { utente.toString() }));
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new GenericException(method + "errore", e);
    }
    return result;
  }
}