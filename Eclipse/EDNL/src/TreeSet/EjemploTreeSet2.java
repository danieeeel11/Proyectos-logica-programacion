package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet2 {

	public static void main(String[] args) {
		Set<String> agenda = new TreeSet<String>();
		agenda.add("Pedro");
		agenda.add("Esteban");
		agenda.add("Adriana");
		agenda.add("Ivan");
		agenda.add("Isabella");
		agenda.add("Pedro");
		agenda.add("Adriana");
		
		for (String str : agenda) {
			System.out.println(str);
		}

	}

}
