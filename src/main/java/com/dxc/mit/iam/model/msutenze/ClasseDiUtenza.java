package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jakarta.validation.Valid;

/*
 * Classe che descrive un insieme di utenti o di utilizzo, 
 * utilizzata in contesti come la gestione degli accessi o delle autorizzazioni.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ClasseDiUtenza implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codiceClasseUtenza: Rappresenta il codice identificativo della classe di
   * utenza
   * 
   * descrizioneClasseUtenza: Descrizione della classe di utenza, utilizzata per
   * spiegare il significato o lo scopo della classe
   * 
   * indicatoreClasseUtenza: Un codice che rappresenta un indicatore per la classe
   * di utenza (ad esempio,
   * un flag che può essere utilizzato per determinare lo stato o la categoria
   * della classe)
   * 
   * contestiApplicativi: Una lista di stringhe che descrivono i contesti
   * applicativi (ad esempio,
   * quali applicazioni o ambienti sono associati a questa classe di utenza)
   * 
   */
  private String codiceClasseUtenza;

  private String descrizioneClasseUtenza;

  private String indicatoreClasseUtenza;

  @Valid
  private List<String> contestiApplicativi;

  public com.dxc.mit.iam.model.msutenze.ClasseDiUtenza codiceClasseUtenza(String codiceClasseUtenza) {
    this.codiceClasseUtenza = codiceClasseUtenza;
    return this;
  }

  @JsonProperty("codiceClasseUtenza")
  public String getCodiceClasseUtenza() {
    return this.codiceClasseUtenza;
  }

  public void setCodiceClasseUtenza(String codiceClasseUtenza) {
    this.codiceClasseUtenza = codiceClasseUtenza;
  }

  public com.dxc.mit.iam.model.msutenze.ClasseDiUtenza descrizioneClasseUtenza(String descrizioneClasseUtenza) {
    this.descrizioneClasseUtenza = descrizioneClasseUtenza;
    return this;
  }

  @JsonProperty("descrizioneClasseUtenza")
  public String getDescrizioneClasseUtenza() {
    return this.descrizioneClasseUtenza;
  }

  public void setDescrizioneClasseUtenza(String descrizioneClasseUtenza) {
    this.descrizioneClasseUtenza = descrizioneClasseUtenza;
  }

  public com.dxc.mit.iam.model.msutenze.ClasseDiUtenza indicatoreClasseUtenza(String indicatoreClasseUtenza) {
    this.indicatoreClasseUtenza = indicatoreClasseUtenza;
    return this;
  }

  @JsonProperty("indicatoreClasseUtenza")
  public String getIndicatoreClasseUtenza() {
    return this.indicatoreClasseUtenza;
  }

  public void setIndicatoreClasseUtenza(String indicatoreClasseUtenza) {
    this.indicatoreClasseUtenza = indicatoreClasseUtenza;
  }

  public com.dxc.mit.iam.model.msutenze.ClasseDiUtenza contestiApplicativi(List<String> contestiApplicativi) {
    this.contestiApplicativi = contestiApplicativi;
    return this;
  }

  public com.dxc.mit.iam.model.msutenze.ClasseDiUtenza addContestiApplicativiItem(String contestiApplicativiItem) {
    if (this.contestiApplicativi == null)
      this.contestiApplicativi = new ArrayList<>();
    this.contestiApplicativi.add(contestiApplicativiItem);
    return this;
  }

  @JsonProperty("contestiApplicativi")
  public List<String> getContestiApplicativi() {
    return this.contestiApplicativi;
  }

  public void setContestiApplicativi(List<String> contestiApplicativi) {
    this.contestiApplicativi = contestiApplicativi;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.ClasseDiUtenza classeDiUtenza = (com.dxc.mit.iam.model.msutenze.ClasseDiUtenza) o;
    return (Objects.equals(this.codiceClasseUtenza, classeDiUtenza.codiceClasseUtenza) &&
        Objects.equals(this.descrizioneClasseUtenza, classeDiUtenza.descrizioneClasseUtenza) &&
        Objects.equals(this.indicatoreClasseUtenza, classeDiUtenza.indicatoreClasseUtenza) &&
        Objects.equals(this.contestiApplicativi, classeDiUtenza.contestiApplicativi));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceClasseUtenza, this.descrizioneClasseUtenza,
        this.indicatoreClasseUtenza, this.contestiApplicativi });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClasseDiUtenza {\n");
    sb.append("    codiceClasseUtenza: ").append(toIndentedString(this.codiceClasseUtenza)).append("\n");
    sb.append("    descrizioneClasseUtenza: ").append(toIndentedString(this.descrizioneClasseUtenza)).append("\n");
    sb.append("    indicatoreClasseUtenza: ").append(toIndentedString(this.indicatoreClasseUtenza)).append("\n");
    sb.append("    contestiApplicativi: ").append(toIndentedString(this.contestiApplicativi)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}