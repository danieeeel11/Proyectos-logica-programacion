package Controlador;

import Modelo.A;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
//ActionLsitener para activar la escucha de los eventos
public class Controler implements ActionListener{
    //Conecta el controlador con el modelo
    private A modelo;
    private Ventana vista;
    public Controler(A modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler(this);
    }
    
    @Override
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Me presiono");
        String n1 = this.vista.getTexto1().getText();
        String n2 = this.vista.getTexto2().getText();
        
        int num1= Integer.parseInt(n1);
        int num2= Integer.parseInt(n2);
        modelo.operacion(num1,num2);
    }

    
    
    /*@Override
    public void llamar() {
        System.out.println("Estoy llamando");
    }
    @Override
    public void consultarRedesSociales() {
        System.out.println("Estoy consultando redes sociales");
    }
    @Override
    public void jugar() {
        System.out.println("Estoy jugando");
    }*/
    
    
}
