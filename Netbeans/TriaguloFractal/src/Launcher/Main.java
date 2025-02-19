package Launcher;

import Controlador.Controler;
import Modelo.A;
import Vista.Ventana;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // el new llama un metodo de la clase Ventana
        Ventana v = new Ventana();
        A a = new A(v);
        
        Controler c = new Controler(a,v);
    }
}
