/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Ventana;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Operacion {
    private Ventana ventana = null;
    //private Timer timer= new Timer();
    public Operacion(Ventana v){
        this.ventana=v;
    }
    
    double Angulo;
    double Altura;
    double Velocidadi;
    double Distancia;
    double Velocidadx;
    double Velocidady;
    double Velocidadf;
    double Tiempo;
    
    int a=1;
    public void operacionPosicionXY(int angulo, int velocidad) {
        ventana.getPanel().getPuntos().clear();
        for (double i = 0; i < Tiempo()+2; i+=0.2) {
            int x=(int) ((int) velocidad*Math.cos((Math.toRadians(Angulo)))*i);
            int y = (int) (velocidad*Math.sin(Math.toRadians(Angulo))*i
                    +(-0.5)*9.8*Math.pow(i, 2));
            Punto punto=new Punto(50+x, 550-y);
            if(punto.getX()>800 || punto.getY()>600){
                break;
            }
            ventana.getPanel().getPuntos().add(punto);
            ventana.getPanel().repaint();
            /*try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("aaaaaaa");
            }*/
        }
        
        this.ventana.updateLabel4("");
        this.ventana.updateLabel4(String.valueOf(a));
        a++;
    }
    
    int im = 2;
    public void impacto(){
        int margenIx = ventana.getPanel().getGorilas().get(1).getX();
        int margenFx = ventana.getPanel().getGorilas().get(1).getX()+30;
        
        int margenIy = ventana.getPanel().getGorilas().get(1).getY();
        int margenFy = ventana.getPanel().getGorilas().get(1).getY()+30;
        
        Boolean impact=false;
        for (int i = 0; i < ventana.getPanel().getPuntos().size(); i++) {
            if(ventana.getPanel().getPuntos().get(i).getX()> margenIx && 
                    ventana.getPanel().getPuntos().get(i).getX()<margenFx && 
                    ventana.getPanel().getPuntos().get(i).getY()>margenIy &&
                    ventana.getPanel().getPuntos().get(i).getY()<margenFy){
                impact=true;
            }
        }
        
        if(impact){
            if(im==2){
                this.ventana.updateLabel("");
                this.ventana.updateLabel("I I");
                im--;
            }else if(im==1){
                this.ventana.updateLabel("");
                this.ventana.updateLabel("I");
                im--;
            }else{
                this.ventana.updateLabel("");
                this.ventana.updateLabel("Rival derrotado");
            }
        }
        if(ventana.getLabel().equals("Rival derrotado")){
            JOptionPane.showMessageDialog(null, "El rival ha sido derrotado");
        }
    }
    
    public void dibujarBola(int i){
        for (int j = 0; j < ventana.getPanel().getPuntos().size(); j++) {
            if(j==i){
                //Punto pt= pu.get(i);
                //ventana.getPanel().getPuntos().add(pt);
                Punto p = ventana.getPanel().getPuntos().get(i);
                ventana.getPanel().repaint(p.getX(),p.getY(),10,10);
            }
        }
    }
        
    /**
    * Retorna datos de la vel max, altura max, distancia max, tiempo
    * @param angulo
    * @param velocidad
    */
    public void operacionesDatos(double angulo, double velocidad){
        Angulo = angulo;
        Velocidadi = velocidad;
        System.out.println("\nDistancia Recorrida: "+Distancia()+" m");
        System.out.println("Tiempo Total: "+Tiempo()+" s");
        System.out.println("Velocidad Maxima: "+Velocidad()+" m/s");
        System.out.println("Altura Maxima: "+Altura()+" m");
    }

    double Distancia(){
        Distancia = ((Math.pow(Velocidadi,2)*(Math.sin(Math.toRadians(Angulo*2))))/9.8);
        return Distancia;
    }
    double Tiempo(){
        Tiempo = ((2*Velocidadi)*(Math.sin(Math.toRadians(Angulo))))/9.8;
        return Tiempo;
    }
    double Velocidad(){
        Velocidadx = (Velocidadi*Math.cos(Math.toRadians(Angulo)));
        Velocidady = (Velocidadi*Math.sin(Math.toRadians(Angulo)) - 9.8*Tiempo);
        Velocidadf = (Math.sqrt(Math.pow(Velocidadx,2)+Math.pow(Velocidady,2)));
        return Velocidadf;
    }
    double Altura(){
        Altura = ((Math.pow(Velocidadi,2)*Math.pow(Math.sin(Math.toRadians(Angulo)),2))/(9.8*2));
        return Altura;
    }
    
    public void addGorila(){
        ventana.getPanel().getGorilas().add(new Gorila(50,550));
        ventana.getPanel().getGorilas().add(new Gorila(750,550));
        ventana.getPanel().repaint();
    }
    
    public void cambiarPosGorila(){
        Random r = new Random();
        String n = ventana.getLabel4().getText();
        int num = Integer.parseInt(n);
        if(num>0){
            //ventana.getPanel().getGorilas().set(1, new Gorila(r.nextInt()*750-450, r.nextInt()*550-100));
            ventana.getPanel().getGorilas().set(1, new Gorila(r.nextInt(750-450+1)+450, r.nextInt(550-100+1)+100));
            System.out.println("a");
            ventana.getPanel().repaint();
        }
        //ventana.getPanel().getGorilas().get(1).setX(r.nextInt()*750-450);
        //ventana.getPanel().getGorilas().get(1).setY(r.nextInt()*550-100);
        //ventana.getPanel().repaint();
    }
}
