package com.dxc.mit.iam.service;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

/*
 * Classe gestore di errori personalizzato che implementa ResponseErrorHandler di Spring per intercettare e gestire errori nelle chiamate HTTP fatte con RestTemplate.
 */
@Component
public class SSOResponseErrorHandler implements ResponseErrorHandler {
  public void handleError(ClientHttpResponse response) throws IOException {
    logger.error("Response error: {} {}", response.getStatusCode(), response.getStatusText());
  }

  public boolean hasError(ClientHttpResponse response) throws IOException {
    return false;
  }

  private static final Logger logger = LoggerFactory.getLogger(com.dxc.mit.iam.service.SSOResponseErrorHandler.class);
}