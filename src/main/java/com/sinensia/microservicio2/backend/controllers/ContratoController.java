package com.sinensia.microservicio2.backend.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.microservicio2.backend.model.Contrato;
import com.sinensia.microservicio2.backend.model.Precio;
import com.sinensia.microservicio2.backend.model.Sexo;
import com.sinensia.microservicio2.backend.services.ContratoService;

@RestController
@CrossOrigin
public class ContratoController {
	
	@Autowired
	private ContratoService contratoServicio;
	

	@GetMapping("/precios")
	public Precio getPrecios(@RequestParam String marca,
			 				 @RequestParam String modelo, 
			 				 @RequestParam Date fechaMatricula, 
			 				 @RequestParam String color, 
			 				 @RequestParam Date fechaNacimiento, 
			 				 @RequestParam Sexo sexo, 
			 				 @RequestParam String profesion) {
		//Precio  precio = contratoServicio.getPrecios("", "", null, "", null, null, "");
		Precio  precio = contratoServicio.getPrecios(marca, modelo, fechaMatricula, color, fechaNacimiento, sexo, profesion);
		
		return precio; //new Precio(200, 300, 500, 450);
		
	}
	
	@PostMapping("/contrato")
	public void create(@RequestBody Contrato contrato) {
		
		contratoServicio.crearContrato(contrato);
		
	}
}
