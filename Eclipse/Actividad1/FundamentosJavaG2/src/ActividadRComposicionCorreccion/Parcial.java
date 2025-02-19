package ActividadRComposicionCorreccion;

public class Parcial {
	private String asignatura;
	private String docente;
	private Fecha fecha;
	private Hora hora;
	/**
	 * @param asignatura
	 * @param docente
	 */
	public Parcial(String asignatura, String docente) {
		super();
		this.asignatura = asignatura;
		this.docente = docente;
	}
	
	/**
	 *  Se crea una instancia de la clase Fecha dentro de una instancia de la clase Parcial
	 * @param id
	 * @param mes
	 * @param año
	 */
	public void agregarFecha(int id, int mes, int año) {
		this.fecha = new Fecha(id, mes, año);
	}
	/**
	 * Se crea una instancia de la clase Hora dentro de una instancia de la clase Parcial
	 * @param hora  del parcial entero
	 * @param minutos del parcial entero
	 */
	public void agregarHora(int hora, int minutos) {
		this.hora = new Hora(hora, minutos);
	}

	/**
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}

	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}

	/** Metodo para obtener una instancia de la clase Fecha
	 * @return the fecha
	 */
	public Fecha getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	/** Metodo para obtener una instancia de la clase Hora
	 * @return the hora
	 */
	public Hora getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	

}
