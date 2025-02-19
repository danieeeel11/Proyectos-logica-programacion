package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class prSigPr {
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
	//Conjunto de predicciones
	ArrayList<String> prd = new ArrayList<>();
	
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
	 * Metodo que contiene el proceso debido para hallar el conjunto de los Siguientes
	 */
	public void processSiguientes() {
		ArrayList<String> siguientes = new ArrayList<>();
		for (int i = 0; i < keyWRep.size(); i++) {
			String k = keyWRep.get(i);
			for (int j = 0; j < produccion.size(); j++) {
				if (produccion.get(j).contains(k)) {
					//Identificamos si el conjunto de siguientes de esta key ya ha sido declarado en el array siguientes
					//Si no ha sido declarado
					if(!siguientes.stream().filter(e->e.substring(0,1).equals(k)).findFirst().isPresent()) {
						//Se declara el conjunto
						String conjP = "";
						if(i==0) {
							conjP = k + "=" + getPr(removeRep(analisisSiguientes(produccion.get(j),k,j,siguientes))) + ",$";
						}else {
							conjP = k + "=" + getPr(removeRep(analisisSiguientes(produccion.get(j),k,j,siguientes)));
						}
						//Se añade al array siguientes
						siguientes.add(conjP);
					}
					//Si ya ha sido declarado
					else {
						//Se obtiene el conjunto declarado
						String cjP = siguientes.stream().filter(e->e.substring(0,1).equals(k)).findFirst().get();
						//Se obtiene su indice dentro del array siguientes
						int index = siguientes.indexOf(siguientes.stream().filter(e->e.substring(0,1).equals(k)).findFirst().get());
						//Se añaden los valores al conjunto de siguientes de tal clave
						String conjP = cjP + "," + getPr(removeRep(analisisSiguientes(produccion.get(j),k,j,siguientes)));
						//Se actualiza la informacion
						siguientes.set(index, conjP);
					}
				}
			}
		}
		//Se verifica que no hay valores repetidos dentro de los conjuntos de los siguientes
		for (int i = 0; i < siguientes.size(); i++) {
			String[] aux = siguientes.get(i).split("=");
			String[] pAux = aux[1].split(",");
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(pAux));
			sig.add(aux[0] + "=" + getPr(removeRep(list)));
		}
		System.out.println("\nConjunto de siguientes:");
		for (String str : sig) {
			System.out.println(str);
		}
	}
	/**
	 * Metodo que contiene la logica de los Siguientes
	 * @param p recibe una produccion completa 
	 * @return Array con las producciones del conjunto Siguientes sin filtrar
	 */
	public ArrayList<String> analisisSiguientes(String p, String k, int iG, ArrayList<String> siguientes) {
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
		//Se recorre las posibles producciones
		for (int i = 0; i < pG.size(); i++) {
			//Cada produccion se separa por los espacios
			String[] p1 = pG.get(i).split(" ");
			int index = busquedaArray(p1, k);
			ArrayList<String> cAux = busquedaPosicion(p1,index,iG,siguientes);
			for (int j = 0; j < cAux.size(); j++) {
				conjunto.add(cAux.get(j));
			}
		}
		return conjunto;
	}
	/**
	 * Metodo para las reglas del conjunto de siguientes
	 * @param produc produccion
	 * @param index indice donde se encuentra la variable dentro de la produccion
	 * @param iG indice de la produccion dentro de la gramatica
	 * @param siguientes conjunto de siguientes hasta el momento
	 * @return siguientes actuales
	 */
	public ArrayList<String> busquedaPosicion(String[] produc, int index, int iG, ArrayList<String> siguientes) {
		ArrayList<String> aux = new ArrayList<>();
		//Determinar si la variable esta en la última posición
		if (index == (produc.length-1)) {
			if(siguientes.stream().filter(e->e.substring(0, 1).equals(key.get(iG))).findFirst().isPresent()) {
				String[] s = siguientes.stream().filter(e->e.substring(0, 1).equals(key.get(iG))).findFirst().get().split("=");
				if(s.length>1 && s[1].contains(",")) {
					String[] s1 = s[1].split(",");
					aux = new ArrayList<String>(Arrays.asList(s1));
				}
			}else {
				
			}
		}
		//Determina si hay algo después de la variable
		else if(index < (produc.length-1)) {
			if(keyWRep.stream().filter(e->e.equals(produc[index+1])).findFirst().isPresent()) {
				if(prim.stream().filter(e->e.substring(0, 1).equals(produc[index+1])).findFirst().isPresent()) {
					//System.out.println(prim.stream().filter(e->e.substring(0, 1).equals(produc[index+1])).findFirst().get());
					if(prim.stream().filter(e->e.substring(0, 1).equals(produc[index+1])).findFirst().get().contains("#")) {
						String[] p = prim.stream().filter(e->e.substring(0, 1).equals(produc[index+1])).findFirst().get().split("=");
						String[] p1 = p[1].split(",");
						aux = new ArrayList<String>(Arrays.asList(p1));
						aux.remove("#");
						if(siguientes.stream().filter(e->e.substring(0, 1).equals(key.get(iG))).findFirst().isPresent()) {
							String[] s = siguientes.stream().filter(e->e.substring(0, 1).equals(key.get(iG))).findFirst().get().split("=");
							if(s.length>1 && s[1].contains(",")) {
								String[] s1 = s[1].split(",");
								for (int i = 0; i < s1.length; i++) {
									aux.add(s1[i]);
								}
							}else {
								for (int i = 0; i < s.length; i++) {
									aux.add(s[i]);
								}
							}
						}
					}else {
						String[] p = prim.stream().filter(e->e.substring(0, 1).equals(produc[index+1])).findFirst().get().split("=");
						String[] p1 = p[1].split(",");
						aux = new ArrayList<String>(Arrays.asList(p1));
					}
				}
			}else {
				aux.add(produc[index+1]);
			}
		}
		return aux;
	}
	/**
	 * Metodo que contiene el proceso debido para hallar el conjunto de los Predicciones
	 */
	public void processPrediccion() {
		ArrayList<String> prediccion = new ArrayList<>();
		for (int i = 0; i < keyWRep.size(); i++) {
			String k = keyWRep.get(i);
			for (int j = 0; j < key.size(); j++) {
				if(k.equals(key.get(j))) {
					String p = produccion.get(j);
					String conjP = k + "=" + getPr(analisisPrimeros(p));
					if (conjP.contains("#")) {
						String[]s = sig.stream().filter(e->e.contains(k)).findFirst().get().split("=");
						conjP = k + "=" + s[1];
					}
					prediccion.add(conjP);
				}
			}
		}
		for (int i = 0; i < prediccion.size(); i++) {
			prd.add(prediccion.get(i));
		}
		System.out.println("\nConjunto de prediccion:");
		prd.forEach(System.out::println);
	}
	
	/**
	 * Metodo para buscar dentro de un array una clave
	 * @param produc array
	 * @param k clave a buscar
	 * @return indice
	 */
	public Integer busquedaArray(String[] produc, String k) {
		int index = 0;
		for (int i = 0; i < produc.length; i++) {
			if (produc[i].equals(k)) {
				index = i;
			}
		}
		return index;
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
		prSigPr pr = new prSigPr();
		pr.ingresarReglas();
		pr.processPrimeros();
		pr.processSiguientes();
		pr.processPrediccion();
	}
}