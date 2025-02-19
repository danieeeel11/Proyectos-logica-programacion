package ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			System.out.println("tipo de gato?");
			int felino = Integer.parseInt(sc.nextLine());
			System.out.println("color de ojos?");
			String color = sc.nextLine();
			System.out.println("tamaño de ojos?");
			String size = sc.nextLine();
			
			
			AbstractFactory catsFactory=null;
			if(felino==0) {
			 catsFactory=new CreadorDeGatos();
			}else if(felino == 1) {
				catsFactory=new CreadorDeTigres();
			}else {
				catsFactory=new CreadorDeLeones();
			}
			
			IFelino g=catsFactory.crearFelino(color, size);
			IGym gym=catsFactory.crearGym();
			g.ver();
			gym.jugar();
			

	}

}
