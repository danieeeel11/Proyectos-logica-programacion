package Genericidad;
/**
 * Clase de tipo Object que contiene los metodos get
 * y set
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 09-02-2021
 */
public class ClaseObject {
	private Object obj;
	
	public ClaseObject() {
		this.obj = null;
	}
	
	public ClaseObject(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}
