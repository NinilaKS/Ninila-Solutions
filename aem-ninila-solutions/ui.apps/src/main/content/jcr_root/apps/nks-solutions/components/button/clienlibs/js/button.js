
$(document).ready(function(){

$(".my-btn").click(function(){

  var api = $(".my-btn").attr("data-api");
  api = api+".txt";

  $.ajax({url: api, method:"GET", success: function(result){
    $("#div1").html(result);
  }});


});

});