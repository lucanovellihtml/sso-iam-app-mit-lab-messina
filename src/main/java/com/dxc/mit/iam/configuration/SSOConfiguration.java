package com.dxc.mit.iam.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@Configuration
public class SSOConfiguration {

    @Value("${sso.url.authenticate}")
    private String authenticateUrl;

    @Value("${sso.cookieName}")
    private String cookieName;

    @Value("${sso.jwtCookieName}")
    private String jwtCookieName;

    @Value("${sso.headerName}")
    private String headerName;

    @Value("${sso.url.sessionInfo}")
    private String sessionInfoUrl;

    @Value("${sso.url.logout}")
    private String logoutUrl;

    @Value("${sso.targetUrl.param}")
    private String targetUrlParam;

    @Value("${sso.targetUrl.default}")
    private String targetUrlDefault;

    @Value("${sso.targetUrl.pattern}")
    private String targetUrlPattern;

    @Value("${sso.fakeresponse}")
    private boolean fakeResponse;

    @Value("${sso.url.findUserByCFNotTipoUtente}")
    private String findUserByCFNotTipoUtente;

    @Value("${sso.url.userInfo}")
    private String userInfo;

    @Value("${sso.url.resetUserIdByEmail}")
    private String resetUserIdByEmail;

    @Value("${sso.url.resetUserIdByPartitaIvaOrCF}")
    private String resetUserIdByPartitaIva;

    @Value("${sso.url.passwordRecovery}")
    private String passwordRecovery;

    @Value("${hcaptcha.key.site}")
    private String captchaSiteKey;

    @Value("${hcaptcha.key.secret}")
    private String captchaSecretKey;

    @Value("${hcaptcha.urlVerifier}")
    private String hcaptchaVerifierUrl;

    @Value("${sso.url.postLoginUrl}")
    private String postLoginUrl;

    @Value("${sso.url.httpHeaderPostLoginUrl}")
    private String httpHeaderPostLoginUrl;

    @Value("${sso.url.passwordRecoveryTokenCheck}")
    private String passwordRecoveryTokenCheck;

    @Value("${hcaptcha.captcha_enabled}")
    private boolean captchaEnabled;

    @Value("${sso.url.passwordReset}")
    private String passwordReset;

    /*
     * Ricerca della variabile static.resource.url dal file .yml per essere
     * utilizzata nella variabile cdnUrl
     */
    @Value("${static.resource.url}")
    private String staticResourceUrl;

    @Value("${sso.url.passwordChange}")
    private String passwordChange;

    @Value("${sso.url.passwordChangeExpired}")
    private String passwordChangeExpired;

    @Value("${footer.link.utili}")
    private String footerLinkUtili;

    @Value("${header.link}")
    private String headerLink;

    @Value("${scrivi.url}")
    private String scriviLink;

    @Value("${registrati.url}")
    private String registratiLink;

    @Value("${sso.resetPasswordTargetUrl}")
    private String resetPasswordTargetUrl;

    @Value("${profilo.modifica.url}")
    private String modificaProfiloLink;

    @Value("${profilo.fascicolocittadino.url}")
    private String fascicoloCittadinoLink;

    @Value("${profilo.oblio.url}")
    private String oblioLinkUrl;

    @Value("${sso.logoutRedirectUrl}")
    private String logoutRedirectUrl;

    @Value("${sso.oldLogoutRedirectUrl}")
    private String oldLogoutRedirectUrl;

    @Value("${sso.logoutMessageMobile}")
    private String logoutMessageMobile;

    @Value("${sso.oldCookieName}")
    private String oldCookieName;

    @Value("${supporto.chat.url}")
    private String chatUrl;

    @Value("${supporto.chat.knowledgeBaseIt}")
    private String knowledgeBaseIt;

    @Value("${supporto.chat.auth}")
    private String chatAuth;

    @Value("${homepage.link}")
    private String homepageLink;

    @Value("${breadcrumb.link.home}")
    private String breadcrumbLinkHome;

    @Value("${breadcrumb.link.accedi}")
    private String breadcrumbLinkAccedi;

    @Value("${breadcrumb.link.recuperaPassword}")
    private String breadcrumbLinkRecuperaPassword;

    @Value("${breadcrumb.link.recuperaIdUtente}")
    private String breadcrumbLinkRecuperaIdUtente;

    @Value("${breadcrumb.link.cambioPassword}")
    private String breadcrumbLinkCambioPassword;

    @Value("${breadcrumb.link.altreModalita}")
    private String breadcrumbLinkAltreModalita;

    @Value("${breadcrumb.link.resetPassword}")
    private String breadcrumbLinkResetPassword;

    @Value("${breadcrumb.link.updateCompanyProfile}")
    private String breadcrumbLinkUpdateCompanyProfile;

    @Value("${breadcrumb.link.updateUserProfile}")
    private String breadcrumbLinkUpdateUserProfile;

    // Analytics
    @Value("${analytics.adobe.enabled}")
    private boolean enabledAdobeAnalytics;

    @Value("${analytics.google.enabled}")
    private boolean enabledGoogleAnalytics;
    // End Analytics

    // Anon Session
    @Value("${anon.session.url.sessionByToken}")
    private String anonSessionByTokenUrl;

    @Value("${anon.session.url.update}")
    private String updateAnonSessionUrl;

    @Value("${anon.session.token.validity}")
    private long anonSessionTokenTimeValidity;

    @Value("${anon.session.token.cookie.name}")
    private String anonSessionTokenCookieName;

    @Value("${anon.session.token.cookie.httpOnly}")
    private boolean anonSessionTokenCookieHttpOnly;

