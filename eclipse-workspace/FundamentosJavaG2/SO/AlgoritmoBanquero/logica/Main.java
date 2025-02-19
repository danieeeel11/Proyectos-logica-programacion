package logica;

import java.util.Scanner;

import tablas.Tablas;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("¿Cuántos recursos hay?");
		int recursos = sc.nextInt();
		System.out.println("¿Cuántos procesos hay?");
		int procesos = sc.nextInt();
		
		Tablas t = new Tablas(procesos, recursos);
		t.inicial();
		t.accion();
	}
}
