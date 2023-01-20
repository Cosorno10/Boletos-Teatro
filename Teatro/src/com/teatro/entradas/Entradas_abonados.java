package com.teatro.entradas;
public class Entradas_abonados extends Entradas {

	
	
	public Entradas_abonados(int identificador, String zona, String cliente) {
		super(identificador, zona, cliente);
		// TODO Auto-generated constructor stub
	}

	
		public double calcularPrecio() {
			switch (this.getZona()) {
			case "principal":
				return PreciosAbonados.principal;
			case "palco":	
				return PreciosAbonados.palco;
			case "central":
				return PreciosAbonados.central;
			case "lateral":
				return PreciosAbonados.lateral;
			default:
				return 0;
		}	
		
	}

}
