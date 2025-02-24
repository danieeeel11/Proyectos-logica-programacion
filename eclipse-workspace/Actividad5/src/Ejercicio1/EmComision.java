package Ejercicio1;
/**
 * Programa la clase empleado domiciliario a comision para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 3
 */

public class EmComision extends Empleado{
	private double salario;
	private int aņosTrabajados;
	private double comision;
	private double salarioTotal;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 * @param salario
	 * @param aņosTrabajados
	 * @param comision
	 * @param salarioTotal
	 */
	public EmComision(int id, String nombre, String apellido, Fecha fechaIngreso, double salario, int aņosTrabajados,double comision, double salarioTotal) {
		super(id, nombre, apellido, fechaIngreso);
		this.salario = salario;
		this.aņosTrabajados = aņosTrabajados;
		this.comision = comision;
		this.salarioTotal = salarioTotal;
	}
	/** Metodo para obtener una instancia de salario base de la clase EmComision
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/** Metodo para obtener una instancia de aņos trabajados de la clase EmComision
	 * @return the aņosTrabajados
	 */
	public int getAņosTrabajados() {
		return aņosTrabajados;
	}
	/**
	 * @param aņosTrabajados the aņosTrabajados to set
	 */
	public void setAņosTrabajados(int aņosTrabajados) {
		this.aņosTrabajados = aņosTrabajados;
	}
	/** Metodo para obtener una instancia de comision de la clase EmComision
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}
	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	} 
	/** Metodo para obtener una instancia de salario total de la clase EmComision
	 * @return the salarioTotal
	 */
	public double getSalarioTotal() {
		return salarioTotal;
	}
	/**
	 * @param salarioTotal the salarioTotal to set
	 */
	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
		
	/*
	 * Metodo para convertir los datos de las instancias de EmComision a cadena de caracteres tipo String
	 */
	public String toString() {
		return super.toString() + " Empleado domiciliario a comision [salario base= " + salario
				+ ", aņos trabajados= " + aņosTrabajados + ", comision= " + comision 
				+ ", salario total= " + salarioTotal + " ]";
	
	}

}
