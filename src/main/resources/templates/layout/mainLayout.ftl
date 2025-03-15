<#macro mainTemplate pageTitle viewName>
    <#import "/spring.ftl" as spring />
    <#setting date_format="dd/MM/yyyy" />
    <#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
    <#assign longTimeH=.now?long?c />
    <!DOCTYPE html>
    <!--[if IE 8]
><html class="no-js is-ie8"><![endif]
-->
    <!--[if gt IE 8]
><!-->
    <html class="no-js">
    <!--<![endif]
-->

    <head>
        <title>
            ${pageTitle}
        </title>
        <link rel="icon" href="${cdnUrl}${urls.getForLookupPath('/img/spid-ico-circle-bb.svg')}">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="robots" content="noindex,nofollow">
        <link href="${cdnUrl}${urls.getForLookupPath('/bsitalia/css/bootstrap-italia.min.css')}" rel="stylesheet" media="screen" />
        <link href="${cdnUrl}${urls.getForLookupPath('/css/spid-sp-access-button.min.css')}" rel="stylesheet" />
        <link href="${cdnUrl}${urls.getForLookupPath('/css/custom.css')}" rel="stylesheet" media="screen" />
        <script>
        window.__PUBLIC_PATH__ = "${cdnUrl}/bsitalia/fonts"
        </script>
    </head>

    <body class="text-dark">
        <div class="container-fluid px-0" style="min-height: calc(100vh - 123.56px);">
            <!-- header -->
            <header class="it-header-wrapper">
                <div class="it-nav-wrapper">
                    <div class="it-header-center-wrapper p-0">
                        <div class="container px-5">
                            <div class="row">
                                <div class="col-12 text-center">
                                    <a target="_blank" href="https://pcs.adspstretto.it/web/portale-adsp/home"><img
                                            src="${cdnUrl}${urls.getForLookupPath('/img/adsp-messina.png')}" alt="Autorita' di Sistema Portuale del Mare Adriatico Centro Settentrionale"
                                            class="w-100 my-4" style="max-width:800px;"></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- main -->
            <main>
                <#include "${viewName}/body.ftl" ignore_missing=true>
            </main>
        </div>
        <!-- footer -->
        <#include "mainLayoutFooter.ftl">
            <script>
            $(function() {
                $(document).keypress(
                    function(event) {
                        if (event.which == '13') {
                            event.preventDefault();
                        }
                    });
            });
            </script>
    </body>

    </html>
</#macro>