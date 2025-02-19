package Ej2;

public class NumPerfecto {
	public static void NumPerfecto(int numero) {
		int[] arrayP = new int [numero/2];
		int i=0;
		for(int div=1; div<numero; div++) {
			if(numero % div == 0) {
				arrayP[i] = div;
				i = i+1;
			}
		}
		
		int suma = 0;
		for(int j=0; j<arrayP.length; j++) {
			suma = suma + arrayP[j];
			System.out.print(arrayP[j] + " ");
		}
		System.out.println(" ");
		
		if(suma == numero) {
			System.out.println("El numero " +numero+ " es perfecto. La suma es " +suma+ " Factores " +i);
			//return true;
		}else {
			System.out.println("El numero " +numero+ " no es perfecto. La suma es " +suma+ " Factores " +i);
			//return false;
		}
	}
}
