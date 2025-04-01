package com.dxc.mit.iam.security.exceptions;

import org.springframework.security.core.AuthenticationException;

/*
 * Classe che estende la gestione dell'eccezione legate all'autenticazione.
 */
public class GenericException extends AuthenticationException {
  private static final long serialVersionUID = 3893366763703031836L;

  /**
   * Costruttore che crea l'eccezione con un messaggio personalizzato.
   * ES ---> throw new GenericException("Errore durante l'autenticazione
   * dell'utente!");
   * 
   * @param msg Messaggio di errore
   */
  public GenericException(String msg) {
    super(msg);
  }

  /**
   * Costruttore che crea l'eccezione con un messaggio personalizzato e l'errore.
   * ES ---> try {
   * throw new Exception("Errore di accesso al database");
   * } catch (Exception e) {
   * throw new GenericException("Autenticazione fallita!", e);
   * }
   * 
   * @param msg Messaggio di errore
   * @param t   Errore originale
   */
  public GenericException(String msg, Throwable t) {
    super(msg, t);
  }
}