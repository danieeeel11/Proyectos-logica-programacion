package ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class CreadorDeLeones implements AbstractFactory {


		@Override
		public IFelino crearFelino(String color, String size) {
			Ojo o=new Ojo(color,size);
			IFelino g=new Leon(o);
			return g;
		}

		@Override
		public IGym crearGym() {
			// TODO Auto-generated method stub
			return new GymLeones();
		}
	
}
