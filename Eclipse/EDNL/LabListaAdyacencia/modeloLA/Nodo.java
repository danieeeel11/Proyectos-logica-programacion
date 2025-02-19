package modeloLA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */

public class Nodo {
	private int vertice;
	private Nodo siguiente;
	private int peso;
	
	public Nodo(int vertice, Nodo siguiente, int peso) {
		super();
		this.vertice = vertice;
		this.siguiente = siguiente;
		this.peso = peso;
	}

	public int getVertice() {
		return vertice;
	}

	public void setVertice(int vertice) {
		this.vertice = vertice;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nodo [vertice=" + vertice + ", siguiente=" + siguiente + ", peso=" + peso + "]";
	}
	
	
	
	
}
