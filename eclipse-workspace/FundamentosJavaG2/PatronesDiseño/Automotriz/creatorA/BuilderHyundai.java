package creatorA;

public class BuilderHyundai extends IBuilderAuto{

	public BuilderHyundai() {
		super.auto = new Auto();
		this.factory = new Hyundai();
	}

	@Override
	public void makeMarca(String marca) {
		auto.marca = factory.createMarca(marca);
	}

	@Override
	public void makeModelo() {
		auto.modelo = factory.createModelo();
	}

	@Override
	public void makeMotor() {
		auto.motor = factory.createMotor();
	}

	@Override
	public void makeTransmision() {
		auto.transmision = factory.createTransmision();
	}

	@Override
	public void makeRines() {
		auto.rines = factory.createRines();
	}
	
}
