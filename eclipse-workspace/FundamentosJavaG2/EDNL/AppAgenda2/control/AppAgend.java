package control;

import modelo.OperacionProveedo;
import modelo.Proveedo;
import vista.Entrada_Salida;

public class AppAgend{
	private OperacionProveedo operacion;
	private Entrada_Salida lector;
	public AppAgend() {
		this.operacion = new OperacionProveedo();
		this.lector = new Entrada_Salida();
	}
	public void funcionar() {
		int opcion=0;
		String menu= "Menu Principal" + "\n" + 
				"Seleccione proceso a realizar:" + "\n" +
				"1. Anexar Proveedor" + "\n" + 
				"2. Imprimir Proveedores" + "\n" +
				"3. Consultar Proveedor" + "\n" +
				"4. Borrar lista proveedores" + "\n" +
				"5. Salir" + "\n" +
				"Opcion:";
		do {
			lector.imprimirInformacion(menu);
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
					borrarProveedor();
					break;
			}
		}while(opcion!=5);
	}
	private void anexarProveedor() {
		String id = "";
		String nombre = "";
		String apellido = "";
		String correoPer = "";
		String correoOrg = "";
		String nCelular = "";
		
		lector.imprimirInformacion("Identificacion: ");
		id = lector.leerTexto();
		lector.imprimirInformacion("Nombre: ");
		nombre = lector.leerTexto();
		lector.imprimirInformacion("Apellido: ");
		apellido = lector.leerTexto();
		lector.imprimirInformacion("Correo Personal: ");
		correoPer = lector.leerTexto();
		lector.imprimirInformacion("Correo Organizacion: ");
		correoOrg = lector.leerTexto();
		lector.imprimirInformacion("Numero Celular: : ");
		nCelular = lector.leerTexto();
		
		operacion.anexarProveedor(new Proveedo(id,nombre,apellido,correoPer,correoOrg,nCelular));
	}
	
	private void imprimirProveedor() {
		operacion.listarProveedor();
	}
	
	private void consultarProveedor(){
		String id ="";
		lector.imprimirInformacion("Indentificacion: ");
		id = lector.leerTexto();
		operacion.consultarProveedor(id);
	}
	
	private void borrarProveedor() {
		operacion.borrarLista();
	}

}
