/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.EyS;

/**
 *
 * @author User
 */
public class Operacion {
    private EyS vista;

    public Operacion(EyS v) {
        this.vista = v;
    }

    
    
    public void llenarData(){
        vista.imprimirInformacion("Tamaño del arreglo: ");
        int tam = vista.leerDatoInt();
        vista.imprimirInformacion("Ingrese el contido");
        for (int i = 0; i < tam; i++) {
            vista.getArregloNumeros().add(vista.leerDatoInt());
        }
    }
    
    public boolean camino() {
        boolean ca = true;
	int aumento=1;
        int resto =1;
        
        for (int i = 0; i < vista.getArregloNumeros().size(); i+=aumento) {
            if(ca){
                if(vista.getArregloNumeros().get(0).equals(0)){
                    ca = false;
                }else{
                    if(vista.getArregloNumeros().get(i).equals(0)){
                        ca = pasar(vista.getArregloNumeros().get(i-resto), (i-resto), i);
                        if(i-resto>=0){
                            while((resto!=i+1) && !ca ){
                                ca = pasar(vista.getArregloNumeros().get(i-resto), (i-resto), i);
                                resto++;
                            }
                            resto=1;
                        }else{
                            ca=false;
                        }
                        
                    }
                }
            }else{
                return ca;
            }
            
        }
        return ca;
    }
    
    public boolean pasar(int i, int idex, int izero){
        boolean pas = false;
        int max =i;
        int min=1;
        for(int x=1; x<=max;x++){
            if(izero==vista.getArregloNumeros().size()-1){
                return pas=true;
            }
            if(idex+min>izero){
                //System.out.println(idex+min);
                return pas=true;
            }else{
                min++;
            }
        }
        
        return pas;
    }
        
}
