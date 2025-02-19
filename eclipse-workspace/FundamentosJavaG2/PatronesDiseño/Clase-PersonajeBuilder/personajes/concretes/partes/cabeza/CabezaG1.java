package personajes.concretes.partes.cabeza;

import java.util.Random;

import personajes.CopiadorArchivos;
import personajes.abstracts.Cabeza;

public class CabezaG1 implements Cabeza{

	@Override
	public String selectCabeza(String n) {
		// TODO Auto-generated method stub
		String nnn="/Imagenes/Cabezas/familia1/";
		Random r=new Random();
		int i=r.nextInt(2);
		i++;
		
		CopiadorArchivos.getInstance().copia(nnn+i+".jpg", n+"/cabeza.jpg");
		return nnn+i+".jpg";
	}

}
