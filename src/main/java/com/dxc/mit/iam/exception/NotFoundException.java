package com.dxc.mit.iam.exception;

/*
 * NotFoundException è classe che gestisce l'eccezione personalizzata utile per segnalare 
 * che una determinata risorsa non è stata trovata.
 */
public class NotFoundException extends Exception {

  /**
   * Costruttore che accetta come parametro il messaggio di errore.
   * Es ---> throw new NotFoundException("Utente non trovato");
   * 
   * @param s Messaggi di errore
   */
  public NotFoundException(String s) {
    super(s);
  }

  /**
   * Costruttore che accetta come parametro il messaggio di errore con l'errore
   * originale.
   * Es ---> catch (SQLException e) {
   * throw new NotFoundException("Database non trovato", e);
   * }
   * 
   * @param s Messaggio di errore
   * @param t Causa dell'errore originale
   */
  public NotFoundException(String s, Exception t) {
    super(s, t);
  }
}