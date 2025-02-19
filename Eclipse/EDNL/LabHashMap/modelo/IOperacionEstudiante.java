package modelo;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public interface IOperacionEstudiante {
	public abstract void listarEstudiante(String id, Estudiante e);
	public abstract void mostrarEstudiante(String id);
	public abstract void actualizarEstudiante(String id);
	public abstract void anexarEstucianteSiNoExiste(String id, Estudiante e);
	public abstract void borrarEstudiante(String id);
	public abstract void consultaPrograma(String programa);
	public abstract void consultarGenero(String genero);
	public abstract void consultarRangoEdad(int edadBase, int edadTope);
	public abstract void consultarMenoresEdad();
}
