package ActividadRComposicion;

import java.util.Scanner;

public class AppParcial {
	public static Scanner leerDato =new Scanner(System.in);

	public static void main(String[] args) {
		int nParciales=2;
		Parcial parcial1= null;
		Parcial parcial2= null;
		
		System.out.println("Datos parciales");
		do {
			System.out.println(" ");
			System.out.println("Asignatura ");
			String nombreAsig =leerDato.nextLine();
			System.out.println("Docente ");
			String docente =leerDato.nextLine();
			System.out.println("Fecha ");
			System.out.print("*Año ");
			int año =leerDato.nextInt();
			System.out.print(" mes ");
			String mes =leerDato.next();
			System.out.print(" dia ");
			int dia =leerDato.nextInt();
			System.out.println("Hora parcial ");
			System.out.print("*Hora ");
			int hora =leerDato.nextInt();
			System.out.println(" minutos ");
			int minutos =leerDato.nextInt();
			
			if(nParciales==2) {
				parcial1 =new Parcial(nombreAsig,docente);
				parcial1.crearFecha(año, mes, dia);
				parcial1.crearHora(hora, minutos);
			}
			if(nParciales==1) {
				parcial2 =new Parcial(nombreAsig,docente);
				parcial2.crearFecha(año, mes, dia);
				parcial2.crearHora(hora, minutos);
			}
			nParciales--;
		}while(nParciales>0);
		
		System.out.println("Datos de los parciales");
		mostrarDatos(parcial1);
		mostrarDatos(parcial2);
		
	}
	public static void mostrarDatos(Parcial parcial) {
		System.out.println("La asignatura " + parcial.getNombreAsig() + " del docente " + parcial.getDocente() + " tiene el parcial el " + parcial.getFecha().getAño() + " " + parcial.getFecha().getMes() + " " + parcial.getFecha().getDia() + " a las " + parcial.getHora().getHora() + " " + parcial.getHora().getMinutos());
	}

}
