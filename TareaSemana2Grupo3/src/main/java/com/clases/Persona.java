package com.clases;

public class Persona {
	
	Long identificador;
	String nombre;
	int edad;
	String direccion;
	int tel;
	
	
	public Persona(Long identificador, String nombre, int edad, String direccion, int tel) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.tel = tel;
		
		
	}
	
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	@Override
	public String toString() {
		return "Persona [identificador=" + identificador + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", tel=" + tel + "]";
	}
	
	

}
