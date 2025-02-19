package ejemplo;

import java.util.Scanner;

public class Gato extends IFelino{

	public Ojo ojos;
	public Gato(Ojo ojo) {
		super(ojo);
	}
	@Override
	public void hacerRuido() {
		System.out.println("miau");
	}
	

}
