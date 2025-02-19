package Ejercicio1;
/**
 * Programa la clase empleado con salario fijo para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 3
 */

public class EmSalarioFijo extends Empleado {
	private double salario;
	private int a�osTrabajados;
	private double salarioTotal;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 * @param salario
	 * @param a�osTrabajados
	 * @param salarioTotal
	 */
	public EmSalarioFijo(int id, String nombre, String apellido, Fecha fechaIngreso, double salario,int a�osTrabajados,double salarioTotal) { 
			//double salarioTotal
		super(id, nombre, apellido, fechaIngreso);
		this.salario = salario;
		this.a�osTrabajados = a�osTrabajados;
		this.salarioTotal = salarioTotal;
	}
	/** Metodo para obtener una instancia de salario base de la clase EmSalarioFijo
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
	/** Metodo para obtener una instancia de a�os de trabajo base de la clase EmSalarioFijo
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
	/** Metodo para obtener una instancia de salario total de la clase EmSalarioFijo
	 * @return the salarioTotal
	 */
	public double getSalarioTotal() {
		return salarioTotal;
	}
	/**
	 * @param salarioTotal the salarioTotal to set
	 */
	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal=salarioTotal;
	}
	
	/**
	 * Metodo para convertir los datos de las instancias de EmSalarioFijo a cadena de caracteres tipo String
	 */
	public String toString() {
		return super.toString() + " Empleado de salario fijo [salario base= " + salario
				+ ", a�os trabajados= " + a�osTrabajados + ", salario total= " 
				+ salarioTotal + " ]";
	}

}
