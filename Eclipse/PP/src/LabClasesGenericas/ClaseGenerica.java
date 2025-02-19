package LabClasesGenericas;
/**
 * Clase de tipo Generica parametrizando 
 * la clase y que contiene los metodos get
 * y set
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 09-02-2021
 */
public class ClaseGenerica <T>{
	private T dato;
	
	public ClaseGenerica() {
		this.dato = null;
	}
	
	public ClaseGenerica(T dato) {
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	
}
