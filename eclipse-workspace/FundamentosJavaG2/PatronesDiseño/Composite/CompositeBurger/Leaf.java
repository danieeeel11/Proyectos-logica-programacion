package CompositeBurger;

public class Leaf extends Component{
	public Leaf(int price) {
		super(price);
	}

	@Override
	public int execute() {
		return price;
	}
	
	
}
