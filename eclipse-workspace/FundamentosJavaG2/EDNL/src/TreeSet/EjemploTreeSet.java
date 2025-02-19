package TreeSet;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

	public static void main(String[] args) {
		Set<Integer> conjunto = new TreeSet<Integer>();
		Random rnd = new Random();
		while(conjunto.size()<10) {
			int aleatorio = (int)(rnd.nextInt(50)+1);
			conjunto.add(aleatorio);
		}
		System.out.println(conjunto);

	}

}
