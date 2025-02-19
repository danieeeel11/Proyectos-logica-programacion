package Lab1;
/**
 * 
 * @author User
 *
 */
public class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo = 0.0;
	}
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public void consignar(double cantidad) {
		saldo += cantidad;
	}

	public void retirar(double cantidad) {
		saldo -= cantidad;
	}
	
	public double obtenerSaldo() {
		return saldo;
	}
}
