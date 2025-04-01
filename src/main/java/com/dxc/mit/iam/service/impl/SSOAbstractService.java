package com.dxc.mit.iam.service.impl;

import com.dxc.mit.iam.service.SSOResponseErrorHandler;
import com.dxc.mit.iam.ws.client.RestClient;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.hc.client5.http.impl.LaxRedirectStrategy;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/*
 * Classe astratta di servizio che fornisce metodi di supporto per la gestione della comunicazione con servizi SSO (Single Sign-On).
 */
public abstract class SSOAbstractService {
  private static final int CONNECTION_TIMEOUT = 30000;

  private static final int READ_TIMEOUT = 30000;

  protected RestClient getRestClient(int connectionTimeout, int readTimeout, boolean followRedirect) {
    HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
    httpRequestFactory.setConnectTimeout(connectionTimeout);
    // httpRequestFactory.setReadTimeout(readTimeout);
    HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
    if (followRedirect)
      httpClientBuilder.setRedirectStrategy(new LaxRedirectStrategy());
    CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
    httpRequestFactory.setHttpClient(closeableHttpClient);
    httpRequestFactory.getHttpClient();

    RestClient restClient = new RestClient((ClientHttpRequestFactory) new BufferingClientHttpRequestFactory(
        (ClientHttpRequestFactory) httpRequestFactory));
    restClient.setErrorHandler((ResponseErrorHandler) new SSOResponseErrorHandler());
    return restClient;
  }

  protected RestClient getRestClient() {
    return getRestClient(false);
  }

  protected RestClient getRestClient(boolean followRedirect) {
    return getRestClient(30000, 30000, followRedirect);
  }

  protected void copyCookieToResponse(ResponseEntity<?> res, boolean simulate) {
    RequestAttributes attr = RequestContextHolder.getRequestAttributes();
    ServletRequestAttributes servletAttr = (ServletRequestAttributes) attr;
    HttpServletResponse response = servletAttr.getResponse();
    for (String s : res.getHeaders().get("Set-Cookie")) {
      if (simulate) {
        String[] hs = s.split(";");
        if (hs != null && hs.length > 0) {
          for (int i = 0; i < hs.length; i++) {
            String h = hs[i];
            String[] c = h.split("=");
            if ("domain".equalsIgnoreCase(c[0].trim()))
              c[1] = "localhost";
            h = String.join("=", (CharSequence[]) c);
            hs[i] = h;
          }
          s = String.join(";", (CharSequence[]) hs);
        }
      }
      response.addHeader("Set-Cookie", s);
    }
  }
}