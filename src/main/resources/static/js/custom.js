function graphicheader_responsive() {
    var minWidthVisibility = 768;
    var width = window.innerWidth;
    if (width >= minWidthVisibility && $(".graphicheader").length) {
        var imgheight = jQuery(".group-header header > img").height();
        //$(".group-header header").append("qui" + imgheight);
        $(".group-header header").attr(
            "style",
            "height: calc(184px + " + imgheight + "px);"
        );
    } else {
        $(".group-header header").removeAttr("style");
    }
}
/* Google translate - patch gestione spostamento */
function googleTranslateElementInit_custom() {
    new google.translate.TranslateElement({
            pageLanguage: "it",
            includedLanguages: "ar,de,el,en,es,fr,ja,ru,zh-CN",
            layout: google.translate.TranslateElement.InlineLayout.SIMPLE
        },
        "google_translate_element"
    );
}

function isIE() {
    var ua = window.navigator.userAgent;
    var msie = ua.indexOf("MSIE ");
    if (msie > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./)) {
        return true;
    } else {
        return false;
    }
    return false;
}

function isEDGE() {
    var ua = window.navigator.userAgent;
    var msEdge = ua.indexOf("Edge");
    if (msEdge > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./)) {
        return true;
    } else {
        return false;
    }
    return false;
}

function tabEqualDestroy() {
    var width = window.innerWidth;
    if ($(".equal").length && width > 767) {
        var highestBox = 0;
        $(".equal")
            .children()
            .each(function () {
                if ($(this).height() > highestBox) {
                    highestBox = $(this).height();
                }
            });
        //$('.equal').append(highestBox);
        $(".equal")
            .children()
            .height(highestBox);
        $(".nav_step .nav a").attr("data-toggle", "tab");
    } else if ($(".equal").length && width < 768) {
        $(".nav_step .nav a").removeAttr("data-toggle");
    }
}

