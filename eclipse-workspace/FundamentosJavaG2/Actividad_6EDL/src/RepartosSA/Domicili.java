package RepartosSA;
/**
 * Clase Domicili que contiene los atributos del domiciliario
 * @author Laura Ojeda & Daniel Velasquez
 * @date 30-05-2021
 */
public class Domicili {
	private int id;
	private String nombre;
	private String fechaNac;
	private String nacionalidad;
	private String upz;
	private int nDomicilioP;
	private int nDomicilioN;
	private int valorDeven;
	private int valorDes;
	private int salario;
	static final int precio =10000;
	
	/**
	 * Constructor de la clase Domilici (Domiciliario)
	 * @param id
	 * @param nombre
	 * @param fechaNac
	 * @param nacionalidad
	 * @param upz
	 */
	public Domicili(int id, String nombre, String fechaNac, String nacionalidad, String upz) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.upz = upz;
	}
	
	/**
	 * Método get de la Id del domiciliario
	 * @return Id del domiciliario
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método set de la Id del domiciliario
	 * @param id del dimiciliario
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Método get del Nombre del domiciliario
	 * @return Nombre del domiciliario
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set del nombre del domiciliario
	 * @param nombre del domiciliario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método get de la fecha de nacimiento del domiciliario
	 * @return la fecha del nacimiento del domiciliario
	 */
	public String getFechaNac() {
		return fechaNac;
	}
	/**
	 * Método set de la fecha de nacimiento del domiciliario
	 * @param fechaNac del domiciliario
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * Método get de la nacionalidad del domiciliario
	 * @return la nacionalidad del domiciliario
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * Método set de la nacionalidad del domiciliario
	 * @param nacionalidad del domiciliario
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * Método get de la Upz del domiciliario
	 * @return Upz del domiciliario
	 */
	public String getUpz() {
		return upz;
	}
	/**
	 * Método set de la Upz del domiciliario
	 * @param upz del domiciliario
	 */
	public void setUpz(String upz) {
		this.upz = upz;
	}
	/**
	 * Método get del número de domicilios entregados
	 * @return el número del domicilios entregados
	 */
	public int getnDomicilioP() {
		return nDomicilioP;
	}
	/**
	 * Método set del número de domicilios entregados
	 * @param estado true o false
	 * @param n número 
	 */
	public void setnDomicilioP(boolean estado, int n) {
		if(estado) {
			this.nDomicilioP =n;
		}else {
			this.nDomicilioP = n;
		}
	}
	/**
	 * Método get del número de domicilios no entregados
	 * @return el número de domicilios no entregados
	 */
	public int getnDomicilioN() {
		return nDomicilioN;
	}
	/**
	 * Método set del número de domicilios no entregados
	 * @param estado true o false
	 * @param n número
	 */
	public void setnDomicilioN(boolean estado, int n) {
		if(!estado) {
			this.nDomicilioN =n;
		}else {
			this.nDomicilioN = n;
		}
	}
	/**
	 * Método get del valor devengado del domiciliario
	 * @return valor devengado del domiciliario
	 */
	public int getValorDeven() {
		return valorDeven;
	}
	/**
	 * Método set del Valor Devengado del domiciliario
	 * @param estado true o false
	 * @param nv número de domicilios entregados
	 */
	public void setValorDeven(boolean estado, int nv) {
		if(estado) {
			valorDeven=nv*precio;
		}else {
			valorDeven=nv*precio;
		}
	}
	/**
	 * Método get del valor descontado debido a los domicilios no entregados
	 * @return valor descontado
	 */
	public int getValorDes() {
		return valorDes;
	}
	/**
	 * Método set del Valor descontado
	 * @param nvn número de los domicilios no entregados
	 */
	public void setValorDes(int nvn) {
		this.valorDes = nvn*1000;
	}
	/**
	 * Método get del salario del domiciliario
	 * @return el salario del domiciliario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * Método set del salario del domiciliario
	 * @param valorDeven valor devengado
	 * @param valorDes valor descontado
	 * @param semana número de semanas en la que esta inscrito el domiciliario
	 */
	public void setSalario(int valorDeven, int valorDes, int semana) {
		this.salario = valorDeven-valorDes-(40000*semana);
	}
	/**
	 * Método get del precio de cada domicilio entregado 
	 * @return el precio estandar de cada domicilio entregado 
	 */
	public static int getPrecio() {
		return precio;
	}
	
	/**
	 * Método toString de la clase 
	 */
	@Override
	public String toString() {
		return "[Id=" + id + ", UPZ=" + upz + ", Nombre=" + nombre + ", Fecha Nacimiento=" + fechaNac + ", Nacionalidad="
				+ nacionalidad +", N° domicilios=" + nDomicilioP + ", N° domicilios no entregados: " + nDomicilioN + "]";
	}
}
