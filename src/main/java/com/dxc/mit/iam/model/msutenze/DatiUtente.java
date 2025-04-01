package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

/*
 * Classe che rappresenta le informazioni relative a
 * un singolo utente all'interno di un sistema.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DatiUtente implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
   * Lista di attributi con i relativi metodi set e get.
   * 
   * progressivoUtente: Il codice identificativo progressivo dell'utente, che
   * rappresenta l'ID unico
   * di un utente nel sistema.
   * 
   * statoUtente: Stato dell'utente, come ad esempio attivo o sospeso
   * 
   * dataSospensioneUtente: La data in cui l'utente è stato sospeso, se
   * applicabile. Questo campo è utile
   * per tracciare quando un utente è stato disabilitato
   * 
   * codiceMatricolaUtenteInterno: Un codice identificativo interno specifico per
   * l'utente, che potrebbe essere
   * usato per riferirsi all'utente in sistemi aziendali o HR
   * 
   * dataUltimaConnessione: La data dell'ultima connessione dell'utente al
   * sistema, che può essere utile
   * per monitorare l'attività dell'utente
   * 
   * emailUtente: L'email dell'utente, utilizzata per la comunicazione tramite il
   * sistema
   * 
   * emailPecUtente: L'email PEC (Posta Elettronica Certificata) dell'utente, che
   * è una forma di
   * comunicazione ufficiale in Italia
   * 
   * denominazioneUtente: Il nome o la denominazione dell'utente, utilizzato per
   * identificare l'utente
   * in modo più leggibile o formale
   */
  private String progressivoUtente;

  private String statoUtente;

  private String dataSospensioneUtente;

  private String codiceMatricolaUtenteInterno;

  private String dataUltimaConnessione;

  private String emailUtente;

  private String emailPecUtente;

  private String denominazioneUtente;

  public com.dxc.mit.iam.model.msutenze.DatiUtente progressivoUtente(String progressivoUtente) {
    this.progressivoUtente = progressivoUtente;
    return this;
  }

  @JsonProperty("progressivoUtente")
  public String getProgressivoUtente() {
    return this.progressivoUtente;
  }

  public void setProgressivoUtente(String progressivoUtente) {
    this.progressivoUtente = progressivoUtente;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente statoUtente(String statoUtente) {
    this.statoUtente = statoUtente;
    return this;
  }

  @JsonProperty("statoUtente")
  public String getStatoUtente() {
    return this.statoUtente;
  }

  public void setStatoUtente(String statoUtente) {
    this.statoUtente = statoUtente;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente dataSospensioneUtente(String dataSospensioneUtente) {
    this.dataSospensioneUtente = dataSospensioneUtente;
    return this;
  }

  @JsonProperty("dataSospensioneUtente")
  public String getDataSospensioneUtente() {
    return this.dataSospensioneUtente;
  }

  public void setDataSospensioneUtente(String dataSospensioneUtente) {
    this.dataSospensioneUtente = dataSospensioneUtente;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente codiceMatricolaUtenteInterno(String codiceMatricolaUtenteInterno) {
    this.codiceMatricolaUtenteInterno = codiceMatricolaUtenteInterno;
    return this;
  }

  @JsonProperty("codiceMatricolaUtenteInterno")
  public String getCodiceMatricolaUtenteInterno() {
    return this.codiceMatricolaUtenteInterno;
  }

  public void setCodiceMatricolaUtenteInterno(String codiceMatricolaUtenteInterno) {
    this.codiceMatricolaUtenteInterno = codiceMatricolaUtenteInterno;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente dataUltimaConnessione(String dataUltimaConnessione) {
    this.dataUltimaConnessione = dataUltimaConnessione;
    return this;
  }

  @JsonProperty("dataUltimaConnessione")
  public String getDataUltimaConnessione() {
    return this.dataUltimaConnessione;
  }

  public void setDataUltimaConnessione(String dataUltimaConnessione) {
    this.dataUltimaConnessione = dataUltimaConnessione;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente emailUtente(String emailUtente) {
    this.emailUtente = emailUtente;
    return this;
  }

  @JsonProperty("emailUtente")
  public String getEmailUtente() {
    return this.emailUtente;
  }

  public void setEmailUtente(String emailUtente) {
    this.emailUtente = emailUtente;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente emailPecUtente(String emailPecUtente) {
    this.emailPecUtente = emailPecUtente;
    return this;
  }

  @JsonProperty("emailPecUtente")
  public String getEmailPecUtente() {
    return this.emailPecUtente;
  }

  public void setEmailPecUtente(String emailPecUtente) {
    this.emailPecUtente = emailPecUtente;
  }

  public com.dxc.mit.iam.model.msutenze.DatiUtente denominazioneUtente(String denominazioneUtente) {
    this.denominazioneUtente = denominazioneUtente;
    return this;
  }

  @JsonProperty("denominazioneUtente")
  public String getDenominazioneUtente() {
    return this.denominazioneUtente;
  }

  public void setDenominazioneUtente(String denominazioneUtente) {
    this.denominazioneUtente = denominazioneUtente;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.DatiUtente datiUtente = (com.dxc.mit.iam.model.msutenze.DatiUtente) o;
    return (Objects.equals(this.progressivoUtente, datiUtente.progressivoUtente) &&
        Objects.equals(this.statoUtente, datiUtente.statoUtente) &&
        Objects.equals(this.dataSospensioneUtente, datiUtente.dataSospensioneUtente) &&
        Objects.equals(this.codiceMatricolaUtenteInterno, datiUtente.codiceMatricolaUtenteInterno) &&
        Objects.equals(this.dataUltimaConnessione, datiUtente.dataUltimaConnessione) &&
        Objects.equals(this.emailUtente, datiUtente.emailUtente) &&
        Objects.equals(this.emailPecUtente, datiUtente.emailPecUtente) &&
        Objects.equals(this.denominazioneUtente, datiUtente.denominazioneUtente));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.progressivoUtente, this.statoUtente, this.dataSospensioneUtente,
        this.codiceMatricolaUtenteInterno, this.dataUltimaConnessione, this.emailUtente, this.emailPecUtente,
        this.denominazioneUtente });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiUtente {\n");
    sb.append("    progressivoUtente: ").append(toIndentedString(this.progressivoUtente)).append("\n");
    sb.append("    statoUtente: ").append(toIndentedString(this.statoUtente)).append("\n");
    sb.append("    dataSospensioneUtente: ").append(toIndentedString(this.dataSospensioneUtente)).append("\n");
    sb.append("    codiceMatricolaUtenteInterno: ").append(toIndentedString(this.codiceMatricolaUtenteInterno))
        .append("\n");
    sb.append("    dataUltimaConnessione: ").append(toIndentedString(this.dataUltimaConnessione)).append("\n");
    sb.append("    emailUtente: ").append(toIndentedString(this.emailUtente)).append("\n");
    sb.append("    emailPecUtente: ").append(toIndentedString(this.emailPecUtente)).append("\n");
    sb.append("    denominazioneUtente: ").append(toIndentedString(this.denominazioneUtente)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}