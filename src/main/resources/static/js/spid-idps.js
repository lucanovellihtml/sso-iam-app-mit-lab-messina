(function (window) {

  // check if exists button spid aziende and spid user
  let spid_element_cittadino = document.querySelectorAll('ul[data-spid-remote-cittadino]');
  let spid_element_azienda = document.querySelectorAll('ul[data-spid-remote-azienda]');


  // spid_populate function, if '.spid-button[data-spid-remote] ul' exist, try to get the remote json file and pupulate all spid buttons or use array static idps if fetch failure
  function spid_populate(spid_elements) {
    var idps = [{ "organization_name": "ArubaPEC S.p.A.", "entity_id": "https://loginspid.aruba.it", "logo_uri": "img/spid-idp-arubaid.svg" }, { "organization_name": "InfoCert S.p.A.", "entity_id": "https://identity.infocert.it", "logo_uri": "img/spid-idp-infocertid.svg" }, { "organization_name": "IN.TE.S.A. S.p.A.", "entity_id": "https://spid.intesa.it", "logo_uri": "img/spid-idp-intesaid.svg" }, { "organization_name": "Lepida S.p.A.", "entity_id": "https://id.lepida.it/idp/shibboleth", "logo_uri": "img/spid-idp-lepidaid.svg" }, { "organization_name": "Namirial", "entity_id": "https://idp.namirialtsp.com/idp", "logo_uri": "img/spid-idp-namirialid.svg" }, { "organization_name": "Poste Italiane SpA", "entity_id": "https://posteid.poste.it", "logo_uri": "img/spid-idp-posteid.svg" }, { "organization_name": "Sielte S.p.A.", "entity_id": "https://identity.sieltecloud.it", "logo_uri": "img/spid-idp-sielteid.svg" }, { "organization_name": "Register.it S.p.A.", "entity_id": "https://spid.register.it", "logo_uri": "img/spid-idp-spiditalia.svg" }, { "organization_name": "TI Trust Technologies srl", "entity_id": "https://login.id.tim.it/affwebservices/public/saml2sso", "logo_uri": "img/spid-idp-timid.svg" }, { "organization_name": "TeamSystem s.p.a.", "entity_id": "https://spid.teamsystem.com/idp", "logo_uri": "img/spid-idp-teamsystemid.svg" }];
    if (spid_elements.length > 0) {
      fetch(idpListUrl)
        .then(function (response) {
          return response.json();
        })
        .then(function (idps) {
          idps = idps.sort(() => Math.random() - 0.5)
          for (var u = 0; u < spid_elements.length; u++) {
            for (var i = 0; i < idps.length; i++) { spid_addIdpEntry(idps[i], spid_elements[u]); }

          }
        })
        .catch(function (error) {
          console.log('Error during fetch: ' + error.message);
          idps.sort(() => Math.random() - 0.5)
          for (var u = 0; u < spid_elements.length; u++) {
            for (var i = 0; i < idps.length; i++) { spid_addIdpEntry(idps[i], spid_elements[u]); }
          }
        });
    }
  }

  // function spid_addIdpEntry make a "li" element with the ipd link and prepend this in a element
  //
  // options:
  // - data - is an object with "organization_name", "entity_id" and "logo_uri" values
  // - element - is the element where is added the new "li" element
  function spid_addIdpEntry(data, element) {
    const att = document.createAttribute("data-idp");
    att.value = data['entity_id'];
    let li = document.createElement('li');
    li.className = 'spid-idp-button-link';
    li.setAttributeNode(att);
    console.log("url azienda ->", spInitiatedBaseUrlAzienda);
    console.log("url cittadino ->", spInitiatedBaseUrl);
    if (element.id.indexOf('post-cittadino') !== -1) {
      console.log("Sono cittadino");
      li.innerHTML = `<button class="idp-button-idp-logo" onclick='this.form.action="${spInitiatedBaseUrl.replace("@entity_id@", data['entity_id'])}";' name="${data['organization_name']}" type="submit"><span class="spid-sr-only">${data['organization_name']}</span><img class="spid-idp-button-logo" src="${data['logo_uri']}?t=${Date.now()}" alt="${data['organization_name']}" /></button></li>`
    };
    if (element.id.indexOf('post-azienda') !== -1) {
      console.log("sono azienda");
      li.innerHTML = `<button class="idp-button-idp-logo" onclick='this.form.action="${spInitiatedBaseUrlAzienda.replace("@entity_id@", data['entity_id'])}";' name="${data['organization_name']}" type="submit"><span class="spid-sr-only">${data['organization_name']}</span><img class="spid-idp-button-logo" src="${data['logo_uri']}?t=${Date.now()}" alt="${data['organization_name']}" /></button></li>`
    };
    /*if (element.id.indexOf('get-cittadino') !== -1) {
      li.innerHTML = `<a href="${spInitiatedBaseUrl.replace("@entity_id@", data['entity_id'])}"><span class="spid-sr-only">${data['organization_name']}</span><img src="${data['logo_uri']}?t=${Date.now()}" alt="${data['organization_name']}" /></a>`
    };
    if (element.id.indexOf('get-azienda') !== -1) {
      li.innerHTML = `<a href="${spInitiatedBaseUrlAzienda.replace("@entity_id@", data['entity_id'])}"><span class="spid-sr-only">${data['organization_name']}</span><img src="${data['logo_uri']}?t=${Date.now()}" alt="${data['organization_name']}" /></a>`
    }*/
    element.prepend(li)
  }

  // when page is ready populate all spid buttons
  document.onreadystatechange = function () {
    if (document.readyState == "interactive") {
      spid_populate(spid_element_cittadino);
      spid_populate(spid_element_azienda);
    }
  }

})(window)
