package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta le informazioni sul comune di residenza.
 */
public class ComuneResidenza {

  /*
   * Attributi con il relativi metodi set e get.
   * 
   * codCapCom: Codice del CAP del comune
   * 
   * codIttCom: Codice ISTAT del comune
   * 
   * codIttPro: Codice ISTAT della provincia
   * 
   * codPro: Oggetto che rappresenta la provincia associata
   * 
   * cod_ana_tri: Codice anagrafico tributario del comune
   * 
   * datFinValCom: Data di fine validità del comune
   * 
   * datIniValCom: Data di inizio validità del comune
   * 
   * datUltAgg: Data dell'ultimo aggiornamento del dato
   * 
   * desUffCom: Nome ufficiale del comune
   * 
   * id: Identificativo del comune
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