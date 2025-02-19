package Prioridad;

public class Persona implements Comparable<Persona>{
	private int id;
	private String nombre;
	private int edad;
	private int prioridad;
	public Persona(int id, String nombre, int edad, int prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.prioridad = prioridad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", prioridad=" + prioridad + "]";
	}

	//@Override
	/*public int compareTo(Persona o) {
		if(edad<o.getEdad()) {
			return 1;
		}else if(edad>o.getEdad()) {
			return -1;
		}else {
			return 0;
		}
	}*/
	
	@Override
	public int compareTo(Persona o) {
		if(this.prioridad<o.getPrioridad()) {
			return 1;
		}else if(this.prioridad>o.getPrioridad()) {
			return -1;
		}else {
			return 0;
		}
	}
	/*
	@Override
	public int compareTo(Persona o) {
		if(this.edad>80 && this.prioridad <o.getPrioridad()) {
			return 1;
		}else if(this.prioridad>o.getPrioridad()) {
			return -1;
		}else {
			return 0;
		}
	}*/
	
}
