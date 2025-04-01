package com.dxc.mit.iam.ws.client;

import java.io.IOException;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

public class RestClient extends RestTemplate {
  private static final Logger logger = LoggerFactory.getLogger(com.dxc.mit.iam.ws.client.RestClient.class);

  private ClientHttpRequestInterceptor logInterceptor = null;

  public RestClient(ClientHttpRequestFactory requestFactory) {
    super(requestFactory);
    if (logger.isDebugEnabled()) {
      this.logInterceptor = new LogInterceptor();
      getInterceptors().add(this.logInterceptor);
    }
  }

  public RestClient() {
    this((ClientHttpRequestFactory) new BufferingClientHttpRequestFactory(
        (ClientHttpRequestFactory) new SimpleClientHttpRequestFactory()));
  }

  public void setAccessToken(String accessToken) {
    addHeader("Authorization", accessToken);
  }

  public void addHeader(String key, String value) {
    HttpHeaderInterceptor httpHeaderInterceptor = new HttpHeaderInterceptor(key, value);
    getInterceptors().add(httpHeaderInterceptor);
    if (this.logInterceptor != null && getInterceptors().contains(this.logInterceptor)) {
      getInterceptors().remove(this.logInterceptor);
      getInterceptors().add(this.logInterceptor);
    }
  }

  private class HttpHeaderInterceptor implements ClientHttpRequestInterceptor {
    private final String headerName;
    private final String headerValue;

    public HttpHeaderInterceptor(String headerName, String headerValue) {
      this.headerName = headerName;
      this.headerValue = headerValue;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
        throws IOException {
      request.getHeaders().set(headerName, headerValue);
      return execution.execute(request, body);
    }
  }

  private class LogInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
        throws IOException {
      logRequest(request, body);
      ClientHttpResponse response = execution.execute(request, body);
      logResponse(response);
      return response;
    }

    private void logRequest(HttpRequest request, byte[] body) throws IOException {
      if (logger.isDebugEnabled()) {
        logger.debug("=========================== request begin ================================================");
        logger.debug("URI         : {}", request.getURI());
        logger.debug("Method      : {}", request.getMethod());
        logger.debug("Headers     : {}", request.getHeaders());
        logger.debug("Request body: {}", new String(body, "UTF-8"));
        logger.debug("========================== request end ================================================");
      }
    }

    private void logResponse(ClientHttpResponse response) throws IOException {
      if (logger.isDebugEnabled()) {
        logger.debug("============================ response begin ==========================================");
        logger.debug("Status code  : {}", response.getStatusCode());
        logger.debug("Status text  : {}", response.getStatusText());
        logger.debug("Headers      : {}", response.getHeaders());
        if (response.getBody() != null) {
          logger.debug("Response body: {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
        }
        logger.debug("======================= response end =================================================");
      }
    }
  }

}