package Recursion;

public class Ej8ProdVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato [] = {1,20,3,40,15,5};
		int dato2 [] = {1,20,3,40,15,5};
		System.out.println(fpv(dato,0));
		System.out.println(fv(dato,dato2,0));
	}
	
	/**
	 * Funcion para hallar el producto de un vectores
	 * @param l1
	 * @param t
	 * @return
	 */
	public static int fpv(int[] l1, int t) {
		if(t > l1.length-1) {
			return 1;
		}else {
			return l1[t] * fpv(l1, t+1);
		}
	}
	/**
	 * Funcion para hallar el producto de dos vectores
	 * @param l1
	 * @param l2
	 * @param t
	 * @return
	 */
	public static int fv(int[] l1, int[] l2, int t) {
		if(t > l2.length-1) {
			return 1;
		}else {
			return l1[t] * l2[t] * fv(l1, l2, t+1);
		}
	}
}
