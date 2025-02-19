/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class order {
    private int[] vector;
    private ArrayList<Integer> num = new ArrayList<>();
    private ArrayList<Integer> numMerge = new ArrayList<>();
    private ArrayList<Integer> numInsertion = new ArrayList<>();
    private ArrayList<Integer> numCollections = new ArrayList<>();
    private ArrayList<String> dataTxtMerge = new ArrayList<>();
    private ArrayList<String> dataTxtInsertion = new ArrayList<>();
    private ArrayList<String> dataTxtICollections = new ArrayList<>();
    int cambioLinea = 0;
    
    public void leer(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File open = file.getSelectedFile();
            if(open!=null){
                FileReader archivos=new FileReader(open);
                BufferedReader leer =new BufferedReader(archivos);
                String linea;
                while((linea = leer.readLine()) != null){
                    if(num.isEmpty()){
                        String[] v = linea.split("");
                        linea = "";
                        for (int i = 3; i < v.length; i++) {
                            linea += v[i];
                        }
                    }
                    ArrayList<Integer>numbers = sep(linea);
                    for (int i = 0; i < numbers.size(); i++) {
                        num.add(numbers.get(i));
                    }
                }
                leer.close();
                open.getPath();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex + "" +
            "\nNo se ha encontrado el archivo",
            "ERROR!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ArrayList<Integer> sep(String linea){
        String[] n = linea.split(";");
        cambioLinea = n.length;
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            numeros.add(Integer.parseInt(n[i]));
        }
        return numeros;
    }
    
    public void accionVector() {
        vector = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            vector[i]=num.get(i);
        }
    }
    
    public int[] obtenerHora(){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        int nano = locaDate.getNano();
        int[] time = new int[4];
        time[0] = hours;
        time[1] = minutes;
        time[2] = seconds;
        time[3] = nano;
        return time;
    }
    
    public void calcularTime(int[] hInicial, int[] hFinal){
        int cantH = 0;
        int cantMin = 0;
        int cantSeg = 0;
        double cantNano = 0;
        if(hFinal[0]>hInicial[0]){
            cantH = hFinal[0]-hInicial[0];
            if(hFinal[1]>hInicial[1]){
                cantMin = hFinal[1]-hInicial[1];
                if(hFinal[2]>hInicial[2]){
                    cantSeg = hFinal[2]-hInicial[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }else{
                    cantSeg = hInicial[2]-hFinal[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }
            }else{
                cantMin = hInicial[1]-hFinal[1];
                if(hFinal[2]>hInicial[2]){
                    cantSeg = hFinal[2]-hInicial[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }else{
                    cantSeg = hInicial[2]-hFinal[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }
            }
        }else{
            if(hFinal[1]>hInicial[1]){
                cantMin = hFinal[1]-hInicial[1];
                if(hFinal[2]>hInicial[2]){
                    cantSeg = hFinal[2]-hInicial[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }else{
                    cantSeg = hInicial[2]-hFinal[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }
            }else{
                cantMin = hInicial[1]-hFinal[1];
                if(hFinal[2]>hInicial[2]){
                    cantSeg = hFinal[2]-hInicial[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }else{
                    cantSeg = hInicial[2]-hFinal[2];
                    if(hFinal[3]>hInicial[3]){
                        cantNano = hFinal[3]-hInicial[3];
                    }else{
                        cantNano = hInicial[3]-hFinal[3];
                    }
                }
            }
        }
        double totalTime = (cantH*3600) + (cantMin*60) + cantSeg + (cantNano/1000000000);
        System.out.println("Total tiempo empleado en segundos: " + totalTime );
    }
    
    //MERGE SORT----------
    public void ordenacionMergeSort(int vec[]){
        if(vec.length<=1) return;
            int mitad= vec.length/2;
            int izq[]=Arrays.copyOfRange(vec, 0, mitad);
            int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
            ordenacionMergeSort(izq);
            ordenacionMergeSort(der);
            combinarVector(vec, izq, der);
    }
    public void combinarVector(int v[], int izq[],int der[]){
        int i=0;
        int j=0;
        for(int k=0;k<v.length;k++){
            if(i>=izq.length){
                v[k]=der[j];
                j++;
                continue;
            }
            if(j>=der.length){
                v[k]=izq[i];
                i++;
                continue;
            }
            if(izq[i]<der[j]){
                v[k]=izq[i];
                i++;
            }else{
                v[k]=der[j];
                j++;
            }
        }
    }
    public void confMerge(int vec[]){
        for(int i=0;i<vec.length;i++){
            numMerge.add(vec[i]);
        }
    }
    
    
    //INSERTION SORT-------------
    public void sort(int vec[]){
        int n = vec.length;
        for (int i = 1; i < n; ++i) {
            int key = vec[i];
            int j = i - 1;
            while (j >= 0 && vec[j] > key) {
                vec[j + 1] = vec[j];
                j = j - 1;
            }
            vec[j + 1] = key;
        }
    }
    public void confInsertion(int vec[]){
        for (int i = 0; i < vec.length; ++i){
            numInsertion.add(vec[i]);
        }
    }
    
    //COLLECTION-------------------------
    public void Collections(List<Integer> list){
        //List<Integer> list = new ArrayList<>();
        //for (int i=0; i < vec.length; i++){
        //    list.add(vec[i]);
        //}
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            numCollections.add(list.get(i));
        }
    }
    
    
    public void imprimir(){
        int cont = 0;
        String linea = "";
        for (Integer a : num) {
            System.out.print(a + " ");
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
            }
        }
        System.out.println("\n----------MERGE-------------\n");
        for (Integer a : numMerge) {
            System.out.print(a + " ");
            linea += a + " ";
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
                
                dataTxtMerge.add(linea);
                linea = "";
            }
        }
        System.out.println("\n---------INSERTION-----------------\n");
        for (Integer a : numInsertion) {
            System.out.print(a + " ");
            linea += a + " ";
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
                
                dataTxtInsertion.add(linea);
                linea = "";
            }
        }
        
        System.out.println("\n---------COLLECTIONS-----------------\n");
        for (Integer a : numCollections) {
            System.out.print(a + " ");
            linea += a + " ";
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
                
                dataTxtICollections.add(linea);
                linea = "";
            }
        }
    }
    
    
    
    public void run(){
        int vectorInicio[];
        int vectorFinal[];
        leer();
        //Merge sort
        System.out.println("\n----------MERGE-------------\n");
        accionVector();
        vectorInicio = obtenerHora();
        ordenacionMergeSort(vector);
        confMerge(vector);
        vectorFinal = obtenerHora();
        calcularTime(vectorInicio, vectorFinal);
        
        //Collections
        accionVector();
        System.out.println("\n---------COLLECTIONS-----------------\n");
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < vector.length; i++){
            list.add(vector[i]);
        }
        vectorInicio = obtenerHora();
        Collections(list);     
        vectorFinal = obtenerHora();
        calcularTime(vectorInicio, vectorFinal);
        
        //Insertion sort
        System.out.println("\n---------INSERTION-----------------\n");
        accionVector();
        vectorInicio = obtenerHora();
        sort(vector);
        confInsertion(vector);
        vectorFinal = obtenerHora();
        calcularTime(vectorInicio, vectorFinal);
        
        //Impresion 
        //imprimir();
    }
}
