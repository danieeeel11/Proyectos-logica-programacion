/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Nodo {
    private String nd;
    private ArrayList<Linea> vecinos;

    public Nodo(String nd, ArrayList<Linea> vecinos) {
        this.nd = nd;
        this.vecinos = vecinos;
    }

    public String getNd() {
        return nd;
    }
    public ArrayList<Linea> getVecinos() {
        return vecinos;
    }
    public void setNd(String nd) {
        this.nd = nd;
    }
    public void setVecinos(ArrayList<Linea> vecinos) {
        this.vecinos = vecinos;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nd=" + nd + ", vecinos=" + vecinos + '}';
    }
    
    
}
