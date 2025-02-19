package Ej2;
/**
 * Clase Bus donde se declaran las instancias de clase: el numero, kilometraje y conductor del bus
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 14-05-2021
 */
public class Bus {
	private int numero;
	private Km km;
	private Conductor conductor;
	/**
	 * Constructor de la clase
	 * @param numero
	 * @param km
	 * @param conductor
	 */
	public Bus(int numero, Km km, Conductor conductor) {
		super();
		this.numero = numero;
		this.km = km;
		this.conductor = conductor;
	}
	/**
	 * Metodo get numero
	 * @return numero del bus
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Metodo set numero
	 * @param numero del bus
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Metodo get km
	 * @return km el objeto de la clase Km
	 */
	public Km getKm() {
		return km;
	}
	/**
	 * Metodo set km
	 * @param km el objeto de la clase Km
	 */
	public void setKm(Km km) {
		this.km = km;
	}
	/**
	 * Metodo get conductor
	 * @return conductor el objeto de la clase Conductor
	 */
	public Conductor getConductor() {
		return conductor;
	}
	/**
	 * Metodo set conductor
	 * @param conductor el objeto de la clase Conductor
	 */
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return "Bus --> Numero: " + numero + ", Kilometros: " + km + ", Conductor: " + conductor + "";
	}
	
	

}
