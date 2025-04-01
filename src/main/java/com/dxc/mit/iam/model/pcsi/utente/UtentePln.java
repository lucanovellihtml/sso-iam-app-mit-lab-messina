package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un utente in un sistema, 
 * con vari attributi relativi alle informazioni dell'utente, 
 * come la data dell'ultimo aggiornamento, il nome 
 * dell'utente, la password, lo stato dell'utente, e un oggetto associato (Tcpi1ipf). 
 */
public class UtentePln {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * datUltAgg: Rappresenta la data dell'ultimo aggiornamento dell'utente
   * 
   * desNomUte: Descrizione del nome dell'utente
   * 
   * flgUteAti: Una flag (segnalazione) che indica se l'utente è attivo,
   * inattivo o ha altre caratteristiche specifiche
   * 
   * password: Memorizza la password dell'utente
   * 
   * prgNodoAdsp: Rappresenta un programma o nodo associato all'utente.
   * 
   * prgUte: Rappresenta un identificativo unico per l'utente.
   * 
   * tcpi1ipf: Un oggetto di tipo Tcpi1ipf, che rappresenta informazioni correlate
   * all'utente
   */
  long datUltAgg;

  String desNomUte;

  String flgUteAti;

  Object password;

  Object prgNodoAdsp;

  int prgUte;

  Tcpi1ipf tcpi1ipf;

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desNomUte")
  public String getDesNomUte() {
    return this.desNomUte;
  }

  public void setDesNomUte(String desNomUte) {
    this.desNomUte = desNomUte;
  }

  @JsonProperty("flgUteAti")
  public String getFlgUteAti() {
    return this.flgUteAti;
  }

  public void setFlgUteAti(String flgUteAti) {
    this.flgUteAti = flgUteAti;
  }

  @JsonProperty("password")
  public Object getPassword() {
    return this.password;
  }

  public void setPassword(Object password) {
    this.password = password;
  }

  @JsonProperty("prgNodoAdsp")
  public Object getPrgNodoAdsp() {
    return this.prgNodoAdsp;
  }

  public void setPrgNodoAdsp(Object prgNodoAdsp) {
    this.prgNodoAdsp = prgNodoAdsp;
  }

  @JsonProperty("prgUte")
  public int getPrgUte() {
    return this.prgUte;
  }

  public void setPrgUte(int prgUte) {
    this.prgUte = prgUte;
  }

  @JsonProperty("tcpi1ipf")
  public Tcpi1ipf getTcpi1ipf() {
    return this.tcpi1ipf;
  }

  public void setTcpi1ipf(Tcpi1ipf tcpi1ipf) {
    this.tcpi1ipf = tcpi1ipf;
  }
}