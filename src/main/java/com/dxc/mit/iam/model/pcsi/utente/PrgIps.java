package com.dxc.mit.iam.model.pcsi.utente;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Classe che rappresenta un'entità con molteplici 
 * attributi legati a un soggetto identificato da un codice IPS.
 */
public class PrgIps {
  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * Dati finanziari e di registrazione:
   * codBic: Codice BIC (Bank Identifier Code)
   * codIban: Codice IBAN
   * codParIvaIps: Partita IVA dell'IPS
   * codNumRgzIps: Numero di registrazione IPS
   * codNumIscAlb: Numero di iscrizione all'albo
   * codProRifAlb: Codice provincia di riferimento per l'albo
   * 
   * Dati amministrativi:
   * codCapRes: Codice CAP di residenza
   * desIndRes: Descrizione dell'indirizzo di residenza
   * desLocEstRes: Descrizione della località estera di residenza
   * desAlbApt: Descrizione dell'albo a cui appartiene
   * desDenIps: Denominazione dell'IPS
   * desRagSocIps: Ragione sociale dell'IPS
   * flgIpsFtz: Flag che indica una particolare condizione dell'IPS
   * 
   * Dati storici:
   * datUltAgg: Data dell'ultimo aggiornamento
   * 
   * Relazioni con altri modelli:
   * codStaEstRes: Oggetto che rappresenta lo stato estero di residenza
   * (CodStaEstRes)
   * prgTipIps: Tipo di IPS (PrgTipIps)
   * ttpi1com: Un altro oggetto (Ttpi1com), probabilmente collegato a una tabella
   * di comuni
   * ttpi1tso: Attributo generico per ulteriori informazioni (tipo Object)
   */
  Object codBic;

  Object codCapRes;

  Object codIban;

  Object codImpTspPer;

  Object codNumCvoIndRes;

  Object codNumIscAlb;

  Object codNumRgzIps;

  String codParIvaIps;

  Object codProRifAlb;

  Object codProRifRgz;

  CodStaEstRes codStaEstRes;

  Object codTpn;

  Object cod_num_fax_ips;

  Object cod_num_tfe_ips;

  long datUltAgg;

  Object desAlbApt;

  String desDenIps;

  Object desIndRes;

  Object desIneIban;

  Object desLocEstRes;

  String desRagSocIps;

  Object des_ind_ema_ctf_ips;

  Object des_ind_ema_ips;

  String flgIpsFtz;

  long prgIps;

  PrgTipIps prgTipIps;

  Ttpi1com ttpi1com;

  Object ttpi1tso;

  @JsonProperty("codBic")
  public Object getCodBic() {
    return this.codBic;
  }

  public void setCodBic(Object codBic) {
    this.codBic = codBic;
  }

  @JsonProperty("codCapRes")
  public Object getCodCapRes() {
    return this.codCapRes;
  }

  public void setCodCapRes(Object codCapRes) {
    this.codCapRes = codCapRes;
  }

  @JsonProperty("codIban")
  public Object getCodIban() {
    return this.codIban;
  }

  public void setCodIban(Object codIban) {
    this.codIban = codIban;
  }

  @JsonProperty("codImpTspPer")
  public Object getCodImpTspPer() {
    return this.codImpTspPer;
  }

  public void setCodImpTspPer(Object codImpTspPer) {
    this.codImpTspPer = codImpTspPer;
  }

  @JsonProperty("codNumCvoIndRes")
  public Object getCodNumCvoIndRes() {
    return this.codNumCvoIndRes;
  }

  public void setCodNumCvoIndRes(Object codNumCvoIndRes) {
    this.codNumCvoIndRes = codNumCvoIndRes;
  }

  @JsonProperty("codNumIscAlb")
  public Object getCodNumIscAlb() {
    return this.codNumIscAlb;
  }

  public void setCodNumIscAlb(Object codNumIscAlb) {
    this.codNumIscAlb = codNumIscAlb;
  }

  @JsonProperty("codNumRgzIps")
  public Object getCodNumRgzIps() {
    return this.codNumRgzIps;
  }

  public void setCodNumRgzIps(Object codNumRgzIps) {
    this.codNumRgzIps = codNumRgzIps;
  }

  @JsonProperty("codParIvaIps")
  public String getCodParIvaIps() {
    return this.codParIvaIps;
  }

  public void setCodParIvaIps(String codParIvaIps) {
    this.codParIvaIps = codParIvaIps;
  }

  @JsonProperty("codProRifAlb")
  public Object getCodProRifAlb() {
    return this.codProRifAlb;
  }

  public void setCodProRifAlb(Object codProRifAlb) {
    this.codProRifAlb = codProRifAlb;
  }

