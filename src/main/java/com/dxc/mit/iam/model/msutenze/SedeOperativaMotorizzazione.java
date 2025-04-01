package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

/*
 * Classe che rappresenta una sede operativa della motorizzazione civile.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SedeOperativaMotorizzazione implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
   * Lista degli attributi con i relativi metodi set e get.
   * 
   * codiceSiglaProvincia: Identificativo della provincia in cui si trova la
   * sede
   * 
   * codiceSedeOperativaMotorizzazione: Codice univoco della sede operativa della
   * motorizzazione
   */
  private String codiceSiglaProvincia;

  private String codiceSedeOperativaMotorizzazione;

  public com.dxc.mit.iam.model.msutenze.SedeOperativaMotorizzazione codiceSiglaProvincia(String codiceSiglaProvincia) {
    this.codiceSiglaProvincia = codiceSiglaProvincia;
    return this;
  }

  @JsonProperty("codiceSiglaProvincia")
  public String getCodiceSiglaProvincia() {
    return this.codiceSiglaProvincia;
  }

  public void setCodiceSiglaProvincia(String codiceSiglaProvincia) {
    this.codiceSiglaProvincia = codiceSiglaProvincia;
  }

  public com.dxc.mit.iam.model.msutenze.SedeOperativaMotorizzazione codiceSedeOperativaMotorizzazione(
      String codiceSedeOperativaMotorizzazione) {
    this.codiceSedeOperativaMotorizzazione = codiceSedeOperativaMotorizzazione;
    return this;
  }

  @JsonProperty("codiceSedeOperativaMotorizzazione")
  public String getCodiceSedeOperativaMotorizzazione() {
    return this.codiceSedeOperativaMotorizzazione;
  }

  public void setCodiceSedeOperativaMotorizzazione(String codiceSedeOperativaMotorizzazione) {
    this.codiceSedeOperativaMotorizzazione = codiceSedeOperativaMotorizzazione;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.SedeOperativaMotorizzazione sedeOperativaMotorizzazione = (com.dxc.mit.iam.model.msutenze.SedeOperativaMotorizzazione) o;
    return (Objects.equals(this.codiceSiglaProvincia, sedeOperativaMotorizzazione.codiceSiglaProvincia) &&
        Objects.equals(this.codiceSedeOperativaMotorizzazione,
            sedeOperativaMotorizzazione.codiceSedeOperativaMotorizzazione));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceSiglaProvincia, this.codiceSedeOperativaMotorizzazione });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SedeOperativaMotorizzazione {\n");
    sb.append("    codiceSiglaProvincia: ").append(toIndentedString(this.codiceSiglaProvincia)).append("\n");
    sb.append("    codiceSedeOperativaMotorizzazione: ")
        .append(toIndentedString(this.codiceSedeOperativaMotorizzazione)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}