package Archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {
	private String cadena;
	private Scanner in;
	private String arreglo[];
	private Estudiante unEstudiante;
	private OperacionEstudiante operacion;
	
	public Archivo() {
		operacion = new OperacionEstudiante();
		
	}
	
	public  void leerArchivo(){
		try{
			in = new Scanner (new File("./data/datos.txt"));
			while(in.hasNextLine()) {
				cadena=in.nextLine();
				generarLista(cadena);
			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		//this.unEstudiante = new Estudiante();
		//this.operacion = new OperacionEstudiante();
	}

	public void generarLista(String cad) { 
		arreglo = cad.split(" ");
		System.out.println(arreglo[0]+ " "+arreglo[1]+ " "+arreglo[2]+ " "+arreglo[3]);
		/*
		 * unEstudiante.setId(arreglo[0]);
		unEstudiante.setNombre(arreglo[1]);
		unEstudiante.setPrimerApellido(arreglo[2]);
		unEstudiante.setSegundoApellido(arreglo[3]);
		 */
		
		//this.unEstudiante = new Estudiante(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
		//operacion.registrarEstudiante(unEstudiante);
		operacion.registrarEstudiante(new Estudiante(arreglo[0], arreglo[1], arreglo[2], arreglo[3]));
		
	}
	
}
