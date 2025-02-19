package Ej1;

public class prueba {

	public static void main(String[] args) {
		String pal2 = "Honda";
		String au1 = "Hyundai";
		int res = au1.compareTo(pal2);
		System.out.println(res);
		String pal = "Honda";
		String au = "Hyundai";
		int re = pal.compareTo(au);
		System.out.println(re);
		
		String pal1 = "Bmw";
		String au2 = "Citroen";
		int res2 = au2.compareTo(pal1);
		System.out.println(res2);
		
		String pal3 = "Hmw";
		String au3 = "Gitroen";
		int res3 = au3.compareTo(pal3);
		System.out.println(res3);
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			if(i==4) {
				break;
			}
		}
		System.out.println("Ya");

	}

}
