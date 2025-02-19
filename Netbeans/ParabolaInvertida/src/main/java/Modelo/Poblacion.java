/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 */
public class Poblacion {
    private String signo;
    private String binario;

    public Poblacion(String signo, String binario) {
        this.signo = signo;
        this.binario = binario;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    @Override
    public String toString() {
        return "[" + signo + ", " + binario + ']';
    }
    
    
}
