package Ejercicio1;
/**
 * Programa la clase empleado con salario fijo para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 1
 */

public class EmComision extends Empleado{
//	private double SALARIO;
	static final double SALARIO=300000;
	private int a�osTrabajados;
	private double comision;
	private double salarioTotal;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 */
	public EmComision(int id, String nombre, String apellido, Fecha fechaIngreso) {
		super(id, nombre, apellido, fechaIngreso);
	}
	
	/**
	 * Metodo para calcular los a�os trabajados en la empresa de un empleado domiciliario a comision
	 * @return
	 */
	public int a�osTrabajados() {
		a�osTrabajados =2020 - fechaIngreso.getA�o();
		return a�osTrabajados;
	}
	
	/**
	 * Metodo para calcular  la comsion a pagar en funcion de numero de domiciios de un empleado domiciliario a comision
	 * @return
	 */
	public double comision(double nDomicilios) {
		comision=(nDomicilios)*9500;
		return comision;
	}
	
	/**
	 * Metodo para calcular el salario total de un empleado domiciliario a comision
	 * @return
	 */
	public double salarioTotal() {
		if(comision<SALARIO) {
			salarioTotal=SALARIO;
		}else {
			salarioTotal=SALARIO+comision;
		}
		return salarioTotal;
	}

	/**
	 * Metodo para obtener una instancia de a�os trabajados de la clase EmComision
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

	/**
	 * Metodo para obtener una instancia de comision de la clase EmComision
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

	/**
	 * Metodo para obtener una instancia de salario total de la clase EmComision
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

	/**
	 * @return the salario
	 */
	public static double getSalario() {
		return SALARIO;
	}
	
	/*
	 * Metodo para convertir los datos de las instancias de EmComision a cadena de caracteres tipo String
	 */
	public String toString() {
		return super.toString() + " Empleado domiciliario a comision [salario base= " + SALARIO
				+ ", a�os trabajados= " + a�osTrabajados + ", comision= " + comision 
				+ ", salario total= " + salarioTotal + " ]";
	
	}

}
