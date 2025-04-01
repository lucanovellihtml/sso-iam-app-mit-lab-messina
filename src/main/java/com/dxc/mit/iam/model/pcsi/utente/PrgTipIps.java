package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe rappresenta un modello di dati 
 * che descrive un tipo di "IPS"(entità in un sistema gestionale).
 */
public class PrgTipIps {

  /*
   * Lista attributi con il relativi metodi set e get.
   * 
   * Dati principali:
   * prgTipIps: Identificatore univoco del tipo di IPS
   * desTipIps: Descrizione del tipo di IPS
   * 
   * Dati amministrativi:
   * datUltAgg: Data dell'ultimo aggiornamento, probabilmente in formato
   * timestamp
   * flgRgzAtn: Flag che potrebbe indicare uno stato particolare di
   * registrazione o attivazione (ad es. "S" per attivo, "N" per non attivo)
   */
  long datUltAgg;

  String desTipIps;

  String flgRgzAtn;

  int prgTipIps;

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desTipIps")
  public String getDesTipIps() {
    return this.desTipIps;
  }

  public void setDesTipIps(String desTipIps) {
    this.desTipIps = desTipIps;
  }

  @JsonProperty("flgRgzAtn")
  public String getFlgRgzAtn() {
    return this.flgRgzAtn;
  }

  public void setFlgRgzAtn(String flgRgzAtn) {
    this.flgRgzAtn = flgRgzAtn;
  }

  @JsonProperty("prgTipIps")
  public int getPrgTipIps() {
    return this.prgTipIps;
  }

  public void setPrgTipIps(int prgTipIps) {
    this.prgTipIps = prgTipIps;
  }
}