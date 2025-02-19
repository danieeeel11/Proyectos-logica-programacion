package Extra;

import java.util.ArrayList;

public class Ej2Adicional {
	/**
	 * public boolean determinarIgualdade() {
		ArrayList<Integer> lista = listaN.getLista();
		boolean igualdad = false;
		if(sumaPar() == sumaImpar()) {
			int g= 1 ;
			for (int i = 0; i< listaN.tamanio(); i++) {
				if(listaN.IndexOf(g)%2 != 0) {
					listaN.removerO(g);
				}
				g+=i+1;
			}
			igualdad = true;
		}else {
			int g = lista.size() + lista.size() - 1;
			for (int i = 0 ; i < g; i++) {
				if(listaN.IndexOf(i)%2 != 0) {
					listaN.removerO(i);
				}
				g--;
			}
			igualdad = false;
		}
		return igualdad; 
	}
	 */
	
	/**
	 * public boolean determinarIgualda() {
		ArrayList<Integer> lista = listaN.getLista();
		boolean igualdad = false;
		if(sumaItemsPar() == sumaItemsImpar()) {
			//int g= 1 ;
			for (int i = 0; i< listaN.tamanio(); i++) {
				if(listaN.IndexOf(i+1)%2 != 0) {
					listaN.removerI(i);
				}
			//	g+=i+1;
			}
			igualdad = true;
		}else {
			//int g = lista.size() + lista.size() - 1;
			for (int i = 0 ; i<listaN.tamanio(); i++) {
				if(listaN.IndexOf(i+1)%2 == 0) {
					listaN.removerI(i);
				}
				/**
				if(i == lista.size()) {
					if(i%2==0) {
						
					}
				}**/
				//g--;
			//}
			//igualdad = false;
		//}
		//return igualdad; 
	//}

	/**
	 * public boolean determinarI() {
		ArrayList<Integer> lista = listaN.getLista();
		boolean igualdad = false;
		if(sumaPar() == sumaImpar()) {
			for (int i = 0; i< listaN.tamanio(); i++) {
				int g=0;
				if((i+1)%2 == 0) {
					lista.remove(i);
				}
			}
			igualdad = true;
		}else {
			//int g = lista.size() + lista.size() - 1;
			int g=0;
			for (int i = 0; i <listaN.tamanio(); i++) {
				//g += g+1;
				if((g)%2 != 0) {
					lista.remove(i);
				}
				g += g-1;
				if(g> listaN.tamanio()) {
					break;
				}
			}
			igualdad = false;
		}
		return igualdad; 
	}
	 */
	
	/**
	public void determinarIgualdades(int sI, int sP) {
		ArrayList<Integer> lista = listaN.getLista();
		//boolean igualdad = false;
		if(sI == sP) {
			for (Integer in : lista) {
				if(listaN.IndexOf(in)%2 == 0) {
					listaN.removerO(in);
				}
			}
			//igualdad = true;
		}else {
			for (Integer in : lista) {
				if(listaN.IndexOf(in)%2 != 0) {
					listaN.removerO(in);
				}
			}
			//igualdad = false;
		}
		//return igualdad; 
	}
	**/
	/**
	 * public int sumaItemsImpar() {
		int sumaI = 0;
		ArrayList<Integer> lista = listaN.getLista();
		//int i = 0;
		for (Integer integer : lista) {
			if(listaN.IndexOf(integer)%2 == 0) {
				sumaI += integer;
			}
			//suma += integer;
		}
		return sumaI;
	}
	 */
	/**
	 * public int sumaItemsPar() {
		int sumaP = 0;
		ArrayList<Integer> lista = listaN.getLista();
		//int i = 0;
		for (Integer num : lista) {
			if(listaN.IndexOf(num)%2 != 0) {
				sumaP += num;
			}
			//suma += integer;
		}
		return sumaP;
	}
	 */
}
