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
			System.out.println("A�o...");
			int a�o =leerDato.nextInt();
			System.out.println("Ingrese su salario base...");
			double salario =leerDato.nextDouble();
			System.out.println(" ");
			
			int a�osT=0;
			a�osT=2020-a�o;
			
			double salarioTotal=0;
			if(a�osT<2) {
				salarioTotal=salario;
			}
			else if(a�osT>=2 && a�osT<=3) {
				salarioTotal=(salario*0.05)+salario;
				
			}
			else if(a�osT>=4 && a�osT<=7) {
				salarioTotal=(salario*0.1)+salario;
			}
			else if(a�osT>=8 && a�osT<=15){
				salarioTotal=(salario*0.15)+salario;
			}
			else if(a�osT>15) {
				salarioTotal=(salario*0.2)+salario;
			}
			
			Fecha fechaIngreso =new Fecha(dia, mes, a�o);
			EmSalarioFijo emsf = new EmSalarioFijo(id,nombre,apellido,fechaIngreso,salario,a�osT,salarioTotal);
		   
		    
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
			System.out.println("A�o...");
			int a�o =leerDato.nextInt();
			System.out.println("Digite el numero de domicilios realizados...");
			double comision =leerDato.nextDouble();
			System.out.println(" ");
			
			int a�osT=0;
			a�osT=2020-a�o;
			
			double com=0;
			com=(comision*9500);
			
			double salarioTotal=0;
			double base=300000;
			if(com<base) {
				salarioTotal=base;
			}else {
				salarioTotal=base+com;
			}
			
			Fecha fechaIngreso =new Fecha(dia, mes, a�o);
			EmComision emc =new EmComision(id,nombre,apellido,fechaIngreso,300000,a�osT,com,salarioTotal);
			
			
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
