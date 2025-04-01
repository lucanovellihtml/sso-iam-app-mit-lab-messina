<#import "/spring.ftl" as spring />
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"] />
<#assign page_title>
    <@spring.message "generic.error.title" />
</#assign>
<div class="container px-5 px-sm-0 my-4 bd-highlight">
    <div class="row gap-3 justify-content-center">
        <!-- col titolo -->
        <div class="col-12 bd-highlight">
            <!-- titolo -->
            <h1 class="big-heading fw-bold">
                ${page_title}
            </h1>
        </div>
        <!-- col errore messaggio generico -->
        <div class="col-12 alert alert-danger" role="alert">
            <@spring.messageText "${error_msg}" "Errore Generico" />
        </div>
    </div>
</div>