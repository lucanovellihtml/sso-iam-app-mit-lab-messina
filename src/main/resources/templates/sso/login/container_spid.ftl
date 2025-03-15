<#import "/spring.ftl" as spring />
<#assign info_spid_descrizione>
    <@spring.message "login.spid.messina.page.info.spid.descrizione" />
</#assign>
<#noautoesc>
    <script>
    const idpListUrl = "${idpListUrl}?t=${longTimeH}"
    const spInitiatedBaseUrl = "${spInitiatedBaseUrl}"
    const spInitiatedBaseUrlAzienda = "${spInitiatedBaseUrlAzienda}"
    </script>
</#noautoesc>
<!-- container spid -->
<div class="col-12 col-lg-5 justify-content-center align-items-center border rounded-3 shadow p-3 p-xl-5 bg-white pb-4">
    <!-- div bottone spid -->
    <#include "spid.ftl" />
    <!-- div bottone spid aziende -->
    <#include "spid_aziende.ftl" />
    <!-- div info footer -->
    <div class="mt-3">
        <!-- paragraph info footer -->
        <p>
            ${info_spid_descrizione}
        </p>
    </div>
</div>