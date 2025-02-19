package CompositeBurger;

import java.util.ArrayList;

public class Composite extends Component{

	public Composite(int price) {
		super(price);
	}
	public Composite() {
		super(0);
	}
	
	public ArrayList<Component> hijos = new ArrayList<>();

	@Override
	public int execute() {
		price = 0;
		for (int i = 0; i < hijos.size(); i++) {
			price = price + hijos.get(i).execute();
		}
		return price;
	}
	
}
