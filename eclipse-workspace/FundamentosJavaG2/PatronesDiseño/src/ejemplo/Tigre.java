package ejemplo;

import java.util.Scanner;

public class Tigre extends IFelino{

	public Tigre(Ojo eyes) {
		super(eyes);
	}

	@Override
	public void hacerRuido() {
		System.out.println("Grrr con rayas!");
	}
	@Override
	public void ver() {
		System.out.println("soy un tigre");
		ojos.ver();
	}

}
