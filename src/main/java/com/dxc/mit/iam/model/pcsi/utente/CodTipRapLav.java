package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta le informazioni relative a un tipo di rapporto di lavoro.
 */
public class CodTipRapLav {

  /*
   * Lista attributi con il relativi metodi set e get.
   * 
   * codTipRapLav: Codice identificativo del tipo di rapporto di lavoro
   * 
   * datUltAgg: Data dell'ultimo aggiornamento del dato
   * 
   * desTipRapLav: Descrizione del tipo di rapporto di lavoro
   */
  String codTipRapLav;

  long datUltAgg;

  String desTipRapLav;

  @JsonProperty("codTipRapLav")
  public String getCodTipRapLav() {
    return this.codTipRapLav;
  }

  public void setCodTipRapLav(String codTipRapLav) {
    this.codTipRapLav = codTipRapLav;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desTipRapLav")
  public String getDesTipRapLav() {
    return this.desTipRapLav;
  }

  public void setDesTipRapLav(String desTipRapLav) {
    this.desTipRapLav = desTipRapLav;
  }
}