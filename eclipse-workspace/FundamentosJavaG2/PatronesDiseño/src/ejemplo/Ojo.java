package ejemplo;

public class Ojo {

	public String color;
	public String size;
	public Ojo(String color, String size) {
		this.color=color;
		this.size=size;
	}
	
	
	public void ver() {
		System.out.println("Te estoy mirando con mis ojitos "+ size+" color: "+color);
	}
}
