package Ejercicio1;
/**
 * Clase Diagnostico donde se implementan las instancias nEmbarazo, conGluc, presionArterial, pliegueCut
 * insulinaSeric, masaCorp, pedigriDiab, edad
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 13-05-2021
 */
public class Diagnostico {
	private int nEmbarazo;
	private int conGluc;
	private int presionArterial;
	private int pliegueCut;
	private int insulinaSeric;
	private float masaCorp;
	private float pedrigriDiab;
	private int edad;
	//private int clase;
	private String clase;
	/*
	 * Constructor de la clase
	 */
	public Diagnostico(int nEmbarazo, int conGluc, int presionArterial, int pliegueCut, int insulinaSeric,
			float masaCorp, float pedrigriDiab, int edad, String clase) {
		super();
		this.nEmbarazo = nEmbarazo;
		this.conGluc = conGluc;
		this.presionArterial = presionArterial;
		this.pliegueCut = pliegueCut;
		this.insulinaSeric = insulinaSeric;
		this.masaCorp = masaCorp;
		this.pedrigriDiab = pedrigriDiab;
		this.edad = edad;
		this.clase = clase;
	}

	public int getnEmbarazo() {
		return nEmbarazo;
	}
	public void setnEmbarazo(int nEmbarazo) {
		this.nEmbarazo = nEmbarazo;
	}
	public int getConGluc() {
		return conGluc;
	}
	public void setConGluc(int conGluc) {
		this.conGluc = conGluc;
	}
	public int getPresionArterial() {
		return presionArterial;
	}
	public void setPresionArterial(int presionArterial) {
		this.presionArterial = presionArterial;
	}
	public int getPliegueCut() {
		return pliegueCut;
	}
	public void setPliegueCut(int pliegueCut) {
		this.pliegueCut = pliegueCut;
	}
	public int getInsulinaSeric() {
		return insulinaSeric;
	}
	public void setInsulinaSeric(int insulinaSeric) {
		this.insulinaSeric = insulinaSeric;
	}
	public float getMasaCorp() {
		return masaCorp;
	}
	public void setMasaCorp(float masaCorp) {
		this.masaCorp = masaCorp;
	}
	public float getPedrigriDiab() {
		return pedrigriDiab;
	}
	public void setPedrigriDiab(float pedrigriDiab) {
		this.pedrigriDiab = pedrigriDiab;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		/*if(clase.equals("tested_positive")) {
			this.clase = "1";
		}else {
			this.clase = "0";
		}*/
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "nEmbarazo:" + nEmbarazo + "|conGluc:" + conGluc + "|preArterial:" + presionArterial
				+ "|pliegueCut:" + pliegueCut + "|insulina:" + insulinaSeric + "|masaCorp:" + masaCorp
				+ "|pedrigri:" + pedrigriDiab + "|edad:" + edad + "|clase:" + clase;
	}

	
	
	
}

