package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta degli attributi sulla regione.
 */
public class CodIdeReg {

  /*
   * Lista attributo con i relativi metodi get e set.
   * 
   * codIdeReg: codice identificativo della regione
   * 
   * datUltAgg: data dell'ultimo aggiornamento (in formato long, probabilmente
   * timestamp)
   * 
   * desReg: descrizione della regione
   */
  String codIdeReg;

  long datUltAgg;

  String desReg;

  @JsonProperty("codIdeReg")
  public String getCodIdeReg() {
    return this.codIdeReg;
  }

  public void setCodIdeReg(String codIdeReg) {
    this.codIdeReg = codIdeReg;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desReg")
  public String getDesReg() {
    return this.desReg;
  }

  public void setDesReg(String desReg) {
    this.desReg = desReg;
  }
}