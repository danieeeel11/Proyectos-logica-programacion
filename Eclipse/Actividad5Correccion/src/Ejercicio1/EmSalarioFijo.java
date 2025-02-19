package Ejercicio1;
/**
 * Programa la clase empleado con salario fijo para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 1
 */

public class EmSalarioFijo extends Empleado{
	
	private double salario;
	private int añosTrabajados;
	private double salarioTotal;
	
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaIngreso
	 * @param salario
	 */
	public EmSalarioFijo(int id, String nombre, String apellido, Fecha fechaIngreso, double salario) {
		super(id, nombre, apellido, fechaIngreso);
		this.salario = salario;
	}


	/**
	 * Metodo para calcular los años trabajados en la empresa de un empleado con salario fijo
	 * @return
	 */
	public int añosTrabajados() {
		añosTrabajados= 2020 - fechaIngreso.getAño();
		return añosTrabajados;
	}
	

	/*
	 * Metodo para calcular el salario total de un empleado con salario fijo
	 */
	public double salarioTotal() {
		if(añosTrabajados<2) {
			salarioTotal=salario;
		}
		else if(añosTrabajados>=2 && añosTrabajados<=3) {
			salarioTotal=(salario*0.05)+salario;
			
		}
		else if(añosTrabajados>=4 && añosTrabajados<=7) {
			salarioTotal=(salario*0.1)+salario;
		}
		else if(añosTrabajados>=8 && añosTrabajados<=15){
			salarioTotal=(salario*0.15)+salario;
		}
		else if(añosTrabajados>15) {
			salarioTotal=(salario*0.2)+salario;
		}
		
		return salarioTotal;
	}

	/**
	 * Metodo para obtener una instancia de salario base de la clase EmSalarioFijo
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

	/**
	 * Metodo para obtener una instancia de años de trabajo base de la clase EmSalarioFijo
	 * @return the añosTrabajados
	 */
	public int getAñosTrabajados() {
		return añosTrabajados;
	}

	/**
	 * @param añosTrabajados the añosTrabajados to set
	 */
	public void setAñosTrabajados(int añosTrabajados) {
		this.añosTrabajados = añosTrabajados;
	}

	/**
	 * Metodo para obtener una instancia de salario total de la clase EmSalarioFijo
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
	 * Metodo para convertir los datos de las instancias de EmSalarioFijo a cadena de caracteres tipo String
	 */
	public String toString() {
		return super.toString() + " Empleado de salario fijo [salario base= " + salario
				+ ", años trabajados= " + añosTrabajados + ", salario total= " 
				+ salarioTotal + " ]";
	}

}
