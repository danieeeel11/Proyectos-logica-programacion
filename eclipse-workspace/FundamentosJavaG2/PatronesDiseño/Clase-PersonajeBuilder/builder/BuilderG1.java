package builder;

import java.util.Random;

import personajes.concretes.grupos.G1;

public class BuilderG1 extends IBuilder{
	
	public BuilderG1(String nombre) {
		super(nombre);
		this.fact=new G1();
		this.fact.setNombre(nombre);
	}

	@Override
	public void makeCabeza() {
		
//		String nnn="/Imagenes/Cabezas/familia1/";
//		Random r=new Random();
//		int i=r.nextInt(2);
//		i++;
//		p.cabeza=nnn+p.nombre+"/cabeza.jpg";
		String k=this.fact.crearCabeza();
		p.cabeza=k;
	}

	@Override
	public void makeCuerpo() {
		String nnn="/Imagenes/Cuerpos/familia1/";
		Random r=new Random();
		int i=r.nextInt(2);
		i++;
		p.cuerpo=nnn+p.nombre+"/cuerpito.jpg";
		
	}

	@Override
	public void makePiernas() {
		String nnn="/Imagenes/Piernas/familia1/";
		Random r=new Random();
		int i=r.nextInt(2);
		i++;
		p.piernas=nnn+p.nombre+"/piernas.jpg";
		
	}

}
