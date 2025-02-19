/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Operacion;
import vista.EyS;

/**
 *
 * @author User
 */
public class Controler{
    private Operacion modelo;
    private EyS vista;
    public Controler(Operacion modelo, EyS vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    public void run(){
        vista.imprimirInformacion("SECUENCIA DE PASOS");
        modelo.llenarData();
        vista.mostrarArray();
        if(modelo.camino()){
            vista.imprimirInformacion("Hay camino");
        }else{
            vista.imprimirInformacion("No hay camino");
        }
    }
}
