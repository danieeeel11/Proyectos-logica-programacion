package Ejercicio1;

/**
 * Clase AppEstanque que contiene clases de Duck1, Duck2, Duck3 y Duck4 
 * @author Laura Sofia Ojeda Leon & Daniel Velásquez Rincón
 * @since 5-11-2020
 * @version 4
 */


public class AppEstanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] patos =  new String[4];
		
		Duck1 d1 = new Duck1();
		String nombre1 = d1.display();
		String swim1 = d1.swim();
		String d11 = nombre1 + swim1;
		
		Duck2 d2 = new Duck2();
		String nombre2 = d2.display();
		String swim2 = d2.swim();
		String fly2 = d2.metodoFly();
		String d22 = nombre2 + swim2 + " y" + fly2;
		
		Duck3 d3 = new Duck3();
		String nombre3 = d3.display();
		String swim3 = d3.swim();
		String quack3 = d3.metodoQuack();
		String d33 = nombre3 + swim3 + " y" + quack3;
		
		Duck4 d4 = new Duck4();
		String nombre4 = d4.display();
		String swim4 = d4.swim();
		String quack4 = d4.metodoQuack();
		String fly4 = d4.metodoFly();
		String d44 = nombre4 + swim4 + "," + quack4 + " y" + fly4;
		
		for(int i=0; i<patos.length; i++) {
			if(patos[i]==null) {
				patos[0] = d11;
				patos[1] = d22;
				patos[2] = d33;
				patos[3] = d44;
			}
		}
		
		for(String losPatos : patos) {
			System.out.println(losPatos);
		}
	}

}
