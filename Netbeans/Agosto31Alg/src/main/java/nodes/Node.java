/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

/**
 *
 * @author User
 */
public class Node {
    private String info;
    private boolean visitado=false;
    private Node a;
    private Node b;

    public Node(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Node getA() {
        return a;
    }

    public void setA(Node a) {
        this.a = a;
    }

    public Node getB() {
        return b;
    }

    public void setB(Node b) {
        this.b = b;
    }
    
    
    public String printAmigos(){
        String s = "";
        this.visitado=true;
        if(this.a!=null && !this.a.visitado){
            s+= " " +a.printAmigos();
        }
        s+=" "+info +" "; 
        if (this.b!=null && !this.b.visitado) {
            s+=" " + b.printAmigos();
        }
        
        return s;
    }
    
    
    
    public Node findInfo(String x){
        this.visitado=true;
        
        if(this.info.equals(x)){
            return this;
        }
        Node rta= null;
        if(this.a!=null && !this.a.visitado){
            rta= a.findInfo(x);
        }
        if(rta==null){
           if (this.b!=null && !this.b.visitado) {
                rta = b.findInfo(x);
            } 
        }
        
        
        return rta;
    }
}
