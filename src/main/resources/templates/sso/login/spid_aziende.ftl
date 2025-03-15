<#import "/spring.ftl" as spring />
<#assign accedi_credenziali_spid>
    <@spring.message "login.spid.azienda.messina.page.accedi.credenziali.spid" />
</#assign>
<#assign maggiori_info_spid>
    <@spring.message "login.spid.azienda.messina.page.maggiori.info.spid" />
</#assign>
<#assign info_spid_domanda>
    <@spring.message "login.spid.azienda.messina.page.info.spid.domanda" />
</#assign>
<#assign accesso_area_riservata>
    <@spring.message "login.spid.azienda.messina.page.accesso.area.riservata" />
</#assign>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<!-- div intro titolo spid aziende -->
<div class="mt-4 mt-sm-0">
    <!-- paragrafo -->
    <p class="fw-light mb-0">
        ${accesso_area_riservata}
    </p>
    <!-- div titolo e svg info -->
    <div class="d-flex gap-1">
        <!-- titolo -->
        <h6 class="fw-bold text-break">
            ${accedi_credenziali_spid}
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
<!-- div spid aziende -->
<div class="align-items-center d-sm-flex gap-5 gap-lg-1 gap-xl-5">
    <!-- col list info spid -->
    <div>
        <!-- list info spid -->
        <ul class="list-unstyled small fw-bold primary-color">
            <li><a href="https://www.spid.gov.it">
                    ${maggiori_info_spid}
                </a></li>
            <li><a href="https://www.spid.gov.it/serve-aiuto">
                    ${info_spid_domanda}
                </a></li>
        </ul>
    </div>
    <!-- div form spid access -->
    <div class="ms-sm-4">
        <!-- form -->
        <form id="spidAcces" name="spid_idp_access" action="#" method="post">
            <!-- div bottone e lista idp -->
            <div class="d-grid gap-2 d-sm-block">
                <a href="#" class="btn italia-it-button italia-it-button-size-m button-spid rounded"
                    spid-idp-button="#spid-idp-button-medium-post-azienda" aria-haspopup="true" style="width:auto!important"
                    aria-expanded="false"> <span class="italia-it-button-icon"><img
                            src="${cdnUrl}${urls.getForLookupPath('/img/spid-ico-circle-bb.svg')}"
                            onerror="this.src=\"
                            ${cdnUrl}${urls.getForLookupPath('/img/spid-ico-circle-bb.png')}\"; this.onerror=null;"
                            alt="<@spring.message 'login.mobile.app.access.spid' />" /></span> <span
                        class="italia-it-button-text">
                        <@spring.message 'login.mobile.app.access.spid' />
                    </span>
                </a>
                <div id="spid-idp-button-medium-post-azienda"
                    class="spid-idp-button spid-idp-button-tip spid-idp-button-relative">
                    <ul id="spid-idp-list-medium-root-post-azienda" data-spid-remote-azienda class="spid-idp-button-menu"
                        aria-labelledby="spid-idp" data-spid-remote>
                        <li><a class="dropdown-item ps-2 py-2" href="https://www.spid.gov.it">
                                ${maggiori_info_spid}
                            </a></li>
                        <li><a class="dropdown-item ps-2 py-2" href="https://www.spid.gov.it/richiedi-spid">
                                ${non_hai_spid}
                            </a></li>
                        <li><a class="dropdown-item ps-2 py-2" href="https://www.spid.gov.it/serve-aiuto">
                                ${info_spid_domanda}
                            </a></li>
                    </ul>
                </div>
            </div>
        </form>
    </div>
</div>