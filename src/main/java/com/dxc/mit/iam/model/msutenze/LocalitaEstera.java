package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import jakarta.validation.constraints.NotNull;

/*
 * Classe che rappresenta una località estera e include
 * due proprietà principali: il codice dello stato estero e il nome della località estera.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LocalitaEstera {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codiceStatoEstero: Rappresenta il codice identificativo dello stato estero
   * 
   * localitaEstero: Rappresenta la località estera (ad esempio, una città o un
   * comune estero)
   */
  private String codiceStatoEstero;

  private String localitaEstero;

  public LocalitaEstera() {
  }

  public LocalitaEstera(String codiceStatoEstero) {
    this.codiceStatoEstero = codiceStatoEstero;
  }

  public com.dxc.mit.iam.model.msutenze.LocalitaEstera codiceStatoEstero(String codiceStatoEstero) {
    this.codiceStatoEstero = codiceStatoEstero;
    return this;
  }

  @NotNull
  @JsonProperty("codiceStatoEstero")
  public String getCodiceStatoEstero() {
    return this.codiceStatoEstero;
  }

  public void setCodiceStatoEstero(String codiceStatoEstero) {
    this.codiceStatoEstero = codiceStatoEstero;
  }

  public com.dxc.mit.iam.model.msutenze.LocalitaEstera localitaEstero(String localitaEstero) {
    this.localitaEstero = localitaEstero;
    return this;
  }

  @JsonProperty("localitaEstero")
  public String getLocalitaEstero() {
    return this.localitaEstero;
  }

  public void setLocalitaEstero(String localitaEstero) {
    this.localitaEstero = localitaEstero;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.LocalitaEstera localitaEstera = (com.dxc.mit.iam.model.msutenze.LocalitaEstera) o;
    return (Objects.equals(this.codiceStatoEstero, localitaEstera.codiceStatoEstero) &&
        Objects.equals(this.localitaEstero, localitaEstera.localitaEstero));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceStatoEstero, this.localitaEstero });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalitaEstera {\n");
    sb.append("    codiceStatoEstero: ").append(toIndentedString(this.codiceStatoEstero)).append("\n");
    sb.append("    localitaEstero: ").append(toIndentedString(this.localitaEstero)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}