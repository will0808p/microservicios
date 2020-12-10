package com.sinensia.microservicio2.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.microservicio2.backend.model.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, String>{
	
	

}
