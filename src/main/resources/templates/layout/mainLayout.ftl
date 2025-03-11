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
        <!-- header -->
        <header class="it-header-wrapper">
            <#--<div class="it-header-slim-wrapper">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="it-header-slim-wrapper-content px-5">
                                <a class="d-none d-lg-block navbar-brand" target="_blank" href="https://www.mit.gov.it/">Ministero delle Infrastrutture e dei Trasporti</a>
                                <#- <div class="nav-mobile">
                                    <nav aria-label="Navigazione secondaria">
                                        <a class="it-opener d-lg-none" data-bs-toggle="collapse" href="#menuC1" role="button" aria-expanded="false" aria-controls="menuC1">
                                            <span>Ente appartenenza</span>
                                            <svg class="icon" aria-hidden="true">
                                                <use href="/bootstrap-italia/dist/svg/sprites.svg#it-expand"></use>
                                            </svg>
                                        </a>
                                        <div class="link-list-wrapper collapse" id="menuC1">
                                            <ul class="link-list">
                                                <li><a class="dropdown-item list-item" href="#">Link 1</a></li>
                                                <li><a class="list-item active" href="#" aria-current="page">Link 2 (Attivo)</a></li>
                                            </ul>
                                        </div>
                                    </nav>
                            </div> ->
                            <div class="it-header-slim-right-zone">
                                <div class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                        <span class="visually-hidden">Selezione lingua: lingua selezionata</span>
                                        <span>
                                            ${springMacroRequestContext.getLocale()}
                                        </span>
                                        <svg class="icon d-none d-lg-block">
                                            <use href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-expand" xlink:href="${cdnUrl}${urls.getForLookupPath('/bsitalia/svg/sprites.svg')}#it-expand"></use>
                                        </svg>
                                    </a>
                                    <div class="dropdown-menu">
                                        <div class="row">
                                            <div class="col-12">
                                                <div class="link-list-wrapper">
                                                    <ul class="link-list" id="locales">
                                                        <li><a class="dropdown-item list-item" data-lang="it" href="#"><span>IT <span class="visually-hidden">selezionata</span></span></a></li>
                                                        <li><a class="dropdown-item list-item" data-lang="en" href="#"><span>EN</span></a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </div>
                </div> -->
                <div class="it-nav-wrapper">
                    <div class="it-header-center-wrapper p-0">
                        <div class="container px-5">
                            <div class="row">
                                <div class="col-12">
                                    <#-- manca XS -->
                                        <#--<a target="_blank" href="https://www.mit.gov.it/"><img
                                                src="${cdnUrl}${urls.getForLookupPath('/img/logo-MIT.png')}" alt="Ministero delle Infrastrutture e dei Trasporti"
                                                class="mb-3 float-end" style="max-width: 250px" /></a>-->
                                            <a target="_blank" href="https://adspmacscoll.pcspln.cloud/"><img
                                                    src="${cdnUrl}${urls.getForLookupPath('/img/adsp_ravenna_scritta_bianca.png')}" alt="Autorita' di Sistema Portuale del Mare Adriatico Centro Settentrionale"
                                                    class="mb-3" style="weight:200px;height:100px" /></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </header>
        <!-- main -->
        <div class="">
            <div class="container py-3 px-md-5 py-xl-5">
                <div class="justify-content-center align-items-center border rounded-3 shadow p-3 p-xl-5 bg-white">
                    <#include "${viewName}/body.ftl" ignore_missing=true>
                        <div class="row">
                            <#-- <div class="col-12">
                        </div> -->
                        <div class="col-12">
                            <div class="p-4 text-center mt-3 neutral-2-bg">
                                <#--<a target="_blank" href="https://www.mit.gov.it/"><img
                                        src="${cdnUrl}/img/ministero-trasporti-on.png" alt="Ministero dei Trasporti"
                                        class="mr-3" /></a>-->
                                    <#--<a target="_blank" href="https://www.cciss.it/web/cciss/"><img
                                            src="${cdnUrl}/img/viaggiare-informati-on.png" alt="Viaggiare Informati"
                                            class="mr-3" /></a>-->
                                        <#--<a target="_blank" href="https://carburanti.mise.gov.it/OssPrezziSearch/"><img
                                                src="${cdnUrl}/img/osservaprezzi-carburanti-on.png" alt="Osservaprezzi Carburante"
                                                class="mr-3" /></a>-->
                                            <img src="${cdnUrl}${urls.getForLookupPath('/img/spid-agid-logo-lb.png')}" style="weight:250px;height:40px" class="mr-3" />
                            </div>
                        </div>
                </div>
            </div>
        </div>
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