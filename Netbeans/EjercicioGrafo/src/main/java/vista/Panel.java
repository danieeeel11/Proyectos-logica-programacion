package vista;

import modelo.Punto;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.Linea;
import modelo.Nodo;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
    //Lista de puntos
    private ArrayList<Punto> puntos = new ArrayList<>();
    private ArrayList<Nodo> nodos = new ArrayList<>();
    private ArrayList<Linea> lineas = new ArrayList<>();
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(800, 600);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.clearRect(0,0,1000,1000);
        for(int i=0; i<lineas.size(); i++){
            g.setColor(Color.BLACK);
            g.drawLine(lineas.get(i).getX1(), lineas.get(i).getY1(), lineas.get(i).getX2(), lineas.get(i).getY2());
        }
        for (int i = 0; i < puntos.size(); i++) {
            g.setColor(Color.red);
            g.fillOval(puntos.get(i).getX(), puntos.get(i).getY(),30,30);
        }
        g.setColor(Color.BLACK);
        g.drawString("A", 315,65);
        g.drawString("B", 65,215);
        g.drawString("C", 565,215);
        g.drawString("D", 115,415);
        g.drawString("E", 515,415);
        
        //AB
        g.drawString("5", 200, 120);
        //AC
        g.drawString("3", 423,120);
        //AE
        g.drawString("10", 422, 250);
        //AD
        g.drawString("9", 200, 250);
        //BD
        g.drawString("14", 70, 330);
        //CE
        g.drawString("2", 549, 330);
        //DE
        g.drawString("8", 315, 440);
        
    }
    
    public ArrayList<Punto> getPuntos(){
        return this.puntos;
    }
    public ArrayList<Nodo> getNodos() {
	return this.nodos;
    }
    public ArrayList<Linea> getLineas() {
        return this.lineas;
    }
    
    
    
}
