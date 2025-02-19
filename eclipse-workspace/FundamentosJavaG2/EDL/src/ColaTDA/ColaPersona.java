package ColaTDA;

public class ColaPersona {

	public static void main(String[] args) {
		TdaCola<Persona> colaPago = new TdaCola<>();
		TdaCola<Persona> colaTarjeta= new TdaCola<>();
		
		colaPago.encolar(new Persona(1020,"Juanita","T"));
		colaPago.encolar(new Persona(1040,"Pachita","E"));
		colaPago.encolar(new Persona(1050,"Albita","T"));
		colaPago.encolar(new Persona(10820,"Pedrito","E"));
		colaPago.encolar(new Persona(10220,"Orlando","E"));
		colaPago.encolar(new Persona(100020,"Carlos","T"));
		
		for (int i = colaPago.tamanio(); i >0; i--) {
			System.out.println(colaPago.tope());
			colaPago.decolar();
		}
		System.out.println();
		for (int i = 0; i < colaPago.tamanio(); i++) {
			if(colaPago.tope().getTipo().equals("T")) {
				colaTarjeta.encolar(colaPago.decolar());
			}else {
				colaPago.encolar(colaPago.decolar());
			}
		}
		

	}

}
