package ejemplo;

public interface AbstractFactory {
	
	public IFelino crearFelino(String color, String size);
	public IGym crearGym();

}
