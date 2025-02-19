package Interface;

public class Televisor extends Electrodomestico implements iCalculablee, iMostrable{
	private boolean sintonizador;

	/**
	 * @param color
	 * @param precioBase
	 * @param sintonizador
	 */
	public Televisor(String color, long precioBase, boolean sintonizador) {
		super(color, precioBase);
		this.sintonizador = sintonizador;
	}

	
	public long calcularPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase +(this.precioBase * this.IVA/100);
	}

	
	public void mostrar(String cadena) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}

