package com.dxc.mit.iam.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;

/*
 * La classe IdPUserResponse è un modello dati (model) utilizzato per rappresentare 
 * la risposta di un Identity Provider (IdP), definita anche come classe Data Tranfer Object. 
 * Contiene informazioni personali e di autenticazione dell'utente.
 */

// Indica che, se nella risposta JSON ci sono campi sconosciuti, essi verranno ignorati automaticamente
@JsonIgnoreProperties(ignoreUnknown = true)

// Evita che i campi vuoti o null vengano inclusi nella rappresentazione JSON
// della classe
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IdPUserResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    /*
     * Lista attributi con i relativi set e get.
     * 
     * _id e _rev: Identificatore e revisione dell'utente (probabilmente per
     * database NoSQL come CouchDB).
     * 
     * realm: Indica il dominio di autenticazione.
     * 
     * username: Nome utente.
     * 
     * uid: ID univoco dell'utente.
     * 
     * mail: Email associate all'utente.
     * 
     * givenName, cn, sn: Nomi e cognomi dell'utente.
     * 
     * roles: Ruoli assegnati all'utente.
     * 
     * dateOfBirth, placeOfBirth, stateOfBirth, provinceOfBirth: Informazioni sulla
     * nascita.
     * 
     * fiscalCode: Codice fiscale.
     * 
     * privacy: Consensi privacy.
     * 
     * employeeNumber: Matricola aziendale.
     * 
     * dataRegistrazione: Data di registrazione.
     * 
     * isImpersonate: Indica se l'utente sta impersonando qualcun altro.
     */
    private String _id;

    private String _rev;

    private String realm;

    private String username;

    private List<String> uid;

    private List<String> mail;

    private List<String> givenName;

    private List<String> cn;

    private List<String> sn;

    private List<String> roles;

    private List<String> dateOfBirth;

    private List<String> placeOfBirth;

    private List<String> gender;

    private List<String> fiscalCode;

    private List<String> stateOfBirth;

    private List<String> provinceOfBirth;

    private List<String> privacy;

    private List<String> employeeNumber;

    private List<String> dataRegistrazione;

    private List<String> isImpersonate;

    public void set_id(String _id) {
        this._id = _id;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUid(List<String> uid) {
        this.uid = uid;
    }

    public void setMail(List<String> mail) {
        this.mail = mail;
    }

    public void setGivenName(List<String> givenName) {
        this.givenName = givenName;
    }

    public void setCn(List<String> cn) {
        this.cn = cn;
    }

    public void setSn(List<String> sn) {
        this.sn = sn;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setDateOfBirth(List<String> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPlaceOfBirth(List<String> placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public void setFiscalCode(List<String> fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public void setStateOfBirth(List<String> stateOfBirth) {
        this.stateOfBirth = stateOfBirth;
    }

    public void setProvinceOfBirth(List<String> provinceOfBirth) {
        this.provinceOfBirth = provinceOfBirth;
    }

    public void setPrivacy(List<String> privacy) {
        this.privacy = privacy;
    }

    public void setEmployeeNumber(List<String> employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setDataRegistrazione(List<String> dataRegistrazione) {
        this.dataRegistrazione = dataRegistrazione;
    }

    public void setIsImpersonate(List<String> isImpersonate) {
        this.isImpersonate = isImpersonate;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.dxc.mit.iam.model.IdPUserResponse))
            return false;
        com.dxc.mit.iam.model.IdPUserResponse other = (com.dxc.mit.iam.model.IdPUserResponse) o;
        if (!other.canEqual(this))
            return false;
        Object this$_id = get_id(), other$_id = other.get_id();
        if ((this$_id == null) ? (other$_id != null) : !this$_id.equals(other$_id))
            return false;
        Object this$_rev = get_rev(), other$_rev = other.get_rev();
        if ((this$_rev == null) ? (other$_rev != null) : !this$_rev.equals(other$_rev))
            return false;
        Object this$realm = getRealm(), other$realm = other.getRealm();
        if ((this$realm == null) ? (other$realm != null) : !this$realm.equals(other$realm))
            return false;
        Object this$username = getUsername(), other$username = other.getUsername();
        if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username))
            return false;
        List<String> this$uid = (List<String>) getUid(), other$uid = (List<String>) other.getUid();
        if ((this$uid == null) ? (other$uid != null) : !this$uid.equals(other$uid))
            return false;
        List<String> this$mail = (List<String>) getMail(), other$mail = (List<String>) other.getMail();
        if ((this$mail == null) ? (other$mail != null) : !this$mail.equals(other$mail))
            return false;
        List<String> this$givenName = (List<String>) getGivenName(),
                other$givenName = (List<String>) other.getGivenName();
        if ((this$givenName == null) ? (other$givenName != null) : !this$givenName.equals(other$givenName))
            return false;
        List<String> this$cn = (List<String>) getCn(), other$cn = (List<String>) other.getCn();
        if ((this$cn == null) ? (other$cn != null) : !this$cn.equals(other$cn))
            return false;
        List<String> this$sn = (List<String>) getSn(), other$sn = (List<String>) other.getSn();
        if ((this$sn == null) ? (other$sn != null) : !this$sn.equals(other$sn))
            return false;
        List<String> this$roles = (List<String>) getRoles(), other$roles = (List<String>) other.getRoles();
        if ((this$roles == null) ? (other$roles != null) : !this$roles.equals(other$roles))
            return false;
        List<String> this$dateOfBirth = (List<String>) getDateOfBirth(),
                other$dateOfBirth = (List<String>) other.getDateOfBirth();
        if ((this$dateOfBirth == null) ? (other$dateOfBirth != null) : !this$dateOfBirth.equals(other$dateOfBirth))
            return false;
        List<String> this$placeOfBirth = (List<String>) getPlaceOfBirth(),
                other$placeOfBirth = (List<String>) other.getPlaceOfBirth();
        if ((this$placeOfBirth == null) ? (other$placeOfBirth != null) : !this$placeOfBirth.equals(other$placeOfBirth))
            return false;
        List<String> this$gender = (List<String>) getGender(), other$gender = (List<String>) other.getGender();
        if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
            return false;
        List<String> this$fiscalCode = (List<String>) getFiscalCode(),
                other$fiscalCode = (List<String>) other.getFiscalCode();
        if ((this$fiscalCode == null) ? (other$fiscalCode != null) : !this$fiscalCode.equals(other$fiscalCode))
            return false;
        List<String> this$stateOfBirth = (List<String>) getStateOfBirth(),
                other$stateOfBirth = (List<String>) other.getStateOfBirth();
        if ((this$stateOfBirth == null) ? (other$stateOfBirth != null) : !this$stateOfBirth.equals(other$stateOfBirth))
            return false;
        List<String> this$provinceOfBirth = (List<String>) getProvinceOfBirth(),
                other$provinceOfBirth = (List<String>) other.getProvinceOfBirth();
        if ((this$provinceOfBirth == null) ? (other$provinceOfBirth != null)
                : !this$provinceOfBirth.equals(other$provinceOfBirth))
            return false;
        List<String> this$privacy = (List<String>) getPrivacy(), other$privacy = (List<String>) other.getPrivacy();
        if ((this$privacy == null) ? (other$privacy != null) : !this$privacy.equals(other$privacy))
            return false;
        List<String> this$employeeNumber = (List<String>) getEmployeeNumber(),
                other$employeeNumber = (List<String>) other.getEmployeeNumber();
        if ((this$employeeNumber == null) ? (other$employeeNumber != null)
                : !this$employeeNumber.equals(other$employeeNumber))
            return false;
        List<String> this$dataRegistrazione = (List<String>) getDataRegistrazione(),
                other$dataRegistrazione = (List<String>) other.getDataRegistrazione();
        if ((this$dataRegistrazione == null) ? (other$dataRegistrazione != null)
                : !this$dataRegistrazione.equals(other$dataRegistrazione))
            return false;
        List<String> this$isImpersonate = (List<String>) getIsImpersonate(),
                other$isImpersonate = (List<String>) other.getIsImpersonate();
        return !((this$isImpersonate == null) ? (other$isImpersonate != null)
                : !this$isImpersonate.equals(other$isImpersonate));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.dxc.mit.iam.model.IdPUserResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $_id = get_id();
        result = result * 59 + (($_id == null) ? 43 : $_id.hashCode());
        Object $_rev = get_rev();
        result = result * 59 + (($_rev == null) ? 43 : $_rev.hashCode());
        Object $realm = getRealm();
        result = result * 59 + (($realm == null) ? 43 : $realm.hashCode());
        Object $username = getUsername();
        result = result * 59 + (($username == null) ? 43 : $username.hashCode());
        List<String> $uid = (List<String>) getUid();
        result = result * 59 + (($uid == null) ? 43 : $uid.hashCode());
        List<String> $mail = (List<String>) getMail();
        result = result * 59 + (($mail == null) ? 43 : $mail.hashCode());
        List<String> $givenName = (List<String>) getGivenName();
        result = result * 59 + (($givenName == null) ? 43 : $givenName.hashCode());
        List<String> $cn = (List<String>) getCn();
        result = result * 59 + (($cn == null) ? 43 : $cn.hashCode());
        List<String> $sn = (List<String>) getSn();
        result = result * 59 + (($sn == null) ? 43 : $sn.hashCode());
        List<String> $roles = (List<String>) getRoles();
        result = result * 59 + (($roles == null) ? 43 : $roles.hashCode());
        List<String> $dateOfBirth = (List<String>) getDateOfBirth();
        result = result * 59 + (($dateOfBirth == null) ? 43 : $dateOfBirth.hashCode());
        List<String> $placeOfBirth = (List<String>) getPlaceOfBirth();
        result = result * 59 + (($placeOfBirth == null) ? 43 : $placeOfBirth.hashCode());
        List<String> $gender = (List<String>) getGender();
        result = result * 59 + (($gender == null) ? 43 : $gender.hashCode());
        List<String> $fiscalCode = (List<String>) getFiscalCode();
        result = result * 59 + (($fiscalCode == null) ? 43 : $fiscalCode.hashCode());
        List<String> $stateOfBirth = (List<String>) getStateOfBirth();
        result = result * 59 + (($stateOfBirth == null) ? 43 : $stateOfBirth.hashCode());
        List<String> $provinceOfBirth = (List<String>) getProvinceOfBirth();
        result = result * 59 + (($provinceOfBirth == null) ? 43 : $provinceOfBirth.hashCode());
        List<String> $privacy = (List<String>) getPrivacy();
        result = result * 59 + (($privacy == null) ? 43 : $privacy.hashCode());
        List<String> $employeeNumber = (List<String>) getEmployeeNumber();
        result = result * 59 + (($employeeNumber == null) ? 43 : $employeeNumber.hashCode());
        List<String> $dataRegistrazione = (List<String>) getDataRegistrazione();
        result = result * 59 + (($dataRegistrazione == null) ? 43 : $dataRegistrazione.hashCode());
        List<String> $isImpersonate = (List<String>) getIsImpersonate();
        return result * 59 + (($isImpersonate == null) ? 43 : $isImpersonate.hashCode());
    }

    public String toString() {
        return "IdPUserResponse(_id=" + get_id() + ", _rev=" + get_rev() + ", realm=" + getRealm() + ", username="
                + getUsername() + ", uid=" + getUid() + ", mail=" + getMail() + ", givenName=" + getGivenName()
                + ", cn=" + getCn() + ", sn=" + getSn() + ", roles=" + getRoles() + ", dateOfBirth=" + getDateOfBirth()
                + ", placeOfBirth=" + getPlaceOfBirth() + ", gender=" + getGender() + ", fiscalCode=" + getFiscalCode()
                + ", stateOfBirth=" + getStateOfBirth() + ", provinceOfBirth=" + getProvinceOfBirth() + ", privacy="
                + getPrivacy() + ", employeeNumber=" + getEmployeeNumber() + ", dataRegistrazione="
                + getDataRegistrazione() + ", isImpersonate=" + getIsImpersonate() + ")";
    }

    public String get_id() {
        return this._id;
    }

    public String get_rev() {
        return this._rev;
    }

    public String getRealm() {
        return this.realm;
    }

    public String getUsername() {
        return this.username;
    }

    public List<String> getUid() {
        return this.uid;
    }

    public List<String> getMail() {
        return this.mail;
    }

    public List<String> getGivenName() {
        return this.givenName;
    }

    public List<String> getCn() {
        return this.cn;
    }

    public List<String> getSn() {
        return this.sn;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public List<String> getDateOfBirth() {
        return this.dateOfBirth;
    }

    public List<String> getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public List<String> getGender() {
        return this.gender;
    }

    public List<String> getFiscalCode() {
        return this.fiscalCode;
    }

    public List<String> getStateOfBirth() {
        return this.stateOfBirth;
    }

    public List<String> getProvinceOfBirth() {
        return this.provinceOfBirth;
    }

    public List<String> getPrivacy() {
        return this.privacy;
    }

    public List<String> getEmployeeNumber() {
        return this.employeeNumber;
    }

    public List<String> getDataRegistrazione() {
        return this.dataRegistrazione;
    }

    public List<String> getIsImpersonate() {
        return this.isImpersonate;
    }
}
