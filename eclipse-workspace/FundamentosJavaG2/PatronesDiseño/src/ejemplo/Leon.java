package ejemplo;

import java.util.Scanner;

public class Leon extends IFelino{

	public Leon(Ojo eyes) {
		super(eyes);
	}

	@Override
	public void hacerRuido() {
		System.out.println("Grrr");
	}
	
	@Override
	public void ver() {
		System.out.println("soy un león");
		ojos.ver();
	}
	

}
