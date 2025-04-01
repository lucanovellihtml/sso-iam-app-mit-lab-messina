<#import "/spring.ftl" as spring />
<#assign defaultLogout><@spring.url '/postlogin/logout'/></#assign>

setTimeout(function(){ 
   window.location = "${(logoutUrl!defaultLogout)?no_esc}"
}, parseInt("${(logoutTimeout!60000)?c}"));