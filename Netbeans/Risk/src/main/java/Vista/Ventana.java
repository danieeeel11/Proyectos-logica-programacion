package Vista;

import Controlador.Controler;
import Controlador.Controler2;
import java.awt.Color;
import javax.swing.*;

/**
 * 
 * @author Julian Cardenas - Daniel Velasquez
 * @since 10/08/21
 */
public class Ventana extends JFrame{
    private JLabel label = new JLabel ("");
    private JLabel label2 = new JLabel ("");
    private JButton boton1 = new JButton("Crear");
    private JButton boton2 = new JButton("Ataque");
    private Controler c;
    private Controler2 c2;
    private JTextField num1 = new JTextField();
    private JTextField num2 = new JTextField();
    
    private Panel panel = new Panel();//Se crea panel y se inicializa

    public JTextField getTexto1() {
        return num1;
    }
    public JTextField getTexto2() {
        return num2;
    }
    public void setTexto1(JTextField num1) {
        this.num1 = num1;
    }
    public void setTexto2(JTextField num2) {
        this.num2 = num2;
    }
    
    
    public Ventana(){
        //establece el tamaño de la ventana emergente
        this.setBounds(100, 50, 1200, 2000);
        //para cerrar la ventana cuando se oprime la x de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //invoca los componentes para aparecer en la pantalla
        this.initComponents();
        this.setVisible(true);
    }
    
    private void initComponents(){
        label.setBounds(10, 220, 200, 50);
        this.add(label);
        
        label2.setBounds(10, 150, 700, 350);
        this.add(label2);
        
        
        this.boton1.setBounds(0, 110, 90, 30);
        this.add(boton1);
        //this.setBackground(Color.WHITE);
        
        this.boton2.setBounds(0, 150, 90, 30);
        this.add(boton2);
        
        this.num1.setBounds(10, 10, 30, 20);
        this.num2.setBounds(10, 80, 30, 20);
        this.add(num1);
        this.add(num2);
        
        this.panel.setBounds(250,0,600,600);
        panel.setVisible(true);
        this.add(panel);
        
        
    }
    
    public void updateLabel(String s){
        this.label.setText(s);
    }
    
    public void updateLabel2(String s){
        this.label2.setText(s);
    }
    
    public void setContoler(Controler cont){
        this.c=cont;
        this.boton1.addActionListener(this.c);
    }
    
    public void setContoler2(Controler2 cont){
        this.c2=cont;
        this.boton2.addActionListener(this.c2);
    }
    
    // Permitir al modelo acceder al panel
    public Panel getPanel(){
        return panel;
    }
}
