package Controlador;

import Modelo.A;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
//ActionListener para activar la escucha de los eventos
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
        //modelo.operacion();
        for (int i = 0; i < 10000; i++) {
            modelo.operacion();
        }
    }
}
