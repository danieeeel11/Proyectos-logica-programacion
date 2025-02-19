package modeloLA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */

public class Grafo {
	private ArrayList<Nodo> arreglo = new ArrayList<>();
	private ArrayList<Integer> vertices = new ArrayList<>();
	Scanner leer = new Scanner(System.in);
	public Grafo() {
	}
	
	public void declarar(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el valor del nodo");
			int nodo = leer.nextInt();
			vertices.add(nodo);
		}
	}
	
	public void agregar(int i, int dato, int peso) {
		boolean find = false;
		while(!find) {
			if(vertices.stream().filter(p->p.equals(i)).findAny().isPresent()) {
				if(vertices.stream().filter(p->p.equals(dato)).findAny().isPresent()) {
					Nodo sig = new Nodo(dato,null,0);
					Nodo add = new Nodo(i,sig,peso);
					if(arreglo!=null) {
						if(!arreglo.stream().filter(p->p.equals(add)).findAny().isPresent()) {
							arreglo.add(add);
							find = true;
						}else {
							System.out.println("El camino ya ha sido establecido");
						}
					}else {
						arreglo.add(add);
						find = true;
					}
				}else {
					System.out.println("El nodo al que va no esta disponible");
				}
			}else {
				System.out.println("El nodo no existe");
			}
		}
	}
	
	public void caminos() {
		boolean cumplido = false;
		while(!cumplido) {
			System.out.println("Digite las conexiones");
			int i = leer.nextInt();
			int dato = leer.nextInt();
			System.out.print("Digite el peso de la conexion: ");
			int peso = leer.nextInt();
			agregar(i,dato,peso);
			System.out.println("¿Desea seguir adicionando caminos?\nY(yes) N(no)");
			String yn = leer.next();
			if(yn.equals("N")) {
				cumplido = true;
			}
		}
	}
	
	public void listar() {
		ArrayList<String> resultado = new ArrayList<>();
		vertices.stream().sorted();
		for (int i = 0; i < vertices.size(); i++) {
			int vertice = vertices.get(i);
			List<Nodo> nodos = arreglo.stream().filter(p->p.getVertice()==vertice).collect(Collectors.toList());
			String level = String.valueOf(vertice)+" ";
			for (int j = 0; j < nodos.size(); j++) {
				int v = nodos.get(j).getSiguiente().getVertice();
				int peso = nodos.get(j).getPeso();
				level += v + "[" + peso + "]" + " ";
			}
			resultado.add(level);
		}
		System.out.println();
		System.out.println("LISTA ADYACENCIA");
		resultado.stream().forEach(System.out::println);
	}
	
}
