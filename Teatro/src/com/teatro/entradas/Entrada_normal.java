package com.teatro.entradas;


public class Entrada_normal extends Entradas {


	public Entrada_normal(int identificador, String zona, String cliente) {
		super(identificador, zona, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub	
		switch (this.getZona()) {
		case "principal":
			return PreciosNormal.principal;
		case "palco":	
			return PreciosNormal.palco;
		case "central":
			return PreciosNormal.central;
		case "lateral":
			return PreciosNormal.lateral;
		default:
			return 0;
		}
		
		
	}


	
	
	

}
