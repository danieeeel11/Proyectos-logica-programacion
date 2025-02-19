package PosFija;

import java.util.Stack;

public class AppPostFija {

	public static void main(String[] args) {
		String e = "4 239 60 + * 1 -";
		String[] expresion = e.split(" ");
		int resultado = PostFija.evaluar(expresion, 0, new Stack<String>());
		
		System.out.println("Resultado de la operacion " + resultado);

	}

}
