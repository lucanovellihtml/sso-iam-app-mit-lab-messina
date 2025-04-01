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
 * Classe che contiene informazioni relative al badge di un utente, 
 * come il codice identificativo, il codice del profilo di autorizzazione, 
 * lo stato del badge e un elenco di profili secondari associati all'utente.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadgeUtente implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
   * Lista attributi con i relativi metodi set e get.
   * 
   * codiceIdentificativoBadge: Rappresenta l'identificativo univoco del badge
   * dell'utente
   * 
   * codiceProfiloAutorizzazione: Indica il codice del profilo di autorizzazione
   * associato al badge
   * dell'utente
   * 
   * codiceStatoBadge: Indica lo stato del badge (ad esempio, attivo,
   * disabilitato, sospeso)
   * 
   * profiloSecondarioUtente: Una lista di oggetti di tipo ProfiloSecondario che
   * rappresentano i profili
   * secondari dell'utente associati al badge
   */
  private String codiceIdentificativoBadge;

  private String codiceProfiloAutorizzazione;

  private String codiceStatoBadge;

  @Valid
  private List<ProfiloSecondario> profiloSecondarioUtente;

  public com.dxc.mit.iam.model.msutenze.BadgeUtente codiceIdentificativoBadge(String codiceIdentificativoBadge) {
    this.codiceIdentificativoBadge = codiceIdentificativoBadge;
    return this;
  }

  @JsonProperty("codiceIdentificativoBadge")
  public String getCodiceIdentificativoBadge() {
    return this.codiceIdentificativoBadge;
  }

  public void setCodiceIdentificativoBadge(String codiceIdentificativoBadge) {
    this.codiceIdentificativoBadge = codiceIdentificativoBadge;
  }

  public com.dxc.mit.iam.model.msutenze.BadgeUtente codiceProfiloAutorizzazione(String codiceProfiloAutorizzazione) {
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

  public com.dxc.mit.iam.model.msutenze.BadgeUtente codiceStatoBadge(String codiceStatoBadge) {
    this.codiceStatoBadge = codiceStatoBadge;
    return this;
  }

  @JsonProperty("codiceStatoBadge")
  public String getCodiceStatoBadge() {
    return this.codiceStatoBadge;
  }

  public void setCodiceStatoBadge(String codiceStatoBadge) {
    this.codiceStatoBadge = codiceStatoBadge;
  }

  public com.dxc.mit.iam.model.msutenze.BadgeUtente profiloSecondarioUtente(
      List<ProfiloSecondario> profiloSecondarioUtente) {
    this.profiloSecondarioUtente = profiloSecondarioUtente;
    return this;
  }

  public com.dxc.mit.iam.model.msutenze.BadgeUtente addProfiloSecondarioUtenteItem(
      ProfiloSecondario profiloSecondarioUtenteItem) {
    if (this.profiloSecondarioUtente == null)
      this.profiloSecondarioUtente = new ArrayList<>();
    this.profiloSecondarioUtente.add(profiloSecondarioUtenteItem);
    return this;
  }

  @Valid
  @JsonProperty("profiloSecondarioUtente")
  public List<ProfiloSecondario> getProfiloSecondarioUtente() {
    return this.profiloSecondarioUtente;
  }

  public void setProfiloSecondarioUtente(List<ProfiloSecondario> profiloSecondarioUtente) {
    this.profiloSecondarioUtente = profiloSecondarioUtente;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    com.dxc.mit.iam.model.msutenze.BadgeUtente badgeUtente = (com.dxc.mit.iam.model.msutenze.BadgeUtente) o;
    return (Objects.equals(this.codiceIdentificativoBadge, badgeUtente.codiceIdentificativoBadge) &&
        Objects.equals(this.codiceProfiloAutorizzazione, badgeUtente.codiceProfiloAutorizzazione) &&
        Objects.equals(this.codiceStatoBadge, badgeUtente.codiceStatoBadge) &&
        Objects.equals(this.profiloSecondarioUtente, badgeUtente.profiloSecondarioUtente));
  }

  public int hashCode() {
    return Objects.hash(new Object[] { this.codiceIdentificativoBadge, this.codiceProfiloAutorizzazione,
        this.codiceStatoBadge, this.profiloSecondarioUtente });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgeUtente {\n");
    sb.append("    codiceIdentificativoBadge: ").append(toIndentedString(this.codiceIdentificativoBadge)).append("\n");
    sb.append("    codiceProfiloAutorizzazione: ").append(toIndentedString(this.codiceProfiloAutorizzazione))
        .append("\n");
    sb.append("    codiceStatoBadge: ").append(toIndentedString(this.codiceStatoBadge)).append("\n");
    sb.append("    profiloSecondarioUtente: ").append(toIndentedString(this.profiloSecondarioUtente)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    if (o == null)
      return "null";
    return o.toString().replace("\n", "\n    ");
  }
}