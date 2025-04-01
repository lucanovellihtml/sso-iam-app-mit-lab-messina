package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un 
 * tipo di ruolo aziendale in un sistema informatico.
 */
public class PrgTipRuoAzi {

  /*
   * Lista attributi con il relativi metodi set e get.
   * 
   * Dati principali:
   * prgTipRuoAzi: Identificatore univoco del tipo di ruolo aziendale
   * desTipRuoAzi: Descrizione del tipo di ruolo aziendale
   * 
   * Dati amministrativi:
   * datUltAgg: Data dell'ultimo aggiornamento, probabilmente in formato
   * timestamp
   */
  long datUltAgg;

  String desTipRuoAzi;

  int prgTipRuoAzi;

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desTipRuoAzi")
  public String getDesTipRuoAzi() {
    return this.desTipRuoAzi;
  }

  public void setDesTipRuoAzi(String desTipRuoAzi) {
    this.desTipRuoAzi = desTipRuoAzi;
  }

  @JsonProperty("prgTipRuoAzi")
  public int getPrgTipRuoAzi() {
    return this.prgTipRuoAzi;
  }

  public void setPrgTipRuoAzi(int prgTipRuoAzi) {
    this.prgTipRuoAzi = prgTipRuoAzi;
  }
}