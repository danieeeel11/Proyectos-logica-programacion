package Ej1;
/**
 * Clase Notas donde se declaran las instancias de clase: las tres notas de la asignatura y la nota final
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 14-05-2021
 */
public class Notas {
	private int act1;
	private int act2;
	private int act3;
	private float notaFinal;
	/**
	 * Constructor de la clase
	 * @param act1 nota de la actividad1
	 * @param act2 nota de la actividad2
	 * @param act3 nota de la actividad3
	 */
	public Notas(int act1, int act2, int act3) {
		super();
		this.act1 = act1;
		this.act2 = act2;
		this.act3 = act3;
		//this.notaFinal = notaFinal;
	}
	/**
	 * Metodo get act1
	 * @return la nota de la actividad1
	 */
	public int getAct1() {
		return act1;
	}
	/**
	 * Metodo set act1
	 * @param act1 la nota de la actividad1
	 */
	public void setAct1(int act1) {
		this.act1 = act1;
	}
	/**
	 * Metodo get act2
	 * @return la nota de la actividad2
	 */
	public int getAct2() {
		return act2;
	}
	/**
	 * Metodo set act2
	 * @param act2 la nota de la actividad2
	 */
	public void setAct2(int act2) {
		this.act2 = act2;
	}
	/**
	 * Metodo get act3
	 * @return la nota de la actividad3
	 */
	public int getAct3() {
		return act3;
	}
	/**
	 * Metodo set act3
	 * @param act3 la nota de la actividad3
	 */
	public void setAct3(int act3) {
		this.act3 = act3;
	}
	/**
	 * Metodo get notaFinal
	 * @return la nota de la notaFinal
	 */
	public float getNotaFinal() {
		return notaFinal;
	}
	/**
	 * Metodo set notaFinal
	 * @param notaFinal la nota de la notaFinal
	 */
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	/**
	 * Metodo set para establecer el valor de la notaFinal
	 */
	public void setNotaFinal() {
			this.notaFinal = (float)((act1*0.3)+(act2*0.3)+(act3*0.4));
	}
	
	/**
	 * Metodo to String de la clase
	 */
	@Override
	public String toString() {
		return "[Actividad1:" + act1 + ", Actividad2:" + act2 + ", Actividad3:" + act3 + ", Nota Final:" + notaFinal +"]";
	}
	

}
