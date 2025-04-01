<#import "/spring.ftl" as spring />
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"] />

<#assign title><@spring.message "postlogin.select.profile.title"/></#assign>
<#assign info1><@spring.message "postlogin.select.profile.info1"/></#assign>
<#assign info2><@spring.message "postlogin.select.profile.info2"/></#assign>
<#assign btn_rifiuta><@spring.message "postlogin.select.profile.btn.annulla"/></#assign>
<#assign btn_conferma><@spring.message "postlogin.select.profile.btn.avanti"/></#assign>
<#assign errore_nessuna_usm_abilitata><@spring.message "postlogin.select.profile.error.no-active-profile"/></#assign>

<div class="row mb-5">
    <div class="col-12">
        <h1 class="big-heading fw-bold">${title}</h1>
    </div>
</div>
<div class="row mb-5">
    <div class="col-md-9 col-xs-6 mb-3">
    
        <span>${info1} <strong>${nomeEcognome!""}</strong>,</span>
        <br>
        <span>${info2}</span>
    </div>
    <div class="col-md-3 col-xs-6 mb-3 ">
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-outline-secondary btn-icon btn-sm  float-md-end" data-bs-toggle="modal" data-bs-target="#informativaTextModal">
            <svg class="icon icon-secondary"><use href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-info-circle" xlink:href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-info-circle"></use></svg> 
            <span><@spring.message "postlogin.select.profile.informativa"/></span>
        </button>
    </div>
</div>
<form class="needs-validation" novalidate method="post" id="privacyForm"
        action="<@spring.url '/postlogin/select-profile'/>" name="privacyForm">
    <@security.csrfInput />
    <div class="row mb-5">
        
       <#if elencoMatricoleUtente?? && elencoMatricoleUtente?has_content >
        <div class="col mb-5">
          <div class="form-group">
            <label for="exampleInputText"><@spring.message "postlogin.select.profile.textsearch"/></label>
            <input type="text" class="form-control" id="exampleInputText">
          </div>
            <#--  <div class="callout mw-100">
                <div class="callout-inner">  -->
                    <#--  <div class="callout-title">
                         <svg class="icon"><use href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-info-circle" xlink:href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-info-circle"></use></svg>  
                        <span class="visually-hidden">Elenco Sedi Imprese</span> 
                        <span class="text">Elenco Sedi Imprese</span>
                    </div>  -->
                    <div id="elencoSedi" >
                    <#assign elencoMatricoleUtente = elencoMatricoleUtente?eval_json />
                        <#list elencoMatricoleUtente?sort_by(['sedeOperativaEsterna', 'denominazioneSedeOperativa']) as usm>
                            <div class="form-check fw-bold my-0 py-2 <#if (usm?is_even_item)> lightgrey-bg-c1 </#if>">
                                <input name="selected" type="radio" id="select-profile-${usm?counter}" value="${usm.datiUtente.codiceMatricolaUtenteInterno}" <#if elencoMatricoleUtente?size == 1> checked="checked"</#if> >
                                <label for="select-profile-${usm?counter}">${usm.sedeOperativaEsterna.denominazioneSedeOperativa} (${usm.datiUtente.codiceMatricolaUtenteInterno})</label>
                            </div>
                        </#list>
                    </div>
                <#--  </div>
            </div>  -->
        </div>
       <#else>
            <div class="col-12">
                <div class="alert alert-danger">
                    <h6 class="">
                        ${errore_nessuna_usm_abilitata}
                    </h6>
                </div>
            </div>
       </#if>
    </div>
    <div class="row">
        <div class="d-grid justify-content-md-between gap-2 d-md-block col-12 mb-3">
            <a id="undoButton" href="<@spring.url '/postlogin/logout'/>" class="btn btn-outline-danger" >
                <span  class="px-5">${btn_rifiuta}</span></a>
            <button id="confirm" type="submit" class="btn btn-primary float-end  <#if (elencoMatricoleUtente?size > 1)> disabled</#if>"
                    style=""><span class="px-5">${btn_conferma}</span>
            </button>
        </div>
    </div>
</form>


<!-- Modal -->
<div class="modal it-dialog-scrollable fade" tabindex="-1" role="dialog" id="informativaTextModal" aria-labelledby="informativaTextModalTitle">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h2 class="modal-title h5 " id="informativaTextModalTitle"><@spring.message "postlogin.privacy.title"/></h2>
      </div>
      <div class="modal-body">
        <p><@spring.message "postlogin.privacy.text"/>
        </p>
      </div>
      <div class="modal-footer">
        <button class="btn btn-outline-primary btn-sm" type="button" data-bs-dismiss="modal"><@spring.message "button.chiudi"/></button>
      </div>
    </div>
  </div>
</div>