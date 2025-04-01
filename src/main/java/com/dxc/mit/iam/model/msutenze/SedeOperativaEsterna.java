package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

/*
 * Classe che rappresenta una sede operativa esterna.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SedeOperativaEsterna implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
   * Lista degli attributi con i relativi metodi set e get.
   * 
   * codiceSiglaProvincia: Codice identificativo della provincia in cui si trova
   * la sede operativa
   * 
   * codiceTipoSedeOperativa: Indica la tipologia della sede operativa
   * 
   * progressivoSedeOperativa: Un numero progressivo identificativo della sede
   * 
   * denominazioneSedeOperativa: Il nome della sede operativa
   */
  private String codiceSiglaProvincia;

  private String codiceTipoSedeOperativa;

  private String progressivoSedeOperativa;

  private String denominazioneSedeOperativa;

  public com.dxc.mit.iam.model.msutenze.SedeOperativaEsterna codiceSiglaProvincia(String codiceSiglaProvincia) {
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

  public com.dxc.mit.iam.model.msutenze.SedeOperativaEsterna codiceTipoSedeOperativa(String codiceTipoSedeOperativa) {
    this.codiceTipoSedeOperativa = codiceTipoSedeOperativa;
    return this;
  }

  @JsonProperty("codiceTipoSedeOperativa")
  public String getCodiceTipoSedeOperativa() {
    return this.codiceTipoSedeOperativa;
  }

  public void setCodiceTipoSedeOperativa(String codiceTipoSedeOperativa) {
    this.codiceTipoSedeOperativa = codiceTipoSedeOperativa;
  }

  public com.dxc.mit.iam.model.msutenze.SedeOperativaEsterna progressivoSedeOperativa(String progressivoSedeOperativa) {
    this.progressivoSedeOperativa = progressivoSedeOperativa;
    return this;
  }

  @JsonProperty("progressivoSedeOperativa")
  public String getProgressivoSedeOperativa() {
    return this.progressivoSedeOperativa;
  }

  public void setProgressivoSedeOperativa(String progressivoSedeOperativa) {
    this.progressivoSedeOperativa = progressivoSedeOperativa;
  }

  public com.dxc.mit.iam.model.msutenze.SedeOperativaEsterna denominazioneSedeOperativa(
      String denominazioneSedeOperativa) {
    this.denominazioneSedeOperativa = denominazioneSedeOperativa;
    return this;
  }

  @JsonProperty("denominazioneSedeOperativa")
  public String getDenominazioneSedeOperativa() {
    return this.denominazioneSedeOperativa;
  }

  public void setDenominazioneSedeOperativa(String denominazioneSedeOperativa) {
    this.denominazioneSedeOperativa = denominazioneSedeOperativa;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.SedeOperativaEsterna sedeOperativaEsterna = (com.dxc.mit.iam.model.msutenze.SedeOperativaEsterna) o;
    return (Objects.equals(this.codiceSiglaProvincia, sedeOperativaEsterna.codiceSiglaProvincia) &&
        Objects.equals(this.codiceTipoSedeOperativa, sedeOperativaEsterna.codiceTipoSedeOperativa) &&
        Objects.equals(this.progressivoSedeOperativa, sedeOperativaEsterna.progressivoSedeOperativa) &&
        Objects.equals(this.denominazioneSedeOperativa, sedeOperativaEsterna.denominazioneSedeOperativa));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceSiglaProvincia, this.codiceTipoSedeOperativa,
        this.progressivoSedeOperativa, this.denominazioneSedeOperativa });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SedeOperativaEsterna {\n");
    sb.append("    codiceSiglaProvincia: ").append(toIndentedString(this.codiceSiglaProvincia)).append("\n");
    sb.append("    codiceTipoSedeOperativa: ").append(toIndentedString(this.codiceTipoSedeOperativa)).append("\n");
    sb.append("    progressivoSedeOperativa: ").append(toIndentedString(this.progressivoSedeOperativa)).append("\n");
    sb.append("    denominazioneSedeOperativa: ").append(toIndentedString(this.denominazioneSedeOperativa))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}