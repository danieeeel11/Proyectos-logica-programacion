package Ej1;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase principal que contiene el metodo main, que ingresa quince clientes de clase persona, para luego realizar las debidas operaciones con el listado de clientes
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 1
 * @since 25-03-2021
 */
public class MainSupermarket {

	public static void main(String[] args) {
		//Generar quince clientes, con nombres, edades e identificaciones
		List<Persona> listaClientes = new ArrayList<>();
		listaClientes.add(new Persona("Daniel", 18, 123456));
		listaClientes.add(new Persona("Sofia", 14, 234561));
		listaClientes.add(new Persona("Felipe", 20, 345612));
		listaClientes.add(new Persona("Juan", 16, 456123));
		listaClientes.add(new Persona("Sara", 22, 561234));
		listaClientes.add(new Persona("Catalina", 19, 612345));
		listaClientes.add(new Persona("Camilo", 11, 987654));
		listaClientes.add(new Persona("Daniela", 12, 876549));
		listaClientes.add(new Persona("Emilio", 13, 765498));
		listaClientes.add(new Persona("Esteban", 17, 654987));
		listaClientes.add(new Persona("Estefany", 15, 549876));
		listaClientes.add(new Persona("Alejandro", 20, 498765));
		listaClientes.add(new Persona("Carlos", 23, 192837));
		listaClientes.add(new Persona("Ana", 11, 283746));
		listaClientes.add(new Persona("Duvan", 24, 3746183));
		//Filtrar el listado de clientes en mayores de edad, ordenandolos por nombre
		System.out.println("Clientes mayores de edad, obteniendo su nombre");
		listaClientes.stream().sorted((p1,p2)->p1.getNombre().compareTo(p2.getNombre())).filter(p->p.getEdad()>=18).map(p->p.getNombre()).forEach(System.out::println);
		//Conteo de las personas mayores y menores de edad
		long cantidadMayoresEdad = listaClientes.stream().filter(p->p.getEdad()>=18).map(p->p.getNombre()).count();
		long cantidadMenoresEdad = listaClientes.stream().filter(p->p.getEdad()<18).map(p->p.getNombre()).count();
		System.out.println();
		System.out.println("Clientes mayores de edad en el dia: " + cantidadMayoresEdad);
		System.out.println("Clientes menores de edad en el dia: " + cantidadMenoresEdad);
		System.out.println();
		//Ordenar el listado de personas de menores a mayores de edad, y usar el limit para obtner los cinco cn menor edad
		System.out.println("Nombre de los cinco clientes con menor edad");
		listaClientes.stream().sorted((p1,p2)->Integer.compare(p1.getEdad(), p2.getEdad())).limit(5).map(p->p.getNombre()).forEach(System.out::println);
		
	}

}
