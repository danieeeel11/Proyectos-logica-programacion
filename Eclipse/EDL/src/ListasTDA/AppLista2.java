package ListasTDA;

public class AppLista2 {

	public static void main(String[] args) {
		Lista miLista = new Lista();
		
		if(miLista.esVacia()) {
			System.out.println("Lista vacia");
		}
		
		Estudiante estudiante = new Estudiante(1020,"Juanita");
		miLista.agregarAlFinal(estudiante);
		miLista.agregarAlFinal(new Estudiante(1021,"Pachito"));
		miLista.agregarAlFinal(new Estudiante(1022,"Laura"));
		miLista.agregarAlFinal(new Estudiante(1023,"Jancito"));
		miLista.mostrar();
		
		if(miLista.buscar(estudiante)) {
			System.out.println("El estudiante esta en la lista");
		}else {
			System.out.println("El estuadiante no esta en la lista");
		}
		
	}

}
