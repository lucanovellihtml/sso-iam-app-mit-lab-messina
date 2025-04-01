package com.dxc.mit.iam.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * Classe che rappresenta la risposta a un'operazione di autenticazione.
 */
// Indica che eventuali proprietà sconosciute nel JSON ricevuto saranno ignorate
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticateResponse {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * tokenId: il token generato per l'utente autenticato.
   * 
   * successUrl: un'eventuale URL a cui reindirizzare l'utente dopo
   * l'autenticazione.
   * 
   * realm: il contesto o dominio di autenticazione (es. "IAM", "Admin", "User").
   * 
   * code: codice di stato che rappresenta il risultato dell'autenticazione (es.
   * "200" per successo, "401" per accesso negato).
   * 
   * reason: motivazione del codice di stato (es. "Invalid credentials" se
   * l'accesso fallisce).
   * 
   * message: messaggio dettagliato associato alla risposta.
   */
  private String tokenId;

  private String successUrl;

  private String realm;

  private String code;

  private String reason;

  private String message;

  public String getTokenId() {
    return this.tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public String getSuccessUrl() {
    return this.successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public String getRealm() {
    return this.realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}