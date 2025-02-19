package EjemploPatron;

import java.util.regex.Pattern;

public class Ej1 {

	public static void main(String[] args) {
		String regexp = "\\d{1,3}/\\d{1,2}/\\d{4}";
		//Lo siguiente devuelve true
		System.out.println(Pattern.matches(regexp, "11/12/2020"));
		System.out.println(Pattern.matches(regexp, "1/12/2020"));
		System.out.println(Pattern.matches(regexp, "11/2/2020"));
		
		//Lo siguiente devuelve false
		System.out.println(Pattern.matches(regexp, "11/12/20")); //El año no tiene cuatro difras
		System.out.println(Pattern.matches(regexp, "11//2020")); //el mes no tiene una o dos cifras
		System.out.println(Pattern.matches(regexp, "11/2/2020Hola")); //sobra "Hola"
		
	}

}
