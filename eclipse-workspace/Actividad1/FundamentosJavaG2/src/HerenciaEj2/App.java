package HerenciaEj2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato =new Scanner(System.in);
		
		System.out.println("Buen dia");
		System.out.println("Digite el numero de lavadoras");
		int n =leerDato.nextInt();
		System.out.println("Digite el numero de televisores");
		int x =leerDato.nextInt();
		
		Lavadora[] lavadoras =new Lavadora[n];
		for(int i=0; i<n; i++) {
			System.out.println("Lavadora N° " + i);
			System.out.println("Digite la marca de la lavadora");
			String marca =leerDato.next();
			System.out.println("Digite el modelo de la lavadora");
			String modelo =leerDato.next();
			System.out.println("Digite el precio base");
			long precioBase =leerDato.nextLong();
			System.out.println("Digite la carga");
			int carga =leerDato.nextInt();
			System.out.println("---------------------");
			
			Lavadora lavadora =new Lavadora(marca,modelo,precioBase,carga);
			
			for(int g=0;g<lavadoras.length;g++) {
				if(lavadoras[g]==null) {
					lavadoras[g] = lavadora;
				}
			}
			
		}
		
		Televisor[] televisores =new Televisor[x];
		for(int i=0; i<x; i++) {
			System.out.println("Televisor N° " + i);
			System.out.println();System.out.println("Digite la marca del televisor");
			String marca =leerDato.next();
			System.out.println("Digite el modelo del televisor");
			String modelo =leerDato.next();
			System.out.println("Digite el precio base");
			long precioBase =leerDato.nextLong();
			System.out.println("¿Hay sintonizador?");
			String sintonizador =leerDato.next();
			System.out.println("---------------------");
			
			Televisor televisor =new Televisor(marca,modelo,precioBase,sintonizador);
			
			for(int g=0;g<televisores.length;g++) {
				if(televisores[g]==null) {
					televisores[g] = televisor;
				}
			}
		}
		
		for(Lavadora lasLavadoras : lavadoras) {
			System.out.println(lasLavadoras);
		}
		
		for(Televisor losTelevisores : televisores) {
			System.out.println(losTelevisores);
		}


	}

}
