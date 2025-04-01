package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/*
 * Classe che rappresenta le informazioni anagrafiche di un referente.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GeneralitaReferente implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
   * Lista attributi con i relativi metodi get e set.
   * 
   * codiceFiscale: Rappresenta il codice fiscale del referente
   * 
   * cognome: Il cognome del referente
   * 
   * dataNascita: La data di nascita del referente
   * 
   * localitaNascitaEstera: Rappresenta la località di nascita estera del
   * referente
   * 
   * localitaNascitaItalia: Rappresenta la località di nascita in Italia del
   * referente
   * 
   * nome: Il nome del referente
   * 
   * sesso: Il sesso del referente
   */
  private String codiceFiscale;

  private String cognome;

  private String dataNascita;

  private LocalitaEstera localitaNascitaEstera;

  private LocalitaItalia localitaNascitaItalia;

  private String nome;

  private SessoEnum sesso;

  public GeneralitaReferente() {
  }

  public GeneralitaReferente(String codiceFiscale, String cognome, String dataNascita, String nome, SessoEnum sesso) {
    this.codiceFiscale = codiceFiscale;
    this.cognome = cognome;
    this.dataNascita = dataNascita;
    this.nome = nome;
    this.sesso = sesso;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente codiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
    return this;
  }

  @NotNull
  @JsonProperty("codiceFiscale")
  public String getCodiceFiscale() {
    return this.codiceFiscale;
  }

  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente cognome(String cognome) {
    this.cognome = cognome;
    return this;
  }

  @NotNull
  @JsonProperty("cognome")
  public String getCognome() {
    return this.cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente dataNascita(String dataNascita) {
    this.dataNascita = dataNascita;
    return this;
  }

  @NotNull
  @JsonProperty("dataNascita")
  public String getDataNascita() {
    return this.dataNascita;
  }

  public void setDataNascita(String dataNascita) {
    this.dataNascita = dataNascita;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente localitaNascitaEstera(
      LocalitaEstera localitaNascitaEstera) {
    this.localitaNascitaEstera = localitaNascitaEstera;
    return this;
  }

  @Valid
  @JsonProperty("localitaNascitaEstera")
  public LocalitaEstera getLocalitaNascitaEstera() {
    return this.localitaNascitaEstera;
  }

  public void setLocalitaNascitaEstera(LocalitaEstera localitaNascitaEstera) {
    this.localitaNascitaEstera = localitaNascitaEstera;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente localitaNascitaItalia(
      LocalitaItalia localitaNascitaItalia) {
    this.localitaNascitaItalia = localitaNascitaItalia;
    return this;
  }

  @Valid
  @JsonProperty("localitaNascitaItalia")
  public LocalitaItalia getLocalitaNascitaItalia() {
    return this.localitaNascitaItalia;
  }

  public void setLocalitaNascitaItalia(LocalitaItalia localitaNascitaItalia) {
    this.localitaNascitaItalia = localitaNascitaItalia;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente nome(String nome) {
    this.nome = nome;
    return this;
  }

  @NotNull
  @JsonProperty("nome")
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public com.dxc.mit.iam.model.msutenze.GeneralitaReferente sesso(SessoEnum sesso) {
    this.sesso = sesso;
    return this;
  }

  @NotNull
  @JsonProperty("sesso")
  public SessoEnum getSesso() {
    return this.sesso;
  }

  public void setSesso(SessoEnum sesso) {
    this.sesso = sesso;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.GeneralitaReferente generalitaReferente = (com.dxc.mit.iam.model.msutenze.GeneralitaReferente) o;
    return (Objects.equals(this.codiceFiscale, generalitaReferente.codiceFiscale) &&
        Objects.equals(this.cognome, generalitaReferente.cognome) &&
        Objects.equals(this.dataNascita, generalitaReferente.dataNascita) &&
        Objects.equals(this.localitaNascitaEstera, generalitaReferente.localitaNascitaEstera) &&
        Objects.equals(this.localitaNascitaItalia, generalitaReferente.localitaNascitaItalia) &&
        Objects.equals(this.nome, generalitaReferente.nome) &&
        Objects.equals(this.sesso, generalitaReferente.sesso));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceFiscale, this.cognome, this.dataNascita, this.localitaNascitaEstera,
        this.localitaNascitaItalia, this.nome, this.sesso });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralitaReferente {\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(this.codiceFiscale)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(this.cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(this.dataNascita)).append("\n");
    sb.append("    localitaNascitaEstera: ").append(toIndentedString(this.localitaNascitaEstera)).append("\n");
    sb.append("    localitaNascitaItalia: ").append(toIndentedString(this.localitaNascitaItalia)).append("\n");
    sb.append("    nome: ").append(toIndentedString(this.nome)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(this.sesso)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}