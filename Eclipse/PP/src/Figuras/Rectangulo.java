package Figuras;
/**
 * Clase que contiene las instancias de un rectangulo, 
 * e implementa los metodos de IFiguraGeometrica
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 04-02-2021
 *
 */
public class Rectangulo implements IFiguraGeometrica{
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		return (2*base)+(2*altura);
	}
	
	
	
}
