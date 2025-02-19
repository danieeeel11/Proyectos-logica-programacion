package ArreglosDinamicos;

import java.util.ArrayList;

public class listaPersona {
	ArrayList <Persona> listaPersona =new ArrayList();

	/**
	 * @param listaPersona
	 */
	public listaPersona() {
		super();
		this.listaPersona = new ArrayList();
	}
	
	public void agregarPersona(Persona persona) {
		listaPersona.add(persona);
	}
	
	public void mostrarLista() {
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
	}
	
	public Persona buscarPersona(int id) {
		Persona p = null;
		for(Persona persona : listaPersona) {
			if(persona.getId()== id) {
				p = persona;
				break;
			}
		}
		return p;
	}
	
	public void borrarPersona(Persona persona) {
		listaPersona.remove(persona);
	}
	
	public void borrar(int index) {
		listaPersona.remove(index);
	}
	
	public void actualizarDatos(int index, Persona persona) {
		listaPersona.set(index, persona);
	}
	
	public int obtenerIndex(Persona persona) {
		return listaPersona.indexOf(persona);
	}

}
