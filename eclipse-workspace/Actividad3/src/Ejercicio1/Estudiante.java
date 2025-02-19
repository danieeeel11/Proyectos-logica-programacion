package Ejercicio1;

public class Estudiante {
	private int idEst;
	private String nombreEst;
	private String apellidoEst;
	private float c1;
	private float c2;
	private float c3;
	
	
	private float notaFinal;
	private String apono;
	/**
	 * @param idEst
	 * @param nombreEst
	 * @param apellidoEst
	 * @param c1
	 * @param c2
	 * @param c3
	 * @param notaFinal
	 */
	public Estudiante(int idEst, String nombreEst, String apellidoEst, float c1, float c2, float c3) {
		super();
		this.idEst = idEst;
		this.nombreEst = nombreEst;
		this.apellidoEst = apellidoEst;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	public float getNotaFinal() {
		setNotaFinal();
		if (notaFinal>=3.0) {
			this.apono = "Aprobo";
		} else {
			this.apono = "No aprobo";
		}
		return notaFinal;
	}
	
	public void setNotaFinal() {
			this.notaFinal = (float) ((c1*0.3) + (c2*0.3) + (c3*0.4)/3);
	}
	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	/**
	 * @return the idEst
	 */
	public int getIdEst() {
		return idEst;
	}
	/**
	 * @param idEst the idEst to set
	 */
	public void setIdEst(int idEst) {
		this.idEst = idEst;
	}
	/**
	 * @return the nombreEst
	 */
	public String getNombreEst() {
		return nombreEst;
	}
	/**
	 * @param nombreEst the nombreEst to set
	 */
	public void setNombreEst(String nombreEst) {
		this.nombreEst = nombreEst;
	}
	/**
	 * @return the apellidoEst
	 */
	public String getApellidoEst() {
		return apellidoEst;
	}
	/**
	 * @param apellidoEst the apellidoEst to set
	 */
	public void setApellidoEst(String apellidoEst) {
		this.apellidoEst = apellidoEst;
	}
	/**
	 * @return the c1
	 */
	public float getC1() {
		return c1;
	}
	/**
	 * @param c1 the c1 to set
	 */
	public void setC1(float c1) {
		this.c1 = c1;
	}
	/**
	 * @return the c2
	 */
	public float getC2() {
		return c2;
	}
	/**
	 * @param c2 the c2 to set
	 */
	public void setC2(float c2) {
		this.c2 = c2;
	}
	/**
	 * @return the c3
	 */
	public float getC3() {
		return c3;
	}
	/**
	 * @param c3 the c3 to set
	 */
	public void setC3(float c3) {
		this.c3 = c3;
	}
	
	/**
	 * @return the apono
	 */
	public String getApono() {
		return apono;
	}
	/**
	 * @param apono the apono to set
	 */
	public void setApono(String apono) {
		this.apono = apono;
	}
	/**public void promedioEst(float nF) {
		this.notaFinal = 
	}**/
	
	
	
	
}