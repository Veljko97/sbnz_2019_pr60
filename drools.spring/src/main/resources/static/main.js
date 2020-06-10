$(document).ready(function () {

    $("#check-crime-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

    $("#bth-save").click(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_save()

    });

    if(window.location.pathname === "/izmeni.html"){
        get_rules();
    }

});

function get_rules(){
var searchParams = new URLSearchParams(window.location.search)
$.ajax({
        type: "GET",
        url: "/getRules?ruleSet="+ searchParams.get('ruleSet'),
        cache: false,
        timeout: 600000,
        success: function (data) {

    $("#text-change").val(data);
        },
        error: function (e){}
        });
}

function fire_ajax_submit() {
     $("#btn-search").prop("disabled", true);
     var data = '';
     var inputs = $( "form input:checkbox" );

     for(let element of inputs){
         if(element.checked){
             let tranform = element.labels[0].innerText;
             tranform = tranform.toUpperCase();
             tranform = tranform.replace(/ /g , "_" );
             tranform = tranform.replace(/,/g , "" );
             data += "actionTypes="+tranform + "&";
         }
     }

     $.ajax({
         type: "GET",
         url: "/actions?" + data,
         cache: false,
         timeout: 600000,
         success: function (data) {

             var json = "Izvrsen zlocin je: " + data.crimeType;
             $('#feedback').html(json);

             console.log("SUCCESS : ", data);
             $("#btn-search").prop("disabled", false);

         },
         error: function (e) {

             var json = "<h4>Nije zlocin</h4>";
             $('#feedback').html(json);
             $("#btn-search").prop("disabled", false);

         }
     });

 }

 function fire_ajax_save() {

    var searchParams = new URLSearchParams(window.location.search)

     $.ajax({
         type: "POST",
         contentType: "application/json",
         url: "/saveRules?ruleSet="+ searchParams.get('ruleSet'),
         data: $("#text-change").val(),
         cache: false,
         timeout: 600000,
         success: function (data) {
            history.back();
         },
         error: function (e) {
         }
     });

 }