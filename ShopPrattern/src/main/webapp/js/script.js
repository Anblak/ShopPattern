$("#header nav a").click(function(e) {
	e.preventDefault();		
	$("#header nav a").removeClass("active");
	$(this).addClass("active");
});
$("#city").click(function(e) {
	document.getElementById("wrapper-city-menu").style="display:block;position:absolute";
});
$("#close").click(function(e) {
	document.getElementById("wrapper-city-menu").style="display:none;";
});
