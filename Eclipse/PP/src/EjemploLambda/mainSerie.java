package EjemploLambda;

public class mainSerie {

	public static void main(String[] args) {
		//---------Clase normal----------------
		int n=0;
		Serie unaSerie = new Serie();
		System.out.println("Impresion de la serie de numeros de 7 en 7");
		for (int i = 0; i <= 10; i++) {
			n= unaSerie.obtenerSiguiente(n);
			System.out.println(n);
		}
		
		//---------Clase anonima----------------
		ISerie otraSerie = new ISerie() {
			@Override
			public int obtenerSiguiente(int n) {
				// TODO Auto-generated method stub
				return n+7;
			}
		};
		n=0;
		System.out.println("Impresion de la serie de numeros de 7 en 7 en una clase anonima");
		for (int i = 0; i <= 10; i++) {
			n= otraSerie.obtenerSiguiente(n);
			System.out.println(n);
		}
		
		//---------Serie Lambda----------------
		ISerie serieLambda = numero -> numero + 7;
		n=0;
		System.out.println("Impresion de la serie de numeros de 7 en 7 con expresion lambda");
		for (int i = 0; i <= 10; i++) {
			n= serieLambda.obtenerSiguiente(n);
			System.out.println(n);
		}
		
	}
}
