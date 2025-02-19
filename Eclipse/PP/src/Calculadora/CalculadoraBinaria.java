package Calculadora;
/**
 * Clase que contiene el metodo minPasos, para calcular y llegar del numero a
 * al numero b, usando solo "-2" y "+3"
 * @author Daniel Felipe VElásquez Rincón
 * @version 4
 * @date 05-02-2021
 */
public class CalculadoraBinaria {
	public static int minPasos(int a, int b) {
		int bot1 = 2;
		int bot2 = 3;
		int contador = 0;
		for(int i=0;i<100;i++) {
			while(a==b) {
				if(a==b) {
					break;
				}
			}
			while(a<b) {
				if(a<b) {
					a=a+bot2;
					contador++;
				}
				if(a==b) {
					break;
				}
			}
			while(a>b) {
				if(a>b) {
					a=a-bot1;
					contador++;
				}
				if(a==b) {
					break;
				}
			}
		}
		return contador;
	}
}
