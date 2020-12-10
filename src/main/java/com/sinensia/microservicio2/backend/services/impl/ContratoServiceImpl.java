package com.sinensia.microservicio2.backend.services.impl;

import java.net.URI;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sinensia.microservicio2.backend.model.Contrato;
import com.sinensia.microservicio2.backend.model.Precio;
import com.sinensia.microservicio2.backend.model.Sexo;
import com.sinensia.microservicio2.backend.repositories.ContratoRepository;
import com.sinensia.microservicio2.backend.services.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService{

	@Autowired
	private ContratoRepository contratoRepository;
	
	
	private RestTemplate restTemplate;
	
	@Autowired
	public ContratoServiceImpl(RestTemplateBuilder builder) {
		restTemplate = builder.build();
	}
	
	
	@Override
	public void crearContrato(Contrato contrato) {
		
		contratoRepository.save(contrato);
		
	}

	@Override
	public Precio getPrecios(String marca, String modelo, Date fechaMatricula, String color, Date fechaNacimiento, Sexo sexo, String profesion) {
		
		URI targetUrl = UriComponentsBuilder.fromUriString("http://10.250.0.9:8080").path("/precios")
				.queryParam("marca", marca)
				.queryParam("modelo", modelo)
				.queryParam("fechaMatricula", fechaMatricula)
				.queryParam("color", color)
				.queryParam("fechaNacimiento", fechaNacimiento)
				.queryParam("sexo", sexo)
				.queryParam("profesion", profesion)

				.build().encode().toUri();
		
		Precio precio = restTemplate.getForObject(targetUrl, Precio.class);
		
		System.out.println("resultado: " + precio);
		return precio;
	}
	
	
	

}
