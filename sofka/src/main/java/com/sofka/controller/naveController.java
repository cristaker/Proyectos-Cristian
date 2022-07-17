package com.sofka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class naveController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/vehiculoslanzadera")
	public String vehiculosLanzadera() {
		return "vehiculoslanzadera";
	}
	
	@GetMapping("/navesnotripuladas")
	public String navesNoTripuladas() {
		return "navesnotripuladas";
	}
	
	@GetMapping("/navestripuladas")
	public String navesTripuladas() {
		return "navestripuladas";
	}
	
	@GetMapping("/crearnave")
	public String crearNave() {
		return "crearnave";
	}
	
	@GetMapping("/resultado")
	public String Resultado() {
		return "resultado";
	}
}
