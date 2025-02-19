package automata;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 */
public class Node {
    protected String nombre;
    protected boolean inicial, finall;
    protected Map<String, String> transiciones;

    public Node(Node n) {
        this(n.getNombre(), n.isInicial(), n.isFina(), n.getTransiciones());
    }

    public Node(String nombre, boolean inicial, boolean fina, Map<String, String >transiciones) {
        this.nombre = nombre ;
        this.inicial = inicial;
        this.finall = fina;
        this.transiciones = transiciones;
    }

    public String getNombre() {
        return nombre;
    }
    public boolean isInicial() {
        return inicial;
    }
    public boolean isFina() {
        return finall;
    }
    public Map<String, String> getTransiciones(){
        return transiciones;
    }
    public Node(String name, boolean i, boolean f) {
        this.nombre = name;
        this.inicial = i;
        this.finall = f;
        this.transiciones = new HashMap();
    }
    
    public void llenarTransiciones(String alfabeto) {
        for (String simbolo : alfabeto.split(",")) {
            transiciones.put(simbolo, JOptionPane.showInputDialog("Transicion de " +
            this.nombre + " con (" + simbolo + ") se dirige a: "));
        }
    }
    public String getTransicionDeSimbolo(String simbolo) {
        return this.transiciones.get(simbolo);
    }
	
}
