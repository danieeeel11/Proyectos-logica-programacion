package Recursion;

public class Ej5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato [] = {1,20,3,40,15,5};
		fMuestra(dato,0);
	}
	
	public static void fMuestra (int[] array, int pos) {
		if(pos == array.length-1) {//caso base
			System.out.println(array[pos]);
		}else {
			System.out.println(array[pos]);
			fMuestra(array,pos + 1);
		}
	}

}
