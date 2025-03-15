<#import "/spring.ftl" as spring />
<#assign info_cie_descrizione>
    <@spring.message "login.cie.messina.page.info.cie.descrizione" />
</#assign>
<#assign info_cie_generali>
    <@spring.message "login.cie.messina.page.info.generali" />
</#assign>
<!-- container cie -->
<div class="col-12 col-lg-5 justify-content-center align-items-center border rounded-3 shadow p-3 p-xl-5 bg-white pb-4">
    <!-- div bottone cie -->
    <#include "cie.ftl" />
    <!-- div info footer -->
    <div class="mt-4">
        <!-- paragraph info footer -->
        <p>
            ${info_cie_descrizione}
        </p>
        <p>
            ${info_cie_generali}
        </p>
    </div>
</div>