package Modelo;

import Vista.Ventana;
import java.util.ArrayList;
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
        //Añadir los puntos fijos una sola vez
        if(ventana.getPanel().getPuntoFijo().isEmpty()){
            Punto p1 = new Punto(300,100);
            Punto p2 = new Punto(100,320);
            Punto p3 = new Punto(500,320);
            //Añadir puntos al listado de puntos fijos
            ventana.getPanel().getPuntoFijo().add(p1);
            ventana.getPanel().getPuntoFijo().add(p2);
            ventana.getPanel().getPuntoFijo().add(p3);
        }
        ventana.getPanel().repaint();
        //Trae en ph el punto medio calculado
        Punto ph = puntMedio();
                                //ventana.getPanel().getPuntos().add(new Punto(puntMedio().getX(),puntMedio().getY()));
        //Añadir el punto medio al listado de puntos medios
        ventana.getPanel().getPuntos().add(ph);
        ventana.getPanel().repaint();
    }
    
    /**
     * Metodo para calcular el punto medio
     * @return el punto medio
     */
    public Punto puntMedio(){
        Random r = new Random();
        //Trae los listados de puntos fijos y puntos medios
        ArrayList<Punto> puntFij = ventana.getPanel().getPuntoFijo();
        ArrayList<Punto> puntMed = ventana.getPanel().getPuntos();
        //Valores iniciales de x,y del punto medio a hallar
        int pmx=0;
        int pmy=0;
        //Genera un numero aleatorio entre 0 y 2 - 0,1,2 - por los tres puntos fijos establecidos
        int a = r.nextInt(3);
        //Se trae el punto fijo aleatorio
        Punto p = puntFij.get(a);
        //Imprime los valores de x,y del punto fijo
        //System.out.println(p.getX() + " " + p.getY() + "<-Punto 1 (fijo)");
        //Crear el punto de ancla vacio
        Punto pi;
        //Si el listado de puntos medios esta vacio se toma como punto ancla otro punto fijo
        if(puntMed.isEmpty()){
            //Si punto fijo es de la posicion 0, se toma como punto ancla el siguiente
            if(a==0){
                pi = puntFij.get(a+1);
            }else{
            //Si punto fijo es de posicion diferente a 0, se toma como punto ancla el anterior
                pi = puntFij.get(a-1);
            }
        }else{
        //Si el listado de puntos medios no esta vacio se toma como punto ancla el ultimo punto medio generado
            int n=ventana.getPanel().getPuntos().size();
            //Se obtiene el ultimo punto medio generado
            pi = ventana.getPanel().getPuntos().get(n-1);
        }
        //Imprime los valores de x,y del punto ancla
        //System.out.println(pi.getX() + " " + pi.getY() + "<-Punto 2 (ancla)");
        //System.out.println("------");
        //Formula hallar punto medio entre dos puntos
        pmx = (p.getX()+pi.getX())/2;
        pmy = (p.getY()+pi.getY())/2;
        //Imprime los valores de x,y del punto medio
        //System.out.println(pmx + " " + pmy + "<-Punto medio" + "\n");
        return new Punto(pmx,pmy);
    }
}
