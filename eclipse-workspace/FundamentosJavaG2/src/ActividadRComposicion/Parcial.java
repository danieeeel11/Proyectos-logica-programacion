package ActividadRComposicion;

public class Parcial {
	private String nombreAsig;
	private String docente;
	private Fecha fecha;
	private HoraP hora;
	/**
	 * @param nombreAsig
	 * @param docente
	 */
	public Parcial(String nombreAsig, String docente) {
		super();
		this.nombreAsig = nombreAsig;
		this.docente = docente;
	}
	public void crearFecha(int año, String mes, int dia) {
		this.fecha =new Fecha(año, mes, dia);
	}
	public void crearHora(int hora, int minutos) {
		this.hora =new HoraP(hora, minutos);
	}
	
	/**
	 * @return the nombreAsig
	 */
	public String getNombreAsig() {
		return nombreAsig;
	}
	/**
	 * @param nombreAsig the nombreAsig to set
	 */
	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
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
	/**
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
	/**
	 * @return the hora
	 */
	public HoraP getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(HoraP hora) {
		this.hora = hora;
	}
	
	

}
