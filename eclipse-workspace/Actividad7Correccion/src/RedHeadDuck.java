
public class RedHeadDuck extends Duck implements Flyable,Quackable{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack, quack");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Y vuelo bajo");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Souy un ReadHead Duck");
		quack();
		fly();
	}
	

}
