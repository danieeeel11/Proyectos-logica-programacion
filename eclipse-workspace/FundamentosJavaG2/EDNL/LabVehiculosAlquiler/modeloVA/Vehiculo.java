package modeloVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class Vehiculo {
	private String placa;
	private String color;
	private String matricula;
	private String marca;
	private String modelo;
	private String motor;
	private double precio;
	private boolean enCirculacion;
	
	public Vehiculo(String placa, String color, String matricula, String marca, String modelo, String motor,
			double precio, boolean enCirculacion) {
		this.placa = placa;
		this.color = color;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.precio = precio;
		this.enCirculacion = enCirculacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEnCirculacion() {
		return enCirculacion;
	}

	public void setEnCirculacion(boolean enCirculacion) {
		this.enCirculacion = enCirculacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [\n\t\tPlaca= " + placa + ", Color= " + color + ", Matricula= " + matricula + ", \n\t\tMarca= " + marca
				+ ", Modelo= " + modelo + ", Motor= " + motor + ", \n\t\tPrecio= " + precio + ", enCirculacion?= " + enCirculacion
				+ "]";
	}
	
	
	
	
}
