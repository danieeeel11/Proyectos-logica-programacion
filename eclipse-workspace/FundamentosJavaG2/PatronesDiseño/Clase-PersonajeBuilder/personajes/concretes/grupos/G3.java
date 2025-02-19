package personajes.concretes.grupos;

import personajes.abstracts.AbstractFactory;
import personajes.abstracts.Cabeza;
import personajes.abstracts.Cuerpo;
import personajes.abstracts.Pies;
import personajes.concretes.partes.cabeza.CabezaG1;
import personajes.concretes.partes.cabeza.CabezaG2;
import personajes.concretes.partes.cabeza.CabezaG3;
import personajes.concretes.partes.cuerpo.CuerpoG1;
import personajes.concretes.partes.cuerpo.CuerpoG2;
import personajes.concretes.partes.cuerpo.CuerpoG3;
import personajes.concretes.partes.pies.PiesG1;
import personajes.concretes.partes.pies.PiesG2;
import personajes.concretes.partes.pies.PiesG3;

public class G3 extends AbstractFactory {

	@Override
	public String  crearCabeza() {
		Cabeza c=new CabezaG3();
		return c.selectCabeza(getNombre());
		
	}

	@Override
	public void crearCuerpo() {
		Cuerpo c =new CuerpoG3(getNombre());
		c.selectCuerpo();
	}

	@Override
	public void crearPies() {
		Pies p=new PiesG3();
		p.selectPies();
	}

}
