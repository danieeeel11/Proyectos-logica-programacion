package EmpresaRepartos;

public class Domiciliario {
	private int id;
	private String nombre;
	private String fechaNac;
	private String nacionalidad;
	private int nDomicilioP;
	private int valorDeven;
	private int salario;
	//private int nD;
	//static int nDo;  
	static final int precio =10000;
	
	public Domiciliario(int id, String nombre, String fechaNac, String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
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
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getnDomicilioP() {
		return nDomicilioP;
	}
	/*public void setnDomicilioP() {
		this.nDomicilioP = nDomicilioP;
	}*/
	/*public void setnDomicilioP(int nDomicilioP) {
		this.nDomicilioP = nDomicilioP;
	}*/
	
	
	
	public void setnDomicilioP(boolean estado, int n) {
		//this.nDomicilioP = nDomicilioP+1;
		if(estado) {
			this.nDomicilioP =n;
			//this.nDomicilioP += 1;
		}else {
			//int n = getnDomicilioP();
			this.nDomicilioP = n;
		}
		//this.nDomicilioP = nDomicilioP;
	}

	public int getValorDeven() {
		return valorDeven;
	}
	/*public void setValorDeven(boolean estado) {
		//this.valorDeven = nDomicilioP*precio;
		if(estado) {
			valorDeven=nD*precio;
			//this.valorDeven = valorDeven;
			//this.valorDeven = nDomicilioP*precio;
		}else {
			this.valorDeven = valorDeven;
		}
		//this.valorDeven = nDomicilioP;
	}*/
	public void setValorDeven(boolean estado, int nv) {
		//this.valorDeven = nDomicilioP*precio;
		if(estado) {
			valorDeven=nv*precio;
			//this.valorDeven = valorDeven;
			//this.valorDeven = nDomicilioP*precio;
		}else {
			valorDeven=nv*precio;
			//this.valorDeven = valorDeven;
		}
		//this.valorDeven = nDomicilioP;
	}
	/*public void setValorDevenn() {
		this.valorDeven = nDomicilioP;
	}*/
	/*public void setValorDeven(int valorDeven) {
		this.valorDeven = valorDeven;
	}*/
	public int getSalario() {
		return salario;
	}

	public void setSalario(int valorDeven, int semana) {
		this.salario = valorDeven-(40000*semana);
	}
	
	public static int getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "[id:" + id + ", nombre:" + nombre + ", fechaNac:" + fechaNac + ", nacionalidad:"
				+ nacionalidad + ", nDomicilioP:" + nDomicilioP + ", valorDeven:" + valorDeven + ", salario:" + salario
				+ "]";
	}

	

	

	
}
