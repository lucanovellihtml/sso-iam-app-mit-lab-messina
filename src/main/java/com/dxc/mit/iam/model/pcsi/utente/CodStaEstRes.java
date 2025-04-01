package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta le informazioni su uno stato estero di residenza.
 */
public class CodStaEstRes {
  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * Lista attributi con i relativi metodi set e get.
   * 
   * codIsoStaEst: Codice ISO dello Stato estero
   * 
   * codStaEst: Codice identificativo dello Stato estero
   * 
   * cod_ana_tri_sta_est: Codice analitico trimodale dello Stato estero
   * 
   * datUltAgg: Data dell'ultimo aggiornamento
   * 
   * desStaEst: Descrizione dello Stato estero
   * 
   * flgStaCes: Flag per identificare se lo Stato è cessato
   */
  String codIsoStaEst;

  String codStaEst;

  Object cod_ana_tri_sta_est;

  long datUltAgg;

  String desStaEst;

  String flgStaCes;

  @JsonProperty("codIsoStaEst")
  public String getCodIsoStaEst() {
    return this.codIsoStaEst;
  }

  public void setCodIsoStaEst(String codIsoStaEst) {
    this.codIsoStaEst = codIsoStaEst;
  }

  @JsonProperty("codStaEst")
  public String getCodStaEst() {
    return this.codStaEst;
  }

  public void setCodStaEst(String codStaEst) {
    this.codStaEst = codStaEst;
  }

  @JsonProperty("cod_ana_tri_sta_est")
  public Object getCod_ana_tri_sta_est() {
    return this.cod_ana_tri_sta_est;
  }

  public void setCod_ana_tri_sta_est(Object cod_ana_tri_sta_est) {
    this.cod_ana_tri_sta_est = cod_ana_tri_sta_est;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desStaEst")
  public String getDesStaEst() {
    return this.desStaEst;
  }

  public void setDesStaEst(String desStaEst) {
    this.desStaEst = desStaEst;
  }

  @JsonProperty("flgStaCes")
  public String getFlgStaCes() {
    return this.flgStaCes;
  }

  public void setFlgStaCes(String flgStaCes) {
    this.flgStaCes = flgStaCes;
  }
}