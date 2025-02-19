package Modelo;

import Vista.Ventana;
import java.util.Random;

/**
 *
 * @author User
 */
public class A {
    private Ventana ventana = null;
    public A(Ventana v){
        this.ventana=v;
    }
    
    public void operacion(){
        Random r = new Random();        
        for (int i = 0; i < 3; i++) {
            ventana.getPanel().getPuntos().add(new Punto(r.nextInt(1000),r.nextInt(1000)));
        }
        /*for (int i = 0; i < 20; i++) {
            ventana.getPanel().getPuntos().add(new Punto((int)(Math.random()*(500-5)+5),(int)(Math.random()*(500-5)+5)));
        }*/
        ventana.getPanel().repaint();
        
        //Borrar la lista de puntos para que no se generen mas
        
        /*Punto p1 = new Punto(300,300);
        Punto p2 = new Punto(400,0);
        Punto p3 = new Punto(500,10);
        Punto p4 = new Punto((int)Math.random()*1000,(int)Math.random()*1000);
        
        ventana.getPanel().getPuntos().add(p1);
        ventana.getPanel().getPuntos().add(p2);
        ventana.getPanel().getPuntos().add(p3);
        ventana.getPanel().getPuntos().add(p4);
        ventana.getPanel().repaint();*/
    }

}
