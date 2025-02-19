package Ej1;

import java.util.Scanner;

import TdaCola.TdaCola;

public class prueba1 {
	TdaCola colaAuto = new TdaCola<>();
	TdaCola colaAux = new TdaCola<>();
	TdaCola colaEspera = new TdaCola<>();
	boolean estado = true;
	Scanner leerDato =new Scanner(System.in);
	public void añadirAuto() {
		while(estado) {
			if(colaAuto.tamanio()!=10) {
				System.out.println("Ingrese la matricula del auto");
				int matricula = leerDato.nextInt();
				colaAuto.encolar(matricula);
			}else {
				System.out.println("La via esta llena, se mueve el carro a la cola de espera");
				System.out.println("Ingrese la matricula del auto");
				int matricula = leerDato.nextInt();
				colaEspera.encolar(matricula);
			}
			System.out.println("Quiere continuar metiendo autos?");
			System.out.print("Si:1, No:2 --> ");
			int r = leerDato.nextInt();
			if(r == 1) {
				estado= true;
			}else {
				estado=false;
			}
		}
		
		/*if(colaAuto.tamanio()!=10) {
			while(estado) {
				System.out.println("Ingrese la matricula del auto");
				int matricula = leerDato.nextInt();
				colaAuto.encolar(matricula);
				System.out.println("Quiere continuar?");
				System.out.print("Si:1, No:2 --> ");
				int r = leerDato.nextInt();
				if(r == 1) {
					estado= true;
				}else {
					estado=false;
				}
			}
		}else {
			System.out.println("La via esta llena, se mueve el carro a la cola de espera");
			System.out.println("Ingrese la matricula del auto");
			int matricula = leerDato.nextInt();
			colaEspera.encolar(matricula);
		}*/
		/*while(estado) {
			System.out.println("Ingrese la matricula del auto");
			int matricula = leerDato.nextInt();
			colaAuto.encolar(matricula);
			System.out.println("Quiere continuar?");
			System.out.print("Si:1, No:2 --> ");
			int r = leerDato.nextInt();
			if(r == 1) {
				estado= true;
			}else {
				estado=false;
			}
		}*/
	}
	
	public void sacarAuto() {
		estado=true;
		while(estado) {
			if (colaAuto.tamanio()>0) {
				System.out.println("Ingrese la matricula del auto que desea sacar");
				int matricula = leerDato.nextInt();
				int sacado = 0;
				for (int i = colaAuto.tamanio(); i > 0; i++) {
					if(colaAuto.tamanio() == 0 ) {
						break;
					}
					int car1 = (int)colaAuto.tope();
					if(car1 != matricula) {
						colaAux.encolar(colaAuto.decolar());
					}else {
						sacado = (int)colaAuto.decolar();
						break;
					}
				}
				System.out.println("\nEl auto de matricula " + sacado + " se ha movido " + (colaAux.tamanio()+1) + " veces en la via");
				System.out.println("Fueron movidos " + colaAux.tamanio() + " autos para sacar el auto requerido");
				rellenar();
				moverEspera();
				System.out.println("Quiere continuar sacando autos?");
				System.out.print("Si:1, No:2 --> ");
				int r = leerDato.nextInt();
				if(r == 1) {
					estado= true;
				}else {
					estado=false;
				}
			}else {
				System.out.println("La via esta vacia");
			}
			/*System.out.println("Ingrese la matricula del auto que desea sacar");
			int matricula = leerDato.nextInt();
			int sacado = 0;
			for (int i = colaAuto.tamanio(); i > 0; i++) {
				if(colaAuto.tamanio() == 0 ) {
					break;
				}
				int car1 = (int)colaAuto.tope();
				if(car1 != matricula) {
					colaAux.encolar(colaAuto.decolar());
				}else {
					sacado = (int)colaAuto.decolar();
					break;
				}
			}
			System.out.println("\nEl auto de matricula " + sacado + " se ha movido " + (colaAux.tamanio()+1) + " veces en la via");
			System.out.println("Fueron movidos " + colaAux.tamanio() + " autos para sacar el auto requerido");
			rellenar();
			moverEspera();
			System.out.println("Quiere continuar sacando autos?");
			System.out.print("Si:1, No:2 --> ");
			int r = leerDato.nextInt();
			if(r == 1) {
				estado= true;
			}else {
				estado=false;
			}*/
		}
		/*System.out.println("Ingrese la matricula del auto que desea sacar");
		int matricula = leerDato.nextInt();
		int sacado = 0;
		for (int i = colaAuto.tamanio(); i > 0; i++) {
			if(colaAuto.tamanio() == 0 ) {
				break;
			}
			int car1 = (int)colaAuto.tope();
			if(car1 != matricula) {
				colaAux.encolar(colaAuto.decolar());
			}else {
				//colaAux.encolar(colaAuto.decolar());
				sacado = (int)colaAuto.decolar();
				//colaAux.encolar(colaAuto.decolar());
				//rellenar();
				break;
			}
		}
		System.out.println("\nEl auto de matricula " + sacado + " se ha movido " + (colaAux.tamanio()+1) + " veces en la via");
		System.out.println("Fueron movidos " + colaAux.tamanio() + " autos para sacar el auto requerido");
		rellenar();
		moverEspera();
		System.out.println("Quiere continuar?");
		System.out.print("Si:1, No:2 --> ");
		int r = leerDato.nextInt();
		if(r == 1) {
			estado= true;
		}else {
			estado=false;
		}*/
	}
	
	public void rellenar() {
		for (int i = colaAux.tamanio(); i > 0; i--) {
			colaAuto.encolar(colaAux.tope());
			colaAux.decolar();
		}
		/*for (int i = aux.tamanio(); i > 0; i--) {
			autos.apilar(aux.tope());
			aux.desapilar();
		}*/
	}
	
	public void moverEspera() {
		//for (int i = colaEspera.tamanio(); i > 0; i--) {
		if (colaEspera.tamanio()>0) {
			colaAuto.encolar(colaEspera.tope());
			colaEspera.decolar();
		}
		//}
	}
	
	public void imprimir() {
		for (int i = colaAuto.tamanio(); i > 0 ; i--) {
			System.out.println(colaAuto.tope());
			colaAuto.decolar();
		}
	}
	
	public void imprimirAux() {
		for (int i = colaAux.tamanio(); i > 0 ; i--) {
			System.out.println(colaAux.tope());
			colaAux.decolar();
		}
	}
	
	public void run() {
		int op=0;
		boolean salir = false;
		System.out.println("Bienvenido a la via de parqueo");
		System.out.println("----------------------------------------------");
		while(!salir) {
			System.out.println("1. Ingresar auto");
			System.out.println("2. Sacar auto");
			System.out.println("3. Mostrar via");
			System.out.println("4. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					añadirAuto();
					break;
				case 2:
					sacarAuto();
					break;
				case 3:
					imprimir();
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 4");
					break;
			}
			System.out.println("----------------------------------------------");
			System.out.println(" ");
		}
		//añadirAuto();
		//sacarAuto();
		//rellenar();
		//imprimir();
		//System.out.println();
		//imprimirAux();
	}
	

}
