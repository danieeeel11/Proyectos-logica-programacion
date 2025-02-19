/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 */
public class Operacion {
    private ArrayList<Poblacion> poblacion = new ArrayList<>();
    private List<Punto> puntos = new ArrayList<>();
    
    public void generarPoblacion(){
        Random rdm = new Random();
        System.out.println("Funcion parabola: -2x^2 +3");
        int start = -200;
        int end = 200;
        System.out.println("Intervalo: [" + start + ", " + end + "]");
        //Generamos una poblacion de 40 individuos, obtenidos del intervalo aleatoriamente
        //Guardamos el valor binario de tales valores en listado
        for (int i = 0; i < 40; i++) {
            int value = rdm.nextInt(end-start+1)+start;
            if(value<0){
                //de decimal a binario
                String bin = Integer.toBinaryString(Math.abs(value));
                poblacion.add(new Poblacion("-", bin));
            }else{
                String bin = Integer.toBinaryString(value);
                poblacion.add(new Poblacion("+", bin));
            }
        }
    }
    
    public void obtenerY(){
        for (int i = 0; i < poblacion.size(); i++) {
            // de binario a decimal
            String x = poblacion.get(i).getSigno() + Integer.parseInt(poblacion.get(i).getBinario(), 2);
            int y = formula(Integer.parseInt(x));
            puntos.add(new Punto(Integer.parseInt(x),y));
        }
    }
    
    public void evaluarMayores(){
        Random r = new Random();
        Collections.sort(puntos, (o1, o2) -> Integer.compare(o2.getY(),o1.getY()));
        //puntos.forEach(System.out::println);
        
        //Medio totalitarista - seleccion de los dos mejores
        //String fth1 = Integer.toBinaryString(Math.abs(puntos.get(0).getX()));
        //String fth2 = Integer.toBinaryString(Math.abs(puntos.get(1).getX()));
        
        //Medio aleatorio
        String fth1 = Integer.toBinaryString(Math.abs(puntos.get(r.nextInt((puntos.size()-1)-0+1)+0).getX()));
        String fth2 = Integer.toBinaryString(Math.abs(puntos.get(r.nextInt((puntos.size()-1)-0+1)+0).getX()));
        
        System.out.println("Ascendentes: " + fth1 + " , " + fth2);
        String sn1 = "";
        String sn2 = "";
        
        String mit1Fth1;
        String mit2Fth1;
        String mit1Fth2;
        String mit2Fth2;
        if(fth1.length()%2 == 0){
            mit1Fth1 = fth1.substring(0, (fth1.length()/2));
            mit2Fth1 = fth1.substring((fth1.length()/2), fth1.length());
            sn1 = mit1Fth1;
            if(fth2.length()%2 == 0){
                mit1Fth2 = fth2.substring(0, (fth2.length()/2));
                mit2Fth2 = fth2.substring((fth2.length()/2), fth2.length());
                sn1 += mit2Fth2;
                sn2 = mit1Fth2 + mit2Fth1;
            }else{
                mit1Fth2 = fth2.substring(0, ((fth2.length()+1)/2));
                mit2Fth2 = fth2.substring(((fth2.length()+1)/2), fth2.length());
                sn1 += mit2Fth2;
                sn2 = mit1Fth2 + mit2Fth1;
            }
        }else{
            mit1Fth1 = fth1.substring(0, ((fth1.length()+1)/2));
            mit2Fth1 = fth1.substring(((fth1.length()+1)/2), fth1.length());
            sn1 = mit1Fth1;
            if(fth2.length()%2 == 0){
                mit1Fth2 = fth2.substring(0, (fth2.length()/2));
                mit2Fth2 = fth2.substring((fth2.length()/2), fth2.length());
                sn1 += mit2Fth2;
                sn2 = mit1Fth2 + mit2Fth1;
            }else{
                mit1Fth2 = fth2.substring(0, ((fth2.length()+1)/2));
                mit2Fth2 = fth2.substring(((fth2.length()+1)/2), fth2.length());
                sn1 += mit2Fth2;
                sn2 = mit1Fth2 + mit2Fth1;
            }
        }
        
        String a1 = fth1;
        String a2 = fth2;
        Poblacion binFth1 = poblacion.stream().filter(p->p.getBinario().equals(a1)).findAny().get();
        Poblacion binFth2 = poblacion.stream().filter(p->p.getBinario().equals(a2)).findAny().get();
        sn1 = String.valueOf(Integer.parseInt(sn1, 2));
        sn2 = String.valueOf(Integer.parseInt(sn2, 2));
        if(binFth1.getSigno().equals("-") && binFth2.getSigno().equals("+")){
            sn1 = "-" + sn1;
        }else if(binFth1.getSigno().equals("+") && binFth2.getSigno().equals("-")){
            sn2 = "-" + sn2;
        }
        System.out.println("Descendientes: [" + Integer.parseInt(sn1) + " , " + Integer.parseInt(sn2) + "]");
        evaluar(Integer.parseInt(sn1), Integer.parseInt(sn2));
    }
    
