/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacion op = new Operacion();
        System.out.println("Cuantas generaciones desea generar?: ");
        int gen = sc.nextInt();
        op.run(gen);
    }
    
}

