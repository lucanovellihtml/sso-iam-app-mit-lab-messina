package com.dxc.mit.iam.configuration;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SSOConfiguration {
    @Value("${sso.url.authenticate}")
    private String authenticateUrl;

    @Value("${sso.cookieName}")
    private String cookieName;

    @Value("${sso.jwtCookieName}")
    private String jwtCookieName;

    @Value("${sso.agentAuthnTxCookie}")
    private String agentAuthnTxCookie;

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

    @Value("${google.recaptcha.key.site}")
    private String recaptchaCode;

    @Value("${google.recaptcha.key.secret}")
    private String recaptchaSecretKey;

    @Value("${google.recaptcha.urlVerifier}")
    private String googleCaptchaVerifierUrl;

    @Value("${sso.url.postLoginUrl}")
    private String postLoginUrl;

    @Value("${sso.url.httpHeaderPostLoginUrl}")
    private String httpHeaderPostLoginUrl;

    @Value("${sso.url.passwordRecoveryTokenCheck}")
    private String passwordRecoveryTokenCheck;

    @Value("${google.recaptcha.captcha_enabled}")
    private boolean captchaEnabled;

    @Value("${sso.url.passwordReset}")
    private String passwordReset;

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

    @Value("${sso.logoutRedirectUrl}")
    private String logoutRedirectUrl;

    // Variabile che identifica la url richiamata quando, nella postlogin, il valore
    // dell'id utente è null
    @Value("${sso.pdtRedirectUrl}")
    private String pdtRedirectUrl;

    @Value("${sso.undoLogoutRedirectUrl}")
    private String undoLogoutRedirectUrl;

    @Value("${sso.logoutMessageMobile}")
    private String logoutMessageMobile;

    @Value("${sso.oldCookieName}")
    private String oldCookieName;

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

    @Value("${analytics.adobe.enabled}")
    private boolean enabledAdobeAnalytics;

    @Value("${analytics.google.enabled}")
    private boolean enabledGoogleAnalytics;

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

    @Value("${sso.oauth2.pattern}")
    private String oauth2Pattern;

    @Value("${cdm.tipo.utente.spid}")
    private String cdmTipoUtenteSpid;

    @Value("${sso.postLogin.headerParamNamePostLogin}")
    private String headerParamNamePostLogin;

    @Value("${sso.postLogin.headerParamValuePostLogin}")
    private String headerParamValuePostLogin;

    @Value("${sso.postLogin.headerParamNameUserId}")
    private String headerParamNameUserId;

    @Value("${sso.postLogin.headerParamNameDataNascita}")
    private String headerParamNameDataNascita;

    @Value("${sso.postLogin.dataNascitaFormat}")
    private String dataNascitaFormat;

    @Value("${forgerock.baseUrl}")
    private String forgerockBaseUrl;

    @Value("${sso.url.IdpInitiatedUrl}")
    private String forgerockIdpInitiatedUrl;

    @Value("${forgerock.adminUsername}")
    private String forgerockAdminUsername;

    @Value("${forgerock.adminPassword}")
    private String forgerockAdminPassword;

    @Value("${forgerock.adminAuthenticate}")
    private String forgerockAdminAuthenticate;

    @Value("${sso.postLogin.randomCodeGroup}")
    private String randomCodeGroup;

    @Value("${otp.validationMinutes}")
    private Integer otpValidationMinutes;

    @Value("${otp.enableOTPHeaderParamName}")
    private String otpEnableOTPHeaderParamName;

    @Value("${otp.enableCheckApp}")
    private String otpEnableCheckApp;

    @Value("${sso.postLogin.headerParamNameUserName}")
    private String headerParamNameUserName;

    @Value("${sso.postLogin.headerParamNameEidasPostLogin}")
    private String headerParamNameEidasPostLogin;

    @Value("${sso.postLogin.headerParamNameUserSurname}")
    private String headerParamNameUserSurname;

    @Value("${sso.postLogin.numeroTentativi}")
    private String numeroTentativi;

    @Value("${sso.cookieName}")
    private String idpCookieName;

    @Value("${sso.url.elencoSediUtenteUrl}")
    private String elencoSediUtenteUrl;

    @Value("${sso.url.aggiornaDataUltimaConnessioneUrl}")
    private String aggiornaDataUltimaConnessioneUrl;

    @Value("${sso.postLogin.randomCodeGroupNumber}")
    private String randomCodeGroupNumber;

    @Value("${cdm.tipo.utente.lite}")
    private String cdmTipoUtenteLite;

    @Value("${cdm.tipo.utente.cie}")
    private String cdmTipoUtenteCie;

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

    @Value("${sso.postLogin.newUserCIE}")
    private String newUserCIE;

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

    @Value("${sso.url.checkUser}")
    private String checkUserUrl;

    @Value("${sso.url.searchUser}")
    private String searchUserUrl;

    @Value("${sso.url.nazioneInfo}")
    private String nazioneInfoUrl;

    @Value("${sso.url.searchCompany}")
    private String searchCompanyUrl;

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

    @Value("${sso.url.otpCheck}")
    private String otpCheckUrl;

    @Value("${sso.url.otpDelete}")
    private String otpDeleteUrl;

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

    @Value("${sso.ageCheck.checkAgeEnabled}")
    private boolean checkAgeEnabled;

    @Value("${sso.ageCheck.minAge}")
    private int minAge;

    @Value("${sso.redirectTimeout}")
    private Integer redirectTimeout;

    // Variabile che identifica la url per innescare il giro della federazione per
    // spid cittadino
    @Value("${sso.url.spInitiatedBaseUrl}")
    private String spInitiatedBaseUrl;

    // Variabile che identifica la url per innescare il giro della federazione per
    // spid azienda
    @Value("${sso.url.spInitiatedBaseUrlAzienda}")
    private String spInitiatedBaseUrlAzienda;

    // Variabile che identifica la url per richiamare il json della lista degli IDP
    @Value("${sso.url.idpListUrl}")
    private String idpListUrl;

    @Value("${sso.postLogin.contestiApplicativiAbilitati}")
    private List<String> contestiApplicativiAbilitati;

    @Value("${adsp.nodo}")
    private int nodoAdsp;

    public void setAuthenticateUrl(String authenticateUrl) {
        this.authenticateUrl = authenticateUrl;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public void setJwtCookieName(String jwtCookieName) {
        this.jwtCookieName = jwtCookieName;
    }

    public void setAgentAuthnTxCookie(String agentAuthnTxCookie) {
        this.agentAuthnTxCookie = agentAuthnTxCookie;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public void setSessionInfoUrl(String sessionInfoUrl) {
        this.sessionInfoUrl = sessionInfoUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public void setTargetUrlParam(String targetUrlParam) {
        this.targetUrlParam = targetUrlParam;
    }

    public void setTargetUrlDefault(String targetUrlDefault) {
        this.targetUrlDefault = targetUrlDefault;
    }

    public void setTargetUrlPattern(String targetUrlPattern) {
        this.targetUrlPattern = targetUrlPattern;
    }

    public void setFakeResponse(boolean fakeResponse) {
        this.fakeResponse = fakeResponse;
    }

    public void setFindUserByCFNotTipoUtente(String findUserByCFNotTipoUtente) {
        this.findUserByCFNotTipoUtente = findUserByCFNotTipoUtente;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setResetUserIdByEmail(String resetUserIdByEmail) {
        this.resetUserIdByEmail = resetUserIdByEmail;
    }

    public void setResetUserIdByPartitaIva(String resetUserIdByPartitaIva) {
        this.resetUserIdByPartitaIva = resetUserIdByPartitaIva;
    }

    public void setPasswordRecovery(String passwordRecovery) {
        this.passwordRecovery = passwordRecovery;
    }

    public void setRecaptchaCode(String recaptchaCode) {
        this.recaptchaCode = recaptchaCode;
    }

    public void setRecaptchaSecretKey(String recaptchaSecretKey) {
        this.recaptchaSecretKey = recaptchaSecretKey;
    }

    public void setGoogleCaptchaVerifierUrl(String googleCaptchaVerifierUrl) {
        this.googleCaptchaVerifierUrl = googleCaptchaVerifierUrl;
    }

    public void setPostLoginUrl(String postLoginUrl) {
        this.postLoginUrl = postLoginUrl;
    }

    public void setHttpHeaderPostLoginUrl(String httpHeaderPostLoginUrl) {
        this.httpHeaderPostLoginUrl = httpHeaderPostLoginUrl;
    }

    public void setPasswordRecoveryTokenCheck(String passwordRecoveryTokenCheck) {
        this.passwordRecoveryTokenCheck = passwordRecoveryTokenCheck;
    }

    public void setCaptchaEnabled(boolean captchaEnabled) {
        this.captchaEnabled = captchaEnabled;
    }

    public void setPasswordReset(String passwordReset) {
        this.passwordReset = passwordReset;
    }

    public void setStaticResourceUrl(String staticResourceUrl) {
        this.staticResourceUrl = staticResourceUrl;
    }

    public void setPasswordChange(String passwordChange) {
        this.passwordChange = passwordChange;
    }

    public void setPasswordChangeExpired(String passwordChangeExpired) {
        this.passwordChangeExpired = passwordChangeExpired;
    }

    public void setFooterLinkUtili(String footerLinkUtili) {
        this.footerLinkUtili = footerLinkUtili;
    }

    public void setHeaderLink(String headerLink) {
        this.headerLink = headerLink;
    }

    public void setScriviLink(String scriviLink) {
        this.scriviLink = scriviLink;
    }

    public void setRegistratiLink(String registratiLink) {
        this.registratiLink = registratiLink;
    }

    public void setResetPasswordTargetUrl(String resetPasswordTargetUrl) {
        this.resetPasswordTargetUrl = resetPasswordTargetUrl;
    }

    public void setModificaProfiloLink(String modificaProfiloLink) {
        this.modificaProfiloLink = modificaProfiloLink;
    }

    public void setFascicoloCittadinoLink(String fascicoloCittadinoLink) {
        this.fascicoloCittadinoLink = fascicoloCittadinoLink;
    }

    public void setLogoutRedirectUrl(String logoutRedirectUrl) {
        this.logoutRedirectUrl = logoutRedirectUrl;
    }

    public void setPdtRedirectUrl(String pdtRedirectUrl) {
        this.pdtRedirectUrl = pdtRedirectUrl;
    }

    public void setUndoLogoutRedirectUrl(String undoLogoutRedirectUrl) {
        this.undoLogoutRedirectUrl = undoLogoutRedirectUrl;
    }

    public void setLogoutMessageMobile(String logoutMessageMobile) {
        this.logoutMessageMobile = logoutMessageMobile;
    }

    public void setOldCookieName(String oldCookieName) {
        this.oldCookieName = oldCookieName;
    }

    public void setHomepageLink(String homepageLink) {
        this.homepageLink = homepageLink;
    }

    public void setBreadcrumbLinkHome(String breadcrumbLinkHome) {
        this.breadcrumbLinkHome = breadcrumbLinkHome;
    }

    public void setBreadcrumbLinkAccedi(String breadcrumbLinkAccedi) {
        this.breadcrumbLinkAccedi = breadcrumbLinkAccedi;
    }

    public void setBreadcrumbLinkRecuperaPassword(String breadcrumbLinkRecuperaPassword) {
        this.breadcrumbLinkRecuperaPassword = breadcrumbLinkRecuperaPassword;
    }

    public void setBreadcrumbLinkRecuperaIdUtente(String breadcrumbLinkRecuperaIdUtente) {
        this.breadcrumbLinkRecuperaIdUtente = breadcrumbLinkRecuperaIdUtente;
    }

    public void setBreadcrumbLinkCambioPassword(String breadcrumbLinkCambioPassword) {
        this.breadcrumbLinkCambioPassword = breadcrumbLinkCambioPassword;
    }

    public void setBreadcrumbLinkAltreModalita(String breadcrumbLinkAltreModalita) {
        this.breadcrumbLinkAltreModalita = breadcrumbLinkAltreModalita;
    }

    public void setBreadcrumbLinkResetPassword(String breadcrumbLinkResetPassword) {
        this.breadcrumbLinkResetPassword = breadcrumbLinkResetPassword;
    }

    public void setBreadcrumbLinkUpdateCompanyProfile(String breadcrumbLinkUpdateCompanyProfile) {
        this.breadcrumbLinkUpdateCompanyProfile = breadcrumbLinkUpdateCompanyProfile;
    }

    public void setBreadcrumbLinkUpdateUserProfile(String breadcrumbLinkUpdateUserProfile) {
        this.breadcrumbLinkUpdateUserProfile = breadcrumbLinkUpdateUserProfile;
    }

    public void setEnabledAdobeAnalytics(boolean enabledAdobeAnalytics) {
        this.enabledAdobeAnalytics = enabledAdobeAnalytics;
    }

    public void setEnabledGoogleAnalytics(boolean enabledGoogleAnalytics) {
        this.enabledGoogleAnalytics = enabledGoogleAnalytics;
    }

    public void setAnonSessionByTokenUrl(String anonSessionByTokenUrl) {
        this.anonSessionByTokenUrl = anonSessionByTokenUrl;
    }

    public void setUpdateAnonSessionUrl(String updateAnonSessionUrl) {
        this.updateAnonSessionUrl = updateAnonSessionUrl;
    }

    public void setAnonSessionTokenTimeValidity(long anonSessionTokenTimeValidity) {
        this.anonSessionTokenTimeValidity = anonSessionTokenTimeValidity;
    }

    public void setAnonSessionTokenCookieName(String anonSessionTokenCookieName) {
        this.anonSessionTokenCookieName = anonSessionTokenCookieName;
    }

    public void setAnonSessionTokenCookieHttpOnly(boolean anonSessionTokenCookieHttpOnly) {
        this.anonSessionTokenCookieHttpOnly = anonSessionTokenCookieHttpOnly;
    }

    public void setAnonSessionTokenCookieSecure(boolean anonSessionTokenCookieSecure) {
        this.anonSessionTokenCookieSecure = anonSessionTokenCookieSecure;
    }

    public void setAnonSessionTokenCookiePath(String anonSessionTokenCookiePath) {
        this.anonSessionTokenCookiePath = anonSessionTokenCookiePath;
    }

    public void setAnonSessionTokenCookieDomain(String anonSessionTokenCookieDomain) {
        this.anonSessionTokenCookieDomain = anonSessionTokenCookieDomain;
    }

    public void setMailAnonSessionSubject(String mailAnonSessionSubject) {
        this.mailAnonSessionSubject = mailAnonSessionSubject;
    }

    public void setAnonSessionCustomApp(String[] anonSessionCustomApp) {
        this.anonSessionCustomApp = anonSessionCustomApp;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public void setMailServiceUrl(String mailServiceUrl) {
        this.mailServiceUrl = mailServiceUrl;
    }

    public void setOauth2Pattern(String oauth2Pattern) {
        this.oauth2Pattern = oauth2Pattern;
    }

    public void setCdmTipoUtenteSpid(String cdmTipoUtenteSpid) {
        this.cdmTipoUtenteSpid = cdmTipoUtenteSpid;
    }

    public void setHeaderParamNamePostLogin(String headerParamNamePostLogin) {
        this.headerParamNamePostLogin = headerParamNamePostLogin;
    }

    public void setHeaderParamValuePostLogin(String headerParamValuePostLogin) {
        this.headerParamValuePostLogin = headerParamValuePostLogin;
    }

    public void setHeaderParamNameUserId(String headerParamNameUserId) {
        this.headerParamNameUserId = headerParamNameUserId;
    }

    public void setHeaderParamNameDataNascita(String headerParamNameDataNascita) {
        this.headerParamNameDataNascita = headerParamNameDataNascita;
    }

    public void setDataNascitaFormat(String dataNascitaFormat) {
        this.dataNascitaFormat = dataNascitaFormat;
    }

    public void setForgerockBaseUrl(String forgerockBaseUrl) {
        this.forgerockBaseUrl = forgerockBaseUrl;
    }

    public void setForgerockIdpInitiatedUrl(String forgerockIdpInitiatedUrl) {
        this.forgerockIdpInitiatedUrl = forgerockIdpInitiatedUrl;
    }

    public void setForgerockAdminUsername(String forgerockAdminUsername) {
        this.forgerockAdminUsername = forgerockAdminUsername;
    }

    public void setForgerockAdminPassword(String forgerockAdminPassword) {
        this.forgerockAdminPassword = forgerockAdminPassword;
    }

    public void setForgerockAdminAuthenticate(String forgerockAdminAuthenticate) {
        this.forgerockAdminAuthenticate = forgerockAdminAuthenticate;
    }

    public void setRandomCodeGroup(String randomCodeGroup) {
        this.randomCodeGroup = randomCodeGroup;
    }

    public void setOtpValidationMinutes(Integer otpValidationMinutes) {
        this.otpValidationMinutes = otpValidationMinutes;
    }

    public void setOtpEnableOTPHeaderParamName(String otpEnableOTPHeaderParamName) {
        this.otpEnableOTPHeaderParamName = otpEnableOTPHeaderParamName;
    }

    public void setOtpEnableCheckApp(String otpEnableCheckApp) {
        this.otpEnableCheckApp = otpEnableCheckApp;
    }

    public void setHeaderParamNameUserName(String headerParamNameUserName) {
        this.headerParamNameUserName = headerParamNameUserName;
    }

    public void setHeaderParamNameEidasPostLogin(String headerParamNameEidasPostLogin) {
        this.headerParamNameEidasPostLogin = headerParamNameEidasPostLogin;
    }

    public void setHeaderParamNameUserSurname(String headerParamNameUserSurname) {
        this.headerParamNameUserSurname = headerParamNameUserSurname;
    }

    public void setNumeroTentativi(String numeroTentativi) {
        this.numeroTentativi = numeroTentativi;
    }

    public void setIdpCookieName(String idpCookieName) {
        this.idpCookieName = idpCookieName;
    }

    public void setElencoSediUtenteUrl(String elencoSediUtenteUrl) {
        this.elencoSediUtenteUrl = elencoSediUtenteUrl;
    }

    public void setAggiornaDataUltimaConnessioneUrl(String aggiornaDataUltimaConnessioneUrl) {
        this.aggiornaDataUltimaConnessioneUrl = aggiornaDataUltimaConnessioneUrl;
    }

    public void setRandomCodeGroupNumber(String randomCodeGroupNumber) {
        this.randomCodeGroupNumber = randomCodeGroupNumber;
    }

    public void setCdmTipoUtenteLite(String cdmTipoUtenteLite) {
        this.cdmTipoUtenteLite = cdmTipoUtenteLite;
    }

    public void setCdmTipoUtenteCie(String cdmTipoUtenteCie) {
        this.cdmTipoUtenteCie = cdmTipoUtenteCie;
    }

    public void setCdmGiuridica(String cdmGiuridica) {
        this.cdmGiuridica = cdmGiuridica;
    }

    public void setCdmFisica(String cdmFisica) {
        this.cdmFisica = cdmFisica;
    }

    public void setCdmResidente(String cdmResidente) {
        this.cdmResidente = cdmResidente;
    }

    public void setLinkModificaPassword(String linkModificaPassword) {
        this.linkModificaPassword = linkModificaPassword;
    }

    public void setLdapUserInfo(String ldapUserInfo) {
        this.ldapUserInfo = ldapUserInfo;
    }

    public void setLdapUserDelete(String ldapUserDelete) {
        this.ldapUserDelete = ldapUserDelete;
    }

    public void setLdapUserUpdate(String ldapUserUpdate) {
        this.ldapUserUpdate = ldapUserUpdate;
    }

    public void setUserFieldModify(String userFieldModify) {
        this.userFieldModify = userFieldModify;
    }

    public void setNewUser(String newUser) {
        this.newUser = newUser;
    }

    public void setSpidEmail(String spidEmail) {
        this.spidEmail = spidEmail;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSpidEmailChanged(String spidEmailChanged) {
        this.spidEmailChanged = spidEmailChanged;
    }

    public void setSpidMobile(String spidMobile) {
        this.spidMobile = spidMobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setSpidmobilechanged(String spidmobilechanged) {
        this.spidmobilechanged = spidmobilechanged;
    }

    public void setNewUserCIE(String newUserCIE) {
        this.newUserCIE = newUserCIE;
    }

    public void setIterationLimitcheckProvisioning(String iterationLimitcheckProvisioning) {
        this.iterationLimitcheckProvisioning = iterationLimitcheckProvisioning;
    }

    public void setTimeLimitCheckProvisioning(String timeLimitCheckProvisioning) {
        this.timeLimitCheckProvisioning = timeLimitCheckProvisioning;
    }

    public void setTimeBeforeLogout(String timeBeforeLogout) {
        this.timeBeforeLogout = timeBeforeLogout;
    }

    public void setNascitaData(String nascitaData) {
        this.nascitaData = nascitaData;
    }

    public void setEnableCheckCieApp(boolean enableCheckCieApp) {
        this.enableCheckCieApp = enableCheckCieApp;
    }

    public void setCreateUserUrl(String createUserUrl) {
        this.createUserUrl = createUserUrl;
    }

    public void setCheckUserUrl(String checkUserUrl) {
        this.checkUserUrl = checkUserUrl;
    }

    public void setSearchUserUrl(String searchUserUrl) {
        this.searchUserUrl = searchUserUrl;
    }

    public void setNazioneInfoUrl(String nazioneInfoUrl) {
        this.nazioneInfoUrl = nazioneInfoUrl;
    }

    public void setSearchCompanyUrl(String searchCompanyUrl) {
        this.searchCompanyUrl = searchCompanyUrl;
    }

    public void setSearchCompanyRappLegaleUrl(String searchCompanyRappLegaleUrl) {
        this.searchCompanyRappLegaleUrl = searchCompanyRappLegaleUrl;
    }

    public void setNazioniListaUrl(String nazioniListaUrl) {
        this.nazioniListaUrl = nazioniListaUrl;
    }

    public void setProvinceListaUrl(String provinceListaUrl) {
        this.provinceListaUrl = provinceListaUrl;
    }

    public void setComuniListaUrl(String comuniListaUrl) {
        this.comuniListaUrl = comuniListaUrl;
    }

    public void setNazioneInfoByNomeUrl(String nazioneInfoByNomeUrl) {
        this.nazioneInfoByNomeUrl = nazioneInfoByNomeUrl;
    }

    public void setProvinciaInfoByIdProvinciaUrl(String provinciaInfoByIdProvinciaUrl) {
        this.provinciaInfoByIdProvinciaUrl = provinciaInfoByIdProvinciaUrl;
    }

    public void setComuneInfoByCodiceUrl(String comuneInfoByCodiceUrl) {
        this.comuneInfoByCodiceUrl = comuneInfoByCodiceUrl;
    }

    public void setUserUpdateProfileUrl(String userUpdateProfileUrl) {
        this.userUpdateProfileUrl = userUpdateProfileUrl;
    }

    public void setCompanyFieldModifyUrl(String companyFieldModifyUrl) {
        this.companyFieldModifyUrl = companyFieldModifyUrl;
    }

    public void setCompanyUpdateProfileUrl(String companyUpdateProfileUrl) {
        this.companyUpdateProfileUrl = companyUpdateProfileUrl;
    }

    public void setEmailCheckUrl(String emailCheckUrl) {
        this.emailCheckUrl = emailCheckUrl;
    }

    public void setEmailCheckTokenCheckUrl(String emailCheckTokenCheckUrl) {
        this.emailCheckTokenCheckUrl = emailCheckTokenCheckUrl;
    }

    public void setOtpGenerateSendEmailUrl(String otpGenerateSendEmailUrl) {
        this.otpGenerateSendEmailUrl = otpGenerateSendEmailUrl;
    }

    public void setOtpCheckUrl(String otpCheckUrl) {
        this.otpCheckUrl = otpCheckUrl;
    }

    public void setOtpDeleteUrl(String otpDeleteUrl) {
        this.otpDeleteUrl = otpDeleteUrl;
    }

    public void setDomicilioDigitaleUrl(String domicilioDigitaleUrl) {
        this.domicilioDigitaleUrl = domicilioDigitaleUrl;
    }

    public void setFakeToken(boolean fakeToken) {
        this.fakeToken = fakeToken;
    }

    public void setLogoutHeaderUrl(String logoutHeaderUrl) {
        this.logoutHeaderUrl = logoutHeaderUrl;
    }

    public void setInformamiIscrizioneUrl(String informamiIscrizioneUrl) {
        this.informamiIscrizioneUrl = informamiIscrizioneUrl;
    }

    public void setEntraConCIEUrl(String entraConCIEUrl) {
        this.entraConCIEUrl = entraConCIEUrl;
    }

    public void setCheckAgeEnabled(boolean checkAgeEnabled) {
        this.checkAgeEnabled = checkAgeEnabled;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setRedirectTimeout(Integer redirectTimeout) {
        this.redirectTimeout = redirectTimeout;
    }

    public void setSpInitiatedBaseUrl(String spInitiatedBaseUrl) {
        this.spInitiatedBaseUrl = spInitiatedBaseUrl;
    }

    public void setSpInitiatedBaseUrlAzienda(String spInitiatedBaseUrlAzienda) {
        this.spInitiatedBaseUrlAzienda = spInitiatedBaseUrlAzienda;
    }

    public void setIdpListUrl(String idpListUrl) {
        this.idpListUrl = idpListUrl;
    }

    public void setContestiApplicativiAbilitati(List<String> contestiApplicativiAbilitati) {
        this.contestiApplicativiAbilitati = contestiApplicativiAbilitati;
    }

    public void setNodoAdsp(int nodoAdsp) {
        this.nodoAdsp = nodoAdsp;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.dxc.mit.iam.configuration.SSOConfiguration))
            return false;
        com.dxc.mit.iam.configuration.SSOConfiguration other = (com.dxc.mit.iam.configuration.SSOConfiguration) o;
        if (!other.canEqual(this))
            return false;
        if (isFakeResponse() != other.isFakeResponse())
            return false;
        if (isCaptchaEnabled() != other.isCaptchaEnabled())
            return false;
        if (isEnabledAdobeAnalytics() != other.isEnabledAdobeAnalytics())
            return false;
        if (isEnabledGoogleAnalytics() != other.isEnabledGoogleAnalytics())
            return false;
        if (getAnonSessionTokenTimeValidity() != other.getAnonSessionTokenTimeValidity())
            return false;
        if (isAnonSessionTokenCookieHttpOnly() != other.isAnonSessionTokenCookieHttpOnly())
            return false;
        if (isAnonSessionTokenCookieSecure() != other.isAnonSessionTokenCookieSecure())
            return false;
        if (isEnableCheckCieApp() != other.isEnableCheckCieApp())
            return false;
        if (isFakeToken() != other.isFakeToken())
            return false;
        if (isCheckAgeEnabled() != other.isCheckAgeEnabled())
            return false;
        if (getMinAge() != other.getMinAge())
            return false;
        if (getNodoAdsp() != other.getNodoAdsp())
            return false;
        Object this$otpValidationMinutes = getOtpValidationMinutes(),
                other$otpValidationMinutes = other.getOtpValidationMinutes();
        if ((this$otpValidationMinutes == null) ? (other$otpValidationMinutes != null)
                : !this$otpValidationMinutes.equals(other$otpValidationMinutes))
            return false;
        Object this$redirectTimeout = getRedirectTimeout(), other$redirectTimeout = other.getRedirectTimeout();
        if ((this$redirectTimeout == null) ? (other$redirectTimeout != null)
                : !this$redirectTimeout.equals(other$redirectTimeout))
            return false;
        Object this$authenticateUrl = getAuthenticateUrl(), other$authenticateUrl = other.getAuthenticateUrl();
        if ((this$authenticateUrl == null) ? (other$authenticateUrl != null)
                : !this$authenticateUrl.equals(other$authenticateUrl))
            return false;
        Object this$cookieName = getCookieName(), other$cookieName = other.getCookieName();
        if ((this$cookieName == null) ? (other$cookieName != null) : !this$cookieName.equals(other$cookieName))
            return false;
        Object this$jwtCookieName = getJwtCookieName(), other$jwtCookieName = other.getJwtCookieName();
        if ((this$jwtCookieName == null) ? (other$jwtCookieName != null)
                : !this$jwtCookieName.equals(other$jwtCookieName))
            return false;
        Object this$agentAuthnTxCookie = getAgentAuthnTxCookie(),
                other$agentAuthnTxCookie = other.getAgentAuthnTxCookie();
        if ((this$agentAuthnTxCookie == null) ? (other$agentAuthnTxCookie != null)
                : !this$agentAuthnTxCookie.equals(other$agentAuthnTxCookie))
            return false;
        Object this$headerName = getHeaderName(), other$headerName = other.getHeaderName();
        if ((this$headerName == null) ? (other$headerName != null) : !this$headerName.equals(other$headerName))
            return false;
        Object this$sessionInfoUrl = getSessionInfoUrl(), other$sessionInfoUrl = other.getSessionInfoUrl();
        if ((this$sessionInfoUrl == null) ? (other$sessionInfoUrl != null)
                : !this$sessionInfoUrl.equals(other$sessionInfoUrl))
            return false;
        Object this$logoutUrl = getLogoutUrl(), other$logoutUrl = other.getLogoutUrl();
        if ((this$logoutUrl == null) ? (other$logoutUrl != null) : !this$logoutUrl.equals(other$logoutUrl))
            return false;
        Object this$targetUrlParam = getTargetUrlParam(), other$targetUrlParam = other.getTargetUrlParam();
        if ((this$targetUrlParam == null) ? (other$targetUrlParam != null)
                : !this$targetUrlParam.equals(other$targetUrlParam))
            return false;
        Object this$targetUrlDefault = getTargetUrlDefault(), other$targetUrlDefault = other.getTargetUrlDefault();
        if ((this$targetUrlDefault == null) ? (other$targetUrlDefault != null)
                : !this$targetUrlDefault.equals(other$targetUrlDefault))
            return false;
        Object this$targetUrlPattern = getTargetUrlPattern(), other$targetUrlPattern = other.getTargetUrlPattern();
        if ((this$targetUrlPattern == null) ? (other$targetUrlPattern != null)
                : !this$targetUrlPattern.equals(other$targetUrlPattern))
            return false;
        Object this$findUserByCFNotTipoUtente = getFindUserByCFNotTipoUtente(),
                other$findUserByCFNotTipoUtente = other.getFindUserByCFNotTipoUtente();
        if ((this$findUserByCFNotTipoUtente == null) ? (other$findUserByCFNotTipoUtente != null)
                : !this$findUserByCFNotTipoUtente.equals(other$findUserByCFNotTipoUtente))
            return false;
        Object this$userInfo = getUserInfo(), other$userInfo = other.getUserInfo();
        if ((this$userInfo == null) ? (other$userInfo != null) : !this$userInfo.equals(other$userInfo))
            return false;
        Object this$resetUserIdByEmail = getResetUserIdByEmail(),
                other$resetUserIdByEmail = other.getResetUserIdByEmail();
        if ((this$resetUserIdByEmail == null) ? (other$resetUserIdByEmail != null)
                : !this$resetUserIdByEmail.equals(other$resetUserIdByEmail))
            return false;
        Object this$resetUserIdByPartitaIva = getResetUserIdByPartitaIva(),
                other$resetUserIdByPartitaIva = other.getResetUserIdByPartitaIva();
        if ((this$resetUserIdByPartitaIva == null) ? (other$resetUserIdByPartitaIva != null)
                : !this$resetUserIdByPartitaIva.equals(other$resetUserIdByPartitaIva))
            return false;
        Object this$passwordRecovery = getPasswordRecovery(), other$passwordRecovery = other.getPasswordRecovery();
        if ((this$passwordRecovery == null) ? (other$passwordRecovery != null)
                : !this$passwordRecovery.equals(other$passwordRecovery))
            return false;
        Object this$recaptchaCode = getRecaptchaCode(), other$recaptchaCode = other.getRecaptchaCode();
        if ((this$recaptchaCode == null) ? (other$recaptchaCode != null)
                : !this$recaptchaCode.equals(other$recaptchaCode))
            return false;
        Object this$recaptchaSecretKey = getRecaptchaSecretKey(),
                other$recaptchaSecretKey = other.getRecaptchaSecretKey();
        if ((this$recaptchaSecretKey == null) ? (other$recaptchaSecretKey != null)
                : !this$recaptchaSecretKey.equals(other$recaptchaSecretKey))
            return false;
        Object this$googleCaptchaVerifierUrl = getGoogleCaptchaVerifierUrl(),
                other$googleCaptchaVerifierUrl = other.getGoogleCaptchaVerifierUrl();
        if ((this$googleCaptchaVerifierUrl == null) ? (other$googleCaptchaVerifierUrl != null)
                : !this$googleCaptchaVerifierUrl.equals(other$googleCaptchaVerifierUrl))
            return false;
        Object this$postLoginUrl = getPostLoginUrl(), other$postLoginUrl = other.getPostLoginUrl();
        if ((this$postLoginUrl == null) ? (other$postLoginUrl != null) : !this$postLoginUrl.equals(other$postLoginUrl))
            return false;
        Object this$httpHeaderPostLoginUrl = getHttpHeaderPostLoginUrl(),
                other$httpHeaderPostLoginUrl = other.getHttpHeaderPostLoginUrl();
        if ((this$httpHeaderPostLoginUrl == null) ? (other$httpHeaderPostLoginUrl != null)
                : !this$httpHeaderPostLoginUrl.equals(other$httpHeaderPostLoginUrl))
            return false;
        Object this$passwordRecoveryTokenCheck = getPasswordRecoveryTokenCheck(),
                other$passwordRecoveryTokenCheck = other.getPasswordRecoveryTokenCheck();
        if ((this$passwordRecoveryTokenCheck == null) ? (other$passwordRecoveryTokenCheck != null)
                : !this$passwordRecoveryTokenCheck.equals(other$passwordRecoveryTokenCheck))
            return false;
        Object this$passwordReset = getPasswordReset(), other$passwordReset = other.getPasswordReset();
        if ((this$passwordReset == null) ? (other$passwordReset != null)
                : !this$passwordReset.equals(other$passwordReset))
            return false;
        Object this$staticResourceUrl = getStaticResourceUrl(), other$staticResourceUrl = other.getStaticResourceUrl();
        if ((this$staticResourceUrl == null) ? (other$staticResourceUrl != null)
                : !this$staticResourceUrl.equals(other$staticResourceUrl))
            return false;
        Object this$passwordChange = getPasswordChange(), other$passwordChange = other.getPasswordChange();
        if ((this$passwordChange == null) ? (other$passwordChange != null)
                : !this$passwordChange.equals(other$passwordChange))
            return false;
        Object this$passwordChangeExpired = getPasswordChangeExpired(),
                other$passwordChangeExpired = other.getPasswordChangeExpired();
        if ((this$passwordChangeExpired == null) ? (other$passwordChangeExpired != null)
                : !this$passwordChangeExpired.equals(other$passwordChangeExpired))
            return false;
        Object this$footerLinkUtili = getFooterLinkUtili(), other$footerLinkUtili = other.getFooterLinkUtili();
        if ((this$footerLinkUtili == null) ? (other$footerLinkUtili != null)
                : !this$footerLinkUtili.equals(other$footerLinkUtili))
            return false;
        Object this$headerLink = getHeaderLink(), other$headerLink = other.getHeaderLink();
        if ((this$headerLink == null) ? (other$headerLink != null) : !this$headerLink.equals(other$headerLink))
            return false;
        Object this$scriviLink = getScriviLink(), other$scriviLink = other.getScriviLink();
        if ((this$scriviLink == null) ? (other$scriviLink != null) : !this$scriviLink.equals(other$scriviLink))
            return false;
        Object this$registratiLink = getRegistratiLink(), other$registratiLink = other.getRegistratiLink();
        if ((this$registratiLink == null) ? (other$registratiLink != null)
                : !this$registratiLink.equals(other$registratiLink))
            return false;
        Object this$resetPasswordTargetUrl = getResetPasswordTargetUrl(),
                other$resetPasswordTargetUrl = other.getResetPasswordTargetUrl();
        if ((this$resetPasswordTargetUrl == null) ? (other$resetPasswordTargetUrl != null)
                : !this$resetPasswordTargetUrl.equals(other$resetPasswordTargetUrl))
            return false;
        Object this$modificaProfiloLink = getModificaProfiloLink(),
                other$modificaProfiloLink = other.getModificaProfiloLink();
        if ((this$modificaProfiloLink == null) ? (other$modificaProfiloLink != null)
                : !this$modificaProfiloLink.equals(other$modificaProfiloLink))
            return false;
        Object this$fascicoloCittadinoLink = getFascicoloCittadinoLink(),
                other$fascicoloCittadinoLink = other.getFascicoloCittadinoLink();
        if ((this$fascicoloCittadinoLink == null) ? (other$fascicoloCittadinoLink != null)
                : !this$fascicoloCittadinoLink.equals(other$fascicoloCittadinoLink))
            return false;
        Object this$logoutRedirectUrl = getLogoutRedirectUrl(), other$logoutRedirectUrl = other.getLogoutRedirectUrl();
        if ((this$logoutRedirectUrl == null) ? (other$logoutRedirectUrl != null)
                : !this$logoutRedirectUrl.equals(other$logoutRedirectUrl))
            return false;
        Object this$pdtRedirectUrl = getPdtRedirectUrl(), other$pdtRedirectUrl = other.getPdtRedirectUrl();
        if ((this$pdtRedirectUrl == null) ? (other$pdtRedirectUrl != null)
                : !this$pdtRedirectUrl.equals(other$pdtRedirectUrl))
            return false;
        Object this$undoLogoutRedirectUrl = getUndoLogoutRedirectUrl(),
                other$undoLogoutRedirectUrl = other.getUndoLogoutRedirectUrl();
        if ((this$undoLogoutRedirectUrl == null) ? (other$undoLogoutRedirectUrl != null)
                : !this$undoLogoutRedirectUrl.equals(other$undoLogoutRedirectUrl))
            return false;
        Object this$logoutMessageMobile = getLogoutMessageMobile(),
                other$logoutMessageMobile = other.getLogoutMessageMobile();
        if ((this$logoutMessageMobile == null) ? (other$logoutMessageMobile != null)
                : !this$logoutMessageMobile.equals(other$logoutMessageMobile))
            return false;
        Object this$oldCookieName = getOldCookieName(), other$oldCookieName = other.getOldCookieName();
        if ((this$oldCookieName == null) ? (other$oldCookieName != null)
                : !this$oldCookieName.equals(other$oldCookieName))
            return false;
        Object this$homepageLink = getHomepageLink(), other$homepageLink = other.getHomepageLink();
        if ((this$homepageLink == null) ? (other$homepageLink != null) : !this$homepageLink.equals(other$homepageLink))
            return false;
        Object this$breadcrumbLinkHome = getBreadcrumbLinkHome(),
                other$breadcrumbLinkHome = other.getBreadcrumbLinkHome();
        if ((this$breadcrumbLinkHome == null) ? (other$breadcrumbLinkHome != null)
                : !this$breadcrumbLinkHome.equals(other$breadcrumbLinkHome))
            return false;
        Object this$breadcrumbLinkAccedi = getBreadcrumbLinkAccedi(),
                other$breadcrumbLinkAccedi = other.getBreadcrumbLinkAccedi();
        if ((this$breadcrumbLinkAccedi == null) ? (other$breadcrumbLinkAccedi != null)
                : !this$breadcrumbLinkAccedi.equals(other$breadcrumbLinkAccedi))
            return false;
        Object this$breadcrumbLinkRecuperaPassword = getBreadcrumbLinkRecuperaPassword(),
                other$breadcrumbLinkRecuperaPassword = other.getBreadcrumbLinkRecuperaPassword();
        if ((this$breadcrumbLinkRecuperaPassword == null) ? (other$breadcrumbLinkRecuperaPassword != null)
                : !this$breadcrumbLinkRecuperaPassword.equals(other$breadcrumbLinkRecuperaPassword))
            return false;
        Object this$breadcrumbLinkRecuperaIdUtente = getBreadcrumbLinkRecuperaIdUtente(),
                other$breadcrumbLinkRecuperaIdUtente = other.getBreadcrumbLinkRecuperaIdUtente();
        if ((this$breadcrumbLinkRecuperaIdUtente == null) ? (other$breadcrumbLinkRecuperaIdUtente != null)
                : !this$breadcrumbLinkRecuperaIdUtente.equals(other$breadcrumbLinkRecuperaIdUtente))
            return false;
        Object this$breadcrumbLinkCambioPassword = getBreadcrumbLinkCambioPassword(),
                other$breadcrumbLinkCambioPassword = other.getBreadcrumbLinkCambioPassword();
        if ((this$breadcrumbLinkCambioPassword == null) ? (other$breadcrumbLinkCambioPassword != null)
                : !this$breadcrumbLinkCambioPassword.equals(other$breadcrumbLinkCambioPassword))
            return false;
        Object this$breadcrumbLinkAltreModalita = getBreadcrumbLinkAltreModalita(),
                other$breadcrumbLinkAltreModalita = other.getBreadcrumbLinkAltreModalita();
        if ((this$breadcrumbLinkAltreModalita == null) ? (other$breadcrumbLinkAltreModalita != null)
                : !this$breadcrumbLinkAltreModalita.equals(other$breadcrumbLinkAltreModalita))
            return false;
        Object this$breadcrumbLinkResetPassword = getBreadcrumbLinkResetPassword(),
                other$breadcrumbLinkResetPassword = other.getBreadcrumbLinkResetPassword();
        if ((this$breadcrumbLinkResetPassword == null) ? (other$breadcrumbLinkResetPassword != null)
                : !this$breadcrumbLinkResetPassword.equals(other$breadcrumbLinkResetPassword))
            return false;
        Object this$breadcrumbLinkUpdateCompanyProfile = getBreadcrumbLinkUpdateCompanyProfile(),
                other$breadcrumbLinkUpdateCompanyProfile = other.getBreadcrumbLinkUpdateCompanyProfile();
        if ((this$breadcrumbLinkUpdateCompanyProfile == null) ? (other$breadcrumbLinkUpdateCompanyProfile != null)
                : !this$breadcrumbLinkUpdateCompanyProfile.equals(other$breadcrumbLinkUpdateCompanyProfile))
            return false;
        Object this$breadcrumbLinkUpdateUserProfile = getBreadcrumbLinkUpdateUserProfile(),
                other$breadcrumbLinkUpdateUserProfile = other.getBreadcrumbLinkUpdateUserProfile();
        if ((this$breadcrumbLinkUpdateUserProfile == null) ? (other$breadcrumbLinkUpdateUserProfile != null)
                : !this$breadcrumbLinkUpdateUserProfile.equals(other$breadcrumbLinkUpdateUserProfile))
            return false;
        Object this$anonSessionByTokenUrl = getAnonSessionByTokenUrl(),
                other$anonSessionByTokenUrl = other.getAnonSessionByTokenUrl();
        if ((this$anonSessionByTokenUrl == null) ? (other$anonSessionByTokenUrl != null)
                : !this$anonSessionByTokenUrl.equals(other$anonSessionByTokenUrl))
            return false;
        Object this$updateAnonSessionUrl = getUpdateAnonSessionUrl(),
                other$updateAnonSessionUrl = other.getUpdateAnonSessionUrl();
        if ((this$updateAnonSessionUrl == null) ? (other$updateAnonSessionUrl != null)
                : !this$updateAnonSessionUrl.equals(other$updateAnonSessionUrl))
            return false;
        Object this$anonSessionTokenCookieName = getAnonSessionTokenCookieName(),
                other$anonSessionTokenCookieName = other.getAnonSessionTokenCookieName();
        if ((this$anonSessionTokenCookieName == null) ? (other$anonSessionTokenCookieName != null)
                : !this$anonSessionTokenCookieName.equals(other$anonSessionTokenCookieName))
            return false;
        Object this$anonSessionTokenCookiePath = getAnonSessionTokenCookiePath(),
                other$anonSessionTokenCookiePath = other.getAnonSessionTokenCookiePath();
        if ((this$anonSessionTokenCookiePath == null) ? (other$anonSessionTokenCookiePath != null)
                : !this$anonSessionTokenCookiePath.equals(other$anonSessionTokenCookiePath))
            return false;
        Object this$anonSessionTokenCookieDomain = getAnonSessionTokenCookieDomain(),
                other$anonSessionTokenCookieDomain = other.getAnonSessionTokenCookieDomain();
        if ((this$anonSessionTokenCookieDomain == null) ? (other$anonSessionTokenCookieDomain != null)
                : !this$anonSessionTokenCookieDomain.equals(other$anonSessionTokenCookieDomain))
            return false;
        Object this$mailAnonSessionSubject = getMailAnonSessionSubject(),
                other$mailAnonSessionSubject = other.getMailAnonSessionSubject();
        if ((this$mailAnonSessionSubject == null) ? (other$mailAnonSessionSubject != null)
                : !this$mailAnonSessionSubject.equals(other$mailAnonSessionSubject))
            return false;
        if (!Arrays.deepEquals((Object[]) getAnonSessionCustomApp(), (Object[]) other.getAnonSessionCustomApp()))
            return false;
        Object this$mailFrom = getMailFrom(), other$mailFrom = other.getMailFrom();
        if ((this$mailFrom == null) ? (other$mailFrom != null) : !this$mailFrom.equals(other$mailFrom))
            return false;
        Object this$mailServiceUrl = getMailServiceUrl(), other$mailServiceUrl = other.getMailServiceUrl();
        if ((this$mailServiceUrl == null) ? (other$mailServiceUrl != null)
                : !this$mailServiceUrl.equals(other$mailServiceUrl))
            return false;
        Object this$oauth2Pattern = getOauth2Pattern(), other$oauth2Pattern = other.getOauth2Pattern();
        if ((this$oauth2Pattern == null) ? (other$oauth2Pattern != null)
                : !this$oauth2Pattern.equals(other$oauth2Pattern))
            return false;
        Object this$cdmTipoUtenteSpid = getCdmTipoUtenteSpid(), other$cdmTipoUtenteSpid = other.getCdmTipoUtenteSpid();
        if ((this$cdmTipoUtenteSpid == null) ? (other$cdmTipoUtenteSpid != null)
                : !this$cdmTipoUtenteSpid.equals(other$cdmTipoUtenteSpid))
            return false;
        Object this$headerParamNamePostLogin = getHeaderParamNamePostLogin(),
                other$headerParamNamePostLogin = other.getHeaderParamNamePostLogin();
        if ((this$headerParamNamePostLogin == null) ? (other$headerParamNamePostLogin != null)
                : !this$headerParamNamePostLogin.equals(other$headerParamNamePostLogin))
            return false;
        Object this$headerParamValuePostLogin = getHeaderParamValuePostLogin(),
                other$headerParamValuePostLogin = other.getHeaderParamValuePostLogin();
        if ((this$headerParamValuePostLogin == null) ? (other$headerParamValuePostLogin != null)
                : !this$headerParamValuePostLogin.equals(other$headerParamValuePostLogin))
            return false;
        Object this$headerParamNameUserId = getHeaderParamNameUserId(),
                other$headerParamNameUserId = other.getHeaderParamNameUserId();
        if ((this$headerParamNameUserId == null) ? (other$headerParamNameUserId != null)
                : !this$headerParamNameUserId.equals(other$headerParamNameUserId))
            return false;
        Object this$headerParamNameDataNascita = getHeaderParamNameDataNascita(),
                other$headerParamNameDataNascita = other.getHeaderParamNameDataNascita();
        if ((this$headerParamNameDataNascita == null) ? (other$headerParamNameDataNascita != null)
                : !this$headerParamNameDataNascita.equals(other$headerParamNameDataNascita))
            return false;
        Object this$dataNascitaFormat = getDataNascitaFormat(), other$dataNascitaFormat = other.getDataNascitaFormat();
        if ((this$dataNascitaFormat == null) ? (other$dataNascitaFormat != null)
                : !this$dataNascitaFormat.equals(other$dataNascitaFormat))
            return false;
        Object this$forgerockBaseUrl = getForgerockBaseUrl(), other$forgerockBaseUrl = other.getForgerockBaseUrl();
        if ((this$forgerockBaseUrl == null) ? (other$forgerockBaseUrl != null)
                : !this$forgerockBaseUrl.equals(other$forgerockBaseUrl))
            return false;
        Object this$forgerockIdpInitiatedUrl = getForgerockIdpInitiatedUrl(),
                other$forgerockIdpInitiatedUrl = other.getForgerockIdpInitiatedUrl();
        if ((this$forgerockIdpInitiatedUrl == null) ? (other$forgerockIdpInitiatedUrl != null)
                : !this$forgerockIdpInitiatedUrl.equals(other$forgerockIdpInitiatedUrl))
            return false;
        Object this$forgerockAdminUsername = getForgerockAdminUsername(),
                other$forgerockAdminUsername = other.getForgerockAdminUsername();
        if ((this$forgerockAdminUsername == null) ? (other$forgerockAdminUsername != null)
                : !this$forgerockAdminUsername.equals(other$forgerockAdminUsername))
            return false;
        Object this$forgerockAdminPassword = getForgerockAdminPassword(),
                other$forgerockAdminPassword = other.getForgerockAdminPassword();
        if ((this$forgerockAdminPassword == null) ? (other$forgerockAdminPassword != null)
                : !this$forgerockAdminPassword.equals(other$forgerockAdminPassword))
            return false;
        Object this$forgerockAdminAuthenticate = getForgerockAdminAuthenticate(),
                other$forgerockAdminAuthenticate = other.getForgerockAdminAuthenticate();
        if ((this$forgerockAdminAuthenticate == null) ? (other$forgerockAdminAuthenticate != null)
                : !this$forgerockAdminAuthenticate.equals(other$forgerockAdminAuthenticate))
            return false;
        Object this$randomCodeGroup = getRandomCodeGroup(), other$randomCodeGroup = other.getRandomCodeGroup();
        if ((this$randomCodeGroup == null) ? (other$randomCodeGroup != null)
                : !this$randomCodeGroup.equals(other$randomCodeGroup))
            return false;
        Object this$otpEnableOTPHeaderParamName = getOtpEnableOTPHeaderParamName(),
                other$otpEnableOTPHeaderParamName = other.getOtpEnableOTPHeaderParamName();
        if ((this$otpEnableOTPHeaderParamName == null) ? (other$otpEnableOTPHeaderParamName != null)
                : !this$otpEnableOTPHeaderParamName.equals(other$otpEnableOTPHeaderParamName))
            return false;
        Object this$otpEnableCheckApp = getOtpEnableCheckApp(), other$otpEnableCheckApp = other.getOtpEnableCheckApp();
        if ((this$otpEnableCheckApp == null) ? (other$otpEnableCheckApp != null)
                : !this$otpEnableCheckApp.equals(other$otpEnableCheckApp))
            return false;
        Object this$headerParamNameUserName = getHeaderParamNameUserName(),
                other$headerParamNameUserName = other.getHeaderParamNameUserName();
        if ((this$headerParamNameUserName == null) ? (other$headerParamNameUserName != null)
                : !this$headerParamNameUserName.equals(other$headerParamNameUserName))
            return false;
        Object this$headerParamNameEidasPostLogin = getHeaderParamNameEidasPostLogin(),
                other$headerParamNameEidasPostLogin = other.getHeaderParamNameEidasPostLogin();
        if ((this$headerParamNameEidasPostLogin == null) ? (other$headerParamNameEidasPostLogin != null)
                : !this$headerParamNameEidasPostLogin.equals(other$headerParamNameEidasPostLogin))
            return false;
        Object this$headerParamNameUserSurname = getHeaderParamNameUserSurname(),
                other$headerParamNameUserSurname = other.getHeaderParamNameUserSurname();
        if ((this$headerParamNameUserSurname == null) ? (other$headerParamNameUserSurname != null)
                : !this$headerParamNameUserSurname.equals(other$headerParamNameUserSurname))
            return false;
        Object this$numeroTentativi = getNumeroTentativi(), other$numeroTentativi = other.getNumeroTentativi();
        if ((this$numeroTentativi == null) ? (other$numeroTentativi != null)
                : !this$numeroTentativi.equals(other$numeroTentativi))
            return false;
        Object this$idpCookieName = getIdpCookieName(), other$idpCookieName = other.getIdpCookieName();
        if ((this$idpCookieName == null) ? (other$idpCookieName != null)
                : !this$idpCookieName.equals(other$idpCookieName))
            return false;
        Object this$elencoSediUtenteUrl = getElencoSediUtenteUrl(),
                other$elencoSediUtenteUrl = other.getElencoSediUtenteUrl();
        if ((this$elencoSediUtenteUrl == null) ? (other$elencoSediUtenteUrl != null)
                : !this$elencoSediUtenteUrl.equals(other$elencoSediUtenteUrl))
            return false;
        Object this$aggiornaDataUltimaConnessioneUrl = getAggiornaDataUltimaConnessioneUrl(),
                other$aggiornaDataUltimaConnessioneUrl = other.getAggiornaDataUltimaConnessioneUrl();
        if ((this$aggiornaDataUltimaConnessioneUrl == null) ? (other$aggiornaDataUltimaConnessioneUrl != null)
                : !this$aggiornaDataUltimaConnessioneUrl.equals(other$aggiornaDataUltimaConnessioneUrl))
            return false;
        Object this$randomCodeGroupNumber = getRandomCodeGroupNumber(),
                other$randomCodeGroupNumber = other.getRandomCodeGroupNumber();
        if ((this$randomCodeGroupNumber == null) ? (other$randomCodeGroupNumber != null)
                : !this$randomCodeGroupNumber.equals(other$randomCodeGroupNumber))
            return false;
        Object this$cdmTipoUtenteLite = getCdmTipoUtenteLite(), other$cdmTipoUtenteLite = other.getCdmTipoUtenteLite();
        if ((this$cdmTipoUtenteLite == null) ? (other$cdmTipoUtenteLite != null)
                : !this$cdmTipoUtenteLite.equals(other$cdmTipoUtenteLite))
            return false;
        Object this$cdmTipoUtenteCie = getCdmTipoUtenteCie(), other$cdmTipoUtenteCie = other.getCdmTipoUtenteCie();
        if ((this$cdmTipoUtenteCie == null) ? (other$cdmTipoUtenteCie != null)
                : !this$cdmTipoUtenteCie.equals(other$cdmTipoUtenteCie))
            return false;
        Object this$cdmGiuridica = getCdmGiuridica(), other$cdmGiuridica = other.getCdmGiuridica();
        if ((this$cdmGiuridica == null) ? (other$cdmGiuridica != null) : !this$cdmGiuridica.equals(other$cdmGiuridica))
            return false;
        Object this$cdmFisica = getCdmFisica(), other$cdmFisica = other.getCdmFisica();
        if ((this$cdmFisica == null) ? (other$cdmFisica != null) : !this$cdmFisica.equals(other$cdmFisica))
            return false;
        Object this$cdmResidente = getCdmResidente(), other$cdmResidente = other.getCdmResidente();
        if ((this$cdmResidente == null) ? (other$cdmResidente != null) : !this$cdmResidente.equals(other$cdmResidente))
            return false;
        Object this$linkModificaPassword = getLinkModificaPassword(),
                other$linkModificaPassword = other.getLinkModificaPassword();
        if ((this$linkModificaPassword == null) ? (other$linkModificaPassword != null)
                : !this$linkModificaPassword.equals(other$linkModificaPassword))
            return false;
        Object this$ldapUserInfo = getLdapUserInfo(), other$ldapUserInfo = other.getLdapUserInfo();
        if ((this$ldapUserInfo == null) ? (other$ldapUserInfo != null) : !this$ldapUserInfo.equals(other$ldapUserInfo))
            return false;
        Object this$ldapUserDelete = getLdapUserDelete(), other$ldapUserDelete = other.getLdapUserDelete();
        if ((this$ldapUserDelete == null) ? (other$ldapUserDelete != null)
                : !this$ldapUserDelete.equals(other$ldapUserDelete))
            return false;
        Object this$ldapUserUpdate = getLdapUserUpdate(), other$ldapUserUpdate = other.getLdapUserUpdate();
        if ((this$ldapUserUpdate == null) ? (other$ldapUserUpdate != null)
                : !this$ldapUserUpdate.equals(other$ldapUserUpdate))
            return false;
        Object this$userFieldModify = getUserFieldModify(), other$userFieldModify = other.getUserFieldModify();
        if ((this$userFieldModify == null) ? (other$userFieldModify != null)
                : !this$userFieldModify.equals(other$userFieldModify))
            return false;
        Object this$newUser = getNewUser(), other$newUser = other.getNewUser();
        if ((this$newUser == null) ? (other$newUser != null) : !this$newUser.equals(other$newUser))
            return false;
        Object this$spidEmail = getSpidEmail(), other$spidEmail = other.getSpidEmail();
        if ((this$spidEmail == null) ? (other$spidEmail != null) : !this$spidEmail.equals(other$spidEmail))
            return false;
        Object this$email = getEmail(), other$email = other.getEmail();
        if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
            return false;
        Object this$spidEmailChanged = getSpidEmailChanged(), other$spidEmailChanged = other.getSpidEmailChanged();
        if ((this$spidEmailChanged == null) ? (other$spidEmailChanged != null)
                : !this$spidEmailChanged.equals(other$spidEmailChanged))
            return false;
        Object this$spidMobile = getSpidMobile(), other$spidMobile = other.getSpidMobile();
        if ((this$spidMobile == null) ? (other$spidMobile != null) : !this$spidMobile.equals(other$spidMobile))
            return false;
        Object this$mobile = getMobile(), other$mobile = other.getMobile();
        if ((this$mobile == null) ? (other$mobile != null) : !this$mobile.equals(other$mobile))
            return false;
        Object this$spidmobilechanged = getSpidmobilechanged(), other$spidmobilechanged = other.getSpidmobilechanged();
        if ((this$spidmobilechanged == null) ? (other$spidmobilechanged != null)
                : !this$spidmobilechanged.equals(other$spidmobilechanged))
            return false;
        Object this$newUserCIE = getNewUserCIE(), other$newUserCIE = other.getNewUserCIE();
        if ((this$newUserCIE == null) ? (other$newUserCIE != null) : !this$newUserCIE.equals(other$newUserCIE))
            return false;
        Object this$iterationLimitcheckProvisioning = getIterationLimitcheckProvisioning(),
                other$iterationLimitcheckProvisioning = other.getIterationLimitcheckProvisioning();
        if ((this$iterationLimitcheckProvisioning == null) ? (other$iterationLimitcheckProvisioning != null)
                : !this$iterationLimitcheckProvisioning.equals(other$iterationLimitcheckProvisioning))
            return false;
        Object this$timeLimitCheckProvisioning = getTimeLimitCheckProvisioning(),
                other$timeLimitCheckProvisioning = other.getTimeLimitCheckProvisioning();
        if ((this$timeLimitCheckProvisioning == null) ? (other$timeLimitCheckProvisioning != null)
                : !this$timeLimitCheckProvisioning.equals(other$timeLimitCheckProvisioning))
            return false;
        Object this$timeBeforeLogout = getTimeBeforeLogout(), other$timeBeforeLogout = other.getTimeBeforeLogout();
        if ((this$timeBeforeLogout == null) ? (other$timeBeforeLogout != null)
                : !this$timeBeforeLogout.equals(other$timeBeforeLogout))
            return false;
        Object this$nascitaData = getNascitaData(), other$nascitaData = other.getNascitaData();
        if ((this$nascitaData == null) ? (other$nascitaData != null) : !this$nascitaData.equals(other$nascitaData))
            return false;
        Object this$createUserUrl = getCreateUserUrl(), other$createUserUrl = other.getCreateUserUrl();
        if ((this$createUserUrl == null) ? (other$createUserUrl != null)
                : !this$createUserUrl.equals(other$createUserUrl))
            return false;
        Object this$checkUserUrl = getCheckUserUrl(), other$checkUserUrl = other.getCheckUserUrl();
        if ((this$checkUserUrl == null) ? (other$checkUserUrl != null) : !this$checkUserUrl.equals(other$checkUserUrl))
            return false;
        Object this$searchUserUrl = getSearchUserUrl(), other$searchUserUrl = other.getSearchUserUrl();
        if ((this$searchUserUrl == null) ? (other$searchUserUrl != null)
                : !this$searchUserUrl.equals(other$searchUserUrl))
            return false;
        Object this$nazioneInfoUrl = getNazioneInfoUrl(), other$nazioneInfoUrl = other.getNazioneInfoUrl();
        if ((this$nazioneInfoUrl == null) ? (other$nazioneInfoUrl != null)
                : !this$nazioneInfoUrl.equals(other$nazioneInfoUrl))
            return false;
        Object this$searchCompanyUrl = getSearchCompanyUrl(), other$searchCompanyUrl = other.getSearchCompanyUrl();
        if ((this$searchCompanyUrl == null) ? (other$searchCompanyUrl != null)
                : !this$searchCompanyUrl.equals(other$searchCompanyUrl))
            return false;
        Object this$searchCompanyRappLegaleUrl = getSearchCompanyRappLegaleUrl(),
                other$searchCompanyRappLegaleUrl = other.getSearchCompanyRappLegaleUrl();
        if ((this$searchCompanyRappLegaleUrl == null) ? (other$searchCompanyRappLegaleUrl != null)
                : !this$searchCompanyRappLegaleUrl.equals(other$searchCompanyRappLegaleUrl))
            return false;
        Object this$nazioniListaUrl = getNazioniListaUrl(), other$nazioniListaUrl = other.getNazioniListaUrl();
        if ((this$nazioniListaUrl == null) ? (other$nazioniListaUrl != null)
                : !this$nazioniListaUrl.equals(other$nazioniListaUrl))
            return false;
        Object this$provinceListaUrl = getProvinceListaUrl(), other$provinceListaUrl = other.getProvinceListaUrl();
        if ((this$provinceListaUrl == null) ? (other$provinceListaUrl != null)
                : !this$provinceListaUrl.equals(other$provinceListaUrl))
            return false;
        Object this$comuniListaUrl = getComuniListaUrl(), other$comuniListaUrl = other.getComuniListaUrl();
        if ((this$comuniListaUrl == null) ? (other$comuniListaUrl != null)
                : !this$comuniListaUrl.equals(other$comuniListaUrl))
            return false;
        Object this$nazioneInfoByNomeUrl = getNazioneInfoByNomeUrl(),
                other$nazioneInfoByNomeUrl = other.getNazioneInfoByNomeUrl();
        if ((this$nazioneInfoByNomeUrl == null) ? (other$nazioneInfoByNomeUrl != null)
                : !this$nazioneInfoByNomeUrl.equals(other$nazioneInfoByNomeUrl))
            return false;
        Object this$provinciaInfoByIdProvinciaUrl = getProvinciaInfoByIdProvinciaUrl(),
                other$provinciaInfoByIdProvinciaUrl = other.getProvinciaInfoByIdProvinciaUrl();
        if ((this$provinciaInfoByIdProvinciaUrl == null) ? (other$provinciaInfoByIdProvinciaUrl != null)
                : !this$provinciaInfoByIdProvinciaUrl.equals(other$provinciaInfoByIdProvinciaUrl))
            return false;
        Object this$comuneInfoByCodiceUrl = getComuneInfoByCodiceUrl(),
                other$comuneInfoByCodiceUrl = other.getComuneInfoByCodiceUrl();
        if ((this$comuneInfoByCodiceUrl == null) ? (other$comuneInfoByCodiceUrl != null)
                : !this$comuneInfoByCodiceUrl.equals(other$comuneInfoByCodiceUrl))
            return false;
        Object this$userUpdateProfileUrl = getUserUpdateProfileUrl(),
                other$userUpdateProfileUrl = other.getUserUpdateProfileUrl();
        if ((this$userUpdateProfileUrl == null) ? (other$userUpdateProfileUrl != null)
                : !this$userUpdateProfileUrl.equals(other$userUpdateProfileUrl))
            return false;
        Object this$companyFieldModifyUrl = getCompanyFieldModifyUrl(),
                other$companyFieldModifyUrl = other.getCompanyFieldModifyUrl();
        if ((this$companyFieldModifyUrl == null) ? (other$companyFieldModifyUrl != null)
                : !this$companyFieldModifyUrl.equals(other$companyFieldModifyUrl))
            return false;
        Object this$companyUpdateProfileUrl = getCompanyUpdateProfileUrl(),
                other$companyUpdateProfileUrl = other.getCompanyUpdateProfileUrl();
        if ((this$companyUpdateProfileUrl == null) ? (other$companyUpdateProfileUrl != null)
                : !this$companyUpdateProfileUrl.equals(other$companyUpdateProfileUrl))
            return false;
        Object this$emailCheckUrl = getEmailCheckUrl(), other$emailCheckUrl = other.getEmailCheckUrl();
        if ((this$emailCheckUrl == null) ? (other$emailCheckUrl != null)
                : !this$emailCheckUrl.equals(other$emailCheckUrl))
            return false;
        Object this$emailCheckTokenCheckUrl = getEmailCheckTokenCheckUrl(),
                other$emailCheckTokenCheckUrl = other.getEmailCheckTokenCheckUrl();
        if ((this$emailCheckTokenCheckUrl == null) ? (other$emailCheckTokenCheckUrl != null)
                : !this$emailCheckTokenCheckUrl.equals(other$emailCheckTokenCheckUrl))
            return false;
        Object this$otpGenerateSendEmailUrl = getOtpGenerateSendEmailUrl(),
                other$otpGenerateSendEmailUrl = other.getOtpGenerateSendEmailUrl();
        if ((this$otpGenerateSendEmailUrl == null) ? (other$otpGenerateSendEmailUrl != null)
                : !this$otpGenerateSendEmailUrl.equals(other$otpGenerateSendEmailUrl))
            return false;
        Object this$otpCheckUrl = getOtpCheckUrl(), other$otpCheckUrl = other.getOtpCheckUrl();
        if ((this$otpCheckUrl == null) ? (other$otpCheckUrl != null) : !this$otpCheckUrl.equals(other$otpCheckUrl))
            return false;
        Object this$otpDeleteUrl = getOtpDeleteUrl(), other$otpDeleteUrl = other.getOtpDeleteUrl();
        if ((this$otpDeleteUrl == null) ? (other$otpDeleteUrl != null) : !this$otpDeleteUrl.equals(other$otpDeleteUrl))
            return false;
        Object this$domicilioDigitaleUrl = getDomicilioDigitaleUrl(),
                other$domicilioDigitaleUrl = other.getDomicilioDigitaleUrl();
        if ((this$domicilioDigitaleUrl == null) ? (other$domicilioDigitaleUrl != null)
                : !this$domicilioDigitaleUrl.equals(other$domicilioDigitaleUrl))
            return false;
        Object this$logoutHeaderUrl = getLogoutHeaderUrl(), other$logoutHeaderUrl = other.getLogoutHeaderUrl();
        if ((this$logoutHeaderUrl == null) ? (other$logoutHeaderUrl != null)
                : !this$logoutHeaderUrl.equals(other$logoutHeaderUrl))
            return false;
        Object this$informamiIscrizioneUrl = getInformamiIscrizioneUrl(),
                other$informamiIscrizioneUrl = other.getInformamiIscrizioneUrl();
        if ((this$informamiIscrizioneUrl == null) ? (other$informamiIscrizioneUrl != null)
                : !this$informamiIscrizioneUrl.equals(other$informamiIscrizioneUrl))
            return false;
        Object this$entraConCIEUrl = getEntraConCIEUrl(), other$entraConCIEUrl = other.getEntraConCIEUrl();
        if ((this$entraConCIEUrl == null) ? (other$entraConCIEUrl != null)
                : !this$entraConCIEUrl.equals(other$entraConCIEUrl))
            return false;
        Object this$spInitiatedBaseUrl = getSpInitiatedBaseUrl(),
                other$spInitiatedBaseUrl = other.getSpInitiatedBaseUrl();
        if ((this$spInitiatedBaseUrl == null) ? (other$spInitiatedBaseUrl != null)
                : !this$spInitiatedBaseUrl.equals(other$spInitiatedBaseUrl))
            return false;
        Object this$spInitiatedBaseUrlAzienda = getSpInitiatedBaseUrlAzienda(),
                other$spInitiatedBaseUrlAzienda = other.getSpInitiatedBaseUrlAzienda();
        if ((this$spInitiatedBaseUrlAzienda == null) ? (other$spInitiatedBaseUrlAzienda != null)
                : !this$spInitiatedBaseUrlAzienda.equals(other$spInitiatedBaseUrlAzienda))
            return false;
        Object this$idpListUrl = getIdpListUrl(), other$idpListUrl = other.getIdpListUrl();
        if ((this$idpListUrl == null) ? (other$idpListUrl != null) : !this$idpListUrl.equals(other$idpListUrl))
            return false;
        List<String> this$contestiApplicativiAbilitati = (List<String>) getContestiApplicativiAbilitati(),
                other$contestiApplicativiAbilitati = (List<String>) other.getContestiApplicativiAbilitati();
        return !((this$contestiApplicativiAbilitati == null) ? (other$contestiApplicativiAbilitati != null)
                : !this$contestiApplicativiAbilitati.equals(other$contestiApplicativiAbilitati));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.dxc.mit.iam.configuration.SSOConfiguration;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (isFakeResponse() ? 79 : 97);
        result = result * 59 + (isCaptchaEnabled() ? 79 : 97);
        result = result * 59 + (isEnabledAdobeAnalytics() ? 79 : 97);
        result = result * 59 + (isEnabledGoogleAnalytics() ? 79 : 97);
        long $anonSessionTokenTimeValidity = getAnonSessionTokenTimeValidity();
        result = result * 59 + (int) ($anonSessionTokenTimeValidity >>> 32L ^ $anonSessionTokenTimeValidity);
        result = result * 59 + (isAnonSessionTokenCookieHttpOnly() ? 79 : 97);
        result = result * 59 + (isAnonSessionTokenCookieSecure() ? 79 : 97);
        result = result * 59 + (isEnableCheckCieApp() ? 79 : 97);
        result = result * 59 + (isFakeToken() ? 79 : 97);
        result = result * 59 + (isCheckAgeEnabled() ? 79 : 97);
        result = result * 59 + getMinAge();
        result = result * 59 + getNodoAdsp();
        Object $otpValidationMinutes = getOtpValidationMinutes();
        result = result * 59 + (($otpValidationMinutes == null) ? 43 : $otpValidationMinutes.hashCode());
        Object $redirectTimeout = getRedirectTimeout();
        result = result * 59 + (($redirectTimeout == null) ? 43 : $redirectTimeout.hashCode());
        Object $authenticateUrl = getAuthenticateUrl();
        result = result * 59 + (($authenticateUrl == null) ? 43 : $authenticateUrl.hashCode());
        Object $cookieName = getCookieName();
        result = result * 59 + (($cookieName == null) ? 43 : $cookieName.hashCode());
        Object $jwtCookieName = getJwtCookieName();
        result = result * 59 + (($jwtCookieName == null) ? 43 : $jwtCookieName.hashCode());
        Object $agentAuthnTxCookie = getAgentAuthnTxCookie();
        result = result * 59 + (($agentAuthnTxCookie == null) ? 43 : $agentAuthnTxCookie.hashCode());
        Object $headerName = getHeaderName();
        result = result * 59 + (($headerName == null) ? 43 : $headerName.hashCode());
        Object $sessionInfoUrl = getSessionInfoUrl();
        result = result * 59 + (($sessionInfoUrl == null) ? 43 : $sessionInfoUrl.hashCode());
        Object $logoutUrl = getLogoutUrl();
        result = result * 59 + (($logoutUrl == null) ? 43 : $logoutUrl.hashCode());
        Object $targetUrlParam = getTargetUrlParam();
        result = result * 59 + (($targetUrlParam == null) ? 43 : $targetUrlParam.hashCode());
        Object $targetUrlDefault = getTargetUrlDefault();
        result = result * 59 + (($targetUrlDefault == null) ? 43 : $targetUrlDefault.hashCode());
        Object $targetUrlPattern = getTargetUrlPattern();
        result = result * 59 + (($targetUrlPattern == null) ? 43 : $targetUrlPattern.hashCode());
        Object $findUserByCFNotTipoUtente = getFindUserByCFNotTipoUtente();
        result = result * 59 + (($findUserByCFNotTipoUtente == null) ? 43 : $findUserByCFNotTipoUtente.hashCode());
        Object $userInfo = getUserInfo();
        result = result * 59 + (($userInfo == null) ? 43 : $userInfo.hashCode());
        Object $resetUserIdByEmail = getResetUserIdByEmail();
        result = result * 59 + (($resetUserIdByEmail == null) ? 43 : $resetUserIdByEmail.hashCode());
        Object $resetUserIdByPartitaIva = getResetUserIdByPartitaIva();
        result = result * 59 + (($resetUserIdByPartitaIva == null) ? 43 : $resetUserIdByPartitaIva.hashCode());
        Object $passwordRecovery = getPasswordRecovery();
        result = result * 59 + (($passwordRecovery == null) ? 43 : $passwordRecovery.hashCode());
        Object $recaptchaCode = getRecaptchaCode();
        result = result * 59 + (($recaptchaCode == null) ? 43 : $recaptchaCode.hashCode());
        Object $recaptchaSecretKey = getRecaptchaSecretKey();
        result = result * 59 + (($recaptchaSecretKey == null) ? 43 : $recaptchaSecretKey.hashCode());
        Object $googleCaptchaVerifierUrl = getGoogleCaptchaVerifierUrl();
        result = result * 59 + (($googleCaptchaVerifierUrl == null) ? 43 : $googleCaptchaVerifierUrl.hashCode());
        Object $postLoginUrl = getPostLoginUrl();
        result = result * 59 + (($postLoginUrl == null) ? 43 : $postLoginUrl.hashCode());
        Object $httpHeaderPostLoginUrl = getHttpHeaderPostLoginUrl();
        result = result * 59 + (($httpHeaderPostLoginUrl == null) ? 43 : $httpHeaderPostLoginUrl.hashCode());
        Object $passwordRecoveryTokenCheck = getPasswordRecoveryTokenCheck();
        result = result * 59 + (($passwordRecoveryTokenCheck == null) ? 43 : $passwordRecoveryTokenCheck.hashCode());
        Object $passwordReset = getPasswordReset();
        result = result * 59 + (($passwordReset == null) ? 43 : $passwordReset.hashCode());
        Object $staticResourceUrl = getStaticResourceUrl();
        result = result * 59 + (($staticResourceUrl == null) ? 43 : $staticResourceUrl.hashCode());
        Object $passwordChange = getPasswordChange();
        result = result * 59 + (($passwordChange == null) ? 43 : $passwordChange.hashCode());
        Object $passwordChangeExpired = getPasswordChangeExpired();
        result = result * 59 + (($passwordChangeExpired == null) ? 43 : $passwordChangeExpired.hashCode());
        Object $footerLinkUtili = getFooterLinkUtili();
        result = result * 59 + (($footerLinkUtili == null) ? 43 : $footerLinkUtili.hashCode());
        Object $headerLink = getHeaderLink();
        result = result * 59 + (($headerLink == null) ? 43 : $headerLink.hashCode());
        Object $scriviLink = getScriviLink();
        result = result * 59 + (($scriviLink == null) ? 43 : $scriviLink.hashCode());
        Object $registratiLink = getRegistratiLink();
        result = result * 59 + (($registratiLink == null) ? 43 : $registratiLink.hashCode());
        Object $resetPasswordTargetUrl = getResetPasswordTargetUrl();
        result = result * 59 + (($resetPasswordTargetUrl == null) ? 43 : $resetPasswordTargetUrl.hashCode());
        Object $modificaProfiloLink = getModificaProfiloLink();
        result = result * 59 + (($modificaProfiloLink == null) ? 43 : $modificaProfiloLink.hashCode());
        Object $fascicoloCittadinoLink = getFascicoloCittadinoLink();
        result = result * 59 + (($fascicoloCittadinoLink == null) ? 43 : $fascicoloCittadinoLink.hashCode());
        Object $logoutRedirectUrl = getLogoutRedirectUrl();
        result = result * 59 + (($logoutRedirectUrl == null) ? 43 : $logoutRedirectUrl.hashCode());
        Object $pdtRedirectUrl = getPdtRedirectUrl();
        result = result * 59 + (($pdtRedirectUrl == null) ? 43 : $pdtRedirectUrl.hashCode());
        Object $undoLogoutRedirectUrl = getUndoLogoutRedirectUrl();
        result = result * 59 + (($undoLogoutRedirectUrl == null) ? 43 : $undoLogoutRedirectUrl.hashCode());
        Object $logoutMessageMobile = getLogoutMessageMobile();
        result = result * 59 + (($logoutMessageMobile == null) ? 43 : $logoutMessageMobile.hashCode());
        Object $oldCookieName = getOldCookieName();
        result = result * 59 + (($oldCookieName == null) ? 43 : $oldCookieName.hashCode());
        Object $homepageLink = getHomepageLink();
        result = result * 59 + (($homepageLink == null) ? 43 : $homepageLink.hashCode());
        Object $breadcrumbLinkHome = getBreadcrumbLinkHome();
        result = result * 59 + (($breadcrumbLinkHome == null) ? 43 : $breadcrumbLinkHome.hashCode());
        Object $breadcrumbLinkAccedi = getBreadcrumbLinkAccedi();
        result = result * 59 + (($breadcrumbLinkAccedi == null) ? 43 : $breadcrumbLinkAccedi.hashCode());
        Object $breadcrumbLinkRecuperaPassword = getBreadcrumbLinkRecuperaPassword();
        result = result * 59
                + (($breadcrumbLinkRecuperaPassword == null) ? 43 : $breadcrumbLinkRecuperaPassword.hashCode());
        Object $breadcrumbLinkRecuperaIdUtente = getBreadcrumbLinkRecuperaIdUtente();
        result = result * 59
                + (($breadcrumbLinkRecuperaIdUtente == null) ? 43 : $breadcrumbLinkRecuperaIdUtente.hashCode());
        Object $breadcrumbLinkCambioPassword = getBreadcrumbLinkCambioPassword();
        result = result * 59
                + (($breadcrumbLinkCambioPassword == null) ? 43 : $breadcrumbLinkCambioPassword.hashCode());
        Object $breadcrumbLinkAltreModalita = getBreadcrumbLinkAltreModalita();
        result = result * 59 + (($breadcrumbLinkAltreModalita == null) ? 43 : $breadcrumbLinkAltreModalita.hashCode());
        Object $breadcrumbLinkResetPassword = getBreadcrumbLinkResetPassword();
        result = result * 59 + (($breadcrumbLinkResetPassword == null) ? 43 : $breadcrumbLinkResetPassword.hashCode());
        Object $breadcrumbLinkUpdateCompanyProfile = getBreadcrumbLinkUpdateCompanyProfile();
        result = result * 59
                + (($breadcrumbLinkUpdateCompanyProfile == null) ? 43 : $breadcrumbLinkUpdateCompanyProfile.hashCode());
        Object $breadcrumbLinkUpdateUserProfile = getBreadcrumbLinkUpdateUserProfile();
        result = result * 59
                + (($breadcrumbLinkUpdateUserProfile == null) ? 43 : $breadcrumbLinkUpdateUserProfile.hashCode());
        Object $anonSessionByTokenUrl = getAnonSessionByTokenUrl();
        result = result * 59 + (($anonSessionByTokenUrl == null) ? 43 : $anonSessionByTokenUrl.hashCode());
        Object $updateAnonSessionUrl = getUpdateAnonSessionUrl();
        result = result * 59 + (($updateAnonSessionUrl == null) ? 43 : $updateAnonSessionUrl.hashCode());
        Object $anonSessionTokenCookieName = getAnonSessionTokenCookieName();
        result = result * 59 + (($anonSessionTokenCookieName == null) ? 43 : $anonSessionTokenCookieName.hashCode());
        Object $anonSessionTokenCookiePath = getAnonSessionTokenCookiePath();
        result = result * 59 + (($anonSessionTokenCookiePath == null) ? 43 : $anonSessionTokenCookiePath.hashCode());
        Object $anonSessionTokenCookieDomain = getAnonSessionTokenCookieDomain();
        result = result * 59
                + (($anonSessionTokenCookieDomain == null) ? 43 : $anonSessionTokenCookieDomain.hashCode());
        Object $mailAnonSessionSubject = getMailAnonSessionSubject();
        result = result * 59 + (($mailAnonSessionSubject == null) ? 43 : $mailAnonSessionSubject.hashCode());
        result = result * 59 + Arrays.deepHashCode((Object[]) getAnonSessionCustomApp());
        Object $mailFrom = getMailFrom();
        result = result * 59 + (($mailFrom == null) ? 43 : $mailFrom.hashCode());
        Object $mailServiceUrl = getMailServiceUrl();
        result = result * 59 + (($mailServiceUrl == null) ? 43 : $mailServiceUrl.hashCode());
        Object $oauth2Pattern = getOauth2Pattern();
        result = result * 59 + (($oauth2Pattern == null) ? 43 : $oauth2Pattern.hashCode());
        Object $cdmTipoUtenteSpid = getCdmTipoUtenteSpid();
        result = result * 59 + (($cdmTipoUtenteSpid == null) ? 43 : $cdmTipoUtenteSpid.hashCode());
        Object $headerParamNamePostLogin = getHeaderParamNamePostLogin();
        result = result * 59 + (($headerParamNamePostLogin == null) ? 43 : $headerParamNamePostLogin.hashCode());
        Object $headerParamValuePostLogin = getHeaderParamValuePostLogin();
        result = result * 59 + (($headerParamValuePostLogin == null) ? 43 : $headerParamValuePostLogin.hashCode());
        Object $headerParamNameUserId = getHeaderParamNameUserId();
        result = result * 59 + (($headerParamNameUserId == null) ? 43 : $headerParamNameUserId.hashCode());
        Object $headerParamNameDataNascita = getHeaderParamNameDataNascita();
        result = result * 59 + (($headerParamNameDataNascita == null) ? 43 : $headerParamNameDataNascita.hashCode());
        Object $dataNascitaFormat = getDataNascitaFormat();
        result = result * 59 + (($dataNascitaFormat == null) ? 43 : $dataNascitaFormat.hashCode());
        Object $forgerockBaseUrl = getForgerockBaseUrl();
        result = result * 59 + (($forgerockBaseUrl == null) ? 43 : $forgerockBaseUrl.hashCode());
        Object $forgerockIdpInitiatedUrl = getForgerockIdpInitiatedUrl();
        result = result * 59 + (($forgerockIdpInitiatedUrl == null) ? 43 : $forgerockIdpInitiatedUrl.hashCode());
        Object $forgerockAdminUsername = getForgerockAdminUsername();
        result = result * 59 + (($forgerockAdminUsername == null) ? 43 : $forgerockAdminUsername.hashCode());
        Object $forgerockAdminPassword = getForgerockAdminPassword();
        result = result * 59 + (($forgerockAdminPassword == null) ? 43 : $forgerockAdminPassword.hashCode());
        Object $forgerockAdminAuthenticate = getForgerockAdminAuthenticate();
        result = result * 59 + (($forgerockAdminAuthenticate == null) ? 43 : $forgerockAdminAuthenticate.hashCode());
        Object $randomCodeGroup = getRandomCodeGroup();
        result = result * 59 + (($randomCodeGroup == null) ? 43 : $randomCodeGroup.hashCode());
        Object $otpEnableOTPHeaderParamName = getOtpEnableOTPHeaderParamName();
        result = result * 59 + (($otpEnableOTPHeaderParamName == null) ? 43 : $otpEnableOTPHeaderParamName.hashCode());
        Object $otpEnableCheckApp = getOtpEnableCheckApp();
        result = result * 59 + (($otpEnableCheckApp == null) ? 43 : $otpEnableCheckApp.hashCode());
        Object $headerParamNameUserName = getHeaderParamNameUserName();
        result = result * 59 + (($headerParamNameUserName == null) ? 43 : $headerParamNameUserName.hashCode());
        Object $headerParamNameEidasPostLogin = getHeaderParamNameEidasPostLogin();
        result = result * 59
                + (($headerParamNameEidasPostLogin == null) ? 43 : $headerParamNameEidasPostLogin.hashCode());
        Object $headerParamNameUserSurname = getHeaderParamNameUserSurname();
        result = result * 59 + (($headerParamNameUserSurname == null) ? 43 : $headerParamNameUserSurname.hashCode());
        Object $numeroTentativi = getNumeroTentativi();
        result = result * 59 + (($numeroTentativi == null) ? 43 : $numeroTentativi.hashCode());
        Object $idpCookieName = getIdpCookieName();
        result = result * 59 + (($idpCookieName == null) ? 43 : $idpCookieName.hashCode());
        Object $elencoSediUtenteUrl = getElencoSediUtenteUrl();
        result = result * 59 + (($elencoSediUtenteUrl == null) ? 43 : $elencoSediUtenteUrl.hashCode());
        Object $aggiornaDataUltimaConnessioneUrl = getAggiornaDataUltimaConnessioneUrl();
        result = result * 59
                + (($aggiornaDataUltimaConnessioneUrl == null) ? 43 : $aggiornaDataUltimaConnessioneUrl.hashCode());
        Object $randomCodeGroupNumber = getRandomCodeGroupNumber();
        result = result * 59 + (($randomCodeGroupNumber == null) ? 43 : $randomCodeGroupNumber.hashCode());
        Object $cdmTipoUtenteLite = getCdmTipoUtenteLite();
        result = result * 59 + (($cdmTipoUtenteLite == null) ? 43 : $cdmTipoUtenteLite.hashCode());
        Object $cdmTipoUtenteCie = getCdmTipoUtenteCie();
        result = result * 59 + (($cdmTipoUtenteCie == null) ? 43 : $cdmTipoUtenteCie.hashCode());
        Object $cdmGiuridica = getCdmGiuridica();
        result = result * 59 + (($cdmGiuridica == null) ? 43 : $cdmGiuridica.hashCode());
        Object $cdmFisica = getCdmFisica();
        result = result * 59 + (($cdmFisica == null) ? 43 : $cdmFisica.hashCode());
        Object $cdmResidente = getCdmResidente();
        result = result * 59 + (($cdmResidente == null) ? 43 : $cdmResidente.hashCode());
        Object $linkModificaPassword = getLinkModificaPassword();
        result = result * 59 + (($linkModificaPassword == null) ? 43 : $linkModificaPassword.hashCode());
        Object $ldapUserInfo = getLdapUserInfo();
        result = result * 59 + (($ldapUserInfo == null) ? 43 : $ldapUserInfo.hashCode());
        Object $ldapUserDelete = getLdapUserDelete();
        result = result * 59 + (($ldapUserDelete == null) ? 43 : $ldapUserDelete.hashCode());
        Object $ldapUserUpdate = getLdapUserUpdate();
        result = result * 59 + (($ldapUserUpdate == null) ? 43 : $ldapUserUpdate.hashCode());
        Object $userFieldModify = getUserFieldModify();
        result = result * 59 + (($userFieldModify == null) ? 43 : $userFieldModify.hashCode());
        Object $newUser = getNewUser();
        result = result * 59 + (($newUser == null) ? 43 : $newUser.hashCode());
        Object $spidEmail = getSpidEmail();
        result = result * 59 + (($spidEmail == null) ? 43 : $spidEmail.hashCode());
        Object $email = getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        Object $spidEmailChanged = getSpidEmailChanged();
        result = result * 59 + (($spidEmailChanged == null) ? 43 : $spidEmailChanged.hashCode());
        Object $spidMobile = getSpidMobile();
        result = result * 59 + (($spidMobile == null) ? 43 : $spidMobile.hashCode());
        Object $mobile = getMobile();
        result = result * 59 + (($mobile == null) ? 43 : $mobile.hashCode());
        Object $spidmobilechanged = getSpidmobilechanged();
        result = result * 59 + (($spidmobilechanged == null) ? 43 : $spidmobilechanged.hashCode());
        Object $newUserCIE = getNewUserCIE();
        result = result * 59 + (($newUserCIE == null) ? 43 : $newUserCIE.hashCode());
        Object $iterationLimitcheckProvisioning = getIterationLimitcheckProvisioning();
        result = result * 59
                + (($iterationLimitcheckProvisioning == null) ? 43 : $iterationLimitcheckProvisioning.hashCode());
        Object $timeLimitCheckProvisioning = getTimeLimitCheckProvisioning();
        result = result * 59 + (($timeLimitCheckProvisioning == null) ? 43 : $timeLimitCheckProvisioning.hashCode());
        Object $timeBeforeLogout = getTimeBeforeLogout();
        result = result * 59 + (($timeBeforeLogout == null) ? 43 : $timeBeforeLogout.hashCode());
        Object $nascitaData = getNascitaData();
        result = result * 59 + (($nascitaData == null) ? 43 : $nascitaData.hashCode());
        Object $createUserUrl = getCreateUserUrl();
        result = result * 59 + (($createUserUrl == null) ? 43 : $createUserUrl.hashCode());
        Object $checkUserUrl = getCheckUserUrl();
        result = result * 59 + (($checkUserUrl == null) ? 43 : $checkUserUrl.hashCode());
        Object $searchUserUrl = getSearchUserUrl();
        result = result * 59 + (($searchUserUrl == null) ? 43 : $searchUserUrl.hashCode());
        Object $nazioneInfoUrl = getNazioneInfoUrl();
        result = result * 59 + (($nazioneInfoUrl == null) ? 43 : $nazioneInfoUrl.hashCode());
        Object $searchCompanyUrl = getSearchCompanyUrl();
        result = result * 59 + (($searchCompanyUrl == null) ? 43 : $searchCompanyUrl.hashCode());
        Object $searchCompanyRappLegaleUrl = getSearchCompanyRappLegaleUrl();
        result = result * 59 + (($searchCompanyRappLegaleUrl == null) ? 43 : $searchCompanyRappLegaleUrl.hashCode());
        Object $nazioniListaUrl = getNazioniListaUrl();
        result = result * 59 + (($nazioniListaUrl == null) ? 43 : $nazioniListaUrl.hashCode());
        Object $provinceListaUrl = getProvinceListaUrl();
        result = result * 59 + (($provinceListaUrl == null) ? 43 : $provinceListaUrl.hashCode());
        Object $comuniListaUrl = getComuniListaUrl();
        result = result * 59 + (($comuniListaUrl == null) ? 43 : $comuniListaUrl.hashCode());
        Object $nazioneInfoByNomeUrl = getNazioneInfoByNomeUrl();
        result = result * 59 + (($nazioneInfoByNomeUrl == null) ? 43 : $nazioneInfoByNomeUrl.hashCode());
        Object $provinciaInfoByIdProvinciaUrl = getProvinciaInfoByIdProvinciaUrl();
        result = result * 59
                + (($provinciaInfoByIdProvinciaUrl == null) ? 43 : $provinciaInfoByIdProvinciaUrl.hashCode());
        Object $comuneInfoByCodiceUrl = getComuneInfoByCodiceUrl();
        result = result * 59 + (($comuneInfoByCodiceUrl == null) ? 43 : $comuneInfoByCodiceUrl.hashCode());
        Object $userUpdateProfileUrl = getUserUpdateProfileUrl();
        result = result * 59 + (($userUpdateProfileUrl == null) ? 43 : $userUpdateProfileUrl.hashCode());
        Object $companyFieldModifyUrl = getCompanyFieldModifyUrl();
        result = result * 59 + (($companyFieldModifyUrl == null) ? 43 : $companyFieldModifyUrl.hashCode());
        Object $companyUpdateProfileUrl = getCompanyUpdateProfileUrl();
        result = result * 59 + (($companyUpdateProfileUrl == null) ? 43 : $companyUpdateProfileUrl.hashCode());
        Object $emailCheckUrl = getEmailCheckUrl();
        result = result * 59 + (($emailCheckUrl == null) ? 43 : $emailCheckUrl.hashCode());
        Object $emailCheckTokenCheckUrl = getEmailCheckTokenCheckUrl();
        result = result * 59 + (($emailCheckTokenCheckUrl == null) ? 43 : $emailCheckTokenCheckUrl.hashCode());
        Object $otpGenerateSendEmailUrl = getOtpGenerateSendEmailUrl();
        result = result * 59 + (($otpGenerateSendEmailUrl == null) ? 43 : $otpGenerateSendEmailUrl.hashCode());
        Object $otpCheckUrl = getOtpCheckUrl();
        result = result * 59 + (($otpCheckUrl == null) ? 43 : $otpCheckUrl.hashCode());
        Object $otpDeleteUrl = getOtpDeleteUrl();
        result = result * 59 + (($otpDeleteUrl == null) ? 43 : $otpDeleteUrl.hashCode());
        Object $domicilioDigitaleUrl = getDomicilioDigitaleUrl();
        result = result * 59 + (($domicilioDigitaleUrl == null) ? 43 : $domicilioDigitaleUrl.hashCode());
        Object $logoutHeaderUrl = getLogoutHeaderUrl();
        result = result * 59 + (($logoutHeaderUrl == null) ? 43 : $logoutHeaderUrl.hashCode());
        Object $informamiIscrizioneUrl = getInformamiIscrizioneUrl();
        result = result * 59 + (($informamiIscrizioneUrl == null) ? 43 : $informamiIscrizioneUrl.hashCode());
        Object $entraConCIEUrl = getEntraConCIEUrl();
        result = result * 59 + (($entraConCIEUrl == null) ? 43 : $entraConCIEUrl.hashCode());
        Object $spInitiatedBaseUrl = getSpInitiatedBaseUrl();
        result = result * 59 + (($spInitiatedBaseUrl == null) ? 43 : $spInitiatedBaseUrl.hashCode());
        Object $idpListUrl = getIdpListUrl();
        result = result * 59 + (($idpListUrl == null) ? 43 : $idpListUrl.hashCode());
        List<String> $contestiApplicativiAbilitati = (List<String>) getContestiApplicativiAbilitati();
        return result * 59 + (($contestiApplicativiAbilitati == null) ? 43 : $contestiApplicativiAbilitati.hashCode());
    }

    public String toString() {
        return "SSOConfiguration(authenticateUrl=" + getAuthenticateUrl() + ", cookieName=" + getCookieName()
                + ", jwtCookieName=" + getJwtCookieName() + ", agentAuthnTxCookie=" + getAgentAuthnTxCookie()
                + ", headerName=" + getHeaderName() + ", sessionInfoUrl=" + getSessionInfoUrl() + ", logoutUrl="
                + getLogoutUrl() + ", targetUrlParam=" + getTargetUrlParam() + ", targetUrlDefault="
                + getTargetUrlDefault() + ", targetUrlPattern=" + getTargetUrlPattern() + ", fakeResponse="
                + isFakeResponse() + ", findUserByCFNotTipoUtente=" + getFindUserByCFNotTipoUtente() + ", userInfo="
                + getUserInfo() + ", resetUserIdByEmail=" + getResetUserIdByEmail() + ", resetUserIdByPartitaIva="
                + getResetUserIdByPartitaIva() + ", passwordRecovery=" + getPasswordRecovery() + ", recaptchaCode="
                + getRecaptchaCode() + ", recaptchaSecretKey=" + getRecaptchaSecretKey() + ", googleCaptchaVerifierUrl="
                + getGoogleCaptchaVerifierUrl() + ", postLoginUrl=" + getPostLoginUrl() + ", httpHeaderPostLoginUrl="
                + getHttpHeaderPostLoginUrl() + ", passwordRecoveryTokenCheck=" + getPasswordRecoveryTokenCheck()
                + ", captchaEnabled=" + isCaptchaEnabled() + ", passwordReset=" + getPasswordReset()
                + ", staticResourceUrl=" + getStaticResourceUrl() + ", passwordChange=" + getPasswordChange()
                + ", passwordChangeExpired=" + getPasswordChangeExpired() + ", footerLinkUtili=" + getFooterLinkUtili()
                + ", headerLink=" + getHeaderLink() + ", scriviLink=" + getScriviLink() + ", registratiLink="
                + getRegistratiLink() + ", resetPasswordTargetUrl=" + getResetPasswordTargetUrl()
                + ", modificaProfiloLink=" + getModificaProfiloLink() + ", fascicoloCittadinoLink="
                + getFascicoloCittadinoLink() + ", logoutRedirectUrl=" + getLogoutRedirectUrl() + ", pdtRedirectUrl="
                + getPdtRedirectUrl() + ", undoLogoutRedirectUrl=" + getUndoLogoutRedirectUrl()
                + ", logoutMessageMobile=" + getLogoutMessageMobile() + ", oldCookieName=" + getOldCookieName()
                + ", homepageLink=" + getHomepageLink() + ", breadcrumbLinkHome=" + getBreadcrumbLinkHome()
                + ", breadcrumbLinkAccedi=" + getBreadcrumbLinkAccedi() + ", breadcrumbLinkRecuperaPassword="
                + getBreadcrumbLinkRecuperaPassword() + ", breadcrumbLinkRecuperaIdUtente="
                + getBreadcrumbLinkRecuperaIdUtente() + ", breadcrumbLinkCambioPassword="
                + getBreadcrumbLinkCambioPassword() + ", breadcrumbLinkAltreModalita="
                + getBreadcrumbLinkAltreModalita() + ", breadcrumbLinkResetPassword=" + getBreadcrumbLinkResetPassword()
                + ", breadcrumbLinkUpdateCompanyProfile=" + getBreadcrumbLinkUpdateCompanyProfile()
                + ", breadcrumbLinkUpdateUserProfile=" + getBreadcrumbLinkUpdateUserProfile()
                + ", enabledAdobeAnalytics=" + isEnabledAdobeAnalytics() + ", enabledGoogleAnalytics="
                + isEnabledGoogleAnalytics() + ", anonSessionByTokenUrl=" + getAnonSessionByTokenUrl()
                + ", updateAnonSessionUrl=" + getUpdateAnonSessionUrl() + ", anonSessionTokenTimeValidity="
                + getAnonSessionTokenTimeValidity() + ", anonSessionTokenCookieName=" + getAnonSessionTokenCookieName()
                + ", anonSessionTokenCookieHttpOnly=" + isAnonSessionTokenCookieHttpOnly()
                + ", anonSessionTokenCookieSecure=" + isAnonSessionTokenCookieSecure() + ", anonSessionTokenCookiePath="
                + getAnonSessionTokenCookiePath() + ", anonSessionTokenCookieDomain="
                + getAnonSessionTokenCookieDomain() + ", mailAnonSessionSubject=" + getMailAnonSessionSubject()
                + ", anonSessionCustomApp=" + Arrays.deepToString((Object[]) getAnonSessionCustomApp()) + ", mailFrom="
                + getMailFrom() + ", mailServiceUrl=" + getMailServiceUrl() + ", oauth2Pattern=" + getOauth2Pattern()
                + ", cdmTipoUtenteSpid=" + getCdmTipoUtenteSpid() + ", headerParamNamePostLogin="
                + getHeaderParamNamePostLogin() + ", headerParamValuePostLogin=" + getHeaderParamValuePostLogin()
                + ", headerParamNameUserId=" + getHeaderParamNameUserId() + ", headerParamNameDataNascita="
                + getHeaderParamNameDataNascita() + ", dataNascitaFormat=" + getDataNascitaFormat()
                + ", forgerockBaseUrl=" + getForgerockBaseUrl() + ", forgerockIdpInitiatedUrl="
                + getForgerockIdpInitiatedUrl() + ", forgerockAdminUsername=" + getForgerockAdminUsername()
                + ", forgerockAdminPassword=" + getForgerockAdminPassword() + ", forgerockAdminAuthenticate="
                + getForgerockAdminAuthenticate() + ", randomCodeGroup=" + getRandomCodeGroup()
                + ", otpValidationMinutes=" + getOtpValidationMinutes() + ", otpEnableOTPHeaderParamName="
                + getOtpEnableOTPHeaderParamName() + ", otpEnableCheckApp=" + getOtpEnableCheckApp()
                + ", headerParamNameUserName=" + getHeaderParamNameUserName() + ", headerParamNameEidasPostLogin="
                + getHeaderParamNameEidasPostLogin() + ", headerParamNameUserSurname=" + getHeaderParamNameUserSurname()
                + ", numeroTentativi=" + getNumeroTentativi() + ", idpCookieName=" + getIdpCookieName()
                + ", elencoSediUtenteUrl=" + getElencoSediUtenteUrl() + ", aggiornaDataUltimaConnessioneUrl="
                + getAggiornaDataUltimaConnessioneUrl() + ", randomCodeGroupNumber=" + getRandomCodeGroupNumber()
                + ", cdmTipoUtenteLite=" + getCdmTipoUtenteLite() + ", cdmTipoUtenteCie=" + getCdmTipoUtenteCie()
                + ", cdmGiuridica=" + getCdmGiuridica() + ", cdmFisica=" + getCdmFisica() + ", cdmResidente="
                + getCdmResidente() + ", linkModificaPassword=" + getLinkModificaPassword() + ", ldapUserInfo="
                + getLdapUserInfo() + ", ldapUserDelete=" + getLdapUserDelete() + ", ldapUserUpdate="
                + getLdapUserUpdate() + ", userFieldModify=" + getUserFieldModify() + ", newUser=" + getNewUser()
                + ", spidEmail=" + getSpidEmail() + "SSOConfiguration(authenticateUrl=" + getAuthenticateUrl()
                + ", cookieName=" + getCookieName() + ", jwtCookieName=" + getJwtCookieName() + ", agentAuthnTxCookie="
                + getAgentAuthnTxCookie() + ", headerName=" + getHeaderName() + ", sessionInfoUrl="
                + getSessionInfoUrl() + ", logoutUrl=" + getLogoutUrl() + ", targetUrlParam=" + getTargetUrlParam()
                + ", targetUrlDefault=" + getTargetUrlDefault() + ", targetUrlPattern=" + getTargetUrlPattern()
                + ", fakeResponse=" + isFakeResponse() + ", findUserByCFNotTipoUtente=" + getFindUserByCFNotTipoUtente()
                + ", userInfo=" + getUserInfo() + ", resetUserIdByEmail=" + getResetUserIdByEmail()
                + ", resetUserIdByPartitaIva=" + getResetUserIdByPartitaIva() + ", passwordRecovery="
                + getPasswordRecovery() + ", recaptchaCode=" + getRecaptchaCode() + ", recaptchaSecretKey="
                + getRecaptchaSecretKey() + ", googleCaptchaVerifierUrl=" + getGoogleCaptchaVerifierUrl()
                + ", postLoginUrl=" + getPostLoginUrl() + ", httpHeaderPostLoginUrl=" + getHttpHeaderPostLoginUrl()
                + ", passwordRecoveryTokenCheck=" + getPasswordRecoveryTokenCheck() + ", captchaEnabled="
                + isCaptchaEnabled() + ", passwordReset=" + getPasswordReset() + ", staticResourceUrl="
                + getStaticResourceUrl() + ", passwordChange=" + getPasswordChange() + ", passwordChangeExpired="
                + getPasswordChangeExpired() + ", footerLinkUtili=" + getFooterLinkUtili() + ", headerLink="
                + getHeaderLink() + ", scriviLink=" + getScriviLink() + ", registratiLink=" + getRegistratiLink()
                + ", resetPasswordTargetUrl=" + getResetPasswordTargetUrl() + ", modificaProfiloLink="
                + getModificaProfiloLink() + ", fascicoloCittadinoLink=" + getFascicoloCittadinoLink()
                + ", logoutRedirectUrl=" + getLogoutRedirectUrl() + ", pdtRedirectUrl=" + getPdtRedirectUrl()
                + ", undoLogoutRedirectUrl=" + getUndoLogoutRedirectUrl() + ", logoutMessageMobile="
                + getLogoutMessageMobile() + ", oldCookieName=" + getOldCookieName() + ", homepageLink="
                + getHomepageLink() + ", breadcrumbLinkHome=" + getBreadcrumbLinkHome() + ", breadcrumbLinkAccedi="
                + getBreadcrumbLinkAccedi() + ", breadcrumbLinkRecuperaPassword=" + getBreadcrumbLinkRecuperaPassword()
                + ", breadcrumbLinkRecuperaIdUtente=" + getBreadcrumbLinkRecuperaIdUtente()
                + ", breadcrumbLinkCambioPassword=" + getBreadcrumbLinkCambioPassword()
                + ", breadcrumbLinkAltreModalita=" + getBreadcrumbLinkAltreModalita() + ", breadcrumbLinkResetPassword="
                + getBreadcrumbLinkResetPassword() + ", breadcrumbLinkUpdateCompanyProfile="
                + getBreadcrumbLinkUpdateCompanyProfile() + ", breadcrumbLinkUpdateUserProfile="
                + getBreadcrumbLinkUpdateUserProfile() + ", enabledAdobeAnalytics=" + isEnabledAdobeAnalytics()
                + ", enabledGoogleAnalytics=" + isEnabledGoogleAnalytics() + ", anonSessionByTokenUrl="
                + getAnonSessionByTokenUrl() + ", updateAnonSessionUrl=" + getUpdateAnonSessionUrl()
                + ", anonSessionTokenTimeValidity=" + getAnonSessionTokenTimeValidity()
                + ", anonSessionTokenCookieName=" + getAnonSessionTokenCookieName()
                + ", anonSessionTokenCookieHttpOnly=" + isAnonSessionTokenCookieHttpOnly()
                + ", anonSessionTokenCookieSecure=" + isAnonSessionTokenCookieSecure() + ", anonSessionTokenCookiePath="
                + getAnonSessionTokenCookiePath() + ", anonSessionTokenCookieDomain="
                + getAnonSessionTokenCookieDomain() + ", mailAnonSessionSubject=" + getMailAnonSessionSubject()
                + ", anonSessionCustomApp=" + Arrays.deepToString((Object[]) getAnonSessionCustomApp()) + ", mailFrom="
                + getMailFrom() + ", mailServiceUrl=" + getMailServiceUrl() + ", oauth2Pattern=" + getOauth2Pattern()
                + ", cdmTipoUtenteSpid=" + getCdmTipoUtenteSpid() + ", headerParamNamePostLogin="
                + getHeaderParamNamePostLogin() + ", headerParamValuePostLogin=" + getHeaderParamValuePostLogin()
                + ", headerParamNameUserId=" + getHeaderParamNameUserId() + ", headerParamNameDataNascita="
                + getHeaderParamNameDataNascita() + ", dataNascitaFormat=" + getDataNascitaFormat()
                + ", forgerockBaseUrl=" + getForgerockBaseUrl() + ", forgerockIdpInitiatedUrl="
                + getForgerockIdpInitiatedUrl() + ", forgerockAdminUsername=" + getForgerockAdminUsername()
                + ", forgerockAdminPassword=" + getForgerockAdminPassword() + ", forgerockAdminAuthenticate="
                + getForgerockAdminAuthenticate() + ", randomCodeGroup=" + getRandomCodeGroup()
                + ", otpValidationMinutes=" + getOtpValidationMinutes() + ", otpEnableOTPHeaderParamName="
                + getOtpEnableOTPHeaderParamName() + ", otpEnableCheckApp=" + getOtpEnableCheckApp()
                + ", headerParamNameUserName=" + getHeaderParamNameUserName() + ", headerParamNameEidasPostLogin="
                + getHeaderParamNameEidasPostLogin() + ", headerParamNameUserSurname=" + getHeaderParamNameUserSurname()
                + ", numeroTentativi=" + getNumeroTentativi() + ", idpCookieName=" + getIdpCookieName()
                + ", elencoSediUtenteUrl=" + getElencoSediUtenteUrl() + ", aggiornaDataUltimaConnessioneUrl="
                + getAggiornaDataUltimaConnessioneUrl() + ", randomCodeGroupNumber=" + getRandomCodeGroupNumber()
                + ", cdmTipoUtenteLite=" + getCdmTipoUtenteLite() + ", cdmTipoUtenteCie=" + getCdmTipoUtenteCie()
                + ", cdmGiuridica=" + getCdmGiuridica() + ", cdmFisica=" + getCdmFisica() + ", cdmResidente="
                + getCdmResidente() + ", linkModificaPassword=" + getLinkModificaPassword() + ", ldapUserInfo="
                + getLdapUserInfo() + ", ldapUserDelete=" + getLdapUserDelete() + ", ldapUserUpdate="
                + getLdapUserUpdate() + ", userFieldModify=" + getUserFieldModify() + ", newUser=" + getNewUser()
                + ", spidEmail=" + getSpidEmail();
    }

    public String getAuthenticateUrl() {
        return this.authenticateUrl;
    }

    public String getCookieName() {
        return this.cookieName;
    }

    public String getJwtCookieName() {
        return this.jwtCookieName;
    }

    public String getAgentAuthnTxCookie() {
        return this.agentAuthnTxCookie;
    }

    public String getHeaderName() {
        return this.headerName;
    }

    public String getSessionInfoUrl() {
        return this.sessionInfoUrl;
    }

    public String getLogoutUrl() {
        return this.logoutUrl;
    }

    public String getTargetUrlParam() {
        return this.targetUrlParam;
    }

    public String getTargetUrlDefault() {
        return this.targetUrlDefault;
    }

    public String getTargetUrlPattern() {
        return this.targetUrlPattern;
    }

    public boolean isFakeResponse() {
        return this.fakeResponse;
    }

    public String getFindUserByCFNotTipoUtente() {
        return this.findUserByCFNotTipoUtente;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public String getResetUserIdByEmail() {
        return this.resetUserIdByEmail;
    }

    public String getResetUserIdByPartitaIva() {
        return this.resetUserIdByPartitaIva;
    }

    public String getPasswordRecovery() {
        return this.passwordRecovery;
    }

    public String getRecaptchaCode() {
        return this.recaptchaCode;
    }

    public String getRecaptchaSecretKey() {
        return this.recaptchaSecretKey;
    }

    public String getGoogleCaptchaVerifierUrl() {
        return this.googleCaptchaVerifierUrl;
    }

    public String getPostLoginUrl() {
        return this.postLoginUrl;
    }

    public String getHttpHeaderPostLoginUrl() {
        return this.httpHeaderPostLoginUrl;
    }

    public String getPasswordRecoveryTokenCheck() {
        return this.passwordRecoveryTokenCheck;
    }

    public boolean isCaptchaEnabled() {
        return this.captchaEnabled;
    }

    public String getPasswordReset() {
        return this.passwordReset;
    }

    public String getStaticResourceUrl() {
        return this.staticResourceUrl;
    }

    public String getPasswordChange() {
        return this.passwordChange;
    }

    public String getPasswordChangeExpired() {
        return this.passwordChangeExpired;
    }

    public String getFooterLinkUtili() {
        return this.footerLinkUtili;
    }

    public String getHeaderLink() {
        return this.headerLink;
    }

    public String getScriviLink() {
        return this.scriviLink;
    }

    public String getRegistratiLink() {
        return this.registratiLink;
    }

    public String getResetPasswordTargetUrl() {
        return this.resetPasswordTargetUrl;
    }

    public String getModificaProfiloLink() {
        return this.modificaProfiloLink;
    }

    public String getFascicoloCittadinoLink() {
        return this.fascicoloCittadinoLink;
    }

    public String getLogoutRedirectUrl() {
        return this.logoutRedirectUrl;
    }

    public String getPdtRedirectUrl() {
        return this.pdtRedirectUrl;
    }

    public String getUndoLogoutRedirectUrl() {
        return this.undoLogoutRedirectUrl;
    }

    public String getLogoutMessageMobile() {
        return this.logoutMessageMobile;
    }

    public String getOldCookieName() {
        return this.oldCookieName;
    }

    public String getHomepageLink() {
        return this.homepageLink;
    }

    public String getBreadcrumbLinkHome() {
        return this.breadcrumbLinkHome;
    }

    public String getBreadcrumbLinkAccedi() {
        return this.breadcrumbLinkAccedi;
    }

    public String getBreadcrumbLinkRecuperaPassword() {
        return this.breadcrumbLinkRecuperaPassword;
    }

    public String getBreadcrumbLinkRecuperaIdUtente() {
        return this.breadcrumbLinkRecuperaIdUtente;
    }

    public String getBreadcrumbLinkCambioPassword() {
        return this.breadcrumbLinkCambioPassword;
    }

    public String getBreadcrumbLinkAltreModalita() {
        return this.breadcrumbLinkAltreModalita;
    }

    public String getBreadcrumbLinkResetPassword() {
        return this.breadcrumbLinkResetPassword;
    }

    public String getBreadcrumbLinkUpdateCompanyProfile() {
        return this.breadcrumbLinkUpdateCompanyProfile;
    }

    public String getBreadcrumbLinkUpdateUserProfile() {
        return this.breadcrumbLinkUpdateUserProfile;
    }

    public boolean isEnabledAdobeAnalytics() {
        return this.enabledAdobeAnalytics;
    }

    public boolean isEnabledGoogleAnalytics() {
        return this.enabledGoogleAnalytics;
    }

    public String getAnonSessionByTokenUrl() {
        return this.anonSessionByTokenUrl;
    }

    public String getUpdateAnonSessionUrl() {
        return this.updateAnonSessionUrl;
    }

    public long getAnonSessionTokenTimeValidity() {
        return this.anonSessionTokenTimeValidity;
    }

    public String getAnonSessionTokenCookieName() {
        return this.anonSessionTokenCookieName;
    }

    public boolean isAnonSessionTokenCookieHttpOnly() {
        return this.anonSessionTokenCookieHttpOnly;
    }

    public boolean isAnonSessionTokenCookieSecure() {
        return this.anonSessionTokenCookieSecure;
    }

    public String getAnonSessionTokenCookiePath() {
        return this.anonSessionTokenCookiePath;
    }

    public String getAnonSessionTokenCookieDomain() {
        return this.anonSessionTokenCookieDomain;
    }

    public String getMailAnonSessionSubject() {
        return this.mailAnonSessionSubject;
    }

    public String[] getAnonSessionCustomApp() {
        return this.anonSessionCustomApp;
    }

    public String getMailFrom() {
        return this.mailFrom;
    }

    public String getMailServiceUrl() {
        return this.mailServiceUrl;
    }

    public String getOauth2Pattern() {
        return this.oauth2Pattern;
    }

    public String getCdmTipoUtenteSpid() {
        return this.cdmTipoUtenteSpid;
    }

    public String getHeaderParamNamePostLogin() {
        return this.headerParamNamePostLogin;
    }

    public String getHeaderParamValuePostLogin() {
        return this.headerParamValuePostLogin;
    }

    public String getHeaderParamNameUserId() {
        return this.headerParamNameUserId;
    }

    public String getHeaderParamNameDataNascita() {
        return this.headerParamNameDataNascita;
    }

    public String getDataNascitaFormat() {
        return this.dataNascitaFormat;
    }

    public String getForgerockBaseUrl() {
        return this.forgerockBaseUrl;
    }

    public String getForgerockIdpInitiatedUrl() {
        return this.forgerockIdpInitiatedUrl;
    }

    public String getForgerockAdminUsername() {
        return this.forgerockAdminUsername;
    }

    public String getForgerockAdminPassword() {
        return this.forgerockAdminPassword;
    }

    public String getForgerockAdminAuthenticate() {
        return this.forgerockAdminAuthenticate;
    }

    public String getRandomCodeGroup() {
        return this.randomCodeGroup;
    }

    public Integer getOtpValidationMinutes() {
        return this.otpValidationMinutes;
    }

    public String getOtpEnableOTPHeaderParamName() {
        return this.otpEnableOTPHeaderParamName;
    }

    public String getOtpEnableCheckApp() {
        return this.otpEnableCheckApp;
    }

    public String getHeaderParamNameUserName() {
        return this.headerParamNameUserName;
    }

    public String getHeaderParamNameEidasPostLogin() {
        return this.headerParamNameEidasPostLogin;
    }

    public String getHeaderParamNameUserSurname() {
        return this.headerParamNameUserSurname;
    }

    public String getNumeroTentativi() {
        return this.numeroTentativi;
    }

    public String getIdpCookieName() {
        return this.idpCookieName;
    }

    public String getElencoSediUtenteUrl() {
        return this.elencoSediUtenteUrl;
    }

    public String getAggiornaDataUltimaConnessioneUrl() {
        return this.aggiornaDataUltimaConnessioneUrl;
    }

    public String getRandomCodeGroupNumber() {
        return this.randomCodeGroupNumber;
    }

    public String getCdmTipoUtenteLite() {
        return this.cdmTipoUtenteLite;
    }

    public String getCdmTipoUtenteCie() {
        return this.cdmTipoUtenteCie;
    }

    public String getCdmGiuridica() {
        return this.cdmGiuridica;
    }

    public String getCdmFisica() {
        return this.cdmFisica;
    }

    public String getCdmResidente() {
        return this.cdmResidente;
    }

    public String getLinkModificaPassword() {
        return this.linkModificaPassword;
    }

    public String getLdapUserInfo() {
        return this.ldapUserInfo;
    }

    public String getLdapUserDelete() {
        return this.ldapUserDelete;
    }

    public String getLdapUserUpdate() {
        return this.ldapUserUpdate;
    }

    public String getUserFieldModify() {
        return this.userFieldModify;
    }

    public String getNewUser() {
        return this.newUser;
    }

    public String getSpidEmail() {
        return this.spidEmail;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSpidEmailChanged() {
        return this.spidEmailChanged;
    }

    public String getSpidMobile() {
        return this.spidMobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getSpidmobilechanged() {
        return this.spidmobilechanged;
    }

    public String getNewUserCIE() {
        return this.newUserCIE;
    }

    public String getIterationLimitcheckProvisioning() {
        return this.iterationLimitcheckProvisioning;
    }

    public String getTimeLimitCheckProvisioning() {
        return this.timeLimitCheckProvisioning;
    }

    public String getTimeBeforeLogout() {
        return this.timeBeforeLogout;
    }

    public String getNascitaData() {
        return this.nascitaData;
    }

    public boolean isEnableCheckCieApp() {
        return this.enableCheckCieApp;
    }

    public String getCreateUserUrl() {
        return this.createUserUrl;
    }

    public String getCheckUserUrl() {
        return this.checkUserUrl;
    }

    public String getSearchUserUrl() {
        return this.searchUserUrl;
    }

    public String getNazioneInfoUrl() {
        return this.nazioneInfoUrl;
    }

    public String getSearchCompanyUrl() {
        return this.searchCompanyUrl;
    }

    public String getSearchCompanyRappLegaleUrl() {
        return this.searchCompanyRappLegaleUrl;
    }

    public String getNazioniListaUrl() {
        return this.nazioniListaUrl;
    }

    public String getProvinceListaUrl() {
        return this.provinceListaUrl;
    }

    public String getComuniListaUrl() {
        return this.comuniListaUrl;
    }

    public String getNazioneInfoByNomeUrl() {
        return this.nazioneInfoByNomeUrl;
    }

    public String getProvinciaInfoByIdProvinciaUrl() {
        return this.provinciaInfoByIdProvinciaUrl;
    }

    public String getComuneInfoByCodiceUrl() {
        return this.comuneInfoByCodiceUrl;
    }

    public String getUserUpdateProfileUrl() {
        return this.userUpdateProfileUrl;
    }

    public String getCompanyFieldModifyUrl() {
        return this.companyFieldModifyUrl;
    }

    public String getCompanyUpdateProfileUrl() {
        return this.companyUpdateProfileUrl;
    }

    public String getEmailCheckUrl() {
        return this.emailCheckUrl;
    }

    public String getEmailCheckTokenCheckUrl() {
        return this.emailCheckTokenCheckUrl;
    }

    public String getOtpGenerateSendEmailUrl() {
        return this.otpGenerateSendEmailUrl;
    }

    public String getOtpCheckUrl() {
        return this.otpCheckUrl;
    }

    public String getOtpDeleteUrl() {
        return this.otpDeleteUrl;
    }

    public String getDomicilioDigitaleUrl() {
        return this.domicilioDigitaleUrl;
    }

    public boolean isFakeToken() {
        return this.fakeToken;
    }

    public String getLogoutHeaderUrl() {
        return this.logoutHeaderUrl;
    }

    public String getInformamiIscrizioneUrl() {
        return this.informamiIscrizioneUrl;
    }

    public String getEntraConCIEUrl() {
        return this.entraConCIEUrl;
    }

    public boolean isCheckAgeEnabled() {
        return this.checkAgeEnabled;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public Integer getRedirectTimeout() {
        return this.redirectTimeout;
    }

    public String getSpInitiatedBaseUrl() {
        return this.spInitiatedBaseUrl;
    }

    public String getSpInitiatedBaseUrlAzienda() {
        return this.spInitiatedBaseUrlAzienda;
    }

    public String getIdpListUrl() {
        return this.idpListUrl;
    }

    public List<String> getContestiApplicativiAbilitati() {
        return this.contestiApplicativiAbilitati;
    }

    public int getNodoAdsp() {
        return this.nodoAdsp;
    }
}