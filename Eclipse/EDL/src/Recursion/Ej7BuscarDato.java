package Recursion;

public class Ej7BuscarDato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato [] = {1,20,3,40,15,5};
		System.out.println(find(dato,3,0));
	}
	
	public static int find (int[] array, int data, int pos) {
		if(array[pos] == data) {
			return pos;
		}
		if(pos == array.length-1){
			return -1;
		}else {
			return find(array,data,pos+1);
		}
	}
	
	public static int find1(int array[], int data) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == data) {
				index = i;
				break;
			}
		}
		return index;
	}

}
