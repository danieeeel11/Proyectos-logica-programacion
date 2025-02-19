package Ejercicio1;

import java.util.Scanner;

public class AppEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato =new Scanner(System.in);
		
		System.out.println("Buen dia");
		System.out.println("Gestion de valores");
		System.out.println("..............................................");
		System.out.println(" ");
		System.out.println("Datos empleados de salario fijo");
		
		int n=2;
		EmSalarioFijo[] esf =new EmSalarioFijo[n];
		//Metodo para ingresar y asignar los datos de las instancias de la clase EmSalarioFijo
		for(int i=0;i<esf.length;i++) {
			System.out.println("Digite la identificacion...");
			int id =leerDato.nextInt();
			System.out.println("Digite el nombre...");
			String nombre =leerDato.next();
			System.out.println("Digite el apellido...");
			String apellido =leerDato.next();
			System.out.println("Digite la fecha de ingreso a la empresa...");
			System.out.println("Dia...");
			int dia =leerDato.nextInt();
			System.out.println("Mes...");
			int mes =leerDato.nextInt();
			System.out.println("Año...");
			int año =leerDato.nextInt();
			System.out.println("Ingrese su salario base...");
			double salario =leerDato.nextDouble();
			System.out.println(" ");
			
			
			
			Fecha fechaIngreso =new Fecha(dia, mes, año);
			EmSalarioFijo emsf = new EmSalarioFijo(id,nombre,apellido,fechaIngreso,salario);
			emsf.añosTrabajados();
			emsf.salarioTotal();
				    
			for(int g=0;g<esf.length;g++) {
			   	if(esf[g]==null) {
			 		esf[g]=emsf;
			   		break;
			    	}
			    }
			}
				
		EmComision[] ec =new EmComision[n];
				
		System.out.println("___________________________________________");
		System.out.println("Datos de empleados domiciliarios a comision");
		//Metodo para ingresar y asignar los datos de las instancias de la clase EmComision
		for(int i=0; i<ec.length;i++) {
			System.out.println("Digite la identificacion...");
			int id =leerDato.nextInt();
			System.out.println("Digite el nombre...");
			String nombre =leerDato.next();
			System.out.println("Digite el apellido...");
			String apellido =leerDato.next();
			System.out.println("Digite la fecha de ingreso a la empresa...");
			System.out.println("Dia...");
			int dia =leerDato.nextInt();
			System.out.println("Mes...");
			int mes =leerDato.nextInt();
			System.out.println("Año...");
			int año =leerDato.nextInt();
			System.out.println("Digite el numero de domicilios realizados...");
			double nDomicilios =leerDato.nextDouble();
			System.out.println(" ");
								
			Fecha fechaIngreso =new Fecha(dia, mes, año);
			EmComision emc =new EmComision(id,nombre,apellido,fechaIngreso);
			emc.añosTrabajados();
			emc.comision(nDomicilios);
			emc.salarioTotal();
		
			for(int g=0;g<ec.length;g++) {
				if(ec[g]==null) {
					ec[g]=emc;
					break;
					}
			    }
					
			}
				
		System.out.println(" ");
		System.out.println("____________________________");
		System.out.println("Datos empleados con salario fijo ");
		//Metodo para imprimir los datos ingresados de la clase EmSalarioFijo
		for(EmSalarioFijo losEmSalarioFijo : esf) {
			System.out.println(losEmSalarioFijo);
		}
		System.out.println(" ");
		System.out.println("Datos empleados domiciliarios a comision ");
		//Metodo para imprimir los datos ingresados de la clase EmComision
		for(EmComision losEmComision : ec) {
			System.out.println(losEmComision);
		}

	}

}
