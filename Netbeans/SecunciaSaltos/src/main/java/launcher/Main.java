/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import controlador.Controler;
import modelo.Operacion;
import vista.EyS;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EyS es = new EyS();
        Operacion o = new Operacion(es);
        
        Controler con = new Controler(o,es);
        con.run();
    }
    
}
