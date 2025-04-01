<#include "/layout/mainLayout.ftl" />
<#import "/spring.ftl" as spring />
<#assign page_title>
    <@spring.message "error.message.notfound.title" />
</#assign>
<@mainTemplate pageTitle="${page_title}" viewName="/error/" />