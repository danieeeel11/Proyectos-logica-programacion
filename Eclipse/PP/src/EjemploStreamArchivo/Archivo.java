package EjemploStreamArchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Archivo {
	private String cadenaArchivo;
	private Scanner input;
	
	public Archivo() {
		this.cadenaArchivo="";
		try {
			//this.input = new Scanner(new File("./data/persona.txt"));
			this.input = new Scanner(new File("personas2.txt"));
		}catch(FileNotFoundException exc) {
			exc.printStackTrace();
		}
	}
	
	public String obtenerArchivo() {
		while(input.hasNextLine()) {
			cadenaArchivo += input.nextLine()+"\n";
		}
		return cadenaArchivo;
	}

	public static void main(String[] args) {
		Archivo arch = new Archivo();
		System.out.println(arch.obtenerArchivo());

	}

}
