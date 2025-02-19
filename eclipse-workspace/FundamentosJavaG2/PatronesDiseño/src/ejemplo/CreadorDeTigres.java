package ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class CreadorDeTigres implements AbstractFactory {


		@Override
		public IFelino crearFelino(String color, String size) {
			Ojo o=new Ojo(color,size);
			IFelino g=new Tigre(o);
			return g;
		}

		@Override
		public IGym crearGym() {
			// TODO Auto-generated method stub
			return new GymTigres();
		}
	
}
