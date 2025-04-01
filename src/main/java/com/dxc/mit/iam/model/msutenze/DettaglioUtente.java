package com.dxc.mit.iam.model.msutenze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;
import jakarta.validation.Valid;

/*
 * Classe che rappresenta le informazioni dettagliate su un utente.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DettaglioUtente implements Serializable {
    private static final long serialVersionUID = 1L;

    /*
     * Lista attributi con i relativi metodi set e get.
     * 
     * datiUtente: Contiene i dettagli dell'utente
     * 
     * datiAnagrafici: Contiene le informazioni anagrafiche del referente
     * dell'utente
     * 
     * sedeOperativaEsterna: Dettaglia la sede operativa esterna dell'utente, che
     * potrebbe essere legata a
     * un'azienda o a una località specifica
     * 
     * sedeOperativaMotorizzazione: Descrive la sede operativa relativa alla
     * motorizzazione
     * 
     * classeDiUtenza: Specifica la classe di utenza, come la categoria o il tipo di
     * accesso che
     * l'utente ha nel sistema
     * 
     * badgeUtente: Contiene informazioni relative al badge dell'utente, come il
     * numero del
     * badge, la validità e altri dettagli simili
     */
    @Valid
    @JsonProperty("datiUtente")
    private DatiUtente datiUtente;

    @Valid
    @JsonProperty("datiAnagrafici")
    private GeneralitaReferente datiAnagrafici;

    @Valid
    @JsonProperty("sedeOperativaEsterna")
    private SedeOperativaEsterna sedeOperativaEsterna;

    @Valid
    @JsonProperty("sedeOperativaMotorizzazione")
    private SedeOperativaMotorizzazione sedeOperativaMotorizzazione;

    @Valid
    @JsonProperty("classeDiUtenza")
    private ClasseDiUtenza classeDiUtenza;

    @Valid
    @JsonProperty("badgeUtente")
    private BadgeUtente badgeUtente;

    public com.dxc.mit.iam.model.msutenze.DettaglioUtente datiUtente(DatiUtente datiUtente) {
        this.datiUtente = datiUtente;
        return this;
    }

    public DatiUtente getDatiUtente() {
        return this.datiUtente;
    }

    public void setDatiUtente(DatiUtente datiUtente) {
        this.datiUtente = datiUtente;
    }

    public com.dxc.mit.iam.model.msutenze.DettaglioUtente datiAnagrafici(GeneralitaReferente datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
        return this;
    }

    public GeneralitaReferente getDatiAnagrafici() {
        return this.datiAnagrafici;
    }

    public void setDatiAnagrafici(GeneralitaReferente datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public com.dxc.mit.iam.model.msutenze.DettaglioUtente sedeOperativaEsterna(
            SedeOperativaEsterna sedeOperativaEsterna) {
        this.sedeOperativaEsterna = sedeOperativaEsterna;
        return this;
    }

    public SedeOperativaEsterna getSedeOperativaEsterna() {
        return this.sedeOperativaEsterna;
    }

    public void setSedeOperativaEsterna(SedeOperativaEsterna sedeOperativaEsterna) {
        this.sedeOperativaEsterna = sedeOperativaEsterna;
    }

    public com.dxc.mit.iam.model.msutenze.DettaglioUtente sedeOperativaMotorizzazione(
            SedeOperativaMotorizzazione sedeOperativaMotorizzazione) {
        this.sedeOperativaMotorizzazione = sedeOperativaMotorizzazione;
        return this;
    }

    public SedeOperativaMotorizzazione getSedeOperativaMotorizzazione() {
        return this.sedeOperativaMotorizzazione;
    }

    public void setSedeOperativaMotorizzazione(SedeOperativaMotorizzazione sedeOperativaMotorizzazione) {
        this.sedeOperativaMotorizzazione = sedeOperativaMotorizzazione;
    }

    public com.dxc.mit.iam.model.msutenze.DettaglioUtente classeDiUtenza(ClasseDiUtenza classeDiUtenza) {
        this.classeDiUtenza = classeDiUtenza;
        return this;
    }

    public ClasseDiUtenza getClasseDiUtenza() {
        return this.classeDiUtenza;
    }

    public void setClasseDiUtenza(ClasseDiUtenza classeDiUtenza) {
        this.classeDiUtenza = classeDiUtenza;
    }

    public com.dxc.mit.iam.model.msutenze.DettaglioUtente badgeUtente(BadgeUtente badgeUtente) {
        this.badgeUtente = badgeUtente;
        return this;
    }

    public BadgeUtente getBadgeUtente() {
        return this.badgeUtente;
    }

    public void setBadgeUtente(BadgeUtente badgeUtente) {
        this.badgeUtente = badgeUtente;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        com.dxc.mit.iam.model.msutenze.DettaglioUtente rispostaDettaglioUtente = (com.dxc.mit.iam.model.msutenze.DettaglioUtente) o;
        return (Objects.equals(this.datiUtente, rispostaDettaglioUtente.datiUtente) &&
                Objects.equals(this.datiAnagrafici, rispostaDettaglioUtente.datiAnagrafici) &&
                Objects.equals(this.sedeOperativaEsterna, rispostaDettaglioUtente.sedeOperativaEsterna) &&
                Objects.equals(this.sedeOperativaMotorizzazione, rispostaDettaglioUtente.sedeOperativaMotorizzazione) &&
                Objects.equals(this.classeDiUtenza, rispostaDettaglioUtente.classeDiUtenza) &&
                Objects.equals(this.badgeUtente, rispostaDettaglioUtente.badgeUtente));
    }

    public int hashCode() {
        return Objects.hash(new Object[] { this.datiUtente, this.datiAnagrafici, this.sedeOperativaEsterna,
                this.sedeOperativaMotorizzazione, this.classeDiUtenza, this.badgeUtente });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RispostaDettaglioUtente {\n");
        sb.append("    datiUtente: ").append(toIndentedString(this.datiUtente)).append("\n");
        sb.append("    datiAnagrafici: ").append(toIndentedString(this.datiAnagrafici)).append("\n");
        sb.append("    sedeOperativaEsterna: ").append(toIndentedString(this.sedeOperativaEsterna)).append("\n");
        sb.append("    sedeOperativaMotorizzazione: ").append(toIndentedString(this.sedeOperativaMotorizzazione))
                .append("\n");
        sb.append("    classeDiUtenza: ").append(toIndentedString(this.classeDiUtenza)).append("\n");
        sb.append("    badgeUtente: ").append(toIndentedString(this.badgeUtente)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null)
            return "null";
        return o.toString().replace("\n", "\n    ");
    }
}
