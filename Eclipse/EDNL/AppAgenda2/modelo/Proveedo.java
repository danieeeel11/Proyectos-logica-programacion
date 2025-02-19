package modelo;

public class Proveedo {
	private String id;
	private String nombre;
	private String apellido;
	private String correoOrg;
	private String correoPer;
	private String nCelular;
	
	public Proveedo(String id, String nombre, String apellido, String correoPer, String correoOrg, String nCelular) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoPer = correoPer;
		this.correoOrg = correoOrg;
		this.nCelular = nCelular;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreoOrg() {
		return correoOrg;
	}
	public void setCorreoOrg(String correoOrg) {
		this.correoOrg = correoOrg;
	}
	public String getCorreoPer() {
		return correoPer;
	}
	public void setCorreoPer(String correoPer) {
		this.correoPer = correoPer;
	}
	public String getnCelular() {
		return nCelular;
	}
	public void setnCelular(String nCelular) {
		this.nCelular = nCelular;
	}
	@Override
	public String toString() {
		return "Id: " + id + 
				" \nNombre: " + nombre + 
				" \nApellido: " + apellido + 
				" \nCorreo Personal: " + correoPer + 
				" \nCorreo Organizacion: " + correoOrg + 
				" \nNumero de celular: " + nCelular + 
				"\n";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 :
		id.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proveedor other = (Proveedor) obj;
		if (id == null) {
			if (other.getId() != null)
					return false;
		} else if (!id.equals(other.getId()))
			return false;
		return true;
	}

	
}
