package RelacionComposicion;

public class AppTeleCelular {

	public static void main(String[] args) {
		
		TeleCelular miCelular =new TeleCelular("LG", "FG678");
		miCelular.crearAntena(20);
		System.out.println("Datos del primer objeto");
		System.out.println("Marca " + miCelular.getMarca());
		System.out.println("Modelo " + miCelular.getModelo());
		System.out.println("Potencia " + miCelular.getAntena().getPotencia());
		
		TeleCelular miOtroCelular =new TeleCelular("Nokia", "TRX89");
		miOtroCelular.crearAntena(15);
		System.out.println("Datos del segundo objeto");
		System.out.println("Marca " + miOtroCelular.getMarca());
		System.out.println("Modelo " + miOtroCelular.getModelo());
		System.out.println("Potencia " + miOtroCelular.getAntena().getPotencia());
				
	}

}
