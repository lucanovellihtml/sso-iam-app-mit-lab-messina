<#import "/spring.ftl" as spring />
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<#assign codice_errore_message>
    <@spring.message "error.message.notfound.code" />
</#assign>
<#assign messaggio_errore_message>
    <@spring.message "error.message.notfound.message" />
</#assign>
<#assign bottone_errore_message>
    <@spring.message "error.message.notfound.button.title" />
</#assign>
<#assign messaggio_info1_message>
    <@spring.message "error.message.notfound.description" />
</#assign>
<div class="container px-5 px-sm-0 my-4 bd-highlight d-flex flex-column align-items-center">
    <div class="row gap-3 w-100" style="max-width:600px;">
        <!-- col titolo -->
        <div class="col-12 text-center">
            <!-- title -->
            <h1 class="my-1">
                ${codice_errore_message}
            </h1>
            <!-- title -->
            <h3 class="mt-1 mb-4">
                ${messaggio_errore_message}
            </h3>
        </div>
        <!-- col info -->
        <div class="col-12">
            <p class="m-0">
                <!-- paragrafo -->
                ${messaggio_info1_message}
            </p>
        </div>
        <!-- col link -->
        <div class="col-12">
            <!-- paragrafo -->
            <p class="sr-only">
                <!-- link -->
                <a href="#navinterna" title="${bottone_errore_message}">
                    ${bottone_errore_message}
                </a>
            </p>
        </div>
    </div>
</div>