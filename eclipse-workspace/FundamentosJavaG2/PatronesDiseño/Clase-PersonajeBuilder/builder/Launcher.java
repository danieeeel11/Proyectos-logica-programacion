package builder;

public class Launcher {
	
	
	public static void main(String[] args) {
	
		IBuilder b=new BuilderG1("GOKU");
		
		Director d=new Director(b);
		
		Personaje p=d.crearPersonaje();
		
		System.out.println(p.toString());
		
		
	}

}
