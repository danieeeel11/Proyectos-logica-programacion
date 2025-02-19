package CompositeNotas;

public class Launcher {

	public static void main(String[] args) {
		Composite materias = new Composite();
		
		Composite patrones = new Composite();
		Leaf patrC1 = new Leaf(45);
		Leaf patrC2 = new Leaf(44);
		Leaf patrC3 = new Leaf(46);
		patrones.notas.add(patrC1);
		patrones.notas.add(patrC2);
		patrones.notas.add(patrC3);
		
		Composite inteligenciaArtificial = new Composite();
		Leaf iaC1 = new Leaf(42);
		Leaf iaC2 = new Leaf(44);
		Leaf iaC3 = new Leaf(47);
		inteligenciaArtificial.notas.add(iaC1);
		inteligenciaArtificial.notas.add(iaC2);
		inteligenciaArtificial.notas.add(iaC3);
		
		Composite introHPC = new Composite();
		Leaf introHPCC1 = new Leaf(43);
		Leaf introHPCC2 = new Leaf(44);
		Leaf introHPCC3 = new Leaf(48);
		introHPC.notas.add(introHPCC1);
		introHPC.notas.add(introHPCC2);
		introHPC.notas.add(introHPCC3);
		
		materias.notas.add(patrones);
		materias.notas.add(inteligenciaArtificial);
		materias.notas.add(introHPC);
		
		System.out.println("La nota de Patrones es: " + patrones.execute());
		System.out.println("La nota de Inteligencia Artificial es: " + inteligenciaArtificial.execute());
		System.out.println("La nota de Intro HPC es: " + introHPC.execute());
		System.out.println("La nota promedio del semestre es: " + materias.execute());
	}

}
