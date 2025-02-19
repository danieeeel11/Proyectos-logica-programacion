
public class AppEstanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck[] estanque = new Duck[4];
		
		estanque[0] = new MallardDuck();
		estanque[1] = new RedHeadDuck();
		estanque[2] = new RubberDuck();
		estanque[3] = new DecoyDuck();
		
		for(Duck duck : estanque) {
			duck.display();
			duck.swim();
		}

	}

}
