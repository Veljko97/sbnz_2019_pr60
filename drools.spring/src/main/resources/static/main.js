$(document).ready(function () {

    $("#check-crime-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {
    $("#btn-search").prop("disabled", true);
    var data = '';
    var inputs = $( "form input:checkbox" );
    
    for(let element of inputs){
        if(element.checked){
            let tranform = element.labels[0].innerText;
            tranform = tranform.toUpperCase();
            tranform = tranform.replace(/ /g , "_" );
            data += "actionTypes="+tranform + "&";
        }
    }

    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/actions?" + data,
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "Izvrsen zlocin je: " + data.crimeType;
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4>&lt;pre&gt;"
                + e.responseText + "&lt;/pre&gt;";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}