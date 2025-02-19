package Ej1;


public class Estudiante implements Comparable<Estudiante>{
	private int id;
	private String nombre;
	private Notas notas;
	
	public Estudiante(int id, String nombre, Notas notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notas = notas;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Notas getNotas() {
		return notas;
	}
	public void setNotas(Notas notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Estudiante --> Identificacion:" + id + ", Nombre:" + nombre + ", Notas:" + notas + " ";
	}
	
	@Override
	public int compareTo(Estudiante o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
		
		/*if(this.notas.getNotaFinal()<o.notas.getNotaFinal()) {
			return 1;
		}else if(this.notas.getNotaFinal()>o.notas.getNotaFinal()) {
			return -1;
		}else {
			return 0;
		}*/
	}

}
