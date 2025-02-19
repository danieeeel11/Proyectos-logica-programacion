package ActividadRComposicionCorreccion;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	/**
	 * @param dia
	 * @param mes
	 * @param a�o
	 */
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}
	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	//A�adido 8 octubre 2020
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}
	
	

}
