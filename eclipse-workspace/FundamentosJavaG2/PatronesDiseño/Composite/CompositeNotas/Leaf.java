package CompositeNotas;

public class Leaf extends Component{
	public Leaf(float nota) {
		super(nota);
	}

	@Override
	public float execute() {
		return nota;
	}

	@Override
	public float executeFinal() {
		return nota;
	}
	
	
	
}
