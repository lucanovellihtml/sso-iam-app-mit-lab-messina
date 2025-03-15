<#import "/spring.ftl" as spring />
<#assign accedi_credenziali_cie>
    <@spring.message "login.cie.messina.page.accedi.credenziali.cie" />
</#assign>
<#assign maggiori_info_cie>
    <@spring.message "login.cie.messina.page.maggiori.info.cie" />
</#assign>
<#assign accesso_area_riservata>
    <@spring.message "login.cie.messina.page.accesso.area.riservata" />
</#assign>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<!-- div intro titolo cie -->
<div>
    <!-- paragrafo -->
    <p class="fw-light mb-0">
        ${accesso_area_riservata}
    </p>
    <!-- div titolo e svg info -->
    <div class="d-flex gap-1">
        <!-- titolo -->
        <h6 class="fw-bold">
            ${accedi_credenziali_cie}
        </h6>
        <!-- svg help circle -->
        <svg style="fill: #06c !important;" class="icon icon-sm icon-primary" data-container="body"
            data-toggle="popover" data-trigger="hover" data-placement="bottom" data-html="true"
            title=""
            data-content="<div><b>SPID TIPO 1</b> - Identità digitale della persona fisica</div>
                                                                                                                                                                                          <div><b>SPID TIPO 3</b> - Identità digitale ad uso professionale della persona fisica</div>"
            data-original-title="">
            <use href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-help-circle"
                xlink:href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-help-circle"></use>
        </svg>
    </div>
</div>
<!-- div cie -->
<div class="align-items-center mt-4">
    <!-- div form cie access -->
    <div class="w-100">
        <!-- form -->
        <form id="cieAcces" name="cie_access" action="#" method="post">
            <!-- div bottone e lista idp -->
            <div class="d-grid gap-2 d-sm-block">
                <a href="#" class="btn italia-it-button italia-it-button-size-m button-spid rounded"
                    spid-idp-button="#spid-idp-button-medium-post" aria-haspopup="true" style="width:auto!important"
                    aria-expanded="false"> <span class="italia-it-button-icon"><img
                            src="${cdnUrl}${urls.getForLookupPath('/img/logo_entra_con_CIE.png')}"
                            onerror="this.src=\"
                            ${cdnUrl}${urls.getForLookupPath('/img/logo_entra_con_CIE.png')}\"; this.onerror=null;"
                            alt="<@spring.message 'login.mobile.app.access.cie' />" /></span> <span
                        class="italia-it-button-text">
                        <@spring.message 'login.mobile.app.access.cie' />
                    </span>
                </a>
            </div>
        </form>
    </div>
    <!-- col list info cie -->
    <div>
        <!-- list info cie -->
        <ul class="list-unstyled small fw-bold primary-color">
            <li><a href="https://www.cartaidentita.interno.gov.it/la-carta/identificazione-digitale/">
                    ${maggiori_info_cie}
                </a>
            </li>
        </ul>
    </div>
</div>