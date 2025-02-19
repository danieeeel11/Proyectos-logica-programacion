package automata;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 */
public class AFD{
    private String alfabeto;
    private int noEstados;
    private String estadoInicial;
    private String estadosFinales;
    private Node[] estados;
    private String[][] matriz;

    public AFD(AFD a) {
            this(a.getAlfabeto(), a.getEstados().length, a.getEstadoInicial(), a.getEstadosFinales(), a.getEstados());
    }
    
    public AFD (String alfabeto, int noEstados, String ei, String ef, Node[] estados) {
        this.alfabeto = alfabeto;
        this.noEstados = noEstados;
        this.estadoInicial = ei;
        this.estadosFinales = ef;
        this.estados = new Node[this.noEstados];
        
        for(int i=0; i<this.noEstados;i++) {
            this.estados[i] = new Node(estados[i]);
        }
    }

    public String getAlfabeto() {
        return alfabeto;
    }
    public int getNoEstados() {
        return noEstados;
    }
    public String getEstadoInicial() {
        return estadoInicial;
    }
    public String getEstadosFinales() {
        return estadosFinales;
    }
    public Node[] getEstados() {
        return estados;
    }
    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }
    public void setNoEstados(int noEstados) {
        this.noEstados = noEstados;
    }
    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }
    public void setEstadosFinales(String estadosFinales) {
        this.estadosFinales = estadosFinales;
    }
    public void setEstados(Node[] estados) {
        this.estados = estados;
    }

    public AFD(String alfabeto, int noEstados) {
        this.alfabeto = alfabeto;
        this.noEstados = noEstados;
        this.estadoInicial = "";
        this.estadosFinales = "";
        estados = new Node[noEstados];
    }

    public void llenarEstados() {
        int numAlf = 0;
        for (String s: this.alfabeto.split(",")) {
            numAlf++;
        }
        this.matriz = new String[this.noEstados+1][numAlf+1];
        for(int i = 0; i < this.noEstados; i++) {
            String name = JOptionPane.showInputDialog("Nombre de Estado No. " + (i + 1));
            boolean ini, fina;
            if(this.estadoInicial.equals("")) {
                    ini = JOptionPane.showConfirmDialog(null, "El Estado  '" + name
                                    + "' ¿Es Inicial?", "Estado" + (i + 1), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

                    this.estadoInicial = ini ? name : "";
            }else {
                    ini = false;
            }

            fina = JOptionPane.showConfirmDialog(null, "El Estado  '" + name
                            +"' ¿Es Final?", "Estado " + i,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            this.estadosFinales += fina ? name + "," : "";

            estados[i] = new Node(name, ini, fina);
            estados[i].llenarTransiciones(this.alfabeto);

        }
        matriz[0][0] = " ";
        for (int i = 1; i < this.noEstados+1; i++) {
            String IndiceEstados = estados[i-1].nombre;
            matriz[i][0] = IndiceEstados;
            for (int j = 1; j < numAlf+1; j++) {
                String alf [] = this.alfabeto.split(",");
                matriz[0][j] = alf[j-1];
            }
        }
        for (int i = 1; i < this.noEstados+1; i++) {
            for (int j = 1; j < numAlf+1; j++) {
                String alf [] = this.alfabeto.split(",");
                matriz[i][j] = estados[i-1].transiciones.get(alf[j-1]);
            }
        }
    }

    public void analizarCadena(){
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena para ser analizada: ");
        String[] carac = cadena.split("");
        String nextEst = "";
        boolean valido = true;
        ArrayList<String> camino = new ArrayList<>();
        String nodoInicial = obtenerNodoInicial().getNombre();
        
        for (int i = 0; i < carac.length; i++) {
            if(i == 0){
                if(!busqueda(carac[i], nodoInicial).equals("")){
                   camino.add(nodoInicial);
                   nextEst = busqueda(carac[i], nodoInicial);
                   camino.add(nextEst);
                }else{
                    valido = false;
                    break;
                }
            }else{
                if(!busqueda(carac[i], nextEst).equals("")){
                    nextEst = busqueda(carac[i], nextEst);
                    camino.add(nextEst);
                }else{
                    valido = false;
                    break;
                }
            }
        }
        
        if(!valido){
            System.out.println("\nNo es valida la cadena: " + cadena);
        }else{
            System.out.println("\nCamino tomado: \n" + camino.toString());
            String estadoFinal = camino.get(camino.size()-1);
            if(nodoEsFinal(obtenerNodo(estadoFinal))){
                System.out.println("Cadena aceptada: " + cadena);
            }else{
                System.out.println("Cadena rechazada: " + cadena);
            }
        }

    }

    public String busqueda(String caracter, String estado){
        String estadoSiguiente = "";
        int est = 0;
        int carac = 0;
        int numAlf = 0;
        for (String s: this.alfabeto.split(",")) {
            numAlf++;
        }
        for (int i = 1; i < this.noEstados+1; i++) {
            //Columna indice estados
            if(matriz[i][0].equals(estado)){
                est = i;
            }
            for (int j = 1; j < numAlf+1; j++) {
                if(matriz[0][j].equals(caracter)){
                    carac = j;
                }
            }
        }
        if(est != 0 && carac!=0){
            estadoSiguiente = matriz[est][carac];
        }
        return estadoSiguiente;
    }
    
    public void imprimirMatriz(){
        String estados = "";
        for (int i = 1; i < this.noEstados+1; i++) {
            if(i == this.noEstados){
                estados += matriz[i][0];
            }else{
                estados += matriz[i][0] + ", ";
            }
        }
        System.out.println("Estados Q={" + estados + "}");
        System.out.println("Alfabeto E={" + this.alfabeto +"}");
        System.out.println("Estado Inicial q0={" + obtenerNodoInicial().getNombre() +"}");
        System.out.println("Estado Final f={" + obtenerNodoFinal().getNombre() +"}");
        System.out.println("Matriz de transiciones=");
        int numAlf = 0;
        for (String s: this.alfabeto.split(",")) {
            numAlf++;
        }
        for (int i = 0; i < this.noEstados+1; i++) {
            for (int j = 0; j < numAlf+1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("------------------------");
    }
    
    public Node obtenerNodo(String nombreNodo) {
        Node estado = null;
        for(Node tmp : this.estados) {
            if(tmp.nombre.equals(nombreNodo)) {
                estado = tmp;
            }
        }
        return estado;
    }

    public Node obtenerNodoInicial() {
        Node estado = null;
        for(Node tmp : this.estados) {
            if(tmp.inicial) {
                estado = tmp;
            }
        }
        return estado;
    }
    
    public Node obtenerNodoFinal() {
        Node estado = null;
        for(Node tmp : this.estados) {
            if(tmp.finall) {
                estado = tmp;
            }
        }
        return estado;
    }

    public boolean nodoEsFinal(Node n) {
        boolean find = false;
        for (Node tmp : this.estados) {
            if(n.finall == true) {
                find = true;
            }
        }
        return find;
    }
}
