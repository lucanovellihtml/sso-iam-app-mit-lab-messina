package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un'entità correlata a un comune, 
 * probabilmente nell'ambito di un sistema che gestisce 
 * informazioni anagrafiche o di localizzazione. 
 */
public class Ttpi1com {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codCapCom: Rappresenta il codice CAP (Codice di Avviamento Postale)
   * del comune
   * 
   * codIttCom: Identifica un codice specifico per il comune,
   * probabilmente legato a un sistema di codifica interna
   * 
   * codIttPro: Rappresenta un codice relativo alla provincia associata
   * al comune
   * 
   * codPro: Oggetto che rappresenta ulteriori dettagli sulla provincia,
   * probabilmente contiene il codice e la descrizione della provincia
   * 
   * cod_ana_tri: Un codice, probabilmente un identificativo per
   * l'anagrafe tributaria del comune
   * 
   * datFinValCom: La data di fine validità del comune, rappresentata in
   * formato timestamp
   * 
   * datIniValCom: La data di inizio validità del comune, anch'essa
   * rappresentata come timestamp
   * 
   * datUltAgg: Data dell'ultimo aggiornamento dell'entità, in formato
   * timestamp
   * 
   * desUffCom: Descrizione dell'ufficio comunale (ad esempio,
   * "Anagrafe", "Tributi")
   * 
   * id: Un identificatore univoco per l'entità, rappresentato da un oggetto
   * di tipo Id
   */
  String codCapCom;

  String codIttCom;

  String codIttPro;

  CodPro codPro;

  String cod_ana_tri;

  long datFinValCom;

  long datIniValCom;

  long datUltAgg;

  String desUffCom;

  Id id;

  @JsonProperty("codCapCom")
  public String getCodCapCom() {
    return this.codCapCom;
  }

  public void setCodCapCom(String codCapCom) {
    this.codCapCom = codCapCom;
  }

  @JsonProperty("codIttCom")
  public String getCodIttCom() {
    return this.codIttCom;
  }

  public void setCodIttCom(String codIttCom) {
    this.codIttCom = codIttCom;
  }

  @JsonProperty("codIttPro")
  public String getCodIttPro() {
    return this.codIttPro;
  }

  public void setCodIttPro(String codIttPro) {
    this.codIttPro = codIttPro;
  }

  @JsonProperty("codPro")
  public CodPro getCodPro() {
    return this.codPro;
  }

  public void setCodPro(CodPro codPro) {
    this.codPro = codPro;
  }

  @JsonProperty("cod_ana_tri")
  public String getCod_ana_tri() {
    return this.cod_ana_tri;
  }

  public void setCod_ana_tri(String cod_ana_tri) {
    this.cod_ana_tri = cod_ana_tri;
  }

  @JsonProperty("datFinValCom")
  public long getDatFinValCom() {
    return this.datFinValCom;
  }

  public void setDatFinValCom(long datFinValCom) {
    this.datFinValCom = datFinValCom;
  }

  @JsonProperty("datIniValCom")
  public long getDatIniValCom() {
    return this.datIniValCom;
  }

  public void setDatIniValCom(long datIniValCom) {
    this.datIniValCom = datIniValCom;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desUffCom")
  public String getDesUffCom() {
    return this.desUffCom;
  }

  public void setDesUffCom(String desUffCom) {
    this.desUffCom = desUffCom;
  }

  @JsonProperty("id")
  public Id getId() {
    return this.id;
  }

  public void setId(Id id) {
    this.id = id;
  }
}