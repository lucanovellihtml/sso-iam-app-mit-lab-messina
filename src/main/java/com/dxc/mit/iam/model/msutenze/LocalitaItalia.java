package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import jakarta.validation.constraints.NotNull;

/*
 * Classe che rappresenta una località in Italia, identificata da 
 * due principali proprietà: il codice del comune e il codice della provincia.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LocalitaItalia {

  /*
   * Lista degli attributi con i relativi metodi set e get.
   * 
   * codiceComune: Questo campo rappresenta il codice del comune italiano
   * 
   * codiceProvincia: Questo campo rappresenta il codice della provincia italiana
   */
  private String codiceComune;

  private String codiceProvincia;

  public LocalitaItalia() {
  }

  public LocalitaItalia(String codiceComune, String codiceProvincia) {
    this.codiceComune = codiceComune;
    this.codiceProvincia = codiceProvincia;
  }

  public com.dxc.mit.iam.model.msutenze.LocalitaItalia codiceComune(String codiceComune) {
    this.codiceComune = codiceComune;
    return this;
  }

  @NotNull
  @JsonProperty("codiceComune")
  public String getCodiceComune() {
    return this.codiceComune;
  }

  public void setCodiceComune(String codiceComune) {
    this.codiceComune = codiceComune;
  }

  public com.dxc.mit.iam.model.msutenze.LocalitaItalia codiceProvincia(String codiceProvincia) {
    this.codiceProvincia = codiceProvincia;
    return this;
  }

  @NotNull
  @JsonProperty("codiceProvincia")
  public String getCodiceProvincia() {
    return this.codiceProvincia;
  }

  public void setCodiceProvincia(String codiceProvincia) {
    this.codiceProvincia = codiceProvincia;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.LocalitaItalia localitaItalia = (com.dxc.mit.iam.model.msutenze.LocalitaItalia) o;
    return (Objects.equals(this.codiceComune, localitaItalia.codiceComune) &&
        Objects.equals(this.codiceProvincia, localitaItalia.codiceProvincia));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceComune, this.codiceProvincia });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalitaItalia {\n");
    sb.append("    codiceComune: ").append(toIndentedString(this.codiceComune)).append("\n");
    sb.append("    codiceProvincia: ").append(toIndentedString(this.codiceProvincia)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}