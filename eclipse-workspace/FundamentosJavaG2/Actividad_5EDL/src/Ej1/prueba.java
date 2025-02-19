package Ej1;

public class prueba {
	public static String[] generarNombresAleatorios(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar"};
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };

		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
					+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
		}
		return nombresAleatorios;
	}

	/**
	 * Imprime un arreglo de String
	 * 
	 * @param nombresGenerados
	 *            arreglo con los nombres generados
	 */
	public static void imprimir(String[] nombresGenerados) {
		for (int i = 0; i < nombresGenerados.length; i++) {
			System.out.println(nombresGenerados[i]);
		}
	}

	public static void main(String[] args) {
		imprimir(generarNombresAleatorios(200));
		System.out.println();
		System.out.println(nomAleatorio());
	}
	
	///////////////
	public static String nomAleatorio() {
		//String[] aleaNom = new String[num];
		String aleaNom = new String();
		String[] nombres = { "Andrea", "David", "Baltasar", "Barry", "Bartolomeo",
				"Carlos", "Zaramay", "Marcos", "Davinson", "Polo", "Pepito", "Pachito", 
				"Carlota", "Estefania", "Gabriel", "Dayana", "Hulio", "Roco"};
		String[] apellidos = { "Ruiz", "Guerrero", "Cardenas", "Montoya", "Cuccitini", 
				"Dos Santos", "Gaucho", "Rodriguez","Garcia", "Sanchez", "Cantona", 
				"McKennie", "Araujo", "Alba", "Lavezzi", "Ramos", "Paez", "Montero" };

		//for (int i = 0; i < num; i++) {
			aleaNom = nombres[(int)(Math.floor(Math.random()*((nombres.length-1)-0+1)+0))] + " "+ apellidos[(int)(Math.floor(Math.random()*((apellidos.length-1)-0+1)+0))];
		//}
		return aleaNom;
	}
}
