package Prioridad;

import java.util.Scanner;

public class AppImpresora {
	static Scanner leerDato =new Scanner(System.in);
	public static void main(String[] args) {
		Impresora imprime = new Impresora();
		int prioridad;
		for (int i = 0; i < 10; i++) {
			System.out.println("Numero de hojas");
			int nh = leerDato.nextInt();
			if(nh<=5) {
				prioridad=3;
			}else if(nh>5 && nh<=10) {
				prioridad=2;
			}else {
				prioridad=1;
			}
			imprime.encolar(new Documento(nh,prioridad));
		}
		imprime.imprimir();
	}

}
