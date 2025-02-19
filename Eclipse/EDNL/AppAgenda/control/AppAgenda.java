package control;

import modelo.OperacionProveedor;
import modelo.Proveedor;
import vista.EntradaSalida;

public class AppAgenda{
	private OperacionProveedor operacion;
	private EntradaSalida lector;
	public AppAgenda() {
		this.operacion = new OperacionProveedor();
		this.lector = new EntradaSalida();
	}
	public void funcionar() {
		int opcion=0;
		String menu= "Menu Principal" + "\n" + 
				"Seleccione proceso a realizar:" + "\n" +
				"1. Anexar Proveedor" + "\n" + 
				"2. Imprimir Proveedores" + "\n" +
				"3. Consultar Proveedor" + "\n" +
				"4. Actualizar Proveedor" + "\n" +
				"5. Borrar Proveedor" + "\n" +
				"6. Salir" + "\n" +
				"Opcion:";
		do {
			lector.imprimirMensaje(menu);
			opcion = lector.leerOpcion();
			switch(opcion) {
				case 1:
					anexarProveedor();
					break;
				case 2:
					imprimirProveedor();
					break;
				case 3:
					consultarProveedor();
					break;
				case 4:
					actualizarProveedor();
					break;
				case 5:
					borrarProveedor();
					break;
			}
		}while(opcion!=6);
	}
	private void anexarProveedor() {
		String id = "";
		String nombre = "";
		String apellido = "";
		String correoPer = "";
		String correoOrg = "";
		String nCelular = "";
		
		lector.imprimirMensaje("Identificacion: ");
		id = lector.leerTexto();
		lector.imprimirMensaje("Nombre: ");
		nombre = lector.leerTexto();
		lector.imprimirMensaje("Apellido: ");
		apellido = lector.leerTexto();
		lector.imprimirMensaje("Correo Personal: ");
		correoPer = lector.leerTexto();
		lector.imprimirMensaje("Correo Organizacion: ");
		correoOrg = lector.leerTexto();
		lector.imprimirMensaje("Numero Celular: : ");
		nCelular = lector.leerTexto();
		
		operacion.anexarProveedor(new Proveedor(id,nombre,apellido,correoPer,correoOrg,nCelular));
	}
	private void imprimirProveedor() {
		operacion.listarProveedor();
	}
	private void consultarProveedor(){
		String id ="";
		lector.imprimirMensaje("Indentificacion: ");
		id = lector.leerTexto();
		operacion.consultarProveedor(id);
	}
	private void actualizarProveedor() {
		String id = "";
		String nombre = "";
		String apellido = "";
		String correoPer = "";
		String correoOrg = "";
		String nCelular = "";
		
		lector.imprimirMensaje("Identificacion: ");
		id = lector.leerTexto();
		lector.imprimirMensaje("Nombre: ");
		nombre = lector.leerTexto();
		lector.imprimirMensaje("Apellido: ");
		apellido = lector.leerTexto();
		lector.imprimirMensaje("Correo Personal: ");
		correoPer = lector.leerTexto();
		lector.imprimirMensaje("Correo Organizacion: ");
		correoOrg = lector.leerTexto();
		lector.imprimirMensaje("Numero Celular: : ");
		nCelular = lector.leerTexto();
		
		operacion.actualizarProveedor(id, nombre, apellido, correoPer, correoOrg, nCelular);
	}
	private void borrarProveedor() {
		String id ="";
		lector.imprimirMensaje("Indentificacion: ");
		id = lector.leerTexto();
		operacion.borrarProveedor(id);
	}
	public static void main(String[] args) {
		AppAgend app = new AppAgend();
		app.funcionar();
	}

}