function addMargin() {
    window.scrollTo(0, window.pageYOffset - 100);
}
// AUTOCOMPLETE ARGOMENTO MESSAGGIO
function inputAutoComplete(idInput, arr, autoCompleteOnClick, validateInput) {
    var i,
        currentFocus,
        inp = document.getElementById(idInput);
    inp.addEventListener("input", function (e) {
        var a,
            b,
            val = this.value;
        /*close any already open lists of autocompleted values*/
        closeAllLists();
        if (!val) {
            return false;
        }
        currentFocus = -1;
        /*create a DIV element that will contain the items (values):*/
        a = document.createElement("div");
        a.setAttribute("id", this.id + "autocomplete-list");
        a.setAttribute("class", "autocomplete-items");
        /*append the DIV element as a child of the autocomplete container:*/
        this.parentNode.appendChild(a);
        /*for each item in the array...*/
        for (i = 0; i < arr.length; i++) {
            /*check if the item starts with the same letters as the text field value:*/
            var pos = arr[i].toUpperCase().indexOf(val.toUpperCase());
            if (pos >= 0) {
                //  PREV:   arr[i].substr(0, val.length).toUpperCase() == val.toUpperCase()
                /*create a DIV element for each matching element:*/
                b = document.createElement("div");
                if (pos == 0) {
                    b.innerHTML = "<strong>" + arr[i].substr(0, val.length) + "</strong>";
                } else {
                    b.innerHTML = arr[i].substr(0, pos);
                    b.innerHTML += "<strong>" + arr[i].substr(pos, val.length) + "</strong>";
                }
                b.innerHTML += arr[i].substr(pos + val.length);
                /*insert a input field that will hold the current array item's value:*/
                b.innerHTML += "<input type='hidden' value='" + arr[i] + "'>";
                /*execute a function when someone clicks on the item value (DIV element):*/
                b.addEventListener("click", function (e) {
                    /*insert the value for the autocomplete text field:*/
                    inp.value = this.getElementsByTagName("input")[0].value;
                    checkInputAndEnableDetails(
                        this.getElementsByTagName("input")[0].value
                    );
                    /*close the list of autocompleted values, (or any other open lists of autocompleted values:*/
                    closeAllLists();
                });
                a.appendChild(b);
            }
        }
        if (validateInput == 1) {
            btnClassToggle("tipologiaAppuntamentoForm");
        }
    });
    if (autoCompleteOnClick == 1) {
        inp.addEventListener("mousedown", function (e) {
            var c, d;
            /*close any already open lists of autocompleted values*/
            closeAllLists();
            currentFocus = -1;
            /*create a DIV element that will contain the items (values):*/
            c = document.createElement("div");
            c.setAttribute("id", this.id + "autocomplete-list");
            c.setAttribute("class", "autocomplete-items");
            /*append the DIV element as a child of the autocomplete container:*/
            this.parentNode.appendChild(c);
            /*for each item in the array...*/
            for (i = 0; i < arr.length; i++) {
                /*create a DIV element for each matching element:*/
                d = document.createElement("div");
                /*fill in with elements:*/
                d.innerHTML = arr[i] + "<input type='hidden' value='" + arr[i] + "'>";
                /*execute a function when someone clicks on the item value (DIV element):*/
                d.addEventListener("click", function (e) {
                    /*insert the value for the autocomplete text field:*/
                    inp.value = this.getElementsByTagName("input")[0].value;
                    checkInputAndEnableDetails(
                        this.getElementsByTagName("input")[0].value
                    );
                    /*close the list of autocompleted values, (or any other open lists of autocompleted values:*/
                    closeAllLists();
                });
                c.appendChild(d);
            }
        });
    }
    /*execute a function presses a key on the keyboard:*/
    inp.addEventListener("keydown", function (e) {
        var x = document.getElementById(this.id + "autocomplete-list");
        if (x) x = x.getElementsByTagName("div");
        if (e.keyCode == 40) {
            /*If the arrow DOWN key is pressed,
            increase the currentFocus variable:*/
            currentFocus++;
            /*and and make the current item more visible:*/
            addActive(x);
        } else if (e.keyCode == 38) {
            //up
            /*If the arrow UP key is pressed,
            decrease the currentFocus variable:*/
            currentFocus--;
            /*and and make the current item more visible:*/
            addActive(x);
        } else if (e.keyCode == 13) {
            /*If the ENTER key is pressed, prevent the form from being submitted,*/
            e.preventDefault();
            if (currentFocus > -1) {
                /*and simulate a click on the "active" item:*/
                if (x) x[currentFocus].click();
            }
        }
    });

    function addActive(x) {
        /*a function to classify an item as "active":*/
        if (!x) return false;
        /*start by removing the "active" class on all items:*/
        removeActive(x);
        if (currentFocus >= x.length) currentFocus = 0;
        if (currentFocus < 0) currentFocus = x.length - 1;
        /*add class "autocomplete-active":*/
        x[currentFocus].classList.add("autocomplete-active");
    }

    function removeActive(x) {
        /*a function to remove the "active" class from all autocomplete items:*/
        for (i = 0; i < x.length; i++) {
            x[i].classList.remove("autocomplete-active");
        }
    }

    function closeAllLists(elmnt) {
        /*close all autocomplete lists in the document,
        except the one passed as an argument:*/
        var x = document.getElementsByClassName("autocomplete-items");
        for (i = 0; i < x.length; i++) {
            if (elmnt != x[i] && elmnt != inp) {
                x[i].parentNode.removeChild(x[i]);
            }
        }
    }
    /*execute a function when someone clicks in the document:*/
    document.addEventListener("click", function (e) {
        closeAllLists(e.target);
    });
}

function btnClassToggle(frm) {
    var f = document.getElementById(frm);
    var inpToCheck = f.querySelectorAll("input[required=true]");
    var btnToEnable = document.getElementById("btnProcedi");
    for (i = 0; i < inpToCheck.length; i++) {
        if (!$.nodeName(inpToCheck[i], "input")) return;
        var isValid = inpToCheck[i].checkValidity();
        if (isValid) {
            btnToEnable.classList.remove("disabled");
        } else {
            btnToEnable.classList.add("disabled");
            return false;
        }
    }
}

