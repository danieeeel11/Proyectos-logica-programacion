package Ej1;
/**
 * Clase principal que contiene los metodos llenarLista con datos de personas aleatoriamente, extraerDatos
 * para clasificar cada persona y estadisticas, para generar los datos solicitados
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 15-03-2021
 *
 */
public class main {

	public static void main(String[] args) {
		ListaVacuna lv = new ListaVacuna();
		lv.llenarLista();
		lv.extraerDatos();
		lv.estadisticas();

	}

}
