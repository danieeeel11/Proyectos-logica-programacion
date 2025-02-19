package AbstractasEj2;

public abstract class Cuenta {
	protected int numeroCuenta;
	protected String titular;
	private long saldo;
	
	

	/**
	 * @param numeroCuenta
	 * @param titular
	 */
	public Cuenta(int numeroCuenta, String titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
	}

	public long getSaldo() {
		return this.saldo;
	}
	
	public abstract void deposito(long valor);
	public abstract void retiro(long valor);

	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}



	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	
	
}
