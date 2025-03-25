package com.dxc.mit.iam.model;

import java.io.Serializable;
import java.util.List;

/*
 * Classe che rappresenta le informazioni relative a un utente del sistema identity Provider.
 * Viene usata nei controller per aggiornare le informazioni di un utente in un sistema di autenticazione e autorizzazione IAM.
 */
public class IdPUserUpdate implements Serializable {
    private static final long serialVersionUID = 1L;

    // Stato della privacy dell'utente
    private String privacy;

    // Matricola associata all'utente
    private List<String> employeeNumber;

    // Data registrazione dell'utente
    private String dataRegistrazione;

    // Indica se l'utente sta impersonando un altro utente
    private List<String> isImpersonate;

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public void setDataRegistrazione(String dataRegistrazione) {
        this.dataRegistrazione = dataRegistrazione;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.dxc.mit.iam.model.IdPUserUpdate))
            return false;
        com.dxc.mit.iam.model.IdPUserUpdate other = (com.dxc.mit.iam.model.IdPUserUpdate) o;
        if (!other.canEqual(this))
            return false;
        Object this$privacy = getPrivacy(), other$privacy = other.getPrivacy();
        if ((this$privacy == null) ? (other$privacy != null) : !this$privacy.equals(other$privacy))
            return false;
        List<String> this$employeeNumber = (List<String>) getEmployeeNumber(),
                other$employeeNumber = (List<String>) other.getEmployeeNumber();
        if ((this$employeeNumber == null) ? (other$employeeNumber != null)
                : !this$employeeNumber.equals(other$employeeNumber))
            return false;
        Object this$dataRegistrazione = getDataRegistrazione(), other$dataRegistrazione = other.getDataRegistrazione();
        if ((this$dataRegistrazione == null) ? (other$dataRegistrazione != null)
                : !this$dataRegistrazione.equals(other$dataRegistrazione))
            return false;
        List<String> this$isImpersonate = (List<String>) getIsImpersonate(),
                other$isImpersonate = (List<String>) other.getIsImpersonate();
        return !((this$isImpersonate == null) ? (other$isImpersonate != null)
                : !this$isImpersonate.equals(other$isImpersonate));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.dxc.mit.iam.model.IdPUserUpdate;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $privacy = getPrivacy();
        result = result * 59 + (($privacy == null) ? 43 : $privacy.hashCode());
        List<String> $employeeNumber = (List<String>) getEmployeeNumber();
        result = result * 59 + (($employeeNumber == null) ? 43 : $employeeNumber.hashCode());
        Object $dataRegistrazione = getDataRegistrazione();
        result = result * 59 + (($dataRegistrazione == null) ? 43 : $dataRegistrazione.hashCode());
        List<String> $isImpersonate = (List<String>) getIsImpersonate();
        return result * 59 + (($isImpersonate == null) ? 43 : $isImpersonate.hashCode());
    }

    public String toString() {
        return "IdPUserUpdate(privacy=" + getPrivacy() + ", employeeNumber=" + getEmployeeNumber()
                + ", dataRegistrazione=" + getDataRegistrazione() + ", isImpersonate=" + getIsImpersonate() + ")";
    }

    public String getPrivacy() {
        return this.privacy;
    }

    public List<String> getEmployeeNumber() {
        return this.employeeNumber;
    }

    public String getDataRegistrazione() {
        return this.dataRegistrazione;
    }

    public List<String> getIsImpersonate() {
        return this.isImpersonate;
    }

    public void setEmployeeNumber(List<String> employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        setEmployeeNumber(List.of(employeeNumber));
    }

    public void setIsImpersonate(List<String> isImpersonate) {
        this.isImpersonate = isImpersonate;
    }

    public void setIsImpersonate(String isImpersonate) {
        setIsImpersonate(List.of(isImpersonate));
    }
}
