package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class prSigPr1 {
	//Contiene toda la gramatica
	ArrayList<String> gram = new ArrayList<>();
	//Contiene las claves
	ArrayList<String> key = new ArrayList<>();
	//Contiene las producciones
	ArrayList<String> produccion = new ArrayList<>();
	//Contiene las claves sin repeticion
	ArrayList<String> keyWRep = new ArrayList<>();
	//Conjunto de primeros
	ArrayList<String> prim = new ArrayList<>();
	//Conjunto de siguientes
	ArrayList<String> sig = new ArrayList<>();
	//Conjunto de prediccion
	ArrayList<String> pred = new ArrayList<>();
	
	/**
	 * Metodo para ingresar por pantalla las reglas de la gramatica
	 */
	public void ingresarReglas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas reglas tiene la gramatica?");
		int num = sc.nextInt();
		System.out.println("Ingrese las reglas");
		for (int i = 0; i <= num; i++) {
			String reg = sc.nextLine();
			if(i>0) {
				gram.add(reg);
			}
		}
		//Imprime las reglas por pantalla
		System.out.println("\nGramatica:");
		for (String str : gram) {
			System.out.println(str);
		}
	}
	
	/**
	 * Metodo que contiene el proceso debido para hallar el conjunto de los primeros
	 */
	public void processPrimeros() {
		//Contiene el conjunto de primeros, trabaja como auxiliar para el array prim
		ArrayList<String> primeros = new ArrayList<>();
		//Se separan las claves de las producciones en dos arrays, key y produccion
		for (int i = 0; i < gram.size(); i++) {
			String[]rule = gram.get(i).split("->");
			key.add(rule[0]);
			produccion.add(rule[1]);
		}
		//Extraer claves sin repetirse y se añaden al array keyWRep
		for (int i = 0; i < key.size(); i++) {
			String k = key.get(i);
			if (!keyWRep.stream().filter(p->p.equals(k)).findFirst().isPresent()) {
				keyWRep.add(key.get(i));
			}
		}
		//Exploramos el array con las claves sin repeticion
		for (int i = 0; i < keyWRep.size(); i++) {
			//Obtenemos cada clave
			String k = keyWRep.get(i);
			//Exploramos el array de los keys con repeticion
			for (int j = 0; j < key.size(); j++) {
				//Buscamos cuales reglas tienen la misma clave
				if(k.equals(key.get(j))) {
					//Obtenemos la produccion de cada una
					String p = produccion.get(j);
					//Identificamos si el conjunto de primeros de esta key ya ha sido declarado en el array primeros
					//Si no ha sido declarado
					if(!primeros.stream().filter(e->e.substring(0,1).equals(k)).findFirst().isPresent()) {
						//Se declara el conjunto
						String conjP = k + "=" + getPr(removeRep(analisisPrimeros(p)));
						//Se añade al array primeros
						primeros.add(conjP);
					}
					//Si ya ha sido declarado
					else {
						//Se obtiene el conjunto declarado
						String cjP = primeros.stream().filter(e->e.substring(0,1).equals(k)).findFirst().get();
						//Se obtiene su indice dentro del array primeros
						int index = primeros.indexOf(primeros.stream().filter(e->e.substring(0,1).equals(k)).findFirst().get());
						//String conjP = cjP.substring(0, (cjP.length()-1)) + "," + getPr(removeRep(analisisProduccion(p)));
						//Se añaden los valores al conjunto de primeros de tal clave
						String conjP = cjP + "," + getPr(removeRep(analisisPrimeros(p)));
						//Se actualiza la informacion
						primeros.set(index, conjP);
					}
					//String conjP = k + " = {" + removeRep(analisisProduccion(p)).toString() + "}";
					//primeros.add(conjP);
				}
			}
		}
		//Se verifica que no hay valores repetidos dentro de los conjuntos de los primeros
		for (int i = 0; i < primeros.size(); i++) {
			String[] aux = primeros.get(i).split("=");
			String[] pAux = aux[1].split(",");
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(pAux));
			prim.add(aux[0] + "=" + getPr(removeRep(list)));
		}
		System.out.println("\nConjunto de primeros:");
		for (String str : prim) {
			System.out.println(str);
		}
	}
	/**
	 * Metodo que contiene la logica de los primeros
	 * @param p recibe una produccion completa 
	 * @return Array con las producciones del conjunto primeros sin filtrar
	 */
	public ArrayList<String> analisisPrimeros(String p) {
		ArrayList<String> conjunto = new ArrayList<>();
		ArrayList<String> pG = new ArrayList<>();
		if(p.contains("|")) {
			String[] p1 = p.split("|");
			for (int i = 0; i < p1.length; i++) {
				pG.add(p1[i]);
			}
		}else {
			pG.add(p);
		}
		//Variable para determinar si las producciones de una regla contiene lambda
		boolean lambdaIsPresent = false;
		//Se recorre las posibles producciones
		for (int i = 0; i < pG.size(); i++) {
			//Cada produccion se separa por los espacios
			String[] p1 = pG.get(i).split(" ");
			//Se recorre cada produccion separado por los espacios
			for (int n = 0; n < p1.length; n++) {
				//Si no hay lambda
				if(!lambdaIsPresent) {
					//String[] p1 = pG.get(i).split(" ");
					//Obtenemos el primero
					String pp = p1[0];
					//Verificamos si la primera produccion es una variable 
					if(keyWRep.stream().filter(e->e.equals(pp)).findFirst().isPresent()) {
						ArrayList<Integer> ind = findIndices(pp);
						for (int j = 0; j < ind.size(); j++) {
							ArrayList<String> aux = analisisPrimeros(produccion.get(ind.get(j)));
							for (int k = 0; k < aux.size(); k++) {
								if(!aux.get(k).equals("#")) {
									conjunto.add(aux.get(k));
								}else {
									lambdaIsPresent = true;
								}
							}
						}
					}
					//Verificamos si la primera produccion es un terminal
					else {
						conjunto.add(pp);
					}
					if(!lambdaIsPresent) {
						n = p1.length-1;
					}
				}
				//Si hay labda
				else {
					//String[] p1 = pG.get(i).split(" ");
					//Obtenemos el primero
					String pp = p1[n];
					//Verificamos si la primera produccion es una variable 
					if(keyWRep.stream().filter(e->e.equals(pp)).findFirst().isPresent()) {
						ArrayList<Integer> ind = findIndices(pp);
						for (int j = 0; j < ind.size(); j++) {
							ArrayList<String> aux = analisisPrimeros(produccion.get(ind.get(j)));
							for (int k = 0; k < aux.size(); k++) {
								if(!aux.get(k).equals("#")) {
									conjunto.add(aux.get(k));
								}else {
									lambdaIsPresent = true;
								}
							}
						}
					}
					//Verificamos si la primera produccion es un terminal
					else {
						conjunto.add(pp);
					}
				}
			}
		}
		return conjunto;
	}
	
	
	/**
	 * Metodo que contiene el proceso debido para hallar el conjunto de los siguientes
	 */
	public void processSiguientes() {
		
	}
	/**
	 * Metodo que contiene la logica de los siguientes
	 * @param p recibe una produccion completa 
	 * @return Array con las producciones del conjunto siguientes sin filtrar
	 */
	public ArrayList<String> analisisSiguientes(String p) {
		ArrayList<String> conjunto = new ArrayList<>();
		return conjunto;
	}
	
	
	/**
	 * Metodo que contiene el proceso debido para hallar el conjunto de prediccion
	 */
	public void processPrediccion() {
		
	}
	/**
	 * Metodo que contiene la logica de los prediccion
	 * @param p recibe una produccion completa 
	 * @return Array con las producciones del conjunto prediccion sin filtrar
	 */
	public ArrayList<String> analisisPrediccion(String p) {
		ArrayList<String> conjunto = new ArrayList<>();
		return conjunto;
	}
	
	
	/**
	 * Metodo para encontrar los indices donde cada key tiene producciones dentro de la gramatica
	 * @param pp recibe un String, que es el key
	 * @return los indices donde este aparece
	 */
	public ArrayList<Integer> findIndices(String pp) {
		ArrayList<Integer> indices = new ArrayList<>();
		for (int i = 0; i < key.size(); i++) {
			if(key.get(i).equals(pp)) {
				indices.add(i);
			}
		}
		return indices;
	}
	/**
	 * Metodo para remover repeticiones en un array
	 * @param conj array con posibles repeticiones
	 * @return array sin repeticiones
	 */
	public ArrayList<String> removeRep(ArrayList<String> conj) {
		ArrayList<String> conjunto = new ArrayList<>();
		for (int i = 0; i < conj.size(); i++) {
			if(!conjunto.contains(conj.get(i))) {
				conjunto.add(conj.get(i));
			}
		}
		return conjunto;
	}
	/**
	 * Metodo para obtener las producciones y retornar un String con cada produccion separado por comas
	 * @param pr recibe un arreglo que contiene producciones
	 * @return String con cada produccion separado por comas
	 */
	public String getPr(ArrayList<String> pr) {
		String prd = "";
		for (int i = 0; i < pr.size(); i++) {
			if(i==(pr.size()-1)) {
				prd += pr.get(i);
			}else {
				prd += pr.get(i) + ",";
			}
		}
		return prd;
	}
	/**
	 * Main del programa
	 * @param args
	 */
	public static void main(String[] args) {
		prSigPr1 pr = new prSigPr1();
		pr.ingresarReglas();
		pr.processPrimeros();
	}
}
