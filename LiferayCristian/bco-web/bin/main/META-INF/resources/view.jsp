<%@ include file="init.jsp" %>
<%@ include file="css/view.css" %>
<link rel="stylesheet" href="./css/view.scss" type="text/css">

<p>
	<b><liferay-ui:message key="bcoweb.caption"/></b>
</p>


    
    <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">
<title>Document</title>
<body>
	<hr>
	<div class="container">
		<div class="bg-white display-5 ">
			<div class="col-lg-1">
				<img src="https://i.ibb.co/Hn46n7D/Logo.png"
					class="float-left img-fluid p-2">
			</div>
		</div>
		<div class="text-right p-3">
			<a href="#" class="btn btn-white text-dark">inicio</a>
			<a href="#" class="btn btn-white text-dark lead">Informacion general para clientes</a>
			<a href="#"	class="btn btn-light text-dark lead">Cerrar Sesion</a>
		</div>

	</div>

	<hr>
	
	
   	
	    
	 
	    

	 
	   
   

	<h3 class="display-3 font-weight-bold text-primary">Mis Productos</h3>
	<div class="container card mt-2 p-4 border">
		<div class="container">
			<div class="card-deck mt-3">
				<div class="card text-center border">
					<div class="card-body">
						<img src="https://i.ibb.co/H4vKnqk/Icono.png"
							class="col-lg-4 float-left">
						<div class="dropdown">
							<button class="btn btn-lg btn-white float-right" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<i class="fas fa-ellipsis-v"></i>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="#">Deshabilitar</a>
							</div>
						</div>
						
						
						<p class="card-text mt-6 font-weight-bold text-left">1111111111111</p>
						<p class="card-text font-weight-bold text-left">aaaaaaaaaaaaaa</p>
						<p class="card-text font-weight-bold text-left text-primary display-4"></p>
					
					
					</div>
				</div>

				<div class="card text-center border">
					<div class="card-body">
						<img src="https://i.ibb.co/H4vKnqk/Icono.png"
							class="col-lg-4 float-left">
						<div class="dropdown">
							<button class="btn btn-lg btn-white float-right" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<i class="fas fa-ellipsis-v"></i>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="#">Deshabilitar</a>
							</div>
						</div>
						<p class="card-text mt-6 font-weight-bold text-left">9854328472</p>
						<p class="card-text font-weight-bold text-left">AHORROS</p>
						<p
							class="card-text font-weight-bold text-left text-primary display-4">$
							3.000.000</p>
					</div>
				</div>

				<div class="card text-center border">
					<div class="card-body">
						<img src="https://i.ibb.co/H4vKnqk/Icono.png"
							class="col-lg-4 float-left">
						<div class="dropdown">
							<button class="btn btn-lg btn-white float-right" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<i class="fas fa-ellipsis-v"></i>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="#">Deshabilitar</a>
							</div>
						</div>
						<p class="card-text mt-6 font-weight-bold text-left">9854328472</p>
						<p class="card-text font-weight-bold text-left">AHORROS</p>
						<p
							class="card-text font-weight-bold text-left text-primary display-4">$
							3.000.000</p>
					</div>
				</div>

			</div>
		</div>
	</div>
	<hr>
<table>
<% JSONArray responseService = (JSONArray) request.getAttribute("JsonResponse");%>
  						<% for (int i = 0; i < responseService.length(); i++) { 
  						JSONObject object = responseService.getJSONObject(1); %>
  						<tr><td><%= object.getString("accountNumber") %></td></tr>
  						<tr><td><%= object.getString("accountType") %></td></tr>
  						<tr><td><%= object.getString("currentAmount") %></td></tr>
  						<% } %>
  						
  </table>

</body>
</html>
    
