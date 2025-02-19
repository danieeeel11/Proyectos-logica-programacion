package Interface.ej1;

public class Electrodomestico {
	protected String color;
	protected long precioBase;
	/**
	 * @param color
	 * @param precioBase
	 */
	public Electrodomestico(String color, long precioBase) {
		super();
		this.color = color;
		this.precioBase = precioBase;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the precioBase
	 */
	public long getPrecioBase() {
		return precioBase;
	}
	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(long precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public String toString() {
		return "Electrodomestico [color=" + color + ", precioBase=" + precioBase + "]";
	}
	
	

}
