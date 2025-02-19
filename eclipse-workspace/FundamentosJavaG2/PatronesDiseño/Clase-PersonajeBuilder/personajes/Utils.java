package personajes;

import java.util.HashMap;

import personajes.abstracts.AbstractFactory;
import personajes.concretes.grupos.G1;
import personajes.concretes.grupos.G2;
import personajes.concretes.grupos.G3;
import personajes.concretes.grupos.G4;

public class Utils {

	public static String URL_LOCAL="/home/juan/PruebaBendis/";
	private static HashMap<String, AbstractFactory> gss;
	
	public static HashMap<String, AbstractFactory> getG(){
		gss=new HashMap<String, AbstractFactory>();
		gss.put("Sayayin", new G1());
		gss.put("Perros", new G2());
		gss.put("Gatos", new G3());
		gss.put("Humanos", new G4());
		return gss;
	}
	

	

}
