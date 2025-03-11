package com.dxc.mit.iam.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.servlet.http.HttpServletRequest;

/*
 * La classe implementa metodi per la creazione e la validazione della url. 
 */
public class URLUtil {

    private static final Logger log = LoggerFactory.getLogger(com.dxc.mit.iam.util.URLUtil.class);

    /**
     * Il metodo ha lo scopo di costruire la url combinando il path della request
     * HTTP e la url di base.
     * 
     * @param request, l'oggetto dell'http request
     * @param baseUrl, url recuperata dal file di configurazione
     * @return la url costruita
     */
    public static String determineTargetUri(HttpServletRequest request, String baseUrl) {
        String context = "/";
        if (request == null)
            request = getCurrentHttpRequest();
        if (request != null)
            context = request.getContextPath();
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(context).path(baseUrl);
        return builder.build().toString();
    }

    /**
     * Il metodo ha lo scopo di recuperare l'oggetto Http request corrente.
     * 
     * @return la request corrente
     */
    private static HttpServletRequest getCurrentHttpRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes instanceof ServletRequestAttributes) {
            HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
            return request;
        }
        return null;
    }

    /**
     * Il metodo ha lo scopo di controllare la validità del formato della url.
     * 
     * @param url,              la url costruita dai metodi della classe
     * @param targetUrlPattern, sintassi di controllo recuperata dal file di
     *                          configurazione
     * @return boolean se la url è valida o no
     */
    public static boolean isValidTargetUrl(String url, String targetUrlPattern) {
        boolean result = false;
        if (StringUtils.hasText(targetUrlPattern))
            try {
                Pattern pattern = Pattern.compile(targetUrlPattern, 2);
                Matcher matcher = pattern.matcher(url);
                result = matcher.matches();
            } catch (PatternSyntaxException e) {
                log.error("Errore sintassi espressione regolare " + targetUrlPattern);
            }
        return result;
    }

}
