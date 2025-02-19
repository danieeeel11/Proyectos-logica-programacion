package PilaTDA;
public class AppPila {

	public static void main(String[] args) {
		TdaPila miPila = new TdaPila<>();
		
		miPila.apilar(100);
		miPila.apilar(20);
		miPila.apilar(80);
		
		System.out.println(miPila.tope());
		
		System.out.println(miPila.desapilar());
		
		System.out.println(miPila.tope());
		
		System.out.println(miPila.tamanio());
		
		miPila.apilar(new Estudiante("Juanita",22,"F"));
		
		System.out.println(miPila.tope());
		
		System.out.println(miPila.tamanio());

	}

}
