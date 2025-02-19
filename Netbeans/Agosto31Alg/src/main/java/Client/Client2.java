/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import nodes.Nodo;

/**
 *
 * @author User
 */
public class Client2 {
    public static void main(String[] args) {
        Nodo a=new Nodo("A");
        Nodo b=new Nodo("B");
        Nodo c=new Nodo("C");
        Nodo d=new Nodo("D");
        Nodo e=new Nodo("E");
        Nodo f=new Nodo("F");
        Nodo g=new Nodo("G");
        Nodo h=new Nodo("H");
        Nodo i=new Nodo("I");
        Nodo j=new Nodo("J");
        
        a.agregarVecino(b, 15);
        c.agregarVecino(f, 20);
        b.agregarVecino(d, 10);
        d.agregarVecino(c, 30);
        a.agregarVecino(f, 90);
        
        System.out.println(a.printNodo());
        
    }
}
