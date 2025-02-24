/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Gorila;
import Modelo.Punto;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
    private ArrayList<Gorila> Gorilas = new ArrayList<>();
    private ArrayList<Punto> Puntos = new ArrayList<>();
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(800, 600);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g.clearRect(0, 0, 800, 600);
        float grosor = 6;
        Stroke oldStroke = g2.getStroke();
        g2.setStroke(new BasicStroke(grosor));
        g2.setColor(Color.DARK_GRAY);
        g.drawRect(0, 0, 800, 600);
        g2.setStroke(oldStroke);
        for (int i = 0; i < Gorilas.size(); i++) {
            g.setColor(Color.red);
            g.fillOval(Gorilas.get(i).getX(), Gorilas.get(i).getY(), 30, 30);
        }
        g.setColor(new Color(20,0,100));
        for (int i = 0; i < Puntos.size(); i++) {
            g.fillOval(Puntos.get(i).getX(), Puntos.get(i).getY(),10,10);
        }
    }
    
    public ArrayList<Gorila> getGorilas(){
        return this.Gorilas;
    }
    public ArrayList<Punto> getPuntos(){
        return this.Puntos;
    }
}
