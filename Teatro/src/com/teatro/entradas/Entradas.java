package com.teatro.entradas;


public abstract class Entradas  {
	
	private int identificador;
	private String zona;
	private String cliente;
	private double precio;
	
	
	public Entradas(int identificador, String zona, String cliente) {
		this.identificador=identificador;
		this.zona=zona;
		this.cliente=cliente;
		this.precio = calcularPrecio();
	}
	public int getId() {
		return identificador;
	}
	public String getZona() {
		return zona;
	}
	//get de precios
	
	public abstract double calcularPrecio();
	
	public double getPrecio() {
		return precio;
	}
	
	
	public String getCliente() {
		return cliente;
	}
	
	
	
	
	

}//fine
