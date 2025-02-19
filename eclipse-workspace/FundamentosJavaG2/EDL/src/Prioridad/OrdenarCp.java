package Prioridad;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrdenarCp {
	private static Queue<Integer> enteros = new PriorityQueue<Integer>();
	
	/*public OrdenarCp() {
		this.enteros = new PriorityQueue<Integer>();
	}*/
	
	public static Queue<Integer> ordenarI(int[] array){
		for (int i = 0; i < array.length; i++) {
			enteros.add(array[i]);
		}
		return enteros;
	}
	
	public static Queue<Integer> ordenarR(int[] array, int i){
		if(i == array.length) {
			return enteros;
		}else {
			enteros.add(array[i]);
			return ordenarR(array, i+1);
		}
	}
	/*
	public static void ordenamientoAscenden(Queue<Integer> colaNum, int n) {
        if (n == 1)
            return;
        for (int i=0; i<n-1; i++) {
        	int a = colaNum.peek();
        	int b = colaNum.peek()+1;
        	if (a > b){
                int temp = a;
                a = b;
                b = temp;
            } ordenamientoAscenden(colaNum, n-1);
        }
    }
	
	public static void ordenamientoAscen(int num[], int n) {
        if (n == 1)
            return;
        for (int i=0; i<n-1; i++) {
        	if (num[i] > num[i+1]){
                int temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            } ordenamientoAscen(num, n-1);
        }
    }
	public static void ordenamientoDescen(int num[], int n) {
        if (n == 1)
            return;
        for (int i=0; i<n-1; i++) {
        	if (num[i+1] > num[i]){
                int temp = num[i+1];
                num[i+1] = num[i];
                num[i] = temp;
            } ordenamientoDescen(num, n-1);
        }
    }
    */
	//public static void main(String[] args) {
		//int num[] = {64, 34, 25, 12, 22, 11, 90};
		/*
		ordenamientoAscen(num, num.length);
        System.out.println("Array ordenado de forma ascendente: ");
        System.out.println(Arrays.toString(num));
        
        ordenamientoDescen(num, num.length);
        System.out.println("Array ordenado de forma descendente: ");
        System.out.println(Arrays.toString(num));
        
        System.out.println();
        Queue<ArrayEj1> cola = new PriorityQueue<ArrayEj1>();
		cola.add(new ArrayEj1(7));
		cola.add(new ArrayEj1(1));
		cola.add(new ArrayEj1(90));
		cola.add(new ArrayEj1(15));
		
		while(!cola.isEmpty()) {
			ArrayEj1 a = cola.remove();
			System.out.println(a);
		}
		System.out.println();
		Queue<Integer> colaNum = new PriorityQueue<Integer>();
		colaNum.add(64);
		colaNum.add(34);
		colaNum.add(25);
		colaNum.add(12);
		colaNum.add(22);
		colaNum.add(11);
		colaNum.add(90);
		ordenamientoAscenden(colaNum, colaNum.size());
		for (Integer integer : colaNum) {
			System.out.println(integer);
		}
		*/
	//}

}