  @JsonProperty("codProRifRgz")
  public Object getCodProRifRgz() {
    return this.codProRifRgz;
  }

  public void setCodProRifRgz(Object codProRifRgz) {
    this.codProRifRgz = codProRifRgz;
  }

  @JsonProperty("codStaEstRes")
  public CodStaEstRes getCodStaEstRes() {
    return this.codStaEstRes;
  }

  public void setCodStaEstRes(CodStaEstRes codStaEstRes) {
    this.codStaEstRes = codStaEstRes;
  }

  @JsonProperty("codTpn")
  public Object getCodTpn() {
    return this.codTpn;
  }

  public void setCodTpn(Object codTpn) {
    this.codTpn = codTpn;
  }

  @JsonProperty("cod_num_fax_ips")
  public Object getCod_num_fax_ips() {
    return this.cod_num_fax_ips;
  }

  public void setCod_num_fax_ips(Object cod_num_fax_ips) {
    this.cod_num_fax_ips = cod_num_fax_ips;
  }

  @JsonProperty("cod_num_tfe_ips")
  public Object getCod_num_tfe_ips() {
    return this.cod_num_tfe_ips;
  }

  public void setCod_num_tfe_ips(Object cod_num_tfe_ips) {
    this.cod_num_tfe_ips = cod_num_tfe_ips;
  }

  @JsonProperty("datUltAgg")
  public long getDatUltAgg() {
    return this.datUltAgg;
  }

  public void setDatUltAgg(long datUltAgg) {
    this.datUltAgg = datUltAgg;
  }

  @JsonProperty("desAlbApt")
  public Object getDesAlbApt() {
    return this.desAlbApt;
  }

  public void setDesAlbApt(Object desAlbApt) {
    this.desAlbApt = desAlbApt;
  }

  @JsonProperty("desDenIps")
  public String getDesDenIps() {
    return this.desDenIps;
  }

  public void setDesDenIps(String desDenIps) {
    this.desDenIps = desDenIps;
  }

  @JsonProperty("desIndRes")
  public Object getDesIndRes() {
    return this.desIndRes;
  }

  public void setDesIndRes(Object desIndRes) {
    this.desIndRes = desIndRes;
  }

  @JsonProperty("desIneIban")
  public Object getDesIneIban() {
    return this.desIneIban;
  }

  public void setDesIneIban(Object desIneIban) {
    this.desIneIban = desIneIban;
  }

  @JsonProperty("desLocEstRes")
  public Object getDesLocEstRes() {
    return this.desLocEstRes;
  }

  public void setDesLocEstRes(Object desLocEstRes) {
    this.desLocEstRes = desLocEstRes;
  }

  @JsonProperty("desRagSocIps")
  public String getDesRagSocIps() {
    return this.desRagSocIps;
  }

  public void setDesRagSocIps(String desRagSocIps) {
    this.desRagSocIps = desRagSocIps;
  }

  @JsonProperty("des_ind_ema_ctf_ips")
  public Object getDes_ind_ema_ctf_ips() {
    return this.des_ind_ema_ctf_ips;
  }

  public void setDes_ind_ema_ctf_ips(Object des_ind_ema_ctf_ips) {
    this.des_ind_ema_ctf_ips = des_ind_ema_ctf_ips;
  }

  @JsonProperty("des_ind_ema_ips")
  public Object getDes_ind_ema_ips() {
    return this.des_ind_ema_ips;
  }

  public void setDes_ind_ema_ips(Object des_ind_ema_ips) {
    this.des_ind_ema_ips = des_ind_ema_ips;
  }

  @JsonProperty("flgIpsFtz")
  public String getFlgIpsFtz() {
    return this.flgIpsFtz;
  }

  public void setFlgIpsFtz(String flgIpsFtz) {
    this.flgIpsFtz = flgIpsFtz;
  }

  @JsonProperty("prgIps")
  public long getPrgIps() {
    return this.prgIps;
  }

  public void setPrgIps(long prgIps) {
    this.prgIps = prgIps;
  }

  @JsonProperty("prgTipIps")
  public PrgTipIps getPrgTipIps() {
    return this.prgTipIps;
  }

  public void setPrgTipIps(PrgTipIps prgTipIps) {
    this.prgTipIps = prgTipIps;
  }

  @JsonProperty("ttpi1com")
  public Ttpi1com getTtpi1com() {
    return this.ttpi1com;
  }

  public void setTtpi1com(Ttpi1com ttpi1com) {
    this.ttpi1com = ttpi1com;
  }

  @JsonProperty("ttpi1tso")
  public Object getTtpi1tso() {
    return this.ttpi1tso;
  }

  public void setTtpi1tso(Object ttpi1tso) {
    this.ttpi1tso = ttpi1tso;
  }
}