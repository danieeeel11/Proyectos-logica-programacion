package ejemplo;

public class CreadorDeGatos implements AbstractFactory {


		@Override
		public IFelino crearFelino(String color, String size) {
			Ojo o=new Ojo(color,size);
			IFelino g=new Gato(o);
			return g;
		}

		@Override
		public IGym crearGym() {
			return new GymGatos();
		}
	
}
