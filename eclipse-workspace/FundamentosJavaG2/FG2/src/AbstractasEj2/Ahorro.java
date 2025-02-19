package AbstractasEj2;

public class Ahorro extends Cuenta{
	private long interes;


	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param interes
	 */
	public Ahorro(int numeroCuenta, String titular, long interes) {
		super(numeroCuenta, titular);
		this.interes = interes;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the interes
	 */
	public long getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public void setInteres(long interes) {
		this.interes = interes;
	}

	public String toString() {
		return super.toString() + "Ahorro [interes=" + interes + "]";
	}

	
	
	
	
	
	

}
