package CompositeNotas;

import java.util.ArrayList;

public class Composite extends Component{

	public Composite(float nota) {
		super(nota);
	}
	public Composite() {
		super(0);
	}
	
	public ArrayList<Component> notas = new ArrayList<>();

	@Override
	public float execute() {
		nota = 0;
		for (int i = 0; i < notas.size(); i++) {
			if (i==0 || i==1) {
				nota = (float) (nota*0.3 + notas.get(i).execute());
				System.out.println(nota);
			}else {
				nota = (float) (nota*0.4 + notas.get(i).execute());
			}
			
		}
		return nota;
	}
	@Override
	public float executeFinal() {
		nota = 0;
		for (int i = 0; i < notas.size(); i++) {
			nota = (float) (nota + notas.get(i).execute());		
		}
		return nota/notas.size();
	}
	
}
