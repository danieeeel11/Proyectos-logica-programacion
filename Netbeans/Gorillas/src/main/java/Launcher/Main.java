/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launcher;

import Controlador.Controler;
import Modelo.Operacion;
import Vista.Ventana;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana();
        Operacion a = new Operacion(v);
        
        Controler c = new Controler(a,v);
    }
    
}