    @Value("${anon.session.token.cookie.secure}")
    private boolean anonSessionTokenCookieSecure;

    @Value("${anon.session.token.cookie.path}")
    private String anonSessionTokenCookiePath;

    @Value("${anon.session.token.cookie.domain}")
    private String anonSessionTokenCookieDomain;

    @Value("${anon.session.mail.subject}")
    private String mailAnonSessionSubject;

    @Value("${anon.session.customApp}")
    private String[] anonSessionCustomApp;

    @Value("${mail.from}")
    private String mailFrom;

    @Value("${mail.url}")
    private String mailServiceUrl;
    // End Anon Session

    // Mobile App
    @Value("${sso.oauth2.pattern}")
    private String oauth2Pattern;
    // End Mobile App

    @Value("${cdm.tipo.utente.spid}")
    private String cdmTipoUtenteSpid;

    // @Value("${cdm.tipo.utente.localeResidente}")
    // private String cdmTipoUtenteLocaleResidente;
    //
    // @Value("${cdm.tipo.utente.nonResidente}")
    // private String cdmTipoUtenteNonResidente;

    @Value("${cdm.tipo.utente.lite}")
    private String cdmTipoUtenteLite;

    @Value("${cdm.tipo.utente.cie}")
    private String cdmTipoUtenteCie;

    @Value("${cdm.tipo.utente.spidAzienda}")
    private String cdmTipoUtenteSpidAzienda;

    @Value("${cdm.giuridica}")
    private String cdmGiuridica;

    @Value("${cdm.fisica}")
    private String cdmFisica;

    @Value("${cdm.residente}")
    private String cdmResidente;

    @Value("${password.link.modificaPassword}")
    private String linkModificaPassword;

    @Value("${sso.url.ldapUserInfo}")
    private String ldapUserInfo;

    @Value("${sso.url.ldapUserDelete}")
    private String ldapUserDelete;

    @Value("${sso.url.ldapUserUpdate}")
    private String ldapUserUpdate;

    @Value("${sso.url.userFieldModify}")
    private String userFieldModify;

    @Value("${sso.postLogin.newUser}")
    private String newUser;

    @Value("${sso.postLogin.spidEmail}")
    private String spidEmail;

    @Value("${sso.postLogin.email}")
    private String email;

    @Value("${sso.postLogin.spidEmailChanged}")
    private String spidEmailChanged;

    @Value("${sso.postLogin.spidMobile}")
    private String spidMobile;

    @Value("${sso.postLogin.mobile}")
    private String mobile;

    @Value("${sso.postLogin.spidMobileChanged}")
    private String spidmobilechanged;

    @Value("${sso.postLogin.cieEmailChanged}")
    private String cieEmailChanged;

    @Value("${sso.postLogin.cieMobileChanged}")
    private String cieMobilechanged;

    @Value("${sso.postLogin.cieMobile}")
    private String cieMobile;

    @Value("${sso.postLogin.cieEmail}")
    private String cieEmail;

    @Value("${sso.postLogin.newUserCIE}")
    private String newUserCIE;

    @Value("${sso.postLogin.knownUser}")
    private String knownUser;

    @Value("${sso.postLogin.iterationLimitcheckProvisioning}")
    private String iterationLimitcheckProvisioning;

    @Value("${sso.postLogin.timeLimitCheckProvisioning}")
    private String timeLimitCheckProvisioning;

    @Value("${sso.postLogin.timeBeforeLogout}")
    private String timeBeforeLogout;

    @Value("${sso.postLogin.nascitaData}")
    private String nascitaData;

    @Value("${sso.cie.enableCheckApp}")
    private boolean enableCheckCieApp;

    @Value("${sso.url.createUser}")
    private String createUserUrl;

    @Value("${sso.url.createCompany}")
    private String createCompanyUrl;

    @Value("${sso.url.checkUser}")
    private String checkUserUrl;

    @Value("${sso.url.searchUser}")
    private String searchUserUrl;

    @Value("${sso.url.nazioneInfo}")
    private String nazioneInfoUrl;

    @Value("${sso.url.ldapCompanyInfo}")
    private String ldapCompanyInfoUrl;

    @Value("${sso.url.searchCompany}")
    private String searchCompanyUrl;

    @Value("${sso.url.searchCompanyAlternativa}")
    private String searchCompanyAlternativaUrl;

    @Value("${sso.url.searchCompanyRappLegale}")
    private String searchCompanyRappLegaleUrl;

    @Value("${sso.url.nazioniLista}")
    private String nazioniListaUrl;

    @Value("${sso.url.provinceLista}")
    private String provinceListaUrl;

    @Value("${sso.url.comuniLista}")
    private String comuniListaUrl;

    @Value("${sso.url.nazioneInfoByNome}")
    private String nazioneInfoByNomeUrl;

    @Value("${sso.url.provinciaInfoByIdProvincia}")
    private String provinciaInfoByIdProvinciaUrl;

    @Value("${sso.url.comuneInfoByCodice}")
    private String comuneInfoByCodiceUrl;

    @Value("${sso.url.userUpdateProfile}")
    private String userUpdateProfileUrl;

    @Value("${sso.url.companyFieldModify}")
    private String companyFieldModifyUrl;

    @Value("${sso.url.companyUpdateProfile}")
    private String companyUpdateProfileUrl;

    @Value("${sso.url.emailCheck}")
    private String emailCheckUrl;

    @Value("${sso.url.emailCheckTokenCheck}")
    private String emailCheckTokenCheckUrl;

    @Value("${sso.url.otpGenerateSendEmail}")
    private String otpGenerateSendEmailUrl;

    @Value("${sso.url.otpPhoneGenerateSendEmail}")
    private String otpPhoneGenerateSendEmailUrl;

