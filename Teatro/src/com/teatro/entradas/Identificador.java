package com.teatro.entradas;

public abstract class Identificador {
	
	private static int id=0;
	
	public static int getId() {
		return id++;
	}

}
