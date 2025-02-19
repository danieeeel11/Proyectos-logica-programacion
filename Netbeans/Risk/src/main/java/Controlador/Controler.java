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
//ActionListener para activar la escucha de los eventos
public class Controler implements ActionListener{
    //Conecta el controlador con el modelo
    private Op modelo;
    private Ventana vista;
    public Controler(Op modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler(this);
    }
    @Override
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
        String n1 = this.vista.getTexto1().getText();
        String n2 = this.vista.getTexto2().getText();
        
        int num1= Integer.parseInt(n1);
        int num2= Integer.parseInt(n2);
        while(vista.getPanel().getEjercito1().isEmpty()){
            modelo.operacion(num1,num2);
        }
        
        
        
    }
}
