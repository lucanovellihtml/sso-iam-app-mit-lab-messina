
<#import "/spring.ftl" as spring />
<#assign defaultLogout><@spring.url '/postlogin/logout'/></#assign>

setTimeout(function(){ 
   window.location = "${(logoutUrl!defaultLogout)?no_esc}"
}, parseInt("${(logoutTimeout!60000)?c}"));

$('[id^="select-profile-"]').on("change",function(){
    $("#confirm").removeClass("disabled");
})

$("#exampleInputText").on("keyup", function() {
    var value = $(this).val().toLowerCase();
        $("#elencoSedi label").filter(function() {
        if(!($(this).text().toLowerCase().indexOf(value) >= 0)){
            
            $(this).parent().hide();
        }else{
            $(this).parent().show();
        
        }
        });
  });