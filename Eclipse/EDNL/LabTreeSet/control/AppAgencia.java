package control;

import modelo.OperacionCliente;
import vista.EyS;
import modelo.Cliente;

public class AppAgencia {
	private OperacionCliente operacion;
	private EyS lector;
	public AppAgencia() {
		this.operacion = new OperacionCliente();
		this.lector = new EyS();
	}
	public void funcionar() {
		int opcion=0;
		String menu= "Menu Principal" + "\n" + 
				"Seleccione proceso a realizar:" + "\n" +
				"1. Añadir cliente:" + "\n" + 
				"2. Actualizar cliente:" + "\n" +
				"3. Mostrar primer cliente:" + "\n" +
				"4. Mostrar ultimo cliente:" + "\n" +
				"5. Borrar cliente:" + "\n" +
				"6. Consultar cliente:" + "\n" +
				"7. Borrar primer cliente:" + "\n" +
				"8. Borrar ultimo cliente:" + "\n" +
				"9. Ordenar clientes por id:" + "\n" +
				"10. Ordenar clientes por nombre:" + "\n" +
				"11. Ordenar clientes por apellido:" + "\n" +
				"12. Ordenar clientes por telefonico:" + "\n" +
				"13. Salir" + "\n" +
				"Opcion:";
		do {
			lector.imprimirInformacion(menu);
			opcion = lector.leerOpcion();
			switch(opcion) {
				case 1:
					anexarCliente();
					break;
				case 2:
					actualizarCliente();
					break;
				case 3:
					mostrarPrimerCliente();
					break;
				case 4:
					mostrarUltimoCliente();
					break;
				case 5:
					borrarCliente();
					break;
				case 6:
					consultarCliente();
					break;
				case 7:
					borrarPrimerCliente();
					break;
				case 8:
					borraUltimoCliente();
					break;
				case 9:
					orderId();
					break;
				case 10:
					orderNom();
					break;
				case 11:
					orderAp();
					break;
				case 12:
					orderTel();
					break;
			}
		}while(opcion!=13);
	}
	
	private void anexarCliente() {
		lector.imprimirInformacion("Identificacion: ");
		int id = lector.leerDatoInt();
		lector.imprimirInformacion("Nombre: ");
		String nombre = lector.leerTexto();
		lector.imprimirInformacion("Apellido: ");
		String apellido = lector.leerTexto();
		lector.imprimirInformacion("Direccion: ");
		String direccion = lector.leerTexto();
		lector.imprimirInformacion("Correo Organizacion: ");
		String correoOrg = lector.leerTexto();
		lector.imprimirInformacion("Correo Personal: ");
		String correoPer = lector.leerTexto();
		lector.imprimirInformacion("Numero Celular: ");
		int telefonico = lector.leerDatoInt();
		
		operacion.listarCliente(new Cliente(id, nombre, apellido, direccion, correoOrg, correoPer, telefonico));
	}
	private void actualizarCliente() {
		lector.imprimirInformacion("Indentificacion: ");
		int id = lector.leerDatoInt();
		operacion.actualizarCliente(id);
	}
	private void consultarCliente(){
		//int id =0;
		lector.imprimirInformacion("Indentificacion: ");
		int id = lector.leerDatoInt();
		operacion.consultarCliente(id);
	}
	private void mostrarPrimerCliente() {
		operacion.mostrarPrimerCliente();
	}
	private void mostrarUltimoCliente() {
		operacion.mostrarUltimoCliente();
	}
	private void borrarCliente() {
		//int id =0;
		lector.imprimirInformacion("Indentificacion: ");
		int id = lector.leerDatoInt();
		operacion.borrarCliente(id);
	}
	private void borrarPrimerCliente() {
		operacion.borrarPrimerCliente();
	}
	private void borraUltimoCliente() {
		operacion.borraUltimoCliente();
	}
	private void orderId() {
		operacion.ordenarClienteId();
	}
	private void orderNom() {
		operacion.ordenarClienteNom();
	}
	private void orderAp() {
		operacion.ordenarClienteAp();
	}
	private void orderTel() {
		operacion.ordenarClienteTel();
	}
}
