package com.teatro.entradas;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
	static Scanner sc=new Scanner(System.in);
	
	static ArrayList<Entradas> entradas = new ArrayList<Entradas>();
	
	static int principal=200;
	static int palco = 40;
	static int central = 400;
	static int lateral = 100;
	
	public static void main(String[]args) {
		while (true) {
			System.out.println("seleccione opcion");
			System.out.println("1-Vende entrada");
			System.out.println("2-Consulta entrada");
			System.out.println("3-Informe zona");
			
			switch (sc.nextInt()) {
			case 1:
				Entradas e = vendeEntrada();
				if (e != null) {
					entradas.add(e);
				}
				break;
			case 2:
				consultarEntrada();
				break;
			case 3:
				informezona();
				break;
			default:
				break;
			}
		}		
	}//main
	
	public static void informezona() {
		System.out.println("Introduce la zona que desea");
		sc.nextLine();
		String zona=sc.nextLine();
		
		if (zona.equals("principal") || zona.equals("palco") || zona.equals("central") || zona.equals("lateral")) {	
			int vendidas = 0;
			double recaudacion = 0;
			
			for(int i=0;i<entradas.size();i++) {
				if (entradas.get(i).getZona().equals(zona)) {					//controlla dove hai biglietes vendidos nella zona interesata e ti soma el prezzo di cada
					vendidas++;													//una(solo le entrate con la zona inserita)
					recaudacion = recaudacion + entradas.get(i).getPrecio();
				}
			}
			
			System.out.println("Entradas vendidas: "+vendidas+"\nRecaudacion: "+recaudacion);
		}
		else {
			System.out.println("Zona incorrecta.");
		}
	}
	
	
	public static void consultarEntrada() {
		System.out.println("Introduce identificador");
		int id = sc.nextInt();
		
		for(int i=0;i<entradas.size();i++) {
			if(entradas.get(i).getId() == id)
			{
				System.out.println("Nombre: " + entradas.get(i).getCliente());
				System.out.println("Precio: " + entradas.get(i).getPrecio());
				System.out.println("Zona: " + entradas.get(i).getZona());
			}
		}
		
	}

	public static Entradas vendeEntrada() {
		int id = Identificador.getId();				//inserzione di los datos del biglieto
		System.out.println("Inserte zona, nombre y tipo de entrada");
		sc.nextLine();
		String zona=sc.nextLine();
		String nombre=sc.nextLine();
		String tipo= sc.nextLine();
		
		switch(zona) {					//contador de entradas disponibles por zonas
		case "principal":
			principal--;
			break;
		case "palco":
			palco--;
			break;
		case "central":
			central--;
			break;
		case "lateral":
			lateral--;
			break;
		default:
			System.out.println("Zona de entrada incorrecta.");
			break;
		}
		
		if (principal < 0 || palco < 0 || central < 0 || lateral < 0) {
			System.out.println("Entradas agotadas.");
			System.exit(0);
		}
		
		switch (tipo) {						//creazion de entradas con los datos inseridos dal vendedor
		case "normal":
			return new Entrada_normal(id, zona, nombre);
		case "abonado":
			return new Entradas_abonados(id, zona, nombre);
		case "reducida":
			return new Entrada_reducida(id, zona, nombre);
		default:
			System.out.println("Tipo de entrada incorrecto.");
			return null;
		}
	}
	
}//fin
