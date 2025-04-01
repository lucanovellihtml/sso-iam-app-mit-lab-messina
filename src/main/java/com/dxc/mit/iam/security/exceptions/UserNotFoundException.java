package com.dxc.mit.iam.security.exceptions;

/*
 * Classe che estende la gestione dell'eccezione legate alla ricerca dell'utenza.
 */
public class UserNotFoundException extends Exception {
  private static final long serialVersionUID = 8443570436945335662L;

  public UserNotFoundException() {
  }

  /**
   * Costruttore che restituisce il debug completo dell'errore.
   * 
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  /**
   * Costruttore che restituisce il messaggio di errore e la causa.
   * 
   * @param message Messaggio
   * @param cause   Causa
   */
  public UserNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Costruttore che restituisce il messaggio di errore.
   * 
   * @param message Messaggio
   */
  public UserNotFoundException(String message) {
    super(message);
  }

  /**
   * Costruttore che restituisce la causa.
   * 
   * @param cause Causa
   */
  public UserNotFoundException(Throwable cause) {
    super(cause);
  }
}