    @Value("${sso.url.otpGenerateOtpPhone}")
    private String otpGenerateSendPhoneUrl;

    @Value("${sso.url.otpCheck}")
    private String otpCheckUrl;

    @Value("${sso.url.otpDelete}")
    private String otpDeleteUrl;

    @Value("${sso.url.resetDevice}")
    private String resetDeviceUrl;

    @Value("${sso.url.domicilioDigitaleUrl}")
    private String domicilioDigitaleUrl;

    @Value("${sso.faketoken:false}")
    private boolean fakeToken;

    @Value("${logoutUrl}")
    private String logoutHeaderUrl;

    @Value("${newsletter.informami.iscrizioneUrl}")
    private String informamiIscrizioneUrl;

    @Value("${sso.url.entraConCIEUrl}")
    private String entraConCIEUrl;

    @Value("${sso.url.entraDipendenteUrl}")
    private String entraDipendenteUrl;

    @Value("${sso.ageCheck.checkAgeEnabled}")
    private boolean checkAgeEnabled;

    @Value("${sso.ageCheck.minAge}")
    private int minAge;

    @Value("${sso.ageCheck.redirectTimeout}")
    private String redirectTimeout;

    @Value("${sso.url.ldapUserAggiornamento}")
    private String ldapUserAggiornamento;

    @Value("${sso.mfa.url}")
    private String loginMfaUrl;

    @Value("${sso.mfa.credentials}")
    private String loginMfaCredentials;

    @Value("${journey.enabled}")
    private boolean enableJourney;

    @Value("${journey.id}")
    private String journeyObjectId;

    @Value("${employeeType.type.spid}")
    private String employeeTypeSpid;

    @Value("${employeeType.type.cie}")
    private String employeeTypeCie;

    @Value("${employeeType.type.spidaz}")
    private String employeeTypeSpidAz;

    @Value("${employeeType.type.adminI}")
    private String employeeTypeAdminI;

    @Value("${employeeType.type.adminE}")
    private String employeeTypeAdminE;

    public boolean isEnableJourney() {
        return enableJourney;
    }

    public void setEnableJourney(boolean journeyEnabled) {
        this.enableJourney = journeyEnabled;
    }

    public String getJourneyObjectId() {
        return journeyObjectId;
    }

    public void setJourneyObjectId(String journeyObjectId) {
        this.journeyObjectId = journeyObjectId;
    }

    public String getEntraConCIEUrl() {
        return entraConCIEUrl;
    }

    public void setEntraConCIEUrl(String entraConCIEUrl) {
        this.entraConCIEUrl = entraConCIEUrl;
    }

    public boolean isFakeToken() {
        return fakeToken;
    }

    public void setFakeToken(boolean fakeToken) {
        this.fakeToken = fakeToken;
    }

    public String getBreadcrumbLinkUpdateCompanyProfile() {
        return breadcrumbLinkUpdateCompanyProfile;
    }

    public void setBreadcrumbLinkUpdateCompanyProfile(String breadcrumbLinkUpdateCompanyProfile) {
        this.breadcrumbLinkUpdateCompanyProfile = breadcrumbLinkUpdateCompanyProfile;
    }

    public String getBreadcrumbLinkUpdateUserProfile() {
        return breadcrumbLinkUpdateUserProfile;
    }

    public void setBreadcrumbLinkUpdateUserProfile(String breadcrumbLinkUpdateUserProfile) {
        this.breadcrumbLinkUpdateUserProfile = breadcrumbLinkUpdateUserProfile;
    }

    public String getEmailCheckUrl() {
        return emailCheckUrl;
    }

    public void setEmailCheckUrl(String emailCheckUrl) {
        this.emailCheckUrl = emailCheckUrl;
    }

    public String getEmailCheckTokenCheckUrl() {
        return emailCheckTokenCheckUrl;
    }

    public void setEmailCheckTokenCheckUrl(String emailCheckTokenCheckUrl) {
        this.emailCheckTokenCheckUrl = emailCheckTokenCheckUrl;
    }

    public String getDomicilioDigitaleUrl() {
        return domicilioDigitaleUrl;
    }

    public void setDomicilioDigitaleUrl(String domicilioDigitaleUrl) {
        this.domicilioDigitaleUrl = domicilioDigitaleUrl;
    }

    public String getCompanyUpdateProfileUrl() {
        return companyUpdateProfileUrl;
    }

    public void setCompanyUpdateProfileUrl(String companyUpdateProfileUrl) {
        this.companyUpdateProfileUrl = companyUpdateProfileUrl;
    }

    public String getCompanyFieldModifyUrl() {
        return companyFieldModifyUrl;
    }

    public void setCompanyFieldModifyUrl(String companyFieldModifyUrl) {
        this.companyFieldModifyUrl = companyFieldModifyUrl;
    }

    public String getLdapUserUpdate() {
        return ldapUserUpdate;
    }

    public void setLdapUserUpdate(String ldapUserUpdate) {
        this.ldapUserUpdate = ldapUserUpdate;
    }

    public String getUserUpdateProfileUrl() {
        return userUpdateProfileUrl;
    }

    public void setUserUpdateProfileUrl(String userUpdateProfileUrl) {
        this.userUpdateProfileUrl = userUpdateProfileUrl;
    }

    public String getNazioniListaUrl() {
        return nazioniListaUrl;
    }

    public void setNazioniListaUrl(String nazioniListaUrl) {
        this.nazioniListaUrl = nazioniListaUrl;
    }

    public String getProvinceListaUrl() {
        return provinceListaUrl;
    }

    public void setProvinceListaUrl(String provinceListaUrl) {
        this.provinceListaUrl = provinceListaUrl;
    }

