package Ejercicio1;

public class Profesor {
	private int idProf;
	private String nombreProf;
	private String profesion;
	/**
	 * @param idProf
	 * @param nombreProf
	 * @param profesion
	 */
	public Profesor(int idProf, String nombreProf, String profesion) {
		super();
		this.idProf = idProf;
		this.nombreProf = nombreProf;
		this.profesion = profesion;
	}
	/**
	 * @return the idProf
	 */
	public int getIdProf() {
		return idProf;
	}
	/**
	 * @param idProf the idProf to set
	 */
	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}
	/**
	 * @return the nombreProf
	 */
	public String getNombreProf() {
		return nombreProf;
	}
	/**
	 * @param nombreProf the nombreProf to set
	 */
	public void setNombreProf(String nombreProf) {
		this.nombreProf = nombreProf;
	}
	/**
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}
	/**
	 * @param profesion the profesion to set
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	

}
