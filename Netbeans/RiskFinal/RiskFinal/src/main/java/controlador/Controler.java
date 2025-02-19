/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import modelo.Operacion;
import modelo.PuntoPais;
import vistaR.Ventana;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 */
public class Controler implements ActionListener{
    private Operacion modelo;
    private Ventana vista;
    public Controler(Operacion modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoller(this);
    }
    
    String paisI=null;
    String pais1 = null;
    String pais2 = null;
    //Se declara como 2 ya que
    //Cuando vale 2, se toma el pais inicial de los aliados
    //Cuando vale 1, se genera el pais inicial de los enemigos
    //Cuando vale 0, se realizan las acciones posteriores
    int actBegin=2;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Si actBegin vale 0, se realizan las acciones posteriores al inicio
        if(actBegin==0){
            //Si el boton oprimido es Cambio Turno
            if(e.getActionCommand().equals("Cambio Turno")){
                //Se generan los paises inicio y destino del movimiento enemigo
                String[] pIA = modelo.paisesIA();
                modelo.accion(pIA[0], pIA[1], "Enemigos");
                //System.out.println("turnooooo xd");
            }
            //Se llama el metodo para leer los botones de los paises
            botonesPaises(e);
            //Si el boton oprimido es Accion
            if(e.getActionCommand().equals("Accion")){
                //Si pais1 (inicio) y pais2 (destino), ya tienen un pais asignado a cada uno
                if(pais1!=null && pais2!=null){
                    vista.updateDe("");
                    vista.updateHasta("");
                    System.out.println(pais1 + "-" + pais2);
                    modelo.accion(pais1, pais2, "Aliados");
                }
                pais1=null;
                pais2=null;
            }
        }
        else{
            //Si actBegin vale 2, se toma el pais inicial de los aliados
            if(actBegin==2){
                paisInicial(e);
                modelo.accionInicial(paisI, "Aliados");
            }
            //Si actBegin vale 1, se genera el pais inicial de los enemigos
            else{
                //Si el boton oprimido es Cambio Turno
                if(e.getActionCommand().equals("Cambio Turno")){
                    //Obtiene el listado de paises
                    ArrayList<PuntoPais> paisesT = vista.getPanel().getPaises();
                    //Obtiene el index del pais que a sido ya elegido como pais de inicio de los aliados
                    int index = paisesT.indexOf(vista.getPanel().getPaisesAliados().get(0));
                    Random r = new Random();
                    //Se obtiene un numero random desde 0 hasta el tamaño de la lista de paises
                    int v=r.nextInt(paisesT.size());
                    //Si el numero random es igual al index
                    if(index==v){
                        //Loop hasta que se obtenga un numero random diferente a index
                        while(v==index){
                            v = r.nextInt(paisesT.size());
                        }
                    }
                    //Obtiene el pais de inicio de los enemigos
                    PuntoPais pi = paisesT.get(v);
                    modelo.accionInicial(pi.getPais(), "Enemigos");
                    
                    actBegin--;
                }
            }
            
            
        }
        
    }
    
    /**
     * Metodo para leer el pais de inicio de los aliados
     * @param e ActionEvent
     */
    public void paisInicial(ActionEvent e){
        //Recorre el listado de paises
        for (int i = 0; i < vista.getPanel().getPaises().size(); i++) {
            //Se obtiene el nombre del pais
            String pais = vista.getPanel().getPaises().get(i).getPais();
            //Si el nombre del pais es igual al botonPais oprimido
            if(e.getActionCommand().equals(pais)){
                paisI=pais;
                actBegin--;
            }
        }
    }
    
    /**
     * Metodo para leer los botones de los paises
     * @param e ActionEvent
     */
    public void botonesPaises(ActionEvent e){
        //Recorre el listado de paises
        for (int i = 0; i < vista.getPanel().getPaises().size(); i++) {
            //Se obtiene el nombre del pais
            String pais = vista.getPanel().getPaises().get(i).getPais();
            //Si el nombre del pais es igual al botonPais oprimido
            if(e.getActionCommand().equals(pais)){
                if(pais1 == null){
                    vista.updateDe("Desde: " + pais);
                    pais1 = pais;
                }else{
                    vista.updateHasta("Hasta: " + pais);
                    pais2 = pais;
                }
            }
        }
    }
    
    //Metodo en no uso
    /*public void botonsPaises(ActionEvent e){
        
        if(e.getActionCommand().equals("Argentina")){
            if(pais1==null){
                vista.updateDe("Desde: Argentina");
                pais1="Argentina";
            }else{
                vista.updateHasta("Hasta: Argentina");
                pais2="Argentina";
            }
        }
        if(e.getActionCommand().equals("Bolivia")){
            if(pais1==null){
                vista.updateDe("Desde: Bolivia");
                pais1="Bolivia";
            }else{
                vista.updateHasta("Hasta: Bolivia");
                pais2="Bolivia";
            }
        }
        if(e.getActionCommand().equals("Brasil")){
            if(pais1==null){
                vista.updateDe("Desde: Brasil");
                pais1="Brasil";
            }else{
                vista.updateHasta("Hasta: Brasil");
                pais2="Brasil";
            }
        }
        if(e.getActionCommand().equals("Chile")){
            if(pais1==null){
                vista.updateDe("Desde: Chile");
                pais1="Chile";
            }else{
                vista.updateHasta("Hasta: Chile");
                pais2="Chile";
            }
        }
        if(e.getActionCommand().equals("Colombia")){
            if(pais1==null){
                vista.updateDe("Desde: Colombia");
                pais1="Colombia";
            }else{
                vista.updateHasta("Hasta: Colombia");
                pais2="Colombia";
            }
        }
        if(e.getActionCommand().equals("Ecuador")){
            if(pais1==null){
                vista.updateDe("Desde: Ecuador");
                pais1="Ecuador";
            }else{
                vista.updateHasta("Hasta: Ecuador");
                pais2="Ecuador";
            }
        }
        if(e.getActionCommand().equals("Guyana")){
            if(pais1==null){
                vista.updateDe("Desde: Guyana");
                pais1="Guyana";
            }else{
                vista.updateHasta("Hasta: Guyana");
                pais2="Guyana";
            }
        }
        if(e.getActionCommand().equals("GuyanaFrancesa")){
            if(pais1==null){
                vista.updateDe("Desde: GuyanaFrancesa");
                pais1="GuyanaFrancesa";
            }else{
                vista.updateHasta("Hasta: GuyanaFrancesa");
                pais2="GuyanaFrancesa";
            }
        }
        if(e.getActionCommand().equals("Paraguay")){
            if(pais1==null){
                vista.updateDe("Desde: Paraguay");
                pais1="Paraguay";
            }else{
                vista.updateHasta("Hasta: Paraguay");
                pais2="Paraguay";
            }
        }
        if(e.getActionCommand().equals("Peru")){
            if(pais1==null){
                vista.updateDe("Desde: Peru");
                pais1="Peru";
            }else{
                vista.updateHasta("Hasta: Peru");
                pais2="Peru";
            }
        }
        if(e.getActionCommand().equals("Suriname")){
            if(pais1==null){
                vista.updateDe("Desde: Suriname");
                pais1="Suriname";
            }else{
                vista.updateHasta("Hasta: Suriname");
                pais2="Suriname";
            }
        }
        if(e.getActionCommand().equals("Uruguay")){
            if(pais1==null){
                vista.updateDe("Desde: Uruguay");
                pais1="Uruguay";
            }else{
                vista.updateHasta("Hasta: Uruguay");
                pais2="Uruguay";
            }
        }
        if(e.getActionCommand().equals("Venezuela")){
            if(pais1==null){
                vista.updateDe("Desde: Venezuela");
                pais1="Venezuela";
            }else{
                vista.updateHasta("Hasta: Venezuela");
                pais2="Venezuela";
            }
        }
    }*/
}