    public String getComuniListaUrl() {
        return comuniListaUrl;
    }

    public void setComuniListaUrl(String comuniListaUrl) {
        this.comuniListaUrl = comuniListaUrl;
    }

    public String getLdapCompanyInfoUrl() {
        return ldapCompanyInfoUrl;
    }

    public void setLdapCompanyInfoUrl(String ldapCompanyInfoUrl) {
        this.ldapCompanyInfoUrl = ldapCompanyInfoUrl;
    }

    public String getSearchCompanyUrl() {
        return searchCompanyUrl;
    }

    public void setSearchCompanyUrl(String searchCompanyUrl) {
        this.searchCompanyUrl = searchCompanyUrl;
    }

    public String getSearchCompanyAlternativaUrl() {
        return searchCompanyAlternativaUrl;
    }

    public void setSearchCompanyAlternativaUrl(String searchCompanyAlternativaUrl) {
        this.searchCompanyAlternativaUrl = searchCompanyAlternativaUrl;
    }

    public String getSearchCompanyRappLegaleUrl() {
        return searchCompanyRappLegaleUrl;
    }

    public void setSearchCompanyRappLegaleUrl(String searchCompanyRappLegaleUrl) {
        this.searchCompanyRappLegaleUrl = searchCompanyRappLegaleUrl;
    }

    public String getNazioneInfoUrl() {
        return nazioneInfoUrl;
    }

    public void setNazioneInfoUrl(String nazioneInfoUrl) {
        this.nazioneInfoUrl = nazioneInfoUrl;
    }

    public String getCdmResidente() {
        return cdmResidente;
    }

    public void setCdmResidente(String cdmResidente) {
        this.cdmResidente = cdmResidente;
    }

    public String getSearchUserUrl() {
        return searchUserUrl;
    }

    public void setSearchUserUrl(String searchUserUrl) {
        this.searchUserUrl = searchUserUrl;
    }

    public String getCheckUserUrl() {
        return checkUserUrl;
    }

    public void setCheckUserUrl(String checkUserUrl) {
        this.checkUserUrl = checkUserUrl;
    }

    public String getCreateUserUrl() {
        return createUserUrl;
    }

    public void setCreateUserUrl(String createUserUrl) {
        this.createUserUrl = createUserUrl;
    }

    public String getCreateCompanyUrl() {
        return createCompanyUrl;
    }

    public void setCreateCompanyUrl(String createCompanyUrl) {
        this.createCompanyUrl = createCompanyUrl;
    }

    public String getIterationLimitcheckProvisioning() {
        return iterationLimitcheckProvisioning;
    }

    public void setIterationLimitcheckProvisioning(String iterationLimitcheckProvisioning) {
        this.iterationLimitcheckProvisioning = iterationLimitcheckProvisioning;
    }

    public String getTimeLimitCheckProvisioning() {
        return timeLimitCheckProvisioning;
    }

    public void setTimeLimitCheckProvisioning(String timeLimitCheckProvisioning) {
        this.timeLimitCheckProvisioning = timeLimitCheckProvisioning;
    }

    public String getUserFieldModify() {
        return userFieldModify;
    }

    public void setUserFieldModify(String userFieldModify) {
        this.userFieldModify = userFieldModify;
    }

    public String getLdapUserInfo() {
        return ldapUserInfo;
    }

    public void setLdapUserInfo(String ldapUserInfo) {
        this.ldapUserInfo = ldapUserInfo;
    }

    public String getLdapUserDelete() {
        return ldapUserDelete;
    }

    public void setLdapUserDelete(String ldapUserDelete) {
        this.ldapUserDelete = ldapUserDelete;
    }

    public String getLogoutRedirectUrl() {
        return logoutRedirectUrl;
    }

    public void setLogoutRedirectUrl(String logoutRedirectUrl) {
        this.logoutRedirectUrl = logoutRedirectUrl;
    }

    public String getSessionInfoUrl() {
        return sessionInfoUrl;
    }

    public void setSessionInfoUrl(String sessionInfoUrl) {
        this.sessionInfoUrl = sessionInfoUrl;
    }

    public String getAuthenticateUrl() {
        return authenticateUrl;
    }

    public void setAuthenticateUrl(String authenticateUrl) {
        this.authenticateUrl = authenticateUrl;
    }

    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public String getJwtCookieName() {
        return jwtCookieName;
    }

    public void setJwtCookieName(String jwtCookieName) {
        this.jwtCookieName = jwtCookieName;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getTargetUrlParam() {
        return targetUrlParam;
    }

    public void setTargetUrlParam(String targetUrlParam) {
        this.targetUrlParam = targetUrlParam;
    }

    public String getTargetUrlDefault() {
        return targetUrlDefault;
    }

    public void setTargetUrlDefault(String targetUrlDefault) {
        this.targetUrlDefault = targetUrlDefault;
    }

    public boolean isFakeResponse() {
        return fakeResponse;
    }

    public void setFakeResponse(boolean fakeResponse) {
        this.fakeResponse = fakeResponse;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getResetUserIdByEmail() {
        return resetUserIdByEmail;
    }

    public void setResetUserIdByEmail(String resetUserIdByEmail) {
        this.resetUserIdByEmail = resetUserIdByEmail;
    }

    public String getPasswordRecovery() {
        return passwordRecovery;
    }

    public void setPasswordRecovery(String passwordRecovery) {
        this.passwordRecovery = passwordRecovery;
    }

    public boolean isCaptchaEnabled() {
        return captchaEnabled;
    }

    public void setCaptchaEnabled(boolean captchaEnabled) {
        this.captchaEnabled = captchaEnabled;
    }

    public String getCaptchaSiteKey() {
        return captchaSiteKey;
    }

    public void setCaptchaSiteKey(String captchaSiteKey) {
        this.captchaSiteKey = captchaSiteKey;
    }

    public String getCaptchaSecretKey() {
        return captchaSecretKey;
    }

    public void setCaptchaSecretKey(String captchaSecretKey) {
        this.captchaSecretKey = captchaSecretKey;
    }

    public String getHcaptchaVerifierUrl() {
        return hcaptchaVerifierUrl;
    }

    public void setHcaptchaVerifierUrl(String hcaptchaVerifierUrl) {
        this.hcaptchaVerifierUrl = hcaptchaVerifierUrl;
    }

    public String getPasswordRecoveryTokenCheck() {
        return passwordRecoveryTokenCheck;
    }

    public void setPasswordRecoveryTokenCheck(String passwordRecoveryTokenCheck) {
        this.passwordRecoveryTokenCheck = passwordRecoveryTokenCheck;
    }

    public String getResetUserIdByPartitaIva() {
        return resetUserIdByPartitaIva;
    }

    public void setResetUserIdByPartitaIva(String resetUserIdByPartitaIva) {
        this.resetUserIdByPartitaIva = resetUserIdByPartitaIva;
    }

    public String getPasswordReset() {
        return passwordReset;
    }

    public void setPasswordReset(String passwordReset) {
        this.passwordReset = passwordReset;
    }

    public String getStaticResourceUrl() {
        return staticResourceUrl;
    }

    public void setStaticResourceUrl(String staticResourceUrl) {
        this.staticResourceUrl = staticResourceUrl;
    }

    public String getPasswordChange() {
        return passwordChange;
    }

    public void setPasswordChange(String passwordChange) {
        this.passwordChange = passwordChange;
    }

    public String getFooterLinkUtili() {
        return footerLinkUtili;
    }

    public void setFooterLinkUtili(String footerLinkUtili) {
        this.footerLinkUtili = footerLinkUtili;
    }

    public String getHeaderLink() {
        return headerLink;
    }

    public void setHeaderLink(String headerLink) {
        this.headerLink = headerLink;
    }

    public String getScriviLink() {
        return scriviLink;
    }

    public void setScriviLink(String scriviLink) {
        this.scriviLink = scriviLink;
    }

    public String getRegistratiLink() {
        return registratiLink;
    }

    public void setRegistratiLink(String registratiLink) {
        this.registratiLink = registratiLink;
    }

    public String getTargetUrlPattern() {
        return targetUrlPattern;
    }

    public void setTargetUrlPattern(String targetUrlPattern) {
        this.targetUrlPattern = targetUrlPattern;
    }

    public String getPostLoginUrl() {
        return postLoginUrl;
    }

    public void setPostLoginUrl(String postLoginUrl) {
        this.postLoginUrl = postLoginUrl;
    }

    public String getHttpHeaderPostLoginUrl() {
        return httpHeaderPostLoginUrl;
    }

    public void setHttpHeaderPostLoginUrl(String httpHeaderPostLoginUrl) {
        this.httpHeaderPostLoginUrl = httpHeaderPostLoginUrl;
    }

    public String getResetPasswordTargetUrl() {
        return resetPasswordTargetUrl;
    }

    public void setResetPasswordTargetUrl(String resetPasswordTargetUrl) {
        this.resetPasswordTargetUrl = resetPasswordTargetUrl;
    }

    public String getModificaProfiloLink() {
        return modificaProfiloLink;
    }

    public void setModificaProfiloLink(String modificaProfiloLink) {
        this.modificaProfiloLink = modificaProfiloLink;
    }

    public String getFascicoloCittadinoLink() {
        return fascicoloCittadinoLink;
    }

    public void setFascicoloCittadinoLink(String fascicoloCittadinoLink) {
        this.fascicoloCittadinoLink = fascicoloCittadinoLink;
    }

    public String getPasswordChangeExpired() {
        return passwordChangeExpired;
    }

    public void setPasswordChangeExpired(String passwordChangeExpired) {
        this.passwordChangeExpired = passwordChangeExpired;
    }

    public String getOldLogoutRedirectUrl() {
        return oldLogoutRedirectUrl;
    }

    public void setOldLogoutRedirectUrl(String oldLogoutRedirectUrl) {
        this.oldLogoutRedirectUrl = oldLogoutRedirectUrl;
    }

    public String getOldCookieName() {
        return oldCookieName;
    }

    public void setOldCookieName(String oldCookieName) {
        this.oldCookieName = oldCookieName;
    }

    public String getChatUrl() {
        return chatUrl;
    }

    public void setChatUrl(String chatUrl) {
        this.chatUrl = chatUrl;
    }

    public String getKnowledgeBaseIt() {
        return knowledgeBaseIt;
    }

    public void setKnowledgeBaseIt(String knowledgeBaseIt) {
        this.knowledgeBaseIt = knowledgeBaseIt;
    }

    public String getChatAuth() {
        return chatAuth;
    }

    public void setChatAuth(String chatAuth) {
        this.chatAuth = chatAuth;
    }

    public String getHomepageLink() {
        return homepageLink;
    }

    public void setHomepageLink(String homepageLink) {
        this.homepageLink = homepageLink;
    }

    public String getBreadcrumbLinkHome() {
        return breadcrumbLinkHome;
    }

    public void setBreadcrumbLinkHome(String breadcrumbLinkHome) {
        this.breadcrumbLinkHome = breadcrumbLinkHome;
    }

    public String getBreadcrumbLinkAccedi() {
        return breadcrumbLinkAccedi;
    }

    public void setBreadcrumbLinkAccedi(String breadcrumbLinkAccedi) {
        this.breadcrumbLinkAccedi = breadcrumbLinkAccedi;
    }

    public String getBreadcrumbLinkRecuperaPassword() {
        return breadcrumbLinkRecuperaPassword;
    }

    public void setBreadcrumbLinkRecuperaPassword(String breadcrumbLinkRecuperaPassword) {
        this.breadcrumbLinkRecuperaPassword = breadcrumbLinkRecuperaPassword;
    }

    public String getBreadcrumbLinkRecuperaIdUtente() {
        return breadcrumbLinkRecuperaIdUtente;
    }

    public void setBreadcrumbLinkRecuperaIdUtente(String breadcrumbLinkRecuperaIdUtente) {
        this.breadcrumbLinkRecuperaIdUtente = breadcrumbLinkRecuperaIdUtente;
    }

    public String getBreadcrumbLinkCambioPassword() {
        return breadcrumbLinkCambioPassword;
    }

    public void setBreadcrumbLinkCambioPassword(String breadcrumbLinkCambioPassword) {
        this.breadcrumbLinkCambioPassword = breadcrumbLinkCambioPassword;
    }

    public String getBreadcrumbLinkAltreModalita() {
        return breadcrumbLinkAltreModalita;
    }

    public void setBreadcrumbLinkAltreModalita(String breadcrumbLinkAltreModalita) {
        this.breadcrumbLinkAltreModalita = breadcrumbLinkAltreModalita;
    }

    public String getBreadcrumbLinkResetPassword() {
        return breadcrumbLinkResetPassword;
    }

    public void setBreadcrumbLinkResetPassword(String breadcrumbLinkResetPassword) {
        this.breadcrumbLinkResetPassword = breadcrumbLinkResetPassword;
    }

    // Analytics
    public boolean getEnabledAdobeAnalytics() {
        return enabledAdobeAnalytics;
    }

    public void setEnabledAdobeAnalytics(boolean enabledAdobeAnalytics) {
        this.enabledAdobeAnalytics = enabledAdobeAnalytics;
    }

    public boolean getEnabledGoogleAnalytics() {
        return enabledGoogleAnalytics;
    }

    public void setEnabledGoogleAnalytics(boolean enabledGoogleAnalytics) {
        this.enabledGoogleAnalytics = enabledGoogleAnalytics;
    }
    // End Analytics

    public String getAnonSessionByTokenUrl() {
        return anonSessionByTokenUrl;
    }

    public void setAnonSessionByTokenUrl(String anonSessionByTokenUrl) {
        this.anonSessionByTokenUrl = anonSessionByTokenUrl;
    }

    public long getAnonSessionTokenTimeValidity() {
        return anonSessionTokenTimeValidity;
    }

    public void setAnonSessionTokenTimeValidity(long anonSessionTokenTimeValidity) {
        this.anonSessionTokenTimeValidity = anonSessionTokenTimeValidity;
    }

    public String getAnonSessionTokenCookieName() {
        return anonSessionTokenCookieName;
    }

    public void setAnonSessionTokenCookieName(String anonSessionTokenCookieName) {
        this.anonSessionTokenCookieName = anonSessionTokenCookieName;
    }

    public boolean getAnonSessionTokenCookieHttpOnly() {
        return anonSessionTokenCookieHttpOnly;
    }

    public void setAnonSessionTokenCookieHttpOnly(boolean anonSessionTokenCookieHttpOnly) {
        this.anonSessionTokenCookieHttpOnly = anonSessionTokenCookieHttpOnly;
    }

    public boolean getAnonSessionTokenCookieSecure() {
        return anonSessionTokenCookieSecure;
    }

    public void setAnonSessionTokenCookieSecure(boolean anonSessionTokenCookieSecure) {
        this.anonSessionTokenCookieSecure = anonSessionTokenCookieSecure;
    }

    public String getAnonSessionTokenCookiePath() {
        return anonSessionTokenCookiePath;
    }

    public void setAnonSessionTokenCookiePath(String anonSessionTokenCookiePath) {
        this.anonSessionTokenCookiePath = anonSessionTokenCookiePath;
    }

    public String getAnonSessionTokenCookieDomain() {
        return anonSessionTokenCookieDomain;
    }

    public void setAnonSessionTokenCookieDomain(String anonSessionTokenCookieDomain) {
        this.anonSessionTokenCookieDomain = anonSessionTokenCookieDomain;
    }

    public String getUpdateAnonSessionUrl() {
        return updateAnonSessionUrl;
    }

    public void setUpdateAnonSessionUrl(String updateAnonSessionUrl) {
        this.updateAnonSessionUrl = updateAnonSessionUrl;
    }

    public String getMailAnonSessionSubject() {
        return mailAnonSessionSubject;
    }

    public void setMailAnonSessionSubject(String mailAnonSessionSubject) {
        this.mailAnonSessionSubject = mailAnonSessionSubject;
    }

    public String[] getAnonSessionCustomApp() {
        return anonSessionCustomApp;
    }

    public void setAnonSessionCustomApp(String[] anonSessionCustomApp) {
        this.anonSessionCustomApp = anonSessionCustomApp;
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public String getMailServiceUrl() {
        return mailServiceUrl;
    }

    public void setMailServiceUrl(String mailServiceUrl) {
        this.mailServiceUrl = mailServiceUrl;
    }

    public String getOauth2Pattern() {
        return oauth2Pattern;
    }

    public void setOauth2Pattern(String oauth2Pattern) {
        this.oauth2Pattern = oauth2Pattern;
    }

    public String getCdmTipoUtenteSpid() {
        return cdmTipoUtenteSpid;
    }

    public void setCdmTipoUtenteSpid(String cdmTipoUtenteSpid) {
        this.cdmTipoUtenteSpid = cdmTipoUtenteSpid;
    }

    public String getLinkModificaPassword() {
        return linkModificaPassword;
    }

    public void setLinkModificaPassword(String linkModificaPassword) {
        this.linkModificaPassword = linkModificaPassword;
    }

    public String getNewUser() {
        return newUser;
    }

    public void setNewUser(String newUser) {
        this.newUser = newUser;
    }

    public String getNewUserCIE() {
        return newUserCIE;
    }

    public void setNewUserCIE(String newUserCIE) {
        this.newUserCIE = newUserCIE;
    }

    public String getSpidEmail() {
        return spidEmail;
    }

    public void setSpidEmail(String spidEmail) {
        this.spidEmail = spidEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpidEmailChanged() {
        return spidEmailChanged;
    }

    public void setSpidEmailChanged(String spidEmailChanged) {
        this.spidEmailChanged = spidEmailChanged;
    }

    public String getSpidMobile() {
        return spidMobile;
    }

    public void setSpidMobile(String spidMobile) {
        this.spidMobile = spidMobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSpidmobilechanged() {
        return spidmobilechanged;
    }

    public void setSpidmobilechanged(String spidmobilechanged) {
        this.spidmobilechanged = spidmobilechanged;
    }

    public String getCdmGiuridica() {
        return cdmGiuridica;
    }

    public void setCdmGiuridica(String cdmGiuridica) {
        this.cdmGiuridica = cdmGiuridica;
    }

    public String getCdmFisica() {
        return cdmFisica;
    }

    public void setCdmFisica(String cdmFisica) {
        this.cdmFisica = cdmFisica;
    }

    public String getLogoutHeaderUrl() {
        return logoutHeaderUrl;
    }

    public void setLogoutHeaderUrl(String logoutHeaderUrl) {
        this.logoutHeaderUrl = logoutHeaderUrl;
    }

    public String getCdmTipoUtenteLite() {
        return cdmTipoUtenteLite;
    }

    public void setCdmTipoUtenteLite(String cdmTipoUtenteLite) {
        this.cdmTipoUtenteLite = cdmTipoUtenteLite;
    }

    public String getCdmTipoUtenteCie() {
        return cdmTipoUtenteCie;
    }

    public String getCdmTipoUtenteSpidAzienda() {
        return cdmTipoUtenteSpidAzienda;
    }

    public void setCdmTipoUtenteSpidAzienda(String cdmTipoUtenteSpidAzienda) {
        this.cdmTipoUtenteSpidAzienda = cdmTipoUtenteSpidAzienda;
    }

    public void setCdmTipoUtenteCie(String cdmTipoUtenteCie) {
        this.cdmTipoUtenteCie = cdmTipoUtenteCie;
    }

    public String getOtpGenerateSendEmailUrl() {
        return otpGenerateSendEmailUrl;
    }

    public void setOtpGenerateSendEmailUrl(String otpGenerateSendEmailUrl) {
        this.otpGenerateSendEmailUrl = otpGenerateSendEmailUrl;
    }

    public String getOtpCheckUrl() {
        return otpCheckUrl;
    }

    public void setOtpCheckUrl(String otpCheckUrl) {
        this.otpCheckUrl = otpCheckUrl;
    }

    public String getOtpDeleteUrl() {
        return otpDeleteUrl;
    }

    public void setOtpDeleteUrl(String otpDeleteUrl) {
        this.otpDeleteUrl = otpDeleteUrl;
    }

    public String getResetDeviceUrl() {
        return resetDeviceUrl;
    }

    public void setResetDeviceUrl(String resetDeviceUrl) {
        this.resetDeviceUrl = resetDeviceUrl;
    }

    public String getNazioneInfoByNomeUrl() {
        return nazioneInfoByNomeUrl;
    }

    public void setNazioneInfoByNomeUrl(String nazioneInfoByNomeUrl) {
        this.nazioneInfoByNomeUrl = nazioneInfoByNomeUrl;
    }

    public String getProvinciaInfoByIdProvinciaUrl() {
        return provinciaInfoByIdProvinciaUrl;
    }

    public void setProvinciaInfoByIdProvinciaUrl(String provinciaInfoByIdProvinciaUrl) {
        this.provinciaInfoByIdProvinciaUrl = provinciaInfoByIdProvinciaUrl;
    }

    public String getComuneInfoByCodiceUrl() {
        return comuneInfoByCodiceUrl;
    }

    public void setComuneInfoByCodiceUrl(String comuneInfoByCodiceUrl) {
        this.comuneInfoByCodiceUrl = comuneInfoByCodiceUrl;
    }

    public String getFindUserByCFNotTipoUtente() {
        return findUserByCFNotTipoUtente;
    }

    public void setFindUserByCFNotTipoUtente(String findUserByCFNotTipoUtente) {
        this.findUserByCFNotTipoUtente = findUserByCFNotTipoUtente;
    }

    public String getTimeBeforeLogout() {
        return timeBeforeLogout;
    }

    public void setTimeBeforeLogout(String timeBeforeLogout) {
        this.timeBeforeLogout = timeBeforeLogout;
    }

    public String getNascitaData() {
        return nascitaData;
    }

    public void setNascitaData(String nascitaData) {
        this.nascitaData = nascitaData;
    }

    public boolean isEnableCheckCieApp() {
        return enableCheckCieApp;
    }

    public void setEnableCheckCieApp(boolean enableCheckCieApp) {
        this.enableCheckCieApp = enableCheckCieApp;
    }

    public boolean isCheckAgeEnabled() {
        return checkAgeEnabled;
    }

    public void setCheckAgeEnabled(boolean checkAgeEnabled) {
        this.checkAgeEnabled = checkAgeEnabled;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getRedirectTimeout() {
        return redirectTimeout;
    }

    public void setRedirectTimeout(String redirectTimeout) {
        this.redirectTimeout = redirectTimeout;
    }

    public String getLogoutMessageMobile() {
        return logoutMessageMobile;
    }

    public void setLogoutMessageMobile(String logoutMessageMobile) {
        this.logoutMessageMobile = logoutMessageMobile;
    }

    public String getLdapUserAggiornamento() {
        return ldapUserAggiornamento;
    }

    public void setLdapUserAggiornamento(String ldapUserAggiornamento) {
        this.ldapUserAggiornamento = ldapUserAggiornamento;
    }

    /*
     * Bean di configurazione dove viene definito il path dei file di
     * template".ftl";
     * Viene definita la codifica UTF-8 per i caratteri speciali;
     * Viene definito che il formato output(output_format) desiderao è HTML;
     * Viene definita la mappa "sharedVariables" per essere richiamate nel template
     * FreeMarker, la variabile di accesso è "cdnUrl";
     * Viene restituire l'oggetto di configurazione "freeMarkerConfigurer";
     */
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("classpath:/templates");
        freeMarkerConfigurer.setDefaultEncoding("UTF-8");
        Properties p = new Properties();
        p.setProperty("output_format", "HTML");
        freeMarkerConfigurer.setFreemarkerSettings(p);

        Map<String, Object> sharedVariables = new HashMap<>();
        sharedVariables.put("cdnUrl", staticResourceUrl);
        freeMarkerConfigurer.setFreemarkerVariables(sharedVariables);

        return freeMarkerConfigurer;
    }

    public String getInformamiIscrizioneUrl() {
        return informamiIscrizioneUrl;
    }

    public void setInformamiIscrizioneUrl(String informamiIscrizioneUrl) {
        this.informamiIscrizioneUrl = informamiIscrizioneUrl;
    }

    public String getKnownUser() {
        return knownUser;
    }

    public void setKnownUser(String knownUser) {
        this.knownUser = knownUser;
    }

    public String getEntraDipendenteUrl() {
        return entraDipendenteUrl;
    }

    public void setEntraDipendenteUrl(String entraDipendenteUrl) {
        this.entraDipendenteUrl = entraDipendenteUrl;
    }

    public String getLoginMfaUrl() {
        return loginMfaUrl;
    }

    public void setLoginMfaUrl(String loginMfaUrl) {
        this.loginMfaUrl = loginMfaUrl;
    }

    public String getLoginMfaCredentials() {
        return loginMfaCredentials;
    }

    public void setLoginMfaCredentials(String loginMfaCredentials) {
        this.loginMfaCredentials = loginMfaCredentials;
    }

    public String getOtpPhoneGenerateSendEmailUrl() {
        return otpPhoneGenerateSendEmailUrl;
    }

    public void setOtpPhoneGenerateSendEmailUrl(String otpPhoneGenerateSendEmailUrl) {
        this.otpPhoneGenerateSendEmailUrl = otpPhoneGenerateSendEmailUrl;
    }

    public String getOblioLinkUrl() {
        return oblioLinkUrl;
    }

    public void setOblioLinkUrl(String oblioLinkUrl) {
        this.oblioLinkUrl = oblioLinkUrl;
    }

    public String getOtpGenerateSendPhoneUrl() {
        return otpGenerateSendPhoneUrl;
    }

    public void setOtpGenerateSendPhoneUrl(String otpGenerateSendPhoneUrl) {
        this.otpGenerateSendPhoneUrl = otpGenerateSendPhoneUrl;
    }

    public String getCieEmailChanged() {
        return cieEmailChanged;
    }

    public void setCieEmailChanged(String cieEmailChanged) {
        this.cieEmailChanged = cieEmailChanged;
    }

    public String getCieMobilechanged() {
        return cieMobilechanged;
    }

    public void setCieMobilechanged(String cieMobilechanged) {
        this.cieMobilechanged = cieMobilechanged;
    }

    public String getCieMobile() {
        return cieMobile;
    }

    public void setCieMobile(String cieMobile) {
        this.cieMobile = cieMobile;
    }

    public String getCieEmail() {
        return cieEmail;
    }

    public void setCieEmail(String cieEmail) {
        this.cieEmail = cieEmail;
    }

    public String getEmployeeTypeSpid() {
        return employeeTypeSpid;
    }

    public void setEmployeeTypeSpid(String employeeTypeSpid) {
        this.employeeTypeSpid = employeeTypeSpid;
    }

    public String getEmployeeTypeCie() {
        return employeeTypeCie;
    }

    public void setEmployeeTypeCie(String employeeTypeCie) {
        this.employeeTypeCie = employeeTypeCie;
    }

    public String getEmployeeTypeSpidAz() {
        return employeeTypeSpidAz;
    }

    public void setEmployeeTypeSpidAz(String employeeTypeSpidAz) {
        this.employeeTypeSpidAz = employeeTypeSpidAz;
    }

    public String getEmployeeTypeAdminI() {
        return employeeTypeAdminI;
    }

    public void setEmployeeTypeAdminI(String employeeTypeAdminI) {
        this.employeeTypeAdminI = employeeTypeAdminI;
    }

    public String getEmployeeTypeAdminE() {
        return employeeTypeAdminE;
    }

    public void setEmployeeTypeAdminE(String employeeTypeAdminE) {
        this.employeeTypeAdminE = employeeTypeAdminE;
    }

}
