package CompositeBurger;

public abstract class Component {
	public int price;
	
	public Component(int price) {
		this.price = price;
	}
	
	public abstract int execute();
}
