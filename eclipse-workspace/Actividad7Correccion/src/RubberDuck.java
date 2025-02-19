
public class RubberDuck extends Duck implements Quackable{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack, quack, quack");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Soy un Rubber Duck");
		quack();
	}
	

}
