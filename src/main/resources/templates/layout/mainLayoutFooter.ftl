<script src="${cdnUrl}${urls.getForLookupPath('/js/jquery.min.js')}" type="text/javascript"></script>
<script src="${cdnUrl}${urls.getForLookupPath('/bsitalia/js/bootstrap-italia.bundle.min.js')}" type="text/javascript"></script>
<script>
        const popoverTriggerList = document.querySelectorAll('[data-bs-toggle="popover"]');
        const popoverList = [...popoverTriggerList].map(popoverTriggerEl => new bootstrap.Popover(popoverTriggerEl))
</script>
<!-- Add only if you want load remotally the idps list -->
<script src="${cdnUrl}${urls.getForLookupPath('/js/spid-idps.js')}" type="text/javascript"></script>
<script src="${cdnUrl}${urls.getForLookupPath('/js/jquery.validate.min.js')}" type="text/javascript"></script>
<script src="${cdnUrl}${urls.getForLookupPath('/js/spid-sp-access-button.min.js')}" type="text/javascript"></script>
<script src="${cdnUrl}${urls.getForLookupPath('/js/js.cookie.js')}" type="text/javascript"></script>
