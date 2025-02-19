package PosFija;

import java.util.Stack;

public class PostFija {
	private static String operadores = "+-*/";
	public static int evaluar(String[] expresion, int index, Stack<String> pila) {
		if (expresion.length == index) {
			return Integer.parseInt(pila.pop());
		}else {
			if(expresion[index].equals("+") || expresion[index].equals("-") || expresion[index].equals("*") || expresion[index].equals("/")) {
				pila.push(operaciones(Integer.parseInt(pila.pop()), Integer.parseInt(pila.pop()), expresion[index]) + " ");
			}else {
				pila.push(expresion[index]);
			}
			return evaluar(expresion, index +1, pila);
		}
		
	}
	
	public static int operaciones(int n2, int n1, String operador) {
		if(operador.equals("+")) return n1+n2;
		if(operador.equals("-")) return n1-n2;
		if(operador.equals("*")) return n1*n2;
		if(operador.equals("/")) return n1/n2;
		return 0;
	}

}
