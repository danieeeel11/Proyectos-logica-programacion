package Archivo;

import java.util.ArrayList;
import java.util.List;

public class OperacionEstudiante {
	private List<Estudiante> listaEstudiante;
	
	public OperacionEstudiante() {
		this.listaEstudiante = new ArrayList<>();
	}
	
	public void registrarEstudiante(Estudiante unEstudiante) {
		this.listaEstudiante.add(unEstudiante);
	}

	
}
