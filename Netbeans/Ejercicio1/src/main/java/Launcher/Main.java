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
        //Se entregael controlador a la ventana
        //v.setContoler(c);
        
        //a.operacion();
        
        
        //System.out.println("Hola Mundo");
        /*A uno = new A();
        A dos = new A();
        uno.texto = "Hola Mundo";
        dos = uno;
        dos.texto = "Adios mundo cruel";
        System.out.println(uno.texto);*/
        
        /*int a=1;
        int b=2;
        b=a;
        b=3;
        System.out.println(a);*/
        
        /*Integer a=1;
        Integer b=2;
        b=a;
        b=3;
        System.out.println(a);*/
        
    }
}
