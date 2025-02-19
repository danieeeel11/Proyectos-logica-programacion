package controlador;

import modelo.Op;
import vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
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
        //modelo.operacion();
        if (e.getActionCommand().equals("Show Grafo")) {
            modelo.dataLineas();
            modelo.dataNodos();
	}
        if(e.getActionCommand().equals("Operacion")){
            if(vista.getPanel().getLineas().isEmpty()){
                System.out.println("Oprima el boton <Show Grafo>\n"); 
            }else{
                String desde=this.vista.getDesde().getText();
                String hasta=this.vista.getHasta().getText();
                if(desde.equals("") || hasta.equals("")){
                    System.out.println("Ingrese los datos en los espacios vacios\n");
                }else{
                    modelo.recorrido(desde, hasta);
                    this.vista.getDesde().setText("");
                    this.vista.getHasta().setText("");
                }
            }
	}
    }
}
