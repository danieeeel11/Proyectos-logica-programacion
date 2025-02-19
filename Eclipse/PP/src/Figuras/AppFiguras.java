package Figuras;
/**
 * Programa principal para practicar con la implementación
 * de distintas interfaces empleando distintas 
 * alternativas
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 04-02-2021
 */
public class AppFiguras {
	static void mostrarInfo(IFiguraGeometrica fig) {
		System.out.println("Area: " + fig.calcularArea());
		System.out.println("Perimetro: " + fig.calcularPerimetro());
	}
	public static void main(String[] args) {
		//Definicion de objetos a partir de las clases
		Rectangulo rec = new Rectangulo(7,3);
		System.out.println("Datos del rectangulo:");
		mostrarInfo(rec);
		
		Cuadrado cua = new Cuadrado(4);
		System.out.println("Datos del cuadrado");
		mostrarInfo(cua);
		
		System.out.println("Datos del circulo");
		mostrarInfo(new IFiguraGeometrica(){
			int radio = 5;
			
			@Override
			public double calcularArea() {
				return Math.PI * radio * radio;
			}
			
			@Override
			public double calcularPerimetro() {
				return 2 * Math.PI * radio;
			}
		});
	}

}
