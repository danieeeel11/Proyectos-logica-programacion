package Prioridad;

public class ArrayEj1 implements Comparable<ArrayEj1>{
	private int  num;
	public ArrayEj1(int  num) {
		super();
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "[num=" + num + "]";
	}
	//@Override
	public int compareTo(ArrayEj1 o) {
		if(this.num<o.getNum()) {
			return 1;
		}else if(this.num>o.getNum()) {
			return -1;
		}else {
			return 0;
		}
	}
	

}
