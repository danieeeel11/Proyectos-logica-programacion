/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Nodo {
    private String info;
    private boolean visitado=false;
    private ArrayList<Nodo> vecinos = new ArrayList<Nodo>();
    private ArrayList<Integer> pesosVecinos = new ArrayList<Integer>();
    
    
    public Nodo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    public void agregarVecino(Nodo k, int peso){
        vecinos.add(k);
        pesosVecinos.add(peso);
        k.vecinos.add(this);
        k.pesosVecinos.add(peso);
    }
    public String printNodo(){
        this.visitado=true;
        String s ="Estoy en "+ info + " ";
        for(int i=0;i<vecinos.size();i++){
            s+="---->"+vecinos.get(i).info + " a " + pesosVecinos.get(i).intValue()+'\n';
            if(!vecinos.get(i).visitado){
                s+=vecinos.get(i).printNodo();
            }
        }
        return s;
    } 
}
