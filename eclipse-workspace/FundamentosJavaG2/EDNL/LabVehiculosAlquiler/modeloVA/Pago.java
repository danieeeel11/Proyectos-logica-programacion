package modeloVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class Pago {
	private String placa;
	private int precioH;
	private int precioNum;
	public Pago(String placa, int numH, int numKm) {
		super();
		this.placa = placa;
		this.precioH = numH*5000;
		this.precioNum = numKm*1000;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPrecioH() {
		return precioH;
	}
	public void setPrecioH(int precioH) {
		this.precioH = precioH;
		//this.precioH = precioH*50000;
	}
	public int getPrecioNum() {
		return precioNum;
	}
	public void setPrecioNum(int precioNum) {
		this.precioNum = precioNum;
		//this.precioNum = precioNum*100000;
	}

	@Override
	public String toString() {
		return "[Precio Horas= " + precioH + ", Precio km= " + precioNum + "]";
	}
	
	
	
}
