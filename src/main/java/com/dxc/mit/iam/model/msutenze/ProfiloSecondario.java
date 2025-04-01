package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/*
 * Classe che rappresenta un modello utilizzato per gestire i profili 
 * secondari associati a un'utenza o un'entità in un sistema di gestione delle autorizzazioni.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProfiloSecondario {

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codiceProfiloAutorizzazione: Questo campo rappresenta il codice
   * identificativo del profilo di
   * autorizzazione. Esso viene utilizzato per distinguere e identificare un
   * particolare tipo di autorizzazione o profilo associato a un'entità
   * 
   * indicatoreTipoProfilo: Questo campo rappresenta un indicatore o un tipo del
   * profilo secondario
   */
  private String codiceProfiloAutorizzazione;

  private String indicatoreTipoProfilo;

  public com.dxc.mit.iam.model.msutenze.ProfiloSecondario codiceProfiloAutorizzazione(
      String codiceProfiloAutorizzazione) {
    this.codiceProfiloAutorizzazione = codiceProfiloAutorizzazione;
    return this;
  }

  @JsonProperty("codiceProfiloAutorizzazione")
  public String getCodiceProfiloAutorizzazione() {
    return this.codiceProfiloAutorizzazione;
  }

  public void setCodiceProfiloAutorizzazione(String codiceProfiloAutorizzazione) {
    this.codiceProfiloAutorizzazione = codiceProfiloAutorizzazione;
  }

  public com.dxc.mit.iam.model.msutenze.ProfiloSecondario indicatoreTipoProfilo(String indicatoreTipoProfilo) {
    this.indicatoreTipoProfilo = indicatoreTipoProfilo;
    return this;
  }

  @JsonProperty("indicatoreTipoProfilo")
  public String getIndicatoreTipoProfilo() {
    return this.indicatoreTipoProfilo;
  }

  public void setIndicatoreTipoProfilo(String indicatoreTipoProfilo) {
    this.indicatoreTipoProfilo = indicatoreTipoProfilo;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.ProfiloSecondario profiloSecondario = (com.dxc.mit.iam.model.msutenze.ProfiloSecondario) o;
    return (Objects.equals(this.codiceProfiloAutorizzazione, profiloSecondario.codiceProfiloAutorizzazione) &&
        Objects.equals(this.indicatoreTipoProfilo, profiloSecondario.indicatoreTipoProfilo));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceProfiloAutorizzazione, this.indicatoreTipoProfilo });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfiloSecondario {\n");
    sb.append("    codiceProfiloAutorizzazione: ").append(toIndentedString(this.codiceProfiloAutorizzazione))
        .append("\n");
    sb.append("    indicatoreTipoProfilo: ").append(toIndentedString(this.indicatoreTipoProfilo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}