
public class MallardDuck extends Duck implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Soy un Mallard Duck");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Y vuelo muy alto");
		fly();
	}
	

}
