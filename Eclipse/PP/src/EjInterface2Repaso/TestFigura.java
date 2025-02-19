package EjInterface2Repaso;

public class TestFigura {
	private Circunferencia unaCircunferencia;
	private Rectangulo unRectangulo;
	
	public TestFigura() {
		this.unaCircunferencia = new Circunferencia();
		this.unRectangulo = new Rectangulo();
	}
	
	private void procesarInfo() {
		double radio = 3;
		unaCircunferencia.setRadio(radio);
		System.out.println("Perimetro: " + unaCircunferencia.calcularPerimetro());
		System.out.println("Diametro: " + unaCircunferencia.calcularDiametro());
		System.out.println("Area: " + unaCircunferencia.calcularArea());
		
		IFigura cuadrado = new IFigura() {
			double lado = 5;
			@Override
			public double calcularPerimetro() {
				// TODO Auto-generated method stub
				return 4*lado;
			}
			
			@Override
			public double calcularArea() {
				// TODO Auto-generated method stub
				return lado*lado;
			}
		};
	}

	public static void main(String[] args) {
		TestFigura pf = new TestFigura();
		pf.procesarInfo();

	}

}