function checkInputAndEnableDetails(e) {
    var txtToVal,
        frm = document.getElementById("tipologiaAppuntamentoForm"),
        fld = frm.getElementsByTagName("fieldset");
    if (typeof e == "string") {
        txtToVal = e;
    } else {
        txtToVal = e.target.value;
    }
    if (txtToVal == "Carta di identità elettronica") {
        if (!document.getElementById("cartaIdentitaElettronica")) {
            if (fld.length > 0) {
                for (i = 0; i < fld.length; i++) {
                    frm.removeChild(fld[i]);
                }
            }
            fld = document.createElement("fieldset");
            var leg = document.createElement("legend"),
                div = document.createElement("div"),
                lab = document.createElement("label"),
                inp = document.createElement("input"),
                div_int = document.createElement("div");
            fld.setAttribute("id", "cartaIdentitaElettronica");
            fld.setAttribute("class", "d-block");
            leg.innerHTML =
                "Per procedere con la prenotazione dell'appuntamento inserisci il codice fiscale della persona per cui effettuare la prenotazione";
            // INPUT
            div.setAttribute("class", "form-group");
            lab.setAttribute("for", "codiceFiscale");
            lab.innerHTML = "Codice fiscale";
            inp.setAttribute("id", "codiceFiscale");
            inp.setAttribute("name", "codiceFiscale");
            inp.setAttribute("placeholder", "Codice fiscale *");
            inp.setAttribute("type", "text");
            // inp.setAttribute("pattern", ".*\S.*");
            inp.setAttribute("class", "form-control");
            inp.setAttribute("required", "true");
            div_int.setAttribute("class", "invalid-feedback");
            div_int.innerHTML = "Campo obbligatorio";
            // APPEND
            frm.appendChild(fld);
            fld.appendChild(leg);
            fld.appendChild(div);
            div.appendChild(lab);
            div.appendChild(inp);
            div.appendChild(div_int);
        }
    } else if (txtToVal == "Visura fascicoli edilizi") {
        if (!document.getElementById("visuraFascicoliEdilizi")) {
            if (fld.length > 0) {
                for (i = 0; i < fld.length; i++) {
                    frm.removeChild(fld[i]);
                }
            }
            fld = document.createElement("fieldset");
            var leg = document.createElement("legend"),
                div_1 = document.createElement("div"),
                lab_1 = document.createElement("label"),
                inp_1 = document.createElement("input"),
                div_int_1 = document.createElement("div"),
                div_2 = document.createElement("div"),
                lab_2 = document.createElement("label"),
                inp_2 = document.createElement("input"),
                div_int_2 = document.createElement("div");
            fld.setAttribute("id", "visuraFascicoliEdilizi");
            fld.setAttribute("class", "d-block");
            leg.innerHTML =
                "Per procedere con la prenotazione dell'appuntamento compilare i campi seguenti";
            // INPUT 1
            div_1.setAttribute("class", "form-group");
            lab_1.setAttribute("for", "visuraNumeroProtocollo");
            lab_1.innerHTML = "Numero di Protocollo";
            inp_1.setAttribute("id", "visuraNumeroProtocollo");
            inp_1.setAttribute("name", "visuraNumeroProtocollo");
            inp_1.setAttribute("placeholder", "Numero di Protocollo *");
            inp_1.setAttribute("type", "text");
            // inp_1.setAttribute("pattern", ".*\S.*");
            inp_1.setAttribute("class", "form-control");
            inp_1.setAttribute("required", "true");
            div_int_1.setAttribute("class", "invalid-feedback");
            div_int_1.innerHTML = "Campo obbligatorio";
            // INPUT 2
            div_2.setAttribute("class", "form-group");
            lab_2.setAttribute("for", "visuraAnno");
            lab_2.innerHTML = "Anno";
            inp_2.setAttribute("id", "visuraAnno");
            inp_2.setAttribute("name", "visuraAnno");
            inp_2.setAttribute("placeholder", "Anno *");
            inp_2.setAttribute("type", "text");
            // inp_2.setAttribute("pattern", ".*\S.*");
            inp_2.setAttribute("class", "form-control");
            inp_2.setAttribute("required", "true");
            div_int_2.setAttribute("class", "invalid-feedback");
            div_int_2.innerHTML = "Campo obbligatorio";
            // APPEND
            frm.appendChild(fld);
            fld.appendChild(leg);
            fld.appendChild(div_1);
            fld.appendChild(div_2);
            div_1.appendChild(lab_1);
            div_1.appendChild(inp_1);
            div_1.appendChild(div_int_1);
            div_2.appendChild(lab_2);
            div_2.appendChild(inp_2);
            div_2.appendChild(div_int_2);
        }
    } else {
        if (fld.length > 0) {
            for (i = 0; i < fld.length; i++) {
                frm.removeChild(fld[i]);
            }
        }
        document.getElementById("btnProcedi").classList.remove("disabled");
    }
    return;
}

