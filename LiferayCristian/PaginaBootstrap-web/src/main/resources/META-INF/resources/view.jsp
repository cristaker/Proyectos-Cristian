<%@ include file="/init.jsp" %>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">

<body>
	
	<!-- Header -->
	<div class="container">
		<div class="row">
			<div class="header-logo col-12 text-center">
				<img src="https://i.ibb.co/YbfhM2Q/starwarslogo.jpg" alt="starwarslogo">
			</div>
			<div class="col-2 overlay d-flex flex-row">
						<div>
							<a class="fa-fb text-white d-inline ml-1 mt-1" href="#"><i class="fab fa-facebook-square"></i></a>
						</div>
						<div>
							<a class="fa-in text-white d-inline ml-1 mt-1" href="#"><i class="fab fa-instagram"></i></a>
						</div>
						<div>
							<a class="fa-tw d-inline text-white ml-1 mt-1" href="#"><i class="fab fa-twitter-square"></i></a>
						</div>
						<div>
							<a class="fa-lk d-inline text-white ml-1 mt-1" href="#"><i class="fab fa-linkedin"></i></a>
						</div>
			</div>
			<div class="col-11 overlay d-flex flex-row-reverse">
				<div>
					<a class="btn btn-outline-light text-white mt-1" type="button" href="#" data-bs-toggle="modal" data-bs-target="#modal-login">SIGN IN<i class="fad fa-starfighter"></i></a>
				</div>
			</div>
			<div class="header-logo col-12">
				<nav class="header-logo navbar navbar-expand-lg navbar-white">
			  		<a class="navbar-brand">
			  			<img class="logo-navbar" src="https://i.ibb.co/4Twkvr4/logo2.jpg" alt="logo2">
			  		</a>
			  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
			    		<span class="navbar-toggler-icon"></span>
			  		</button>
			
			  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
			    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			      <li class="nav-item active">
			        <a class="nav-link text-white" href="#">CARACTERISTICAS</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">VIDEOS</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">PELICULAS</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">SERIES</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">INTERACTIVO</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">COMUNIDAD</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">SOCIOS</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link text-white" href="#">DISNEY+</a>
			      </li>
			    </ul>
			    <form class="form-inline my-2 my-lg-0">
			      <input class="form-control mr-sm-2" type="search">
			      <button class="btn btn-outline-light text-white my-2 my-sm-0" type="submit">Search</button>
			    </form>
			  </div>
			</nav>
			</div>
		</div>
	</div>	
	<!-- Header -->
	
	<!-- Carrusel -->
	<section>
		<div id="carouselExampleControls" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-pause="false">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="<%=request.getContextPath() %>images/starwars1.jpg" alt="starwars1">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath() %>/starwars9.jpg" alt="starwars9">
				</div>
				<div class="carousel-item">
					<img src="<%=request.getContextPath() %>/starwars8.jpg" alt="starwars8">
				</div>
			</div>
		</div>
	</section>
	<!-- Carrusel -->
	
	<!-- Tarjetas -->
		
		<section>
			<div class="container">
				<div class="row">
					<div class="col-12 header-logo text-center">
						<h1 class="display-4 text-white text-uppercase">
							Destacados De La Semana
						</h1>
					</div>
					<div class="col-md-12 card-group mt-1">
					  <div class="card mr-2">
					    <img class="image-card-1" src="https://i.ibb.co/TRxzM8d/starwarscard1.jpg" alt="starwarscard1">
					    <div class="card-body">
					      <a href="#" class="card-title"">The New Beginning</a>
					    </div>
					  </div>
					  <div class="card mr-2">
					    <img class="image-card-2" src="https://i.ibb.co/1TrkMQX/starwarscard2.jpg" alt="starwarscard2">
					    <div class="card-body">
					      <a href="#" class="card-title" >The Young Force</a>
					    </div>
					  </div>
					  <div class="card">
					    <img class="image-card-3" src="https://i.ibb.co/SNhVRBH/starwars2.jpg" alt="starwars2">
					    <div class="card-body">
					      <a href="#" class="card-title">The StormTroopers</a>					      
					    </div>
					  </div>
					</div>
				</div>
			</div>					
		</section>
	
	<!-- Tarjetas -->
	
	<!-- Formulario -->
	
		<section>
			<div class="container mt-4">
				<div class="row">
					<div class="col-12 text-center mb-4">
						<h1 class="text-uppercase display-4">
							Si quieres que la fuerza te acompañe, dejanos tus datos.
						</h1>
					</div>
				</div>
				<div class="row header-logo p-3">
					<div class="col-8">
						<form>
						  <div class="form-group">
						    <label class="text-white">Nombre</label>
						    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
						    
						  </div>
						  <div class="form-group">
						    <label class="text-white">Apellido</label>
						    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
						    
						  </div>
						  <div class="form-group">
						    <label class="text-white">Email</label>
						    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
						  </div>
						  <div class="form-check">
						  </div>
						  <button type="submit" class="btn btn-outline-light btn-block">Enviar</button>
						</form>
					</div>
						<div class="col-4">
							<img class="image-force" src="https://i.ibb.co/WtZWWWs/starwars-11.jpg" alt="starwars-11">
						</div>
				</div>
			</div>
		</section>
	
	<!-- Formulario -->
	
	<!-- videos -->
	
		<section>
			<div class="container">
				<div class="row mt-4">
					<div class="col-12 text-center">
						<h1 class="text-uppercase display-4">
							Recomendados de la semana
						</h1>
					</div>
				</div>
				<div class="row bg-warning mt-4 p-1">
					<div class="col-12 mt-2">
						<iframe class="mr-4 ml-2" width="560" height="315" src="https://www.youtube.com/embed/X9xJaQK5BjQ" title="YouTube video player" frameborder="100" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
						<iframe width="560" height="315" src="https://www.youtube.com/embed/i_NKBLRacME" title="YouTube video player" frameborder="100" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
						<iframe class="mr-4 ml-2" width="560" height="315" src="https://www.youtube.com/embed/qE3PcSe7GX0" title="YouTube video player" frameborder="100" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
						<iframe width="560" height="315" src="https://www.youtube.com/embed/twKD5A2IUEA" title="YouTube video player" frameborder="100" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
						<nav aria-label="Page navigation example">
					  <ul class="pagination d-flex justify-content-end">
					    <li class="page-item"><a class="page-link text-white" href="#">Previous</a></li>
					    <li class="page-item"><a class="page-link text-white" href="#">1</a></li>
					    <li class="page-item"><a class="page-link text-white" href="#">2</a></li>
					    <li class="page-item"><a class="page-link text-white" href="#">3</a></li>
					    <li class="page-item"><a class="page-link text-white" href="#">Next</a></li>
					  </ul>
					</nav>
					</div>
				</div>
			</div>
		</section>
	
	<!-- videos -->
	
	<!-- Footer -->
	
	<section>
		<div class="container header-logo ">
			<div class="row footer-sw mt-4">
				<div class="col-12 mt-4">
					<h4 class="text-center text-white">
						Mas de Star Wars!
					</h4>
					<div class="d-flex justify-content-center mt-3">
						<div>
							<a class="fa-fb text-white d-inline ml-1 mt-1" href="#"><i class="fab fa-facebook-square"></i></a>
						</div>
						<div>
							<a class="fa-in text-white d-inline ml-1 mt-1" href="#"><i class="fab fa-instagram"></i></a>
						</div>
						<div>
							<a class="fa-tw d-inline text-white ml-1 mt-1" href="#"><i class="fab fa-twitter-square"></i></a>
						</div>
						<div>
							<a class="fa-lk d-inline text-white ml-1 mt-1" href="#"><i class="fab fa-linkedin"></i></a>
						</div>
					</div>
					<h5 class="text-center text-white mt-4">
						TM & © Lucasfilm Ltd. All Rights Reserved
					</h5>
					<div class="tamaño-fuente d-flex justify-content-center mt-2 p-4">
						<a class="text-white mr-2" href="#">
							Terminos De Uso
						</a>
						<a class="text-white mr-2" href="#">
							Contenido Adicional
						</a>
						<a class="text-white mr-2" href="#">
							Politica De Privacidad
						</a>
						<a class="text-white mr-2" href="#">
							Star Wars En Disney
						</a>
						<a class="text-white" href="#">
							Anuncios De Interes
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<!-- Footer -->
	
	<!-- Modal -->
	
		<section>
			<div class="modal" id="modal-login" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title"><i class="fa-duotone fa-user-bounty-hunter"></i>LOGIN</h5>
		      </div>
		      <div class="modal-body">
		        <form>
				  <div class="form-group">
				    <label for="exampleInputEmail1">Email</label>
				    <input type="email" class="form-control">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1">Password</label>
				    <input type="password" class="form-control">
				  </div>
				</form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-primary">LOGIN</button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">CANCEL</button>
		      </div>
		    </div>
		  </div>
		</div>
	</section>
	
<!-- Modal -->
	
	
	
	

	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
</body>