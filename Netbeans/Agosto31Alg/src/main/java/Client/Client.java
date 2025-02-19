/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import nodes.Node;

/**
 *
 * @author User
 */
public class Client {
    public static void main(String[] args) {
        Node x = new Node ("A");
        x.setA(new Node("B"));
        x.setB(new Node("C"));
        
        x.getA().setA(new Node("D"));
        x.getA().setB(new Node("E"));
        
        x.getA().getB().setA(x);
        Node rta=x.findInfo("E");
        System.out.println(rta);
        System.out.println(rta.getInfo());
        //System.out.println(x.printAmigos());
    }
            
}
