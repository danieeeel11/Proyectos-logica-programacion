/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import vista.Ventana;

/**
 *
 * @author User
 */
public class Borrador {
    
    private Ventana ventana = null;
    public Borrador(Ventana v){
        this.ventana=v;
    }
    ArrayList<Linea> lineasAux = new ArrayList<>();
    //indice de valores para completar el camino
    int conteo=0;
    String ndAux=null;
    public void recorridoo(String desde, String hasta) {
        ArrayList<Nodo> nodos = new ArrayList<>(ventana.getPanel().getNodos());
        ArrayList<Linea> lineas=null;
        ArrayList<String> valores=new ArrayList<>();
        
        if(!nodos.stream().filter(p->p.getNd().equals(desde)).findAny().isPresent()){
            System.out.println("Nodo " + desde + " no disponible");
        }else if(!nodos.stream().filter(p->p.getNd().equals(hasta)).findAny().isPresent()){
            System.out.println("Nodo " + hasta + " no disponible");
        }else{
            Nodo nn = ventana.getPanel().getNodos().stream().filter(p->p.getNd().equals(desde)).findAny().get();
            lineas = new ArrayList<>(nn.getVecinos());
            if(lineas.stream().filter(p->p.getDesde().equals(hasta)).findAny().isPresent()){
                Linea l = lineas.stream().filter(p->p.getDesde().equals(hasta)).findAny().get();
                //valores.add(String.valueOf(l.getValor())+ "+");
                valores.add(String.valueOf(l.getValor()));
                conteo++;
                lineas.remove(l);
                lineasAux.add(l);
            }
            if(lineas.stream().filter(p->p.getHasta().equals(hasta)).findAny().isPresent()){
                Linea l = lineas.stream().filter(p->p.getHasta().equals(hasta)).findAny().get();
                valores.add(String.valueOf(l.getValor()));
                //valores.add(String.valueOf(l.getValor())+ "+");
                conteo++;
                lineas.remove(l);
                lineasAux.add(l);
            }
            for (int i = 0; i < lineas.size(); i++) {
                String nodo = null;
                if(!lineas.get(i).getDesde().equals(desde)){
                    nodo = lineas.get(i).getDesde();
                }else if(!lineas.get(i).getHasta().equals(desde)){
                    nodo = lineas.get(i).getHasta();
                }
                //ndAux=nodo;
                valores.add(String.valueOf(lineas.get(i).getValor())+ "+");
                //boolean find = false;
                //find = entreNodos(nodo, hasta, valores);
                /*if(find){
                    while(find){
                        find = entreNodos(ndAux, hasta, valores);
                    }
                }*/
                entreNodos(nodo, hasta, valores);
            }
            String way = cam(valores);
            System.out.println("El menor camino desde " + desde + " hasta " + hasta +" es: " + way);
            nodoCamino(way, desde, hasta);
            System.out.println("\n");
            
        }
        lineasAux.clear();
        nodos.clear();
        lineas.clear();
        valores.clear();
        conteo=0;
    }
    
    public boolean entreNodos(String n1, String n2, ArrayList<String> valores){
        Nodo nod1 = ventana.getPanel().getNodos().stream().filter(p->p.getNd().equals(n1)).findFirst().get();
        //Nodo nod2 = ventana.getPanel().getNodos().stream().filter(p->p.getNd().equals(n2)).findFirst().get();
        boolean encontrado = false;
        ArrayList<Linea> lineas = new ArrayList<>(nod1.getVecinos());
        for (int i = 0; i < lineasAux.size(); i++) {
            if(lineas.get(i).equals(lineasAux.get(i))){
                lineas.remove(i);
            }
        }
        
        if(lineas.stream().filter(p->p.getDesde().equals(n2)).findAny().isPresent()){
            Linea l = lineas.stream().filter(p->p.getDesde().equals(n2)).findAny().get();
            String n = valores.get(conteo);
            valores.set(conteo, n + String.valueOf(l.getValor()));
            //valores.set(conteo, n + String.valueOf(l.getValor())+ "+");
            conteo++;
            encontrado=true;
        }else if(lineas.stream().filter(p->p.getHasta().equals(n2)).findAny().isPresent()){
            Linea l = lineas.stream().filter(p->p.getHasta().equals(n2)).findAny().get();
            String n = valores.get(conteo);
            valores.set(conteo, n + String.valueOf(l.getValor()));
            //valores.set(conteo, n + String.valueOf(l.getValor())+ "+");
            conteo++;
            encontrado=true;
        }else{
            //Nuevo
            //ndAux= n1;
            
            String n = valores.get(conteo);
            valores.set(conteo, n + 100);
            
            //valores.set(conteo, n + 0 + "+");
            conteo++;
            encontrado=false;
        }
        
        return encontrado;
    }
    
    public String cam(ArrayList<String> valores){
        String data = null;
        ArrayList<Integer> dataI = new ArrayList<>();
        ArrayList<String> dataIS = new ArrayList<>();
        
        for (String v : valores) {
            String[] text = v.split("\\+");
            int n=0;
            for (int i = 0; i < text.length; i++) {
                int num = Integer.parseInt(text[i]);
                //numeros[i] = num;
                n+=num;
            }
            dataI.add(n);
            dataIS.add(v+ "=" +n);
        }
        System.out.println("Caminos: " + dataIS.toString());
        int menorCamino = Collections.min(dataI);
        for (String is : dataIS) {
            String[] n = is.split("\\=");
            if(Integer.parseInt(n[1])==menorCamino){
                data=is;
            }
        }
        return data;
    }
    
    public void nodoCamino(String camino, String desde, String hasta){
        String[] text1 = camino.split("\\=");
        String[] text = text1[0].split("\\+");
        String nodos=desde;
        String nodoAux=desde;
        for(int i =0; i<text.length; i++){
            for (Linea lineas :ventana.getPanel().getLineas()) {
                if(text[i].equals(String.valueOf(lineas.getValor()))){
                    if(nodoAux.equals(lineas.getDesde())){
                        nodos+="-"+lineas.getHasta();
                        nodoAux=lineas.getHasta();
                    }else if(nodoAux.equals(lineas.getHasta())){
                        nodos+="-"+lineas.getDesde();
                        nodoAux=lineas.getDesde();
                    }
                }
            }
        }
        System.out.println("El camino es: "+nodos);
    }
}
