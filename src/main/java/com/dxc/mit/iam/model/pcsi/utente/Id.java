package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un'identificativo di un'entità(comune o provincia).
 */
public class Id {
  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * prgIps: Numero progressivo di identificazione
   * 
   * prgMebIps: Numero progressivo di identificazione per membri
   * 
   * codCom: Codice identificativo del comune
   * 
   * codPro: Codice identificativo della provincia
   */
  int prgIps;

  int prgMebIps;

  String codCom;

  String codPro;

  @JsonProperty("prgIps")
  public int getPrgIps() {
    return this.prgIps;
  }

  public void setPrgIps(int prgIps) {
    this.prgIps = prgIps;
  }

  @JsonProperty("prgMebIps")
  public int getPrgMebIps() {
    return this.prgMebIps;
  }

  public void setPrgMebIps(int prgMebIps) {
    this.prgMebIps = prgMebIps;
  }

  @JsonProperty("codCom")
  public String getCodCom() {
    return this.codCom;
  }

  public void setCodCom(String codCom) {
    this.codCom = codCom;
  }

  @JsonProperty("codPro")
  public String getCodPro() {
    return this.codPro;
  }

  public void setCodPro(String codPro) {
    this.codPro = codPro;
  }
}