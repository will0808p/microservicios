package com.sinensia.microservicio2.backend.model;

public class Precio {
	
	private double terceros;
	private double tercerosLunas;
	private double tercerosAsistencia;
	private double premium;
	
	
	public Precio() {
		
	}


	public Precio(double terceros, double tercerosLunas, double tercerosAsistencia, double premium) {
		
		this.terceros = terceros;
		this.tercerosLunas = tercerosLunas;
		this.tercerosAsistencia = tercerosAsistencia;
		this.premium = premium;
	}


	public double getTerceros() {
		return terceros;
	}


	public void setTerceros(double terceros) {
		this.terceros = terceros;
	}


	public double getTercerosLunas() {
		return tercerosLunas;
	}


	public void setTercerosLunas(double tercerosLunas) {
		this.tercerosLunas = tercerosLunas;
	}


	public double getTercerosAsistencia() {
		return tercerosAsistencia;
	}


	public void setTercerosAsistencia(double tercerosAsistencia) {
		this.tercerosAsistencia = tercerosAsistencia;
	}


	public double getPremium() {
		return premium;
	}


	public void setPremium(double premium) {
		this.premium = premium;
	}


	@Override
	public String toString() {
		return "Precio [terceros=" + terceros + ", tercerosLunas=" + tercerosLunas + ", tercerosAsistencia="
				+ tercerosAsistencia + ", premium=" + premium + "]";
	}
	
	
	
	
	

}
