package CompositeNotas;

public abstract class Component {
	public float nota;
	
	public Component(float nota) {
		this.nota = nota;
	}
	
	public abstract float execute();
	public abstract float executeFinal();
}
