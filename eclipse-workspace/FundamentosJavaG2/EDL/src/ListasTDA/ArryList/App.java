package ListasTDA.ArryList;

import java.util.ArrayList;

import ListasTDA.Estudiante;

public class App {

	public static void main(String[] args) {
		TDAlist miLista = new TDAlist();
		
		miLista.addFinal(10);
		miLista.addFinal(20);
		miLista.addFinal(30);
		miLista.addEntreNodo(1, 50);
		miLista.addInicio(100);
		
		miLista.muestra();
		
		TDAlist miLista1 = new TDAlist();
		
		miLista1.addFinal(new Estudiante(1020,"Juanita"));
		miLista1.addFinal(new Estudiante(1021,"Pachito"));
		miLista1.addFinal(new Estudiante(1022,"Pedrito"));
		
		miLista1.muestra();
		
		/**ArrayList a = miLista.getLista();
		
		int s = 0;
		for (Object object : a) {
			s += object;
		}**/
	}

}