function inputCheckDisplayOpt(idEl) {
    if (document.getElementById(idEl + "Chk").checked) {
        document.getElementById(idEl + "Wrp").style.display = "block";
        if (document.getElementById(idEl + "Txt")) {
            document.getElementById(idEl + "Txt").setAttribute("required", "true");
        }
    } else {
        document.getElementById(idEl + "Wrp").style.display = "none";
        if (document.getElementById(idEl + "Txt")) {
            document.getElementById(idEl + "Txt").removeAttribute("required");
        }
    }
}

function inputRadioDisplayOpt(idEl) {
    if (document.getElementById(idEl + "Rad").checked) {
        document.getElementById(idEl + "Wrp").style.display = "block";
        if (document.getElementById(idEl + "Txt")) {
            document.getElementById(idEl + "Txt").setAttribute("required", "true");
        }
    } else {
        document.getElementById(idEl + "Wrp").style.display = "none";
        if (document.getElementById(idEl + "Txt")) {
            document.getElementById(idEl + "Txt").removeAttribute("required");
        }
    }
}
var timerExecuted = false;

function startTimer(counterVal, counterDsp) {
    if (timerExecuted == false) {
        timerExecuted = true;
        var x, diff, minutes, seconds, counterCont, countDown = new Date().getTime() + counterVal;
        // Update the count down every 1 second
        x = setInterval(function () {
            diff = countDown - new Date().getTime() + 1000;
            //  var days = Math.floor(diff / (1000 * 60 * 60 * 24));
            //  var hours = Math.floor((diff % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
            minutes = Math.floor((diff % (1000 * 60 * 60)) / (1000 * 60));
            seconds = Math.floor((diff % (1000 * 60)) / 1000);
            //  minutes = minutes < 10 ? "0" + minutes : minutes;
            seconds = seconds < 10 ? "0" + seconds : seconds;
            counterCont = document.getElementById(counterDsp);
            counterCont.innerHTML = minutes + ":" + seconds;
            //  If the count down is over, write some text
            if (diff < 0) {
                clearInterval(x);
                counterCont.classList.remove("dim-fix-border");
                counterCont.innerHTML = "Tempo scaduto!";
            }
        }, 1000);
    }
}

