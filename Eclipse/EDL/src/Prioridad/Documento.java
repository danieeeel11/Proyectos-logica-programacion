package Prioridad;

public class Documento implements Comparable<Documento>{
	private int nHojas;
	private int prioridad;

	public Documento(int nHojas, int prioridad) {
		super();
		this.prioridad = prioridad;
		this.nHojas = nHojas;
	}
	

	public int getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}


	public int getnHojas() {
		return nHojas;
	}

	public void setnHojas(int nHojas) {
		this.nHojas = nHojas;
	}

	@Override
	public String toString() {
		return "Documento [nHojas=" + nHojas + ", prioridad=" + prioridad + "]";
	}

	@Override
	public int compareTo(Documento o) {
		/*if(this.nHojas>o.getnHojas()) {
			return 1;
		}else if(this.nHojas<o.getnHojas()) {
			return -1;
		}else {
			return 0;
		}*/
		if(this.prioridad>o.getPrioridad()) {
			return 1;
		}else if(this.prioridad<o.getPrioridad()) {
			return -1;
		}else {
			return 0;
		}
	}
}
