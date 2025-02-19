package Ej2;
/*
 * Clase Km donde se declaran las instancias de clase: el kilometraje de cada dia de la semana y el total, de cada bus
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 14-05-2021
 */
public class Km {
	private int kmLunes;
	private int kmMartes;
	private int kmMiercoles;
	private int kmJueves;
	private int kmViernes;
	private int kmSabado;
	private int kmDomingo;
	private int kmSemana;
	/**
	 * Constructor de la clase Km
	 * @param kmLunes
	 * @param kmMartes
	 * @param kmMiercoles
	 * @param kmJueves
	 * @param kmViernes
	 * @param kmSabado
	 * @param kmDomingo
	 */
	public Km(int kmLunes, int kmMartes, int kmMiercoles, int kmJueves, int kmViernes, int kmSabado, int kmDomingo) {
		super();
		this.kmLunes = kmLunes;
		this.kmMartes = kmMartes;
		this.kmMiercoles = kmMiercoles;
		this.kmJueves = kmJueves;
		this.kmViernes = kmViernes;
		this.kmSabado = kmSabado;
		this.kmDomingo = kmDomingo;
		//this.kmSemana = kmSemana;
	}
	/**
	 * Metodo get kmLunes
	 * @return el kilometraje del dia lunes
	 */
	public int getKmLunes() {
		return kmLunes;
	}
	/**
	 * Metodo set kmLunes
	 * @param kmLunes el kilometraje del dia lunes
	 */
	public void setKmLunes(int kmLunes) {
		this.kmLunes = kmLunes;
	}
	/**
	 * Metodo get kmMartes
	 * @return el kilometraje del dia martes
	 */
	public int getKmMartes() {
		return kmMartes;
	}
	/**
	 * Metodo set kmMartes
	 * @param kmMartes el kilometraje del dia martes
	 */
	public void setKmMartes(int kmMartes) {
		this.kmMartes = kmMartes;
	}
	/**
	 * Metodo get kmMiercoles
	 * @return el kilometraje del dia miercoles
	 */
	public int getKmMiercoles() {
		return kmMiercoles;
	}
	/**
	 * Metodo set kmMiercoles
	 * @param kmMiercoles el kilometraje del dia miercoles
	 */
	public void setKmMiercoles(int kmMiercoles) {
		this.kmMiercoles = kmMiercoles;
	}
	/**
	 * Metodo get kmJueves
	 * @return el kilometraje del dia jueves
	 */
	public int getKmJueves() {
		return kmJueves;
	}
	/**
	 * Metodo set kmJueves
	 * @param kmJueves el kilometraje del dia jueves
	 */
	public void setKmJueves(int kmJueves) {
		this.kmJueves = kmJueves;
	}
	/**
	 * Metodo get kmViernes
	 * @return el kilometraje del dia viernes
	 */
	public int getKmViernes() {
		return kmViernes;
	}
	/**
	 * Metodo set kmViernes
	 * @param kmViernes el kilometraje del dia viernes
	 */
	public void setKmViernes(int kmViernes) {
		this.kmViernes = kmViernes;
	}
	/**
	 * Metodo get kmSabado
	 * @return el kilometraje del dia sabado
	 */
	public int getKmSabado() {
		return kmSabado;
	}
	/**
	 * Metodo set kmSabado
	 * @param kmSabado el kilometraje del dia sabado
	 */
	public void setKmSabado(int kmSabado) {
		this.kmSabado = kmSabado;
	}
	/**
	 * Metodo get kmDomingo
	 * @return el kilometraje del dia domingo
	 */
	public int getKmDomingo() {
		return kmDomingo;
	}
	/**
	 * Metodo set kmDomingo
	 * @param kmDomingo el kilometraje del dia domingo
	 */
	public void setKmDomingo(int kmDomingo) {
		this.kmDomingo = kmDomingo;
	}
	/**
	 * Metodo get kmSemana
	 * @return el kilometraje de la semana
	 */
	public int getKmSemana() {
		return kmSemana;
	}
	/**
	 * Metodo set kmSemana
	 * @param kmSemana el kilometraje de la semana
	 */
	public void setKmSemana(int kmSemana) {
		this.kmSemana = kmSemana;
	}
	/**
	 * Metodo set kmSemana definiendo a kmSemana como la suma de los km de la semana
	 */
	public void setKmSemana() {
		this.kmSemana = (kmLunes+kmMartes+kmMiercoles+kmJueves+kmViernes+kmSabado+kmDomingo);
	}
	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return "[Lunes: " + kmLunes + ", Martes: " + kmMartes + ", Miercoles: " + kmMiercoles + ", Jueves: "
				+ kmJueves + ", Viernes: " + kmViernes + ", Sabado: " + kmSabado + ", Domingo:" + kmDomingo
				+ ", - TOTAL: " + kmSemana + "]";
	}
	
	
	

}