function accessoCivicoGeneralizzatoCntrl() {
    if (!docsDaAllegareChk.checked && !datiDaSpecificareChk.checked && !infoDaAggiungereChk.checked) {
        var docsDaAllegare = document.getElementById("docsDaAllegareChk"),
            datiDaSpecificare = document.getElementById("datiDaSpecificareChk"),
            infoDaAggiungere = document.getElementById("infoDaAggiungereChk"),
            chkErr = document.getElementById("chkErrMsg");
        docsDaAllegare.classList.add("is-invalid");
        datiDaSpecificare.classList.add("is-invalid");
        infoDaAggiungere.classList.add("is-invalid");
        chkErr.style.display = "block";
        return false;
    }
}
//Questa itruzione è necessaria perchè sia Edge che IE non chiamano la callback dopo il caricamento degli script googole
if (isIE() || isEDGE()) {
    $(googleTranslateElementInit_custom());
}
graphicheader_responsive();
window.addEventListener("hashchange", addMargin);
// BS4 FORM CUSTOM INPUT VALIDATION
(function () {
    "use strict";
    window.addEventListener(
        "load",
        function () {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName("needs-validation");
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener(
                    "submit",
                    function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        if (document.getElementById("accessoCivicoGeneralizzatoForm")) {
                            accessoCivicoGeneralizzatoCntrl();
                        }
                        form.classList.add("was-validated");
                    },
                    false
                );
            });
        },
        false
    );
})();
/* Swipe carousel news */
if ($(".carousel-evidenza").length) {
    $(".carousel-evidenza").swipe({
        swipe: function (
            event,
            direction,
            distance,
            duration,
            fingerCount,
            fingerData
        ) {
            if (direction == "left") jQuery(this).carousel("next");
            if (direction == "right") jQuery(this).carousel("prev");
        },
        allowPageScroll: "vertical"
    });
}
/* Validate Form Tipologia Appuntamento */
if ($("#tipologiaAppuntamentoForm").length) {
    $("#tipologiaAppuntamentoForm").on("click input", function () {
        btnClassToggle("tipologiaAppuntamentoForm");
    });
}
$(document).ready(function () {
    /* gestione classe per box stessa altezza e destroy tab x small device */
    $(tabEqualDestroy());
    if ($("#navigazioneprincipale").length) {
        /* Menu slide dx - http://mmenu.frebsite.nl/documentation/extensions/ */
        var $menu = $("#navigazioneprincipale").mmenu({
            extensions: ["position-right"],
            keyboardNavigation: {
                enable: true,
                enhance: true
            }
        }, {
            clone: true
        });
        var $icon = $("#toggle-menu");
        var API = $menu.data("mmenu");
        $icon.on("click", function () {
            API.open();
        });
        API.bind("open:finish", function () {
            setTimeout(function () {
                $icon.addClass("is-active");
            }, 100);
        });
        API.bind("close:finish", function () {
            setTimeout(function () {
                $icon.removeClass("is-active");
            }, 100);
        });
        API.bind("close:start", function () {
            cleanheader();
        });
        API.bind("open:start", function () {
            cleanheader();
        });

        function cleanheader() {
            $(".goog-te-menu-frame.skiptranslate").css("display", "none");
            $("#searchresponsive").modal("hide");
            $(".toogle-search").removeClass("selected");
            $(".toogle-menuresponsive").removeClass("selected");
        }
        /* Gestione icone selezionate modali header */
        $("#searchresponsive").on("show.bs.modal", function () {
            $(".toogle-search")
                .addClass("selected")
                .removeClass("noselected");
        });
        $("#searchresponsive").on("hidden.bs.modal", function () {
            $(".toogle-search")
                .removeClass("selected")
                .addClass("noselected");
        });
        $("#menuresponsive").on("show.bs.modal", function () {
            $(".toogle-menuresponsive").toggleClass("selected");
        });
        $("#menuresponsive").on("hidden.bs.modal", function () {
            $(".toogle-menuresponsive").toggleClass("selected");
        });
        /* spostamento google translate */
        var maxWidth = 768;
        var width = window.innerWidth;
        if (width < maxWidth) {
            $(".mm-listitem.gt_container_menu").append(
                "<div id='google_translate_element'></div>"
            );
            $(".gt_container_header").empty();
        }
    }
    /* Collegamento doppia navigazione step by step */
    if ($(".nav_step").length) {
        $(".nav_step .nav a").click(function () {
            var parentref = $(this).attr("data-id");
            var ref = $(this).attr("href");
            //$(".tab-generico.vertical").append("ff"+" #" + parent-ref);
            $("#" + parentref + " .nav a").removeClass("active");
            $("#" + parentref + " .nav a[href='" + ref + "']").addClass("active");
            if (width < 768) {
                $(".nav_step .nav a").removeClass("active");
                $(this).addClass("active");
            }
        });
        $(".tab-generico.vertical .nav a").click(function () {
            var ref = $(this).attr("href");
            $(".nav_step .nav a").removeClass("active");
            $(".nav_step .nav a[href='" + ref + "']").addClass("active");
        });
    }
    if ($(".slick").length) {
        /* Carousel notizie - pagine interne */
        $(".news .slick").slick({
            speed: 500,
            accessibility: true,
            adaptiveHeight: true,
            dots: false,
            infinite: true,
            slidesToShow: 1,
            slidesToScroll: 1
        });
        /* Galleria grande */
        $(".galleria .slick").slick({
            speed: 500,
            accessibility: true,
            dots: false,
            infinite: true,
            slidesToShow: 1,
            slidesToScroll: 1
        });
        /* Galleria mini */
        $(".galleria_mini .slick").slick({
            speed: 500,
            accessibility: true,
            dots: false,
            infinite: true,
            slidesToShow: 4,
            slidesToScroll: 4,
            responsive: [{
                    breakpoint: 1024,
                    settings: {
                        slidesToShow: 3,
                        slidesToScroll: 3
                    }
				},
                {
                    breakpoint: 768,
                    settings: {
                        slidesToShow: 2,
                        slidesToScroll: 2
                    }
				},
                {
                    breakpoint: 500,
                    settings: {
                        slidesToShow: 1,
                        slidesToScroll: 1
                    }
				}
			]
        });
        if ($(".galleria_mini .slick").length) {
            $(".galleria_mini .slick").slickLightbox();
        }
    }
    /* Ancore con animazione - tab verticale con navigazione per step */
    if (width < maxWidth) {
        $(".nav_step a, .navancore a").click(function (e) {
            e.preventDefault();
            var target = $($(this).attr("href"));
            if (target.length) {
                var scrollTo = target.offset().top;
                $("body, html").animate({
                        scrollTop: scrollTo - 100 + "px"
                    },
                    800
                );
            }
        });
    }
    /* Inizializzazione oggetto readmore su content-editor */
    if ($(".content-editor.readmore").length) {
        $(".content-editor.readmore").readmore({
            moreLink: '<p class="readmoreopen"><a href="#">Leggi tutto</a></p>',
            lessLink: '<p class="readmoreclose"><a href="#">Chiudi</a></p>',
            collapsedHeight: 85,
            afterToggle: function (trigger, element, expanded) {
                if (!expanded) {
                    // The "Close" link was clicked
                    $("html, body").animate({
                        scrollTop: element.offset().top - 180
                    }, {
                        duration: 100
                    });
                }
            }
        });
    }
    /* Attivazione DatePicker per IE */
    if ($(".datapicker input").length) {
        webshims.setOptions("forms-ext", {
            types: "date"
        });
        webshims.polyfill("forms forms-ext");
    }
    /* personalizzazione select */
    if ($(".custom_select select").length) {
        $(function () {
            $(".custom_select select").selectric({
                maxHeight: 600
            });
        });
    }
    // AUTOCOMPLETE ARGOMENTO MESSAGGIO
    if (document.getElementById("argomentoMessaggio")) {
        var argomenti = [
			"Appuntamento CIE",
			"Catasto",
			"Cittadino",
			"Documentazione",
			"Domicilio",
			"Informazioni CIE",
			"Modifica appuntamento CIE",
			"Pagamenti",
			"Residenza",
			"Utile"
		];
        inputAutoComplete("argomentoMessaggio", argomenti, 0, 0);
    }
    // AUTOCOMPLETE TIPOLOGIA APPUNTAMENTO
    if (document.getElementById("tipologiaAppuntamento")) {
        var tipologia = [
			"Divorzi e Separazioni",
			"Residenza per cittadini stranieri",
			"Carta di identità elettronica",
			"Pratiche in corso",
			"Edilizia e territorio",
			"Informazioni area bonifiche",
			"Visura fascicoli edilizi"
		];
        inputAutoComplete("tipologiaAppuntamento", tipologia, 1, 1);
    }
    //  ACTIVATE REG TIMER
    if ($("#regTimerWrapper").length > 0 && $(".disponibilita-oraria").length == 0) {
        $("#regTimerWrapper").fadeIn(1000, function () {
            startTimer(120000, "regTimer");
        });
    }
    $("#regTimerLaunch").on("click", function () {
        $("#regTimerWrapper").fadeIn(1000, function () {
            startTimer(120000, "regTimer");
        });
    })
    // Disabilito input partita iva per persone fisiche
    var campiInput = [
		"Nome",
		"Cognome",
		"Codice Fiscale",
		"Email",
		"Telefono",
		"Cellulare"
	];
    $("#tipoPersona").change(function () {
        if (
            $(this)
            .find("option:selected")
            .text() === "Persona fisica"
        ) {
            $("#editPartitaIVA").prop("disabled", true);
            $("#editPartitaIVA").val('');
            campiInput = [
				"Nome",
				"Cognome",
				"Codice Fiscale",
				"Email",
				"Telefono",
				"Cellulare"
			];
        } else {
            $("#editPartitaIVA").prop("disabled", false);
            campiInput = [
				"Nome",
				"Cognome",
				"Partita IVA",
				"Codice Fiscale",
				"Email",
				"Telefono",
				"Cellulare"
			];
        }
    });
    $("#submitEditNome").click(function () {
        console.log("Invio Modale");
        $(".utenteDettagli").html("");
        $("#modalEditUtente input:enabled").each(function (k, v) {
            if ($(this).val() !== "") {
                console.log("KEY: " + k + " VALUE: " + v.value);
                console.log(campiInput[k]);
                $(".utenteDettagli").append(
                    "<p><strong>" +
                    campiInput[k] +
                    ": </strong>" +
                    $(this).val() +
                    "</span></p>"
                );
            }
        });
    });
    $("#customCheckBoxCntrlFld").click(function () {
        $(this).find("input").removeClass("is-valid, is-invalid");
        $(this).find("#chkErrMsg").css("display", "none");
    })
    $("#accessoRecuperoIdForm fieldset").click(function () {
        if ($("#recuperoIdUtentePersonaRad").is(":checked")) {
            $("#emailUtente").removeAttr("disabled").attr("required", "required");
        } else {
            $("#emailUtente").val("").removeAttr("required").attr("disabled", "disabled");
        }
        if ($("#recuperoIdUtenteAziendaleRad").is(":checked")) {
            $("#codiceFiscaleUtente").removeAttr("disabled").attr("required", "required");
        } else {
            $("#codiceFiscaleUtente").val("").removeAttr("required").attr("disabled", "disabled");
        }
    })
});
/* Compressione testata */
$(document).on("scroll", function () {
    //var visoreHeight = jQuery(".group-header").height();
    var visoreHeight = 125;
    if (jQuery(document).scrollTop() > visoreHeight) {
        jQuery("body").addClass("shrink");
    } else {
        jQuery("body").removeClass("shrink");
    }
});
$(window).on("resize", function () {
    graphicheader_responsive();
    $(tabEqualDestroy());
    var width = window.innerWidth;
    var maxWidth = 768;
    /* spostamento google translate - on resize */
    if (width < maxWidth) {
        if (
            $(".mm-listitem.gt_container_menu > #google_translate_element").size() ==
            0
        ) {
            $(".mm-listitem.gt_container_menu").append(
                $("#google_translate_element")
            );
            console.log("metto in menu");
        }
        $(".gt_container_header").empty();
    } else {
        if ($(".gt_container_header > #google_translate_element").size() == 0) {
            $(".gt_container_header").append($("#google_translate_element"));
            console.log("metto in header");
        }
        $(".mm-listitem.gt_container_menu ").empty();
    }
});
