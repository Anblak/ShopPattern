
 <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> 
   
    
   
  
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	
<div id="wrapper">
  <header id="header" class="header" >
		<div class="container">
				<div class="row">
					<div class="h-panel clearfix">
						<nav class="h-nav h-nav-tabs border-fix">
							<a href="#" class="active">Інтернет-магазин</a>
							<a href="#">про компанію</a>
						</nav>
						<nav class="h-nav h-nav-center border-fix">
							<a href="#">Акції</a>
							<a href="#">Дисконтна система</a>
							<a href="#">Адреса і контакти</a>
							<a href="#">Доставка і оплата</a>
						</nav>
					
						<nav class="h-nav pull-right fix border-fix">
							<a href="#">Перевірити замовлення</a>
							<a href="#">Особистий кабінет</a>
						
						</nav>
					
					</div>
				</div>
				<div class="row small-manu">
					<div class="h-panel">
					<nav class="h-nav h-nav-tabs clearfix clearfix-smal-menu fix-two-position" >
							<a  href="#">logo</a>
							
						</nav>
						<nav class="h-nav h-nav-tabs clearfix clearfix-smal-menu city-nav" >
						<p><small>city</small><br><a  href="#" id="city" class="city"><big>Lviv</big></a></p>
							<div class="wrapper-city-menu" id="wrapper-city-menu">
							
								<div class="city-menu"><span title="Close Modal" class="close" id="close" ><a href="#" >&times;</a></span><center><p>Виберіть своє місто</p></center><div class="city-div">
										<a href="#">city1</a>
										<a href="#">city2</a>
										<a href="#">city3</a>
										<a href="#">city4</a>
										<a href="#">city5</a>
										<a href="#">city6</a>
										<a href="#">city7</a>
										<a href="#">city8</a>
										<a href="#">city9</a>
										<a href="#">city10</a>
										<a href="#">city11</a>
										<a href="#">city13</a>
										<a href="#">city14</a>
										<a href="#">city15</a>
										<a href="#">city16</a>
									</div>
									<center><div><center>Введіть інше місто</p></center></div><input id="inputcity" type="text"></input><center></div>
								</div>
							
							
						
						</div>
						
						</nav>
						<nav   class="h-nav h-nav-center research select" id="wrapper-research">
							
							<form action="#" >
							<input  onchange="buttonresearch()" class="input-fix" id="research" type="text"  ><select id="select" class="select-fix">
									<option value>all</option>
									<option value>option2</option>
									<option value>option3</option>
									<option value>option4</option>
								</select></input>
							
								
							<button    id="research-button" class="fix-height research-button">research</button>
							</form>
							
							
						</nav>
						<nav class="h-nav pull-right fix-height fix-two-position">
								<a href="#"><i class="ic-weight"></i>порівняння</a>	
						</nav>
						<nav class="h-nav pull-right fix-height fix-two-position">
								<a href="#"><i class="ic-heart"></i>бажанне</a>	
						</nav>
						<nav class="h-nav pull-right fix-height fix-two-position">
								<a href="#"><i class="ic-basket"></i>корзина</a>	
						</nav>
				
					</div>
				</div>
		</div>
		
	
  </header>
    <main class="body"> 
		<div id="wrapper" >
				<div class="container"  >
				
					<div class="wrapper-catalog" id="catalog-menu" >
						<div class="text-catalog">
							<center>
								<p/>Каталог товарів<p>
							</center>
						</div>
						<div class="catalog-full" id="catalog-full">
						<div class="left-main-catalog" id="catalog">
						<p><a  href="#1-catalog">kategoria1</a></p>
						<p><a  href="#2-catalog">kategoria2</a></p>
						<p><a  href="#3-catalog">kategoria3</a></p>
						<p><a  href="#4-catalog">kategoria4</a></p>
						</div>
					
				<div id="cantainer-catalog" class="cantainer-catalog">
					<div class="categoria-menu" id="1-catalog">
						<p><a  href="#4">kategoria1.1</a></p>
						<p><a  href="#4">kategoria1.2</a></p>
						<p><a  href="#4">kategoria1.3</a></p>
						<p><a  href="#4">kategoria1.4</a></p>
						<p><a  href="#4">kategoria1.5</a></p>
						<p><a  href="#4">kategoria1.5</a></p>
					</div>
					<div class="categoria-menu" id="2-catalog">
						<p><a  href="#4">kategoria2.1</a></p>
						<p><a  href="#4">kategoria2.2</a></p>
						<p><a  href="#4">kategoria2.3</a></p>
						<p><a  href="#4">kategoria2.4</a></p>
						<p><a  href="#4">kategoria2.5</a></p>
						<p><a  href="#4">kategoria2.5</a></p>
					</div>
					<div class="categoria-menu" id="3-catalog">
						<p><a  href="#4">kategoria3.1</a></p>
						<p><a  href="#4">kategoria3.2</a></p>
						<p><a  href="#4">kategoria3.3</a></p>
						<p><a  href="#4">kategoria3.4</a></p>
						<p><a  href="#4">kategoria3.5</a></p>
						<p><a  href="#4">kategoria3.5</a></p>
					</div>
					<div class="categoria-menu" id="4-catalog">
						<p><a  href="#4">kategoria4.1</a></p>
						<p><a  href="#4">kategoria4.2</a></p>
						<p><a  href="#4">kategoria4.3</a></p>
						<p><a  href="#4">kategoria4.4</a></p>
						<p><a  href="#4">kategoria4.5</a></p>
						<p><a  href="#4">kategoria4.5</a></p>
					</div>
				</div>
				</div>
				</div>
				</div>
		</div>
   </main>
    <footer class="footer"> 
		<div id="wrapper">
			<div class="container">
			
			</div>
		</div>
   </footer>
   
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	<script src="js/researchbutton.js"></script>
	<script src="js/script.js"></script>
	<script>action()</script>
	