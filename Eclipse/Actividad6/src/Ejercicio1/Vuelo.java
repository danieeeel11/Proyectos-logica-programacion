package Ejercicio1;
/**
 * Clase vuelo que contiene los datos del vuelo (ciudad  de salida, ciudad de llegada, los datos del piloto, y el asiento donde esta 
 * asignado el pasajero
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */
import java.util.Arrays;

public class Vuelo {

	private int nVuelo;
	private String ciudadSalida;
	private String ciudadLlegada;
	private Piloto piloto;
	private Puesto[] Puestos;
	//CONSTRUCTOR
	/**
	 * @param nVuelo
	 * @param ciudadSalida
	 * @param ciudadLlegada
	 * @param piloto
	 * @param nPuestos
	 */
	public Vuelo(int nVuelo, String ciudadSalida, String ciudadLlegada, Piloto piloto, int nPuestos) {
		super();
		this.nVuelo = nVuelo;
		this.ciudadSalida = ciudadSalida;
		this.ciudadLlegada = ciudadLlegada;
		this.piloto = piloto;
		this.Puestos = new Puesto[nPuestos];
	}
	public void agregarPuesto(Puesto puesto) {
		for(int i=0;i<Puestos.length;i++) {
			if(Puestos[i] == null) {
				Puestos[i] = puesto;
				break;
			}
		}
	}
	//METODO PARA BUSCAR PASAJERO EN CON LA IDENTIFICACION
	public void buscarPasajero(int id) {
		
		
		Puesto puesto=null;
		for (Puesto localizar : Puestos) {
			if (id == localizar.getPasajero().getId()) {
				System.out.println("Datos del pasajero " +localizar.toString()+" "
			+"Vuelo: " + "ciudadSalida=" + ciudadSalida + ", ciudadLlegada=" 
			+ ciudadLlegada);
			 break;
			}else {
				System.out.println("No se encontro el pasajero");
				break;
			}
		}
		
		
		
		
		
	}
	
	/**
	 * @return the nVuelo
	 */
	public int getnVuelo() {
		return nVuelo;
	}
	/**
	 * @param nVuelo the nVuelo to set
	 */
	public void setnVuelo(int nVuelo) {
		this.nVuelo = nVuelo;
	}
	/**
	 * @return the ciudadSalida
	 */
	public String getCiudadSalida() {
		return ciudadSalida;
	}
	/**
	 * @param ciudadSalida the ciudadSalida to set
	 */
	public void setCiudadSalida(String ciudadSalida) {
		this.ciudadSalida = ciudadSalida;
	}
	/**
	 * @return the ciudadLlegada
	 */
	public String getCiudadLlegada() {
		return ciudadLlegada;
	}
	/**
	 * @param ciudadLlegada the ciudadLlegada to set
	 */
	public void setCiudadLlegada(String ciudadLlegada) {
		this.ciudadLlegada = ciudadLlegada;
	}
	/**
	 * @return the piloto
	 */
	public Piloto getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	/**
	 * @return the puestos
	 */
	public Puesto[] getPuestos() {
		return Puestos;
	}
	/**
	 * @param puestos the puestos to set
	 */
	public void setPuestos(Puesto[] puestos) {
		Puestos = puestos;
	}
	
	@Override
	public String toString() {
		return "Vuelo [nVuelo=" + nVuelo + ", ciudadSalida=" + ciudadSalida + ", ciudadLlegada=" + ciudadLlegada
				+ ", piloto=" + piloto + ", Puestos=" + Arrays.toString(Puestos) + "]";
	}

}
