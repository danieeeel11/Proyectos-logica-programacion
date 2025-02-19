package prueba;

import java.io.FileWriter;
import java.io.PrintWriter;

public class creacionHTML {

	public static void main(String[] args) {
		creacionHTML h =new creacionHTML();
		h.resultadosAutomovil("Chevrolet", "Camaro");

	}

	public void resultadosAutomovil(String marca, String modelo) {
		//"./Automotriz/img"+ marca +"/logo.png"
		
		// codigo para cargar las imagenes con una pequeña descripcion, se podria crear un String como este 
		// para cada modelo, motor, etc y que llame las cosas y ya.
		
		//String directorio = System.getProperty("user.home");
		
		//String directorio = System.getProperty("user.dir")+ "\\Automotriz\\img" + marca + "\\logo.png";
		String directorio = System.getProperty("user.dir")+ "\\Automotriz\\img" + marca + "\\" + modelo +".jpg";
		System.out.println(directorio);
		
		//C:\Users\User\Documents\University Sergio Arboleda\Semester VI\Software Design Patterns\Corte 1\Automotriz\img\imgEc\imgChevrolet\Tracker.jpg
		//String modelo = "<img src= " + (char)34 + "C:\\Users\\User\\Documents\\University Sergio Arboleda\\Semester VI\\Software Design Patterns\\Corte 1\\Automotriz\\img\\imgEc\\imgChevrolet\\Tracker.jpg" +(char)34 
		//	    + " width=" + (char)34 + "300" + (char)34 +  " heigh=" + (char)34 + "150" + (char)34 +"/>" 
		//	    + (char)34 + "camioneta mia y solo mia" + (char)34 + "<br>";
		String cuerpo = "<img src= " + (char)34 + directorio +(char)34 
			    + " width=" + (char)34 + "300" + (char)34 +  " heigh=" + (char)34 + "150" + (char)34 +"/>" 
			    + (char)34 + "camioneta mia y solo mia" + (char)34 + "<br>";
		
		String k = "<html>"
				+"<body>"
				+ "<h1>Construccion Automoviles</h1>"
				+ "<br>" + cuerpo
				+ "<br>" + cuerpo
				+ "<br>" + cuerpo
				+ "</body>"
				+ "</html>";
		
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			//C:\Users\User
			String dirSave = System.getProperty("user.home") + "\\Downloads\\";
			fichero =new FileWriter(dirSave + "prueba.html");
			//fichero =new FileWriter("D:\\Perfil\\Desktop\\imagenesAutos\\prueba.html");
			pw =new PrintWriter(fichero);
			
			pw.println(k);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (null != fichero) {
					fichero.close();
				} 
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
		

}
