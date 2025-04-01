package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un'entità relativa a un rapporto di 
 * lavoro o a un contratto lavorativo all'interno di un sistema aziendale.
 */
public class Tcpi1ipf {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codTipRapLav: Identifica il tipo di rapporto di lavoro, ad
   * esempio contratto a tempo determinato, indeterminato, apprendistato ecc.
   * 
   * datScaCtt: Probabile data di scadenza del contratto. È dichiarata
   * come Object, quindi potrebbe essere una data (tipo Date o String) o un valore
   * non ancora definito
   * 
   * datUltAgg: Data dell'ultimo aggiornamento dell'entità in formato
   * timestamp (epoch time)
   * 
   * id: Identificatore univoco dell'entità.
   * 
   * prgIps: Riferimento a un'entità che rappresenta un codice o un
   * identificativo relativo all'IPS (probabilmente un istituto previdenziale o
   * sanitario)
   * 
   * prgPosAna: Rappresenta una posizione anagrafica, che potrebbe
   * contenere dati anagrafici del lavoratore
   * 
   * prgTipRuoAzi: Rappresenta il tipo di ruolo aziendale ricoperto
   * dal lavoratore (es. impiegato, dirigente, operaio)
   */
  CodTipRapLav codTipRapLav;

  Object datScaCtt;

  long datUltAgg;

  Id id;

  PrgIps prgIps;

  PrgPosAna prgPosAna;

  PrgTipRuoAzi prgTipRuoAzi;

  @JsonProperty("codTipRapLav")
  public CodTipRapLav getCodTipRapLav() {
    return this.codTipRapLav;
  }

  public void setCodTipRapLav(CodTipRapLav codTipRapLav) {
    this.codTipRapLav = codTipRapLav;
  }

  @JsonProperty("datScaCtt")
  public Object getDatScaCtt() {
    return this.datScaCtt;
  }

  public void setDatScaCtt(Object datScaCtt) {
    this.datScaCtt = datScaCtt;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("id")
  public Id getId() {
    return this.id;
  }

  public void setId(Id id) {
    this.id = id;
  }

  @JsonProperty("prgIps")
  public PrgIps getPrgIps() {
    return this.prgIps;
  }

  public void setPrgIps(PrgIps prgIps) {
    this.prgIps = prgIps;
  }

  @JsonProperty("prgPosAna")
  public PrgPosAna getPrgPosAna() {
    return this.prgPosAna;
  }

  public void setPrgPosAna(PrgPosAna prgPosAna) {
    this.prgPosAna = prgPosAna;
  }

  @JsonProperty("prgTipRuoAzi")
  public PrgTipRuoAzi getPrgTipRuoAzi() {
    return this.prgTipRuoAzi;
  }

  public void setPrgTipRuoAzi(PrgTipRuoAzi prgTipRuoAzi) {
    this.prgTipRuoAzi = prgTipRuoAzi;
  }
}