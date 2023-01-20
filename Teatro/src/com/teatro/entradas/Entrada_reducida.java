package com.teatro.entradas;

public class Entrada_reducida extends Entradas {

	public Entrada_reducida(int identificador, String zona, String cliente) {
		super(identificador, zona, cliente);
		
	}

	@Override
	public double calcularPrecio() {
		switch (this.getZona()) {
		case "principal":
			return PreciosNormal.principal-PreciosNormal.principal*0.15;
		case "palco":	
			return PreciosNormal.palco-PreciosNormal.palco*0.15;
		case "central":
			return PreciosNormal.central-PreciosNormal.central*0.15;
		case "lateral":
			return PreciosNormal.lateral-PreciosNormal.lateral*0.15;
		default:
			return 0;
		
		}
	
	}	
	
}	
	


