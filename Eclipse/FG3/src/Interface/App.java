package Interface;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televisor miTelevisor = new Televisor("Rojo", 250000, true);
		System.out.println(miTelevisor + "Precio con IVA " 
		+ miTelevisor.calcularPrecio());

	}

}