    public void mutar(){
        Random r = new Random();
        for (int i = 20; i < 40; i++) {
            int pos = (r.nextInt((poblacion.get(i).getBinario().length()-1)-0+1)+0);
            int length = poblacion.get(i).getBinario().length();
            String bin = "";
            for (int j = 0; j < length; j++) {
                if(j == pos){
                    if(poblacion.get(i).getBinario().charAt(j) == '1'){
                        bin += '0';
                    }else{
                        bin += '1';
                    }
                    
                }else{
                    bin += poblacion.get(i).getBinario().charAt(j);
                }
            }
            int countZero = 0;
            for (int j = 0; j < bin.length(); j++) {
                if(bin.charAt(j) == '0'){
                    countZero++;
                }else{
                    break;
                }
            }
            if(countZero == bin.length()){
                bin = "0";
                poblacion.get(i).setBinario(bin);
            }else{
                String aux = "";
                for (int j = countZero; j < bin.length(); j++) {
                    aux += bin.charAt(j);
                }
                poblacion.get(i).setBinario(aux);
            }
        }
        puntos.clear();
        obtenerY();
        evaluarMayores();
    }
    
    public void evaluar(int sn1, int sn2){
        String sign1 = "+";
        String sign2 = "+";
        if(sn1<0){
            sign1 = "-";
        }else if(sn2<0){
            sign2 = "-";
        }
        String aux1 = Integer.toBinaryString(Math.abs(puntos.get(puntos.size()-1).getX()));
        String aux2 = Integer.toBinaryString(Math.abs(puntos.get(puntos.size()-2).getX()));
        Poblacion rem1 = poblacion.stream().filter(p->p.getBinario().equals(aux1)).findAny().get();
        poblacion.set(poblacion.indexOf(rem1), new Poblacion(sign1 ,Integer.toBinaryString(Math.abs(sn1))));
        Poblacion rem2 = poblacion.stream().filter(p->p.getBinario().equals(aux2)).findAny().get();
        poblacion.set(poblacion.indexOf(rem2), new Poblacion(sign2 ,Integer.toBinaryString(Math.abs(sn2))));
        puntos.clear();
        obtenerY();
        Collections.sort(puntos, (o1, o2) -> Integer.compare(o2.getY(),o1.getY()));
        puntos.forEach(System.out::println);
    }
    
    public boolean compIgualdad(){
        boolean equ = false;
        String bin = poblacion.get(0).getBinario();
        if(poblacion.stream().filter(p->p.getBinario().equals(bin)).count() == poblacion.size()){
            equ = true;
        }
        return equ;
    }
    
    public void run (int gen){
        generarPoblacion();
        obtenerY();
        System.out.println("Generacion 0 ------------------------------------------ ");
        Collections.sort(puntos, (o1, o2) -> Integer.compare(o2.getY(),o1.getY()));
        puntos.forEach(System.out::println);
        for (int i = 0; i < gen; i++) {
            System.out.println("Generacion " + (i+1) + " ------------------------------------------ ");
            if(compIgualdad()){
                mutar();
            }else{
                evaluarMayores();
            }
            
        }
        System.out.println("\nEl mejor valor de x generado tras " + gen + " generaciones es: x=" + puntos.get(0).getX() + ", y=" + puntos.get(0).getY());
    }
    
    public Integer formula(int x){
        return (int)((-2*Math.pow(x,2)) +3);
    }

    public ArrayList<Poblacion> getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(ArrayList<Poblacion> poblacion) {
        this.poblacion = poblacion;
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Punto> puntos) {
        this.puntos = puntos;
    }
    /*String p = "100080";
        System.out.println(p.substring(0, (p.length()/2)));
        System.out.println(p.substring((p.length()/2), p.length()));
        
        p = "1000111";
        System.out.println(p.substring(0, ((p.length()+1)/2)));
        System.out.println(p.substring(((p.length()+1)/2), p.length()));
        
        p = "11";
        System.out.println(p.substring(0, (p.length()/2)));
        System.out.println(p.substring((p.length()/2), p.length()));
        
        p = "0";
        System.out.println(p.substring(0, ((p.length()+1)/2)));
        System.out.println(p.substring(((p.length()+1)/2), p.length()));
        */
    
}
