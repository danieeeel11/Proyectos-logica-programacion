package Recursion;

public class Ej6SumaArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato [] = {1,20,3,40,15,5};
		System.out.println(sumArray(dato,0));
		System.out.println(sumArrayReversa(dato,5));
	}
	
	public static int sumArray (int[] array, int pos) {
		if(pos == array.length-1) {
			return array[pos];
		}else {
			return array[pos] + sumArray(array, pos+1);
		}
	}
	
	public static int sumArrayReversa (int[] array, int pos) {
		if(pos == 0) {
			return array[pos];
		}else {
			return array[pos] + sumArrayReversa(array, pos-1);
		}
	}
}
