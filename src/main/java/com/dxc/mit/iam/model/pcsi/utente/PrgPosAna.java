package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un'entità che memorizza informazioni anagrafiche di una 
 * persona fisica, inclusi dati di nascita, residenza, e documentazione.
 */
public class PrgPosAna {

  /*
   * Lista attributo con il relativi metodi set e get.
   * 
   * Dati di identificazione
   * prgPosAna: Progressivo della posizione anagrafica, probabilmente un
   * identificativo univoco.
   * codFisPerFsc: Codice fiscale della persona fisica
   * flgSex: Indica il sesso della persona (ad es. "M" o "F")
   * 
   * Dati di nascita
   * datNas: Data di nascita, probabilmente in formato timestamp
   * codStaEstNas: Stato estero di nascita (se applicabile)
   * desLocNasEst: Descrizione della località di nascita all'estero
   * comuneNascita: Comune di nascita della persona (oggetto
   * separato con dettagli sul comune)
   * 
   * Dati di residenza:
   * codCapRes: Codice di avviamento postale della residenza
   * desIndRes: Indirizzo di residenza
   * codNumCvoIndRes: Numero civico dell'indirizzo di residenza
   * codTpnIndRes: Tipologia dell’indirizzo di residenza
   * comuneResidenza: Comune di residenza della persona
   * 
   * Dati amministrativi e documentazione:
   * presenzaDocumenti: Indica se sono presenti documenti per questa
   * persona
   * datUltAgg: Data dell'ultimo aggiornamento dei dati
   * 
   * Dati anagrafici generali:
   * desCogPerFis: Cognome della persona fisica
   * desNomPerFis: Nome della persona fisica
   */
  String codCapRes;

  String codFisPerFsc;

  Object codNumCvoIndRes;

  CodStaEstNas codStaEstNas;

  Object codTpnIndRes;

  ComuneNascita comuneNascita;

  ComuneResidenza comuneResidenza;

  long datNas;

  long datUltAgg;

  String desCogPerFis;

  String desIndRes;

  Object desLocNasEst;

  String desNomPerFis;

  String flgSex;

  int prgPosAna;

  Boolean presenzaDocumenti;

  @JsonProperty("codCapRes")
  public String getCodCapRes() {
    return this.codCapRes;
  }

  public void setCodCapRes(String codCapRes) {
    this.codCapRes = codCapRes;
  }

  @JsonProperty("codFisPerFsc")
  public String getCodFisPerFsc() {
    return this.codFisPerFsc;
  }

  public void setCodFisPerFsc(String codFisPerFsc) {
    this.codFisPerFsc = codFisPerFsc;
  }

  @JsonProperty("codNumCvoIndRes")
  public Object getCodNumCvoIndRes() {
    return this.codNumCvoIndRes;
  }

  public void setCodNumCvoIndRes(Object codNumCvoIndRes) {
    this.codNumCvoIndRes = codNumCvoIndRes;
  }

  @JsonProperty("codStaEstNas")
  public CodStaEstNas getCodStaEstNas() {
    return this.codStaEstNas;
  }

  public void setCodStaEstNas(CodStaEstNas codStaEstNas) {
    this.codStaEstNas = codStaEstNas;
  }

  @JsonProperty("codTpnIndRes")
  public Object getCodTpnIndRes() {
    return this.codTpnIndRes;
  }

  public void setCodTpnIndRes(Object codTpnIndRes) {
    this.codTpnIndRes = codTpnIndRes;
  }

  @JsonProperty("comuneNascita")
  public ComuneNascita getComuneNascita() {
    return this.comuneNascita;
  }

  public void setComuneNascita(ComuneNascita comuneNascita) {
    this.comuneNascita = comuneNascita;
  }

  @JsonProperty("comuneResidenza")
  public ComuneResidenza getComuneResidenza() {
    return this.comuneResidenza;
  }

  public void setComuneResidenza(ComuneResidenza comuneResidenza) {
    this.comuneResidenza = comuneResidenza;
  }

  @JsonProperty("datNas")
  public long getDatNas() {
    return this.datNas;
  }

  public void setDatNas(long datNas) {
    this.datNas = datNas;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desCogPerFis")
  public String getDesCogPerFis() {
    return this.desCogPerFis;
  }

  public void setDesCogPerFis(String desCogPerFis) {
    this.desCogPerFis = desCogPerFis;
  }

  @JsonProperty("desIndRes")
  public String getDesIndRes() {
    return this.desIndRes;
  }

  public void setDesIndRes(String desIndRes) {
    this.desIndRes = desIndRes;
  }

  @JsonProperty("desLocNasEst")
  public Object getDesLocNasEst() {
    return this.desLocNasEst;
  }

  public void setDesLocNasEst(Object desLocNasEst) {
    this.desLocNasEst = desLocNasEst;
  }

  @JsonProperty("desNomPerFis")
  public String getDesNomPerFis() {
    return this.desNomPerFis;
  }

  public void setDesNomPerFis(String desNomPerFis) {
    this.desNomPerFis = desNomPerFis;
  }

  @JsonProperty("flgSex")
  public String getFlgSex() {
    return this.flgSex;
  }

  public void setFlgSex(String flgSex) {
    this.flgSex = flgSex;
  }

  @JsonProperty("prgPosAna")
  public int getPrgPosAna() {
    return this.prgPosAna;
  }

  public void setPrgPosAna(int prgPosAna) {
    this.prgPosAna = prgPosAna;
  }

  @JsonProperty("presenzaDocumenti")
  public Boolean getPresenzaDocumenti() {
    return this.presenzaDocumenti;
  }

  public void setPresenzaDocumenti(Boolean presenzaDocumenti) {
    this.presenzaDocumenti = presenzaDocumenti;
  }
}