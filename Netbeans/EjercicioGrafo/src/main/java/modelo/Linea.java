/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class Linea {
    private String desde;
    private String hasta;
    private int valor;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Linea(String desde, String hasta, int valor, int x1, int y1, int x2, int y2) {
        this.desde = desde;
        this.hasta = hasta;
        this.valor = valor;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String getDesde() {
        return desde;
    }

    public String getHasta() {
        return hasta;
    }

    public int getValor() {
        return valor;
    }
    
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Linea{" + "desde=" + desde + ", hasta=" + hasta + ", valor=" + valor +"}";
    }

    
}
