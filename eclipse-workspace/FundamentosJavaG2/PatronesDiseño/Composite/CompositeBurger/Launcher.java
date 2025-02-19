package CompositeBurger;

public class Launcher {

	public static void main(String[] args) {
		Composite hamburguesa = new Composite();
		Leaf tomate = new Leaf(200);
		Leaf carne = new Leaf(200);
		Leaf pan = new Leaf(200);
		
		Composite salsas = new Composite();
		Leaf salsaTomate = new Leaf(10);
		Leaf salsaMayonesa = new Leaf(10);
		//Leaf salsaMostaza = new Leaf(10);
		
		salsas.hijos.add(salsaMayonesa);
		salsas.hijos.add(salsaTomate);
		
		hamburguesa.hijos.add(tomate);
		hamburguesa.hijos.add(carne);
		hamburguesa.hijos.add(pan);
		hamburguesa.hijos.add(salsas);
		
		System.out.println("El precio de la hamburguesa es : " + hamburguesa.execute());
	}

}
