/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Operacion;

/**
 *
 * @author User
 */
public class EyS {
    private ArrayList<Integer> arregloNumeros;
    private Scanner leer;
	
    public EyS() {
	this.leer = new Scanner(System.in);
        this.arregloNumeros = new ArrayList<>();
    }
    
    public void llenarData(){
        imprimirInformacion("Tamaño del arreglo: ");
        int tam = leerDatoInt();
        imprimirInformacion("Ingrese el contido");
        for (int i = 0; i < tam; i++) {
            arregloNumeros.add(leerDatoInt());
        }
    }
	
    public int leerDatoInt() {
	int dato =0;
        try {
            dato=leer.nextInt();
        }catch (Exception e){
            System.out.println("El dato ingresado no es un numero");
            dato=0;
        }
        return dato;
    }
    public void imprimirInformacion(String msg) {
	System.out.println(msg);
    }
    
    public void mostrarArray(){
        System.out.println(arregloNumeros.toString());
    }

    public ArrayList<Integer> getArregloNumeros() {
        return this.arregloNumeros;
    }
    
    
}
