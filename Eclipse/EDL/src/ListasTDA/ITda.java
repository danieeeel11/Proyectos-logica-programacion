package ListasTDA;

public interface ITda<E> {
	boolean esVacia();
	int getTamanio();
	boolean buscar(E dato);
	void mostrar();
	void agregarAlFinal(E dato);
}
