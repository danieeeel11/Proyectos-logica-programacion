package Genericidad;

public class TestClaseObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseObject1 ob = new ClaseObject1(5);
		
		String nombre = "Juan";
		ob.add(nombre);
		String name = (String)ob.get(0);
		System.out.println("Imprimir cadena " + name);
		System.out.println(" " + ob.getClass());
		
		Integer numero = 12;
		ob.add(numero);
		int n = (Integer)ob.get(1);
		System.out.println("Imprimir objeto Integer " + n);
		
		Double valor = 150.00;
		ob.add(valor);
		double d = (Double)ob.get(2);
		System.out.println("Imprimir objeto Double " + d);
		
		Character letra = 'S';
		ob.add(letra);
		char c = (Character)ob.get(3);
		System.out.println("Imprimir objeto Character " + c);
		
		Boolean estado = true;
		ob.add(estado);
		boolean b = (Boolean)ob.get(4);
		System.out.println("Imprimir objeto Boolean " + b);
	}

}
