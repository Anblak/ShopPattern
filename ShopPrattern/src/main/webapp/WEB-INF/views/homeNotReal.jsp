<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jsInEveryHouse.js"></script>
</head>
<body>
	<h1>home</h1>

	
	
<script src="js/jquery-3.1.1.min.js"></script>

<input type="text" id="title">
<input type="text" id="pages">
<button id="saveBook">save book</button>
<br>

<input id="nameCatalog">
<button  onclick="saveCatalog()">Save Catalog</button>

<div id="allCatalogs"></div>
<input type="hidden" name="csrf_name"
       value="${_csrf.parameterName}" />
<input type="hidden" name="csrf_value"
       value="${_csrf.token}" />
<br>
<br>
<input type="text" id="reg-login">
<input type="text" id="reg-email">
<input type="text" id="reg-phone">
<input type="password" id="reg-password">
<button id="signUp">reg</button>

<script type="text/javascript">
document.getElementById('signUp').onclick = function () {
	

var user = {
		name : document.getElementById('reg-login').value,
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

document.getElementById('saveBook').onclick = function () {

    var book = {

        title : $('#title').val(),
		pages : $('#pages').val()
        

    }

    document.getElementById('title').value = '';
    document.getElementById('pages').value = '';
    $.ajax({

        url: 'saveBook' ,
        method: 'POST',
        contentType: 'application/json; charset=UTF-8',
        dataType: 'json',
        data: JSON.stringify(book),
        success : function (res) {



        }


    })



}




















</script>
</body>
</html>