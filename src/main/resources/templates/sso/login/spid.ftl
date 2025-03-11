<#import "/spring.ftl" as spring />
<#assign accedi_credenziali_spid>
    <@spring.message "login.spid.page.accedi.credenziali.spid" />
</#assign>
<#assign maggiori_info_spid>
    <@spring.message "login.spid.page.maggiori.info.spid" />
</#assign>
<#assign non_hai_spid>
    <@spring.message "login.spid.page.non.hai.spid" />
</#assign>
<#assign info_spid_domanda>
    <@spring.message "login.spid.page.info.spid.domanda" />
</#assign>
<#assign info_spid_descrizione>
    <@spring.message "login.spid.page.info.spid.descrizione" />
</#assign>
<#assign info_generali_part1>
    <@spring.message "login.spid.page.info.generali.part1" />
</#assign>
<#assign info_generali_part2>
    <@spring.message "login.spid.page.info.generali.part2" />
</#assign>
<#assign info_generali_part3>
    <@spring.message "login.spid.page.info.generali.part3" />
</#assign>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<#noautoesc>
    <script>
    const idpListUrl = "${idpListUrl}?t=${longTimeH}"
    const spInitiatedBaseUrl = "${spInitiatedBaseUrl}"
    </script>
</#noautoesc>
<div class="m-2 bd-highlight">
    <p class="fw-bold">
        ${accedi_credenziali_spid}
    </p>
</div>
<div class="d-grid d-sm-inline-flex gap-2 flex-wrap">
    <div class="bd-highlight">
        <form id="spidAcces" name="spid_idp_access" action="#" method="post">
            <div class="row">
                <div class="col-12">
                    <div class="d-grid gap-2 d-sm-block">
                        <a href="#" class="btn italia-it-button italia-it-button-size-m button-spid rounded"
                            spid-idp-button="#spid-idp-button-medium-post" aria-haspopup="true" style="width:auto!important"
                            aria-expanded="false"> <span class="italia-it-button-icon"><img
                                    src="${cdnUrl}${urls.getForLookupPath('/img/spid-ico-circle-bb.svg')}"
                                    onerror="this.src=\"
                                    ${cdnUrl}${urls.getForLookupPath('/img/spid-ico-circle-bb.png')}\"; this.onerror=null;"
                                    alt="<@spring.message 'login.mobile.app.access.spid' />" /></span> <span
                                class="italia-it-button-text">
                                <@spring.message 'login.mobile.app.access.spid' />
                            </span>
                        </a>
                        <div id="spid-idp-button-medium-post"
                            class="spid-idp-button spid-idp-button-tip spid-idp-button-relative">
                            <ul id="spid-idp-list-medium-root-post" class="spid-idp-button-menu"
                                aria-labelledby="spid-idp" data-spid-remote>
                            </ul>
                        </div>
                        <button onclick="window.open('https://www.spid.gov.it', '_blank');" type="button"
                            class="ml-3 btn rounded btn-outline-secondary text-start px-3 py-2">
                            <span class="fs-6"><svg class="icon icon icon-secondary">
                                    <use href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-info-circle" xlink:href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-info-circle"></use>
                                </svg>
                                ${maggiori_info_spid}
                            </span>
                        </button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<div class="mb-4 mt-1 bd-highlight">
    <a target="_blank" style="color: #0b6fb6"
        href="https://www.spid.gov.it/richiedi-spid">
        ${non_hai_spid}
    </a>
</div>
<div class="mb-4 mt-2 bd-highlight">
    <p class="fw-bold mb-0">
        ${info_spid_domanda}
    </p>
    <p>
        ${info_spid_descrizione}
    </p>
</div>
<div class="alert alert-primary neutral-2-bg border-top-0 border-end-0 border-bottom-0">
    <h6 class="">
        ${info_generali_part1}
        <span
            class="fw-bold">
            ${info_generali_part2}
        </span>
        ${info_generali_part3}
    </h6>
</div>