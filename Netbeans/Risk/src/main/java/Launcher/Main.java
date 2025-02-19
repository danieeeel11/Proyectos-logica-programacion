package Launcher;

import Controlador.Controler;
import Controlador.Controler2;
import Modelo.Op;
import Vista.Ventana;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 * @since 10/08/21
 */
public class Main {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        Op a = new Op(v);
        
        Controler c = new Controler(a,v);
        Controler2 c2 = new Controler2(a,v);
    }
}
