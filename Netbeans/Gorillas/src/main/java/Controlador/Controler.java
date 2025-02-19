/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operacion;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Controler implements ActionListener{
    private Operacion modelo;
    private Ventana vista;
    int i= 0;
    public Controler(Operacion modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler(this);
    }
    
    @Override
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Iniciar")){
            while(vista.getPanel().getGorilas().isEmpty()){
                modelo.addGorila();
            }
        }
        if (e.getActionCommand().equals("Ataque")){
            if(!vista.getLabel().equals("Rival derrotado")){
                
                String n1 = this.vista.getAng().getText();
                String n2 = this.vista.getVel().getText();
                int ang= Integer.parseInt(n1);
                int vel= Integer.parseInt(n2);
                Random r = new Random();
                boolean sum_res=r.nextBoolean();
                int velo;
                if(sum_res){
                    //Suma de margen de error a la velocidad
                    velo = vel+r.nextInt(4);
                }else{
                    //Resta de margen de error va la velocidad
                    velo = vel-r.nextInt(4);
                }
                //modelo.cambiarPosGorila();
                
                modelo.operacionesDatos(ang, velo);
                modelo.operacionPosicionXY(ang, velo);
                modelo.impacto();
                
                this.vista.getAng().setText("");
                this.vista.getVel().setText("");
                
                //modelo.cambiarPosGorila();
            }else{
                JOptionPane.showMessageDialog(null, "El rival ha sido derrotado");
            }
        }
        //modelo.cambiarPosGorila();
    }
}
