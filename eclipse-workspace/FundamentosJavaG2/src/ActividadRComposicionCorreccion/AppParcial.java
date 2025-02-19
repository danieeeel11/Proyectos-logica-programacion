package ActividadRComposicionCorreccion;

import java.util.Scanner;

public class AppParcial {

	public static void main(String[] args) {
		Scanner leerDato =new Scanner(System.in);
		
		System.out.println("Cuantos parciales?");
		int elemento =leerDato.nextInt();
		
		Parcial[] listaParciales =new Parcial[elemento];//relacion de composicion
		
		for (int i=0; i < listaParciales.length; i++) {
			System.out.println("Datos del parcial");
			System.out.println("Asignatura");
			String asignatura = leerDato.next();
			System.out.println("Docente");
			String docente = leerDato.next();
			
			listaParciales[i] =new Parcial(asignatura,docente);//nuevo objeto
			
			System.out.println("Datos de la Fecha y Hora");
			System.out.println("Dia");
			int dia = leerDato.nextInt();
			System.out.println("Mes");
			int mes = leerDato.nextInt();
			System.out.println("A�o");
			int a�o = leerDato.nextInt();
			System.out.println("Hora");
			int hora = leerDato.nextInt();
			System.out.println("Minutos");
			int minutos = leerDato.nextInt();
			
			listaParciales[i].agregarFecha(dia, mes, a�o);
			listaParciales[i].agregarHora(hora, minutos);
		}
		
		System.out.println("Lista de los parciales");
		for(int i=0; i< listaParciales.length; i++) {
			System.out.println("Asignatura " + listaParciales[i].getAsignatura());
			System.out.println("Docente " + listaParciales[i].getDocente());
			System.out.println("Fecha parcial Dia " + listaParciales[i].getFecha().getDia()
					+ " Mes "+ listaParciales[i].getFecha().getMes() 
					+ " A�o "+ listaParciales[i].getFecha().getA�o()
					+ " Hora " + listaParciales[i].getHora().getHora()
					+ " Minutos " + listaParciales[i].getHora().getMinutos());
		}

	}

}
