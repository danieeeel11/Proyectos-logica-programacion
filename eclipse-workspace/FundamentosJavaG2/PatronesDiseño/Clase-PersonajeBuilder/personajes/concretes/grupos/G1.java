package personajes.concretes.grupos;

import personajes.abstracts.AbstractFactory;
import personajes.abstracts.Cabeza;
import personajes.abstracts.Cuerpo;
import personajes.abstracts.Pies;
import personajes.concretes.partes.cabeza.CabezaG1;
import personajes.concretes.partes.cuerpo.CuerpoG1;
import personajes.concretes.partes.pies.PiesG1;

public class G1 extends AbstractFactory {
	
	

	@Override
	public String crearCabeza() {
		Cabeza c=new CabezaG1();
		return c.selectCabeza(getNombre());
		
	}

	@Override
	public void crearCuerpo() {
		Cuerpo c =new CuerpoG1(getNombre());
		c.selectCuerpo();
	}

	@Override
	public void crearPies() {
		Pies p=new PiesG1();
		p.selectPies();
	}

}
