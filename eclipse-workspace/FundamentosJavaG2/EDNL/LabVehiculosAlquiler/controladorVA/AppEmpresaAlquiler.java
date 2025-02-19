package controladorVA;

import modeloVA.OperacionVA;
import vistaVA.EntradaySalidaVA;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class AppEmpresaAlquiler {
	private OperacionVA operacion;
	private EntradaySalidaVA lector;
	public AppEmpresaAlquiler() {
		this.operacion = new OperacionVA();
		this.lector = new EntradaySalidaVA();
	}
	public void funcionar() {
		//metodo para llenar la data necesaria
		operacion.llenarData();
		int opcion=0;
		String menu= "\nMenu Principal" + "\n" + 
				"Seleccione proceso a realizar" + "\n" +
				"1. Alquilar vehiculo" + "\n" + 
				"2. Devolver vehiculo" + "\n" +
				"3. Consultar cliente" + "\n" +
				"4. Consultar vehiculo" + "\n" +
				"5. Consultar vehiculos segun marca" + "\n" +
				"6. Consultar vehiculos segun color" + "\n" +
				"7. Consultar vehiculos alquilados" + "\n" +
				"8. Consultar vehiculos disponibles" + "\n" +
				"9. Consultar clientes que \n    no han devuelto vehiculos" + "\n" +
				"10. Actualizar data cliente" + "\n" +
				"11. Estadisticas" + "\n" +
				"12. Imprimir clientes y vehiculos" + "\n" +
				"13. Salir:" + "\n" +
				"Opcion:";
		do {
			lector.imprimirInformacion(menu);
			opcion = lector.leerOpcion();
			switch(opcion) {
				case 1:
					alquilar();
					break;
				case 2:
					devolver();
					break;
				case 3:
					consultarCli();
					break;
				case 4:
					consultarVehiculo();
					break;
				case 5:
					consultarVehMarca();
					break;
				case 6:
					consultarVehColor();
					break;
				case 7:
					consultarVehAlq();
					break;
				case 8:
					consultarVehDisp();
					break;
				case 9:
					consultarCliMor();
					break;
				case 10:
					actualizarDataCli();
					break;
				case 11:
					estadisticas();
					break;
				case 12:
					operacion.imprimirListados();
					break;
			}
		}while(opcion!=13);
	}
	
	public void alquilar() {
		lector.imprimirInformacion("Digite su id:");
		String id = lector.leerTexto();
		operacion.alquilar(id);
	}
	
	public void devolver() {
		lector.imprimirInformacion("Digite su id:");
		String id = lector.leerTexto();
		operacion.devolver(id);
	}
	
	public void consultarCli() {
		lector.imprimirInformacion("Digite su id:");
		String id = lector.leerTexto();
		operacion.consultaCliente(id);
	}
	
	public void consultarVehiculo() {
		lector.imprimirInformacion("Digite la placa del vehiculo:");
		String placa = lector.leerTexto();
		operacion.consultaAutoPlaca(placa);
	}
	
	public void consultarVehMarca() {
		lector.imprimirInformacion("Digite la marca a consultar:");
		String marca = lector.leerTexto();
		operacion.consultaAutoMarca(marca);
	}
	
	public void consultarVehColor() {
		lector.imprimirInformacion("Digite el color a consultar:");
		String color = lector.leerTexto();
		operacion.consultaAutoColor(color);
	}
	
	public void consultarVehAlq() {
		operacion.consultaAutosAlquilados();
	}
	
	public void consultarVehDisp() {
		operacion.consultaAutosDisponibles();
	}
	
	public void consultarCliMor() {
		operacion.consClientesMorosos();
	}
	
	public void actualizarDataCli() {
		lector.imprimirInformacion("Digite su id:");
		String id = lector.leerTexto();
		operacion.actualizarDataCliente(id);
	}
	
	public void estadisticas() {
		operacion.mediaAquileres();
		System.out.println();
		operacion.mediaRecortadaAlquileres();
		System.out.println();
		operacion.mediaWinzorizadaAlquileres();
		System.out.println();
		operacion.varianza();
		System.out.println();
		operacion.mediaArmonicaVelocidadesAutos();
	}
}
