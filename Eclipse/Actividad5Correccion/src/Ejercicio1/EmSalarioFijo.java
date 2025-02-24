package Ejercicio1;
/**
 * Programa la clase empleado con salario fijo para crear objetos
 * @author Daniel Felipe Velasquez Rincon
 * @since 2020-10-13
 * @version 1
 */

public class EmSalarioFijo extends Empleado{
	
	private double salario;
	private int aņosTrabajados;
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
	 * Metodo para calcular los aņos trabajados en la empresa de un empleado con salario fijo
	 * @return
	 */
	public int aņosTrabajados() {
		aņosTrabajados= 2020 - fechaIngreso.getAņo();
		return aņosTrabajados;
	}
	

	/*
	 * Metodo para calcular el salario total de un empleado con salario fijo
	 */
	public double salarioTotal() {
		if(aņosTrabajados<2) {
			salarioTotal=salario;
		}
		else if(aņosTrabajados>=2 && aņosTrabajados<=3) {
			salarioTotal=(salario*0.05)+salario;
			
		}
		else if(aņosTrabajados>=4 && aņosTrabajados<=7) {
			salarioTotal=(salario*0.1)+salario;
		}
		else if(aņosTrabajados>=8 && aņosTrabajados<=15){
			salarioTotal=(salario*0.15)+salario;
		}
		else if(aņosTrabajados>15) {
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
	 * Metodo para obtener una instancia de aņos de trabajo base de la clase EmSalarioFijo
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
				+ ", aņos trabajados= " + aņosTrabajados + ", salario total= " 
				+ salarioTotal + " ]";
	}

}
