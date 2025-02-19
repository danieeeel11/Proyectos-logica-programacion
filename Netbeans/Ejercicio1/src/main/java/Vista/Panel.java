/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Punto;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
    //Lista de puntos
    private ArrayList<Punto> puntos = new ArrayList<>();
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(800, 800);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        //castear g en Graphics2D
        //g es elmarcador que dibuja los puntos
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(new Color(20,0,100));//Color a base de rgb
        for (int i = 0; i < puntos.size(); i++) {
            g.fillOval(puntos.get(i).getX(), puntos.get(i).getY(),30,30);
        }
        
        //fill es relleno y draw es el delineado
        /*g.fillOval(30,30,30,30);
        g.setColor(Color.red);
        g.fillOval(400,400,50,50);*/
       
    }
    //Llenar la lsta de puntos
    public ArrayList<Punto> getPuntos(){
        return this.puntos;
    }
}
