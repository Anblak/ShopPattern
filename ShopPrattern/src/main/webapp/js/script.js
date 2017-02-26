function action(){
	
	$("#header nav a").click(function(e) {
	e.preventDefault();		
	$("#header nav a").removeClass("active");
	$(this).addClass("active");
});
$("#city").click(function(e) {
	 e.preventDefault(); 
	document.getElementById("wrapper-city-menu").style="display:block;position:absolute";
});
$("#close").click(function(e) {
	 e.preventDefault(); 
	document.getElementById("wrapper-city-menu").style="display:none;";
});


$('#catalog p a').mouseover(function(event){
	closeAllCatalog();
	 event.preventDefault(); 
    $($(this).attr('href')).attr( 'style', 'display:inline-block' );
    $('#cantainer-catalog').attr( 'style', 'display:inline-block' );
    $('#catalog-menu').width( $('#catalog-menu').width()+$($(this).attr('href')).width());
    $('#catalog-full').width( $('#catalog-full').width()+$($(this).attr('href')).width());
    
    
});	
$('#catalog-full').mouseleave(function(event){
	closeAllCatalog();
	
	 event.preventDefault(); 
});	


   
	
function closeAllCatalog(){
	$('#catalog-menu').attr( 'style', 'width:auto' );
	$('#catalog-full').attr( 'style', 'width:auto' );
	
	$('#cantainer-catalog div').attr( 'style', 'display:none' );
}
}

$('#user-office').click(function(event){
		
	 event.preventDefault(); 
	
	if(document.getElementById('user').innerHTML=="none"){
		document.getElementById('registration').style.display='block';
	}else{
		
		
	}
});
$('#button-reg').click(function(event){
	document.getElementById('registration').style.display='none';
	 event.preventDefault(); 
	 
});