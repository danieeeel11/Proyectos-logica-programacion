package Vista;

import Controlador.Controler;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Ventana extends JFrame{
    private JLabel label = new JLabel ("Holis");
    private JButton boton = new JButton("Ok");
    private Controler c;
    private JTextField texto1 = new JTextField();
    private JTextField texto2 = new JTextField();
    
    private Panel panel = new Panel();//Se crea panel y se inicializa

    public JTextField getTexto1() {
        return texto1;
    }
    public JTextField getTexto2() {
        return texto2;
    }
    public void setTexto1(JTextField texto1) {
        this.texto1 = texto1;
    }
    public void setTexto2(JTextField texto2) {
        this.texto2 = texto2;
    }
    
    
    public Ventana(){
        //establece el tamaño de la ventana emergente
        this.setBounds(400, 50, 600, 600);
        //para cerrar la ventana cuando se oprime la x de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //invoca los componentes para aparecer en la pantalla
        this.initComponents();
        this.setVisible(true);
    }
    
    private void initComponents(){
        //establece la posicion y tamaño del boton
        this.boton.setBounds(250, 500, 90, 30);
        this.add(boton);
        this.setBackground(Color.WHITE);
                
        this.panel.setBounds(0,0,600,600);
        //panel.setVisible(true);
        this.add(panel);
        
        
    }
    
    public void updateLabel(String s){
        this.label.setText(s);
    }
    
    //Recibe el controlador y se le entrega al boton
    public void setContoler(Controler cont){
        this.c=cont;
        this.boton.addActionListener(this.c);
    }
    // Permitir al modelo acceder al panel
    public Panel getPanel(){
        return panel;
    }
}
