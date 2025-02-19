package Ej2;

public class NPerfectRec {
	public static boolean perfecto(int dato) {
		int suma=0;
		boolean numeroP = false;
		
		for(int i=1 ; i<dato ; i++) {
			if(dato % i == 0) {
				suma = suma +i;
				System.out.println(i);
			}
		}
		if(suma == dato) {
			numeroP = true;
		}
		return numeroP;
	}

}
