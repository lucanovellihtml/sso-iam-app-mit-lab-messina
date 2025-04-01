package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta  le informazioni relative a un codice di provincia o un'entità
 * amministrativa connessa a una regione(codIdeReg).
 */
public class CodPro {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codCapPro: Codice del Capoluogo della Provincia
   * 
   * codIdeReg: Oggetto che rappresenta la regione di appartenenza
   * 
   * codPro: Codice identificativo della provincia
   * 
   * datFinValPro: Data di fine validità della provincia
   * 
   * datIniValCtaMtp: Data di inizio validità per un certo parametro (CTA/MTP)
   * 
   * datIniValPro: Data di inizio validità della provincia
   * 
   * datUltAgg: Data dell'ultimo aggiornamento
   * 
   * desDenCtaMtp: Descrizione dell’entità CTA/MTP
   * 
   * desDenPro: Descrizione della provincia
   * 
   * desSigAut: Sigla dell’autorità che gestisce questa entità
   */
  String codCapPro;

  CodIdeReg codIdeReg;

  String codPro;

  long datFinValPro;

  long datIniValCtaMtp;

  long datIniValPro;

  long datUltAgg;

  String desDenCtaMtp;

  String desDenPro;

  String desSigAut;

  @JsonProperty("codCapPro")
  public String getCodCapPro() {
    return this.codCapPro;
  }

  public void setCodCapPro(String codCapPro) {
    this.codCapPro = codCapPro;
  }

  @JsonProperty("codIdeReg")
  public CodIdeReg getCodIdeReg() {
    return this.codIdeReg;
  }

  public void setCodIdeReg(CodIdeReg codIdeReg) {
    this.codIdeReg = codIdeReg;
  }

  @JsonProperty("codPro")
  public String getCodPro() {
    return this.codPro;
  }

  public void setCodPro(String codPro) {
    this.codPro = codPro;
  }

  @JsonProperty("datFinValPro")
  @JsonIgnore
  public long getDatFinValPro() {
    return this.datFinValPro;
  }

  public void setDatFinValPro(long datFinValPro) {
    this.datFinValPro = datFinValPro;
  }

  @JsonProperty("datIniValCtaMtp")
  @JsonIgnore
  public long getDatIniValCtaMtp() {
    return this.datIniValCtaMtp;
  }

  public void setDatIniValCtaMtp(long datIniValCtaMtp) {
    this.datIniValCtaMtp = datIniValCtaMtp;
  }

  @JsonProperty("datIniValPro")
  public long getDatIniValPro() {
    return this.datIniValPro;
  }

  public void setDatIniValPro(long datIniValPro) {
    this.datIniValPro = datIniValPro;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desDenCtaMtp")
  public String getDesDenCtaMtp() {
    return this.desDenCtaMtp;
  }

  public void setDesDenCtaMtp(String desDenCtaMtp) {
    this.desDenCtaMtp = desDenCtaMtp;
  }

  @JsonProperty("desDenPro")
  public String getDesDenPro() {
    return this.desDenPro;
  }

  public void setDesDenPro(String desDenPro) {
    this.desDenPro = desDenPro;
  }

  @JsonProperty("desSigAut")
  public String getDesSigAut() {
    return this.desSigAut;
  }

  public void setDesSigAut(String desSigAut) {
    this.desSigAut = desSigAut;
  }
}