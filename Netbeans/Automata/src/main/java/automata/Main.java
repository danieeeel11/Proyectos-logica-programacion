package automata;

import javax.swing.JOptionPane;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 */
public class Main {
    private AFD m1;
    private String  alfabeto;

    public static void main(String[] args) {
        Main e = new Main();
        e.inicio();
    }

    public void inicio() {
        alfabeto = JOptionPane.showInputDialog("Alfabeto E={}:");
        int noEstadosM1 = Integer.parseInt(JOptionPane.showInputDialog("N° de estados:"));
        m1 = new AFD(alfabeto, noEstadosM1);
        m1.llenarEstados();
        m1.imprimirMatriz();
        m1.analizarCadena();
    }
}
