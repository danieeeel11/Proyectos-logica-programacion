package Figuras;
/**
 * Clase que contiene las instancias de un cuadrado, 
 * e implementa los metodos de IFiguraGeometrica
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 04-02-2021
 */
public class Cuadrado implements IFiguraGeometrica{
	private int lado;

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		return (4*lado);
	}
	
	
}
