package Actividad1Pares;

import java.util.Scanner;

public class Punto4 {
	
	public static int cc;
	public static double residuo;
	public static char letra;
	public static char letter[] =new char[23];
	public static Scanner leerCc =new Scanner(System.in);

	public static void main(String[] args) {
		letter[0]='T';
		letter[1]='R';
		letter[2]='w';
		letter[3]='A';
		letter[4]='G';
		letter[5]='M';
		letter[6]='Y';
		letter[7]='F';
		letter[8]='P';
		letter[9]='D';
		letter[10]='X';
		letter[11]='B';
		letter[12]='N';
		letter[13]='J';
		letter[14]='Z';
		letter[15]='S';
		letter[16]='Q';
		letter[17]='V';
		letter[18]='H';
		letter[19]='L';
		letter[20]='C';
		letter[21]='K';
		letter[22]='E';
		
		System.out.println("Identificar codigo de trabajador");
		System.out.print("Entre su cedula - ");
		cc=leerCc.nextInt();
		
		residuo=cc%23;
		System.out.println();
		
		for(int i=0; i < letter.length; i++) {
			if(i==residuo) {
				letra=letter[i];
			}
		}
		
		System.out.println("El codigo de trabajo es: " +letra+"-"+cc);
		
		

	}

}
