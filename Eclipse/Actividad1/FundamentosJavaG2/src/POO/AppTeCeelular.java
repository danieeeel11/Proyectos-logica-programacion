package POO;

import java.util.Scanner;

public class AppTeCeelular {

	public static void main(String[] args) {
		
		Scanner leerDato =new Scanner(System.in);
		
		System.out.print("Entrar el id ");
		int id = leerDato.nextInt();
		System.out.print("Entrar el color ");
		String color = leerDato.next();
		System.out.print("Entrar el modelo ");
		String modelo= leerDato.next();
		System.out.print("Entrar la marca ");
		String marca = leerDato.next();
		
		TeCeelular miCelular =new TeCeelular(id, color, modelo,marca);
		
		System.out.println("Codigo " +miCelular.getId());
		System.out.println("Color " +miCelular.getColor());
		System.out.println("Modelo " +miCelular.getModelo());
		System.out.println("Marca " +miCelular.getMarca());
		
		
		TeCeelular otroCelular =new TeCeelular(3020, "Negro", "AZS45", "LG");
		
		System.out.println("Codigo " +otroCelular.getId());
		System.out.println("Color " +otroCelular.getColor());
		System.out.println("Modelo " +otroCelular.getModelo());
		System.out.println("Marca " +otroCelular.getMarca());
		
		otroCelular.setColor("Amarillo ");
		
		System.out.println("Codigo " +otroCelular.getId());
		System.out.println("Color " +otroCelular.getColor());
		System.out.println("Modelo " +otroCelular.getModelo());
		System.out.println("Marca " +otroCelular.getMarca());
	}

}
