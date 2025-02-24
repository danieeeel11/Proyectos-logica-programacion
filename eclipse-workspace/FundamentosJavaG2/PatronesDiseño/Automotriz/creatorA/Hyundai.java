package creatorA;

public class Hyundai extends AbstractFactory{
	public String marca;
	
	@Override
	public String createMarca(String marca) {
		this.marca = marca;
		return marca;
	}

	@Override
	public String createModelo() {
		buildModelo bMod = new buildModelo();
		System.out.println("�Que modelo de " + marca + " desea?");
		for (int i = 0; i < bMod.modelosHyundai.size(); i++) {
			System.out.print("  " + (i+1) + ". " + bMod.modelosHyundai.get(i) + "\n");
		}
		int number = sc.nextInt();
		while(number>bMod.modelosHyundai.size()) {
			System.out.println("Digite una opcion de modelo valida");
			number = sc.nextInt();
		}
		String modelo = bMod.modelosHyundai.get((number-1));
		return modelo;
	}

	@Override
	public String createMotor() {
		buildMotor bMot = new buildMotor();
		int number = r.nextInt((4-1)+1)+1;
		String motor = bMot.motores.get((number-1));
		return motor;
	}

	@Override
	public String createTransmision() {
		buildTransmision bTra = new buildTransmision();
		int number = r.nextInt((2-1)+1)+1;
		String transmision = bTra.transmisiones.get((number-1));
		return transmision;
	}

	@Override
	public String createRines() {
		buildRines bRin = new buildRines();
		int number = r.nextInt((4-1)+1)+1;
		String rines = bRin.rines.get((number-1));
		return rines;
	}
	
}
