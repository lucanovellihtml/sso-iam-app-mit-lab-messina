package com.dxc.mit.iam.model.msutenze;

import java.time.OffsetDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties
public class AggiornaDataUltimaConnessioneRequest {
    private String codiceMatricolaUtente;
    @DateTimeFormat
    private OffsetDateTime dataUltimaConnessione;

    public AggiornaDataUltimaConnessioneRequest() {
        throw new Error(
                "Unresolved compilation problems: \n\tThe declared package \"BOOT\" does not match the expected package \"BOOT-INF.classes.com.dxc.mit.iam.model.msutenze\"\n\tSyntax error on token \"-\", . expected\n\tThe import com.fasterxml cannot be resolved\n\tThe import com.fasterxml cannot be resolved\n\tThe import com.fasterxml cannot be resolved\n\tThe import javax.validation cannot be resolved\n\tThe import javax.validation cannot be resolved\n\tThe import org.springframework.format cannot be resolved\n\tJsonIgnoreProperties cannot be resolved to a type\n\tJsonInclude cannot be resolved to a type\n\tJsonInclude cannot be resolved to a variable\n\tDateTimeFormat cannot be resolved to a type\n\tDateTimeFormat cannot be resolved to a variable\n\tcom.dxc cannot be resolved to a type\n\tNotNull cannot be resolved to a type\n\tJsonProperty cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n\tValid cannot be resolved to a type\n\tJsonProperty cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n");
    }

    public AggiornaDataUltimaConnessioneRequest(String var1) {
        throw new Error(
                "Unresolved compilation problems: \n\tThe declared package \"BOOT\" does not match the expected package \"BOOT-INF.classes.com.dxc.mit.iam.model.msutenze\"\n\tSyntax error on token \"-\", . expected\n\tThe import com.fasterxml cannot be resolved\n\tThe import com.fasterxml cannot be resolved\n\tThe import com.fasterxml cannot be resolved\n\tThe import javax.validation cannot be resolved\n\tThe import javax.validation cannot be resolved\n\tThe import org.springframework.format cannot be resolved\n\tJsonIgnoreProperties cannot be resolved to a type\n\tJsonInclude cannot be resolved to a type\n\tJsonInclude cannot be resolved to a variable\n\tDateTimeFormat cannot be resolved to a type\n\tDateTimeFormat cannot be resolved to a variable\n\tcom.dxc cannot be resolved to a type\n\tNotNull cannot be resolved to a type\n\tJsonProperty cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n\tValid cannot be resolved to a type\n\tJsonProperty cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n");
    }

    public com.dxc.mit.iam.model.msutenze.AggiornaDataUltimaConnessioneRequest codiceMatricolaUtente(String var1) {
        throw new Error("Unresolved compilation problem: \n\tcom.dxc cannot be resolved to a type\n");
    }

    @NotNull
    public String getCodiceMatricolaUtente() {
        throw new Error(
                "Unresolved compilation problems: \n\tNotNull cannot be resolved to a type\n\tJsonProperty cannot be resolved to a type\n");
    }

    public void setCodiceMatricolaUtente(String var1) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public com.dxc.mit.iam.model.msutenze.AggiornaDataUltimaConnessioneRequest dataUltimaConnessione(
            OffsetDateTime var1) {
        throw new Error("Unresolved compilation problem: \n\tcom.dxc cannot be resolved to a type\n");
    }

    @Valid
    public OffsetDateTime getDataUltimaConnessione() {
        throw new Error(
                "Unresolved compilation problems: \n\tValid cannot be resolved to a type\n\tJsonProperty cannot be resolved to a type\n");
    }

    public void setDataUltimaConnessione(OffsetDateTime var1) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public boolean equals(Object var1) {
        throw new Error(
                "Unresolved compilation problems: \n\tcom.dxc cannot be resolved to a type\n\tcom.dxc cannot be resolved to a type\n");
    }

    public int hashCode() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String toString() {
        throw new Error("Unresolved compilation problem: \n");
    }

    private String toIndentedString(Object var1) {
        throw new Error("Unresolved compilation problem: \n");
    }
}
