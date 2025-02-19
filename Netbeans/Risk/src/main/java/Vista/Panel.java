package Vista;

import Modelo.Soldado;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Julian Cardenas - Daniel Velasquez
 * @since 10/08/21
 */
public class Panel extends JPanel{
    private ArrayList<Soldado> Ejercito1 = new ArrayList<>();
    private ArrayList<Soldado> Ejercito2 = new ArrayList<>();
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(600, 600);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        //Graphics2D g2d = (Graphics2D)g;
        //Generar los puntos fijos, limpiar el panel y renovar
        g.clearRect(0, 0, 800, 800);
        for (int i = 0; i < Ejercito1.size(); i++) {
            g.setColor(Color.red);
            g.fillOval(Ejercito1.get(i).getX(), Ejercito1.get(i).getY(), 10, 10);
        }
        g.setColor(new Color(20,0,100));
        for (int i = 0; i < Ejercito2.size(); i++) {
            g.fillOval(Ejercito2.get(i).getX(), Ejercito2.get(i).getY(),10,10);
        }
    }
    public ArrayList<Soldado> getEjercito1(){
        return this.Ejercito1;
    }
    public ArrayList<Soldado> getEjercito2(){
        return this.Ejercito2;
    }
}
