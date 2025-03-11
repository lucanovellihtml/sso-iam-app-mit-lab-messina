<#include "/layout/mainLayout.ftl" />
<#import "/spring.ftl" as spring />
<#assign page_title>
    <@spring.message "iam.login.header.title" />
</#assign>
<@mainTemplate pageTitle="${page_title}" viewName="/sso/login" />