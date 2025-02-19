package personajes;

import java.util.HashMap;
import java.util.Scanner;

import personajes.abstracts.AbstractFactory;
import personajes.concretes.grupos.G1;
import personajes.concretes.grupos.G2;
import personajes.concretes.grupos.G3;

public class Launcher {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Nombre Personaje");
		String nombreP=sc.nextLine();
		System.out.println("Nombre Familia");
		String i=sc.nextLine();
		AbstractFactory g=Utils.getG().get(i);
		if(g!=null) {
			g.crearPersonaje(nombreP);
		}
		
		
		//CopiadorArchivos.getInstance().copia("Imagenes.zip", "copia.zip");
	
		
		
		
	}
}
