package control;

import modelo.Estudiante;
import modelo.OperacionEstudiante;
import vista.EntradaySalida;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class AppUniversidad {
	private OperacionEstudiante operacion;
	private EntradaySalida lector;
	public AppUniversidad() {
		this.operacion = new OperacionEstudiante();
		this.lector = new EntradaySalida();
	}
	public void funcionar() {
		int opcion=0;
		String menu= "\nMenu Principal" + "\n" + 
				"Seleccione proceso a realizar:" + "\n" +
				"1. Capturar datos de los estudiantes:" + "\n" + 
				"2. Mostrar lista de estudiantes:" + "\n" +
				"3. Mostrar estudiante:" + "\n" +
				"4. Actualizar estudiante:" + "\n" +
				"5. Anexar estudiante si no existe:" + "\n" +
				"6. Borrar estudiante:" + "\n" +
				"7. Consultar estudiantes segun programa:" + "\n" +
				"8. Consultar estudiantes segun genero:" + "\n" +
				"9. Consultar estudiantes segun rango de edad:" + "\n" +
				"10. Consultar estudiantes menores de edad:" + "\n" +
				"11. Salir" + "\n" +
				"Opcion:";
		do {
			lector.imprimirInformacion(menu);
			opcion = lector.leerOpcion();
			switch(opcion) {
				case 1:
					leerArchivo();
					break;
				case 2:
					imprimir();
					break;
				case 3:
					mostrarEst();
					break;
				case 4:
					actualizarEst();
					break;
				case 5:
					anexarEstucianteSiNoExiste();
					break;
				case 6:
					borrarEst();
					break;
				case 7:
					consultaPrograma();
					break;
				case 8:
					consultaGenero();
					break;
				case 9:
					consultarRangoEdad();
					break;
				case 10:
					consultarMenoresEdad();
					break;
			}
		}while(opcion!=11);
	}
	
	public void leerArchivo() {
		operacion.leerArchivo();
	}
	public void imprimir() {
		operacion.imprimir();
	}
	public void mostrarEst() {
		lector.imprimirInformacion("Identificacion:");
		String id = lector.leerTexto();
		operacion.mostrarEstudiante(id);
	}
	public void actualizarEst() {
		lector.imprimirInformacion("Identificacion:");
		String id = lector.leerTexto();
		operacion.actualizarEstudiante(id);
	}
	public void anexarEstucianteSiNoExiste() {
		lector.imprimirInformacion("Identificacion");
		String id = lector.leerTexto();
		lector.imprimirInformacion("Nombre");
		String nombre = lector.leerTexto();
		lector.imprimirInformacion("Apellido");
		String apellido = lector.leerTexto();
		lector.imprimirInformacion("Correo institucional");
		String correoIns = lector.leerTexto();
		lector.imprimirInformacion("Correo Personal");
		String correoPer = lector.leerTexto();
		lector.imprimirInformacion("Numero Telefonico");
		String numTel = lector.leerTexto();
		lector.imprimirInformacion("Genero");
		String genero = lector.leerTexto();
		lector.imprimirInformacion("Edad");
		int edad = lector.leerDatoInt();
		lector.imprimirInformacion("Programa");
		String programa = lector.leerTexto();
		
		operacion.anexarEstucianteSiNoExiste(id, new Estudiante(nombre,apellido,correoIns,correoPer,numTel,genero,edad,programa));
	}
	public void borrarEst() {
		lector.imprimirInformacion("Identificacion:");
		String id = lector.leerTexto();
		operacion.borrarEstudiante(id);
	}
	public void consultaPrograma() {
		lector.imprimirInformacion("Programa: ");
		String programa = lector.leerTexto();
		operacion.consultaPrograma(programa);
	}
	public void consultaGenero() {
		lector.imprimirInformacion("Genero: ");
		lector.imprimirInformacion("1. masculino \n2. femenino");
		String g = lector.leerTexto();
		String genero=null; 
		if(g.equals("1")) {
			genero="masculino";
		}else {
			genero="femenino";
		}
		operacion.consultarGenero(genero);
	}
	public void consultarRangoEdad() {
		lector.imprimirInformacion("Edad base: ");
		int edadBase = lector.leerDatoInt();
		lector.imprimirInformacion("Edad tope: ");
		int edadTope = lector.leerDatoInt();
		operacion.consultarRangoEdad(edadBase, edadTope);
	}
	public void consultarMenoresEdad() {
		operacion.consultarMenoresEdad();
	}
}
