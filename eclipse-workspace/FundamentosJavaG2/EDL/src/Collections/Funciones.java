package Collections;

public class Funciones {
	int tamanio = 0;
	public int[] numero = new int[10];
	
	public boolean vacia() {
		if(tamanio == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int tamanio() {
		return this.tamanio;
	}
	/*
	public void agregarInicia(int dato) {
		this.numero[0] = dato;
		this.tamanio++;
	}*/
	
	public void agregarInicio(int dato) {
		for (int i = numero.length; i > 0; i--) {
			int x = numero[i-1];
			if(numero[i-1]!=0) {
				//break;
				this.numero[i] = x;
			}
		}
		this.numero[0] = dato;
		tamanio++;
	}
	
	public void agregarFinal(int dato) {
		if(vacia()) {
			this.numero[0] = dato;
		}else {
			for (int i = 0; i < numero.length; i++) {
				if(numero[i]==0) {
					this.numero[i] = dato;
					break;
				}
			}
		}
		this.tamanio++;
	}
	
	/*public void borrar(int index) {
		for (int i = 0; i < numero.length; i++) {
			if(i == index && numero[i]!=0) {
				numero[i] = 0;
				this.tamanio--;
			}
		}
	}*/
	
	public void borrar(int index) {
		for (int i = 0; i < numero.length; i++) {
			if(i == index) {
				this.tamanio--;
				for (int j = index+1 ; j < numero.length; j++) {
					numero[j-1] = numero[j];
				}
			}
		}
	}
	
	public void modificar(int index, int dato) {
		this.numero[index] = dato;
	}
	
	public boolean consultar(int dato) {
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] == dato) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public void mostrar() {
		for (int i = 0; i < numero.length; i++) {
			if(numero[i]==0) {
				break;
			}
			System.out.println(numero[i]);
		}
	}
}
