package com.sinensia.microservicio2.backend.services;

import java.util.Date;

import com.sinensia.microservicio2.backend.model.Contrato;
import com.sinensia.microservicio2.backend.model.Precio;
import com.sinensia.microservicio2.backend.model.Sexo;

public interface ContratoService {

	public void crearContrato(Contrato contrato);
	
	public Precio getPrecios(String marca, String modelo, Date fechaMatricula, String color, Date fechaNacimiento, Sexo sexo, String profesion);
}
