package Controlador;

import Modelo.Op;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 * @since 10/08/21
 */
public class Controler2 implements ActionListener{
    private Op modelo;
    private Ventana vista;
    public Controler2(Op modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler2(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (vista.getPanel().getEjercito1().size()==0 
    			||vista.getPanel().getEjercito2().size()==0) {
            System.out.println("Ha finalizado el juego!!");
        } else if(!vista.getPanel().getEjercito1().isEmpty() || 
                !vista.getPanel().getEjercito2().isEmpty()){
            modelo.ataque(vista.getPanel().getEjercito1().size()
                    ,vista.getPanel().getEjercito2().size());
        }
    }
}
