package Vista;

import Modelo.Punto;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
    //Lista de puntos
    private ArrayList<Punto> puntos = new ArrayList<>();
    private ArrayList<Punto> puntosFijos = new ArrayList<>(3);
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(1000, 1000);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        //Graphics2D g2d = (Graphics2D)g;
        //Generar los puntos fijos
        for (int i = 0; i < puntosFijos.size(); i++) {
            g.setColor(Color.red);
            g.fillOval(puntosFijos.get(i).getX(), puntosFijos.get(i).getY(), 30, 30);
        }
        //g es elmarcador que dibuja los puntos
        g.setColor(new Color(20,0,100));//Color a base de rgb
        //Generar los puntos medios
        for (int i = 0; i < puntos.size(); i++) {
            g.fillOval(puntos.get(i).getX(), puntos.get(i).getY(),5,5);
        }
    }
    /**
     * Listado de puntos medios
     * @return listado de puntos medios
     */
    public ArrayList<Punto> getPuntos(){
        return this.puntos;
    }
    /**
     * Listado de puntos fijos
     * @return listado de puntos fijos
     */
    public ArrayList<Punto> getPuntoFijo(){
        return this.puntosFijos;
    }
}
