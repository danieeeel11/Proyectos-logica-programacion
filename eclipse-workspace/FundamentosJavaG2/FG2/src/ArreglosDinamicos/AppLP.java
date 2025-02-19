package ArreglosDinamicos;

public class AppLP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaPersona LP =new listaPersona();
		
		
		LP.agregarPersona(new Persona(100, "Juanita"));
		LP.agregarPersona(new Persona(101, "Alba"));
		LP.agregarPersona(new Persona(102, "Pedro"));
		
		LP.mostrarLista();
		
		LP.agregarPersona(new Persona(103, "Pachito"));
		LP.mostrarLista();
		
		//LP.buscarPersona(101);
		Persona p = LP.buscarPersona(101);
		if(p!=null) {
			System.out.println(p);
		}else {
			System.out.println("Persona buscada no existe");
		}
		
		LP.borrar(LP.obtenerIndex(p));
		LP.borrarPersona(p);
		LP.mostrarLista();
	}

}