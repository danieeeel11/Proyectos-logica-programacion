package Modelo;

import Vista.Ventana;

/**
 *
 * @author User
 */
public class A {
    private Ventana ventana = null;
    public A(Ventana v){
        this.ventana=v;
    }
    
    public void operacion(int num1, int num2){
        Suma s = new Suma();
        int k = s.sumar(num1, num2);
        this.ventana.updateLabel(k + "");
        //System.out.println(k);
        
    }
    //public String texto;

}
