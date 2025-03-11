<#import "/spring.ftl" as spring />
<#assign accesso_area_riservata>
    <@spring.message "login.spid.page.accesso.area.riservata" />
</#assign>
<!-- titolo -->
<div class="bd-highlight">
    <h1 class="big-heading fw-bold">
        ${accesso_area_riservata}
    </h1>
</div>
<div class="bd-highlight">
    <#--
        <p class="fw-bold">
        <@spring.message "login.spid.page.metodo.login" />
        </p>
        <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
            <li class="nav-item">
                <a class="nav-link border border-end-0 border-primary rounded-0 rounded-start active" id="pills-spid-tab" data-bs-toggle="pill" href="#pills-spid" role="tab" aria-controls="pills-spid" aria-selected="true">SPID</a>
            </li>
            <li class="nav-item">
                <a class="nav-link border border-start-0 border-end-0 border-primary rounded-0" id="pills-cie-tab" data-bs-toggle="pill" href="#pills-cie" role="tab" aria-controls="pills-cie" aria-selected="false">CIE</a>
            </li>
            <li class="nav-item">
                <a class="nav-link border border-start-0 border-primary rounded-0 rounded-end" id="pills-eidas-tab" data-bs-toggle="pill" href="#pills-eidas" role="tab" aria-controls="pills-eidas" aria-selected="false">eIDAS</a>
            </li>
        </ul> -->
        <!-- pagina di login spid -->
        <#include "spid.ftl">
            <#-- <div class="tab-content" id="pills-tabContent">
                <div class="tab-pane fade show active" id="pills-spid" role="tabpanel" aria-labelledby="pills-spid-tab"></div>
                <div class="tab-pane fade" id="pills-cie" role="tabpanel" aria-labelledby="pills-cie-tab">
                    <#include "cie.ftl">
                </div>
                <div class="tab-pane fade" id="pills-eidas" role="tabpanel" aria-labelledby="pills-eidas-tab">
                    <#include "eidas.ftl">
                </div>
</div> -->
</div>