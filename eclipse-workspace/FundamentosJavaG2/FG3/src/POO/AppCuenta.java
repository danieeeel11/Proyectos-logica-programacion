package POO;

public class AppCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona miPersona= new Persona(100025, "Juanita", "3001215");
		Cuenta miCuenta= new Cuenta(1020, miPersona);
		miCuenta.deposito(30000);
		System.out.println("Numero de la cuenta " + miCuenta.getNumero());
		System.out.println("Nombre del titular " + miCuenta.getTitular().getNombre());
		System.out.println("Saldo a la fecha " + miCuenta.getSaldo());

	}

}
