function action() {

	$("#header nav a").click(function(e) {
		e.preventDefault();
		$("#header nav a").removeClass("active");
		$(this).addClass("active");
		return false;
	});
	$("#city")
			.click(
					function(e) {
						e.preventDefault();
						document.getElementById("wrapper-city-menu").style = "display:block;position:absolute";
						return false;
					});
	$("#close").click(function(e) {
		e.preventDefault();
		document.getElementById("wrapper-city-menu").style = "display:none;";
		return false;
	});

	$('#catalog p a').mouseover(
			function(event) {
				event.preventDefault();
				closeAllCatalog();
				$($(this).attr('href')).attr('style', 'display:inline-block');
				$('#cantainer-catalog').attr('style', 'display:inline-block');
				$('#catalog-menu').width(
						$('#catalog-menu').width()
								+ $($(this).attr('href')).width());
				$('#catalog-full').width(
						$('#catalog-full').width()
								+ $($(this).attr('href')).width());
				return false;
			});
	$('#catalog-full').mouseleave(function(event) {
	
		closeAllCatalog();
		return false;

	});

	function closeAllCatalog() {
		
		$('#catalog-menu').attr('style', 'width:auto');
		$('#catalog-full').attr('style', 'width:auto');

		$('#cantainer-catalog div').attr('style', 'display:none');
	}
}

$('#user-office').click(function(event) {

	

	if (document.getElementById('user').innerHTML == "none") {
		document.getElementById('login').style.display = 'block';
	} else {

	}
	return false;
});
$('#button-log')
		.click(
				function(event) {
					event.preventDefault();
					if (document.getElementById('name').value != ""
							&& document.getElementById('password').value != ""
							&& true) {
						document.getElementById('login').style.display = 'none';
					} else {
						document.getElementById('login').style.display = 'block';
					}

				});
$('#button-reg').click(function(event) {
	event.preventDefault();

	document.getElementById('login').style.display = 'none';
	document.getElementById('registration').style.display = 'block';

});
$('#reg-button-reg')
		.click(
				function(event) {
					document.getElementById('registration').style.display = 'block';
					document.getElementById('login').style.display = 'none';
					document.getElementById('reg-error').innerHTML = '';
					
					event.preventDefault();
					
					if (document.getElementById('reg-password').value != document
							.getElementById('reg-password-r').value
							|| document.getElementById('reg-password-r').value == ""
							|| document.getElementById('reg-password').value == ""
							|| document.getElementById('reg-login').value == ""
							|| document.getElementById('reg-email').value == ""
							|| document.getElementById('reg-phone').value == "") {

						if (document.getElementById('reg-password').value != document
								.getElementById('reg-password-r').value) {
							document.getElementById('reg-error').innerHTML += 'незбігаються введенні паролі<br>';
							document.getElementById('reg-error-h-password').style.display = 'inline-block';

						} else{
							document.getElementById('reg-error-h-password').style.display = 'none';
						}
						if (document.getElementById('reg-password-r').value == "") {
							document.getElementById('reg-error').innerHTML += 'невведений пароль<br>';
							document.getElementById('reg-error-h-password-r').style.display = 'inline-block';
						}else{
							document.getElementById('reg-error-h-password-r').style.display = 'none';
						}if (document.getElementById('reg-password').value == "") {
							document.getElementById('reg-error').innerHTML += 'невведений пароль<br>';
							document.getElementById('reg-error-h-password').style.display = 'inline-block';
						}else{
							document.getElementById('reg-error-h-password').style.display = 'none';
						} if (document.getElementById('reg-login').value == "") {
							document.getElementById('reg-error').innerHTML += 'невведегний логін<br>';
							document.getElementById('reg-error-h-login').style.display = 'inline-block';
						}else{
							document.getElementById('reg-error-h-login').style.display = 'none';
						}if (document.getElementById('reg-email').value == "") {
							document.getElementById('reg-error').innerHTML += 'невведений email<br>';
							document.getElementById('reg-error-h-email').style.display = 'inline-block';
						}else{
							document.getElementById('reg-error-h-email').style.display = 'none';
						} if (document.getElementById('reg-phone').value == "") {
							document.getElementById('reg-error').innerHTML += 'невведений телефон<br>';
							document.getElementById('reg-error-h-phone').style.display = 'inline-block';
						}else{
							document.getElementById('reg-error-h-phone').style.display = 'none';
						}
					} else {
						document.getElementById('reg-error-h-password').style.display = 'none';
						document.getElementById('reg-error-h-password-r').style.display = 'none';
						document.getElementById('reg-error-h-login').style.display = 'none';
						document.getElementById('reg-error-h-email').style.display = 'none';
						document.getElementById('reg-error-h-phone').style.display = 'none';

						
						
						document.getElementById('reg-error').style.color="green";
						document.getElementById('reg-error').innerHTML = 'реєстрація';
						
						var user = {
								login : document.getElementById('reg-login').value,
								email : document.getElementById('reg-email').value,
								phone : document.getElementById('reg-phone').value,
								password : document.getElementById('reg-password').value
							}
							$.ajax({
								url: 'registration?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
								method: 'POST',
								contentType: 'application/json; charset=UTF-8',
								dataType: 'json',
								data: JSON.stringify(user),
								success : function (res) {
									document.getElementById('registration').style.display = 'none';
									document.getElementById('login').style.display = 'block';
								}
							})
						
					}
					return false;
				});
