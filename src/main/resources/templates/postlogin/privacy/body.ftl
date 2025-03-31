<#import "/spring.ftl" as spring />
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"] />
<#assign title>
    <@spring.message "postlogin.privacy.title" />
</#assign>
<#assign info1>
    <@spring.message "postlogin.privacy.info1" />
</#assign>
<#assign info2>
    <@spring.message "postlogin.privacy.info2" />
</#assign>
<#assign info3>
    <@spring.message "postlogin.privacy.info3" />
</#assign>
<#assign privacy_text>
    <@spring.message "postlogin.privacy.text" />
</#assign>
<#assign privacy_checkbox_label>
    <@spring.message "postlogin.privacy.checkbox.label" />
</#assign>
<#assign btn_rifiuta>
    <@spring.message "postlogin.privacy.btn.rifiuta" />
</#assign>
<#assign btn_conferma>
    <@spring.message "postlogin.privacy.btn.conferma" />
</#assign>
<div class="container px-5 px-sm-0 my-4 bd-highlight">
    <div class="row gap-3 justify-content-center">
        <!-- col titolo -->
        <div class="col-12 bd-highlight">
            <!-- titolo -->
            <h1 class="big-heading fw-bold">
                ${title}
            </h1>
        </div>
        <!-- col descrizione privacy -->
        <div class="col-12 bd-highlight">
            <!-- paragrafo -->
            <p>
                <span>
                    ${info1}
                    <strong>
                        ${nomeEcognome!""}
                    </strong>,</span>
                <br />
                <span>
                    ${info2}
                </span>
                <br />
                <span>
                    ${info3}
                </span>
            </p>
        </div>
        <!-- col form -->
        <div class="col-12 bd-highlight">
            <!-- form -->
            <form class="needs-validation" novalidate method="post" id="privacyForm"
                action="<@spring.url '/postlogin/accept-privacy'/>" name="privacyForm">
                <@security.csrfInput />
                <!-- descrizione privacy -->
                <div class="mb-3">
                    <#-- <label class="" for="privacyText">
                        ${info}
                        </label> -->
                        <div id="privacyText">
                            ${privacy_text}
                        </div>
                </div>
                <!-- div button -->
                <div class="my-5">
                    <!-- bottone rifiuta -->
                    <a id="undoButton" href="<@spring.url '/postlogin/logout'/>" class="btn btn-outline-danger" style="">
                        <span class="px-5">
                            ${btn_rifiuta}
                        </span>
                    </a>
                    <!-- bottone accetta -->
                    <button type="submit" class="btn btn-primary float-end"
                        style=""><span class="px-5">
                            ${btn_conferma}
                        </span>
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>