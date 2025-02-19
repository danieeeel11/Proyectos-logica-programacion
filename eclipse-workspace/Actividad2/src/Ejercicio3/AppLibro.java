package Ejercicio3;

import java.util.Scanner;

public class AppLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leerDato =new Scanner(System.in);
	
		System.out.println("Libro 1");
		System.out.println("");
		System.out.println("Digite el nombre del autor - ");
		String nombre = leerDato.next();
		System.out.println("Digite la nacionalidad del autor - ");
		String nacionalidad = leerDato.next();
		Autor autor1 =new Autor(nombre, nacionalidad);
		
		System.out.println("Digitar titulo del libro - ");
		String titulo = leerDato.next();
		System.out.println("Digite el ISBN - ");
		int isbn = leerDato.nextInt();
		System.out.println("Digite la edicion - ");
		int edicion = leerDato.nextInt();
		System.out.println("Digite el numero de paginas - ");
		int paginas = leerDato.nextInt();
		Libro libro1 =new Libro(titulo, isbn, nombre, edicion, paginas,autor1);
		
		System.out.println("El libro " +libro1.getTitulo()+ " con ISBN " +libro1.getIsbn()+ " del Autor " +libro1.getAutor().getNombreAutor()+ " edicion " +libro1.getEdicion()+ " tiene " +libro1.getPaginas()+ " paginas");
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Libro 2");
		System.out.println(" ");
		System.out.println("Digite el nombre del autor - ");
		String nombre2 = leerDato.next();
		System.out.println("Digite la nacionalidad del autor - ");
		String nacionalidad2 = leerDato.next();
		Autor autor2 =new Autor(nombre2, nacionalidad2);
		
		System.out.println("Digitar titulo del libro - ");
		String titulo2 = leerDato.next();
		System.out.println("Digite el ISBN - ");
		int isbn2 = leerDato.nextInt();
		System.out.println("Digite la edicion - ");
		int edicion2 = leerDato.nextInt();
		System.out.println("Digite el numero de paginas - ");
		int paginas2 = leerDato.nextInt();
		Libro libro2 =new Libro(titulo2, isbn2, nombre2, edicion2, paginas2,autor2);
		
		System.out.println("El libro " +libro2.getTitulo()+ " con ISBN " +libro2.getIsbn()+ " del Autor " +libro2.getAutor().getNombreAutor()+ " edicion " +libro2.getEdicion()+ " tiene " +libro2.getPaginas()+ " paginas");
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Libro 3");
		System.out.println(" ");
		System.out.println("Digite el nombre del autor - ");
		String nombre3 = leerDato.next();
		System.out.println("Digite la nacionalidad del autor - ");
		String nacionalidad3 = leerDato.next();
		Autor autor3 =new Autor(nombre3, nacionalidad3);
		
		System.out.println("Digitar titulo del libro - ");
		String titulo3 = leerDato.next();
		System.out.println("Digite el ISBN - ");
		int isbn3 = leerDato.nextInt();
		System.out.println("Digite la edicion - ");
		int edicion3 = leerDato.nextInt();
		System.out.println("Digite el numero de paginas - ");
		int paginas3 = leerDato.nextInt();
		Libro libro3 =new Libro(titulo3, isbn3, nombre3, edicion3, paginas3,autor3);
		
		System.out.println("El libro " +libro3.getTitulo()+ " con ISBN " +libro3.getIsbn()+ " del Autor " +libro3.getAutor().getNombreAutor()+ " edicion " +libro3.getEdicion()+ " tiene " +libro3.getPaginas()+ " paginas");
		
		
		System.out.println(" ");
		System.out.println(" ");
		if (libro1.getPaginas()>libro2.getPaginas()) {
			if(libro1.getPaginas()>libro3.getPaginas()) {
				System.out.println("El libro con mas paginas es el libro " +libro1.getTitulo()+ " con " +libro1.getPaginas()+ " paginas");
			} else {
				System.out.println("El libro con mas paginas es el libro " +libro3.getTitulo()+ " con " +libro3.getPaginas()+ " paginas ");
			}
		} else if (libro2.getPaginas()>libro3.getPaginas()) {
			System.out.println("El libro con mas paginas es el libro " +libro2.getTitulo()+ " con " +libro2.getPaginas()+ " paginas");
		} else {
			System.out.println("El libro con mas paginas es el libro " +libro3.getTitulo()+ " con " +libro3.getPaginas()+ " paginas");
		}
	}

}
