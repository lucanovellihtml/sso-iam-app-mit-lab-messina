<#include "../layout/mainLayout.ftl" />
<#import "/spring.ftl" as spring />
<#assign page_title>
    <@spring.message "postlogin.privacy.title" />
</#assign>
<@mainTemplate pageTitle="${page_title}" viewName="/postlogin/privacy" />