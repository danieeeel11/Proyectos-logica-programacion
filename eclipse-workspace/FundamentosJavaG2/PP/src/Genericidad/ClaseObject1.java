package Genericidad;

public class ClaseObject1 {
	private Object[] arrayList;
	private int i;
	
	public ClaseObject1(int z) {
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
