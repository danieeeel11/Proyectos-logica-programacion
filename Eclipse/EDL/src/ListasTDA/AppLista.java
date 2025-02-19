package ListasTDA;

public class AppLista {

	public static void main(String[] args) {
		Lista miLista = new Lista();
		
		if(miLista.esVacia()) {
			System.out.println("Lista vacia");
		}
		miLista.mostrar();
		miLista.agregarAlFinal("Juanita");
		miLista.agregarAlFinal("Pachito");
		miLista.agregarAlFinal(2);
		miLista.agregarAlFinal("Laura");
		miLista.mostrar();
		miLista.agregarAlFinal("Pedro");
		System.out.println();
		if (miLista.buscar(-1)) {
			System.out.println("El dato esta en la lista");
		}else{
			System.out.println("El dato no esta en la lista ");
		}

	}

}
