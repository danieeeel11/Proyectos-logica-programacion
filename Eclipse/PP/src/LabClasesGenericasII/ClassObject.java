package LabClasesGenericasII;
/**
 * Clase de tipo Object que contiene los metodos get
 * y add
 * @author Daniel Felipe Velásquez Rincón
 * @version 1
 * @date 11-02-2021
 */
public class ClassObject {
	private Object[] arrayList;
	private int i;
	
	public ClassObject(int z) {
		this.arrayList = new Object[z];
		this.i = 0;
	}
	
	public Object get(int i) {
		return arrayList[i];
	}
	
	public void add(Object obj) {
		this.arrayList[i] = obj;
		i++;
	}
}
