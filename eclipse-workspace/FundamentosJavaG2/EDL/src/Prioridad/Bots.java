package Prioridad;

public class Bots {
	private int codigo;
	private int tipo;
	private int porVida;
	
	public Bots(int codigo, int tipo, int porVida) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.porVida = porVida;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getPorVida() {
		return porVida;
	}
	public void setPorVida(int porVida) {
		this.porVida = porVida;
	}
	
	@Override
	public String toString() {
		return "Bots [codigo=" + codigo + ", tipo=" + tipo + ", porVida=" + porVida + "]";
	}
	
	

}
