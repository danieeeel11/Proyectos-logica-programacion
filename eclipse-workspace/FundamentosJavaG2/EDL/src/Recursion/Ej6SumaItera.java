package Recursion;

public class Ej6SumaItera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato [] = {1,20,3,40,15,5};
		System.out.println(sumArray(dato));
	}
	
	public static int sumArray (int[] array) {
		int suma = 0;
		for(int i=0 ; i< array.length ; i++) {
			suma += array[i];
		}
		return suma;
	}

}
