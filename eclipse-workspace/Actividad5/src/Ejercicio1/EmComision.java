package Ejercicio1;
/**
 * Programa la clase empleado domiciliario a comision para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 3
 */

public class EmComision extends Empleado{
	private double salario;
	private int a�osTrabajados;
	private double comision;
	private double salarioTotal;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 * @param salario
	 * @param a�osTrabajados
	 * @param comision
	 * @param salarioTotal
	 */
	public EmComision(int id, String nombre, String apellido, Fecha fechaIngreso, double salario, int a�osTrabajados,double comision, double salarioTotal) {
		super(id, nombre, apellido, fechaIngreso);
		this.salario = salario;
		this.a�osTrabajados = a�osTrabajados;
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
	/** Metodo para obtener una instancia de a�os trabajados de la clase EmComision
	 * @return the a�osTrabajados
	 */
	public int getA�osTrabajados() {
		return a�osTrabajados;
	}
	/**
	 * @param a�osTrabajados the a�osTrabajados to set
	 */
	public void setA�osTrabajados(int a�osTrabajados) {
		this.a�osTrabajados = a�osTrabajados;
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
				+ ", a�os trabajados= " + a�osTrabajados + ", comision= " + comision 
				+ ", salario total= " + salarioTotal + " ]";
	
	}

}
