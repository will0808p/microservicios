package com.sinensia.microservicio2.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CONTRATOS" )
public class Contrato implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Date fechaNacimiento;
	private Date fechaCarnet;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	private String profesion;
	private String marcaVehiculo;
	private String modeloVehiculo;
	
	@Id
	private String matriculaVehiculo;
	
	private Date fechaMatriculacionVehiculo;
	private String colorVehiculo;
	private String cuentaBancaria;
	
	@Enumerated(EnumType.STRING)
	private TipoContrato productoContratado;
	
	private Integer kilometraje;
	
	
	
	public Contrato() {
		
	}



	public Contrato(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento,
			Date fechaCarnet, Sexo sexo, String profesion, String marcaVehiculo, String modeloVehiculo,
			String matriculaVehiculo, Date fechaMatriculacionVehiculo, String colorVehiculo, String cuentaBancaria,
			TipoContrato productoContratado, Integer kilometraje) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCarnet = fechaCarnet;
		this.sexo = sexo;
		this.profesion = profesion;
		this.marcaVehiculo = marcaVehiculo;
		this.modeloVehiculo = modeloVehiculo;
		this.matriculaVehiculo = matriculaVehiculo;
		this.fechaMatriculacionVehiculo = fechaMatriculacionVehiculo;
		this.colorVehiculo = colorVehiculo;
		this.cuentaBancaria = cuentaBancaria;
		this.productoContratado = productoContratado;
		this.kilometraje = kilometraje;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido1() {
		return apellido1;
	}



	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}



	public String getApellido2() {
		return apellido2;
	}



	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}



	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public Date getFechaCarnet() {
		return fechaCarnet;
	}



	public void setFechaCarnet(Date fechaCarnet) {
		this.fechaCarnet = fechaCarnet;
	}



	public Sexo getSexo() {
		return sexo;
	}



	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}



	public String getProfesion() {
		return profesion;
	}



	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}



	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}



	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}



	public String getModeloVehiculo() {
		return modeloVehiculo;
	}



	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}



	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}



	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}



	public Date getFechaMatriculacionVehiculo() {
		return fechaMatriculacionVehiculo;
	}



	public void setFechaMatriculacionVehiculo(Date fechaMatriculacionVehiculo) {
		this.fechaMatriculacionVehiculo = fechaMatriculacionVehiculo;
	}



	public String getColorVehiculo() {
		return colorVehiculo;
	}



	public void setColorVehiculo(String colorVehiculo) {
		this.colorVehiculo = colorVehiculo;
	}



	public String getCuentaBancaria() {
		return cuentaBancaria;
	}



	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}



	public TipoContrato getProductoContratado() {
		return productoContratado;
	}



	public void setProductoContratado(TipoContrato productoContratado) {
		this.productoContratado = productoContratado;
	}



	public Integer getKilometraje() {
		return kilometraje;
	}



	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Contrato [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", fechaNacimiento=" + fechaNacimiento + ", fechaCarnet=" + fechaCarnet + ", sexo=" + sexo
				+ ", profesion=" + profesion + ", marcaVehiculo=" + marcaVehiculo + ", modeloVehiculo=" + modeloVehiculo
				+ ", matriculaVehiculo=" + matriculaVehiculo + ", fechaMatriculacionVehiculo="
				+ fechaMatriculacionVehiculo + ", colorVehiculo=" + colorVehiculo + ", cuentaBancaria=" + cuentaBancaria
				+ ", productoContratado=" + productoContratado + ", kilometraje=" + kilometraje + "]";
	}
	
	
	
	
	
	
	
	

	
	

}
