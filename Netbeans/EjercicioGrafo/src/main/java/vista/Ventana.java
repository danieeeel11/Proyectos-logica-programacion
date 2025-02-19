package vista;

import controlador.Controler;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Ventana extends JFrame{
    //private JLabel labelA = new JLabel ("A");
    
    private JButton boton = new JButton("Show Grafo");
    private JButton operacion = new JButton("Operacion");
    private Controler c;
    private JLabel desdeTexto = new JLabel("Desde:");
    private JLabel hastaTexto = new JLabel("Hasta:");
    private JTextField desde = new JTextField("");
    private JTextField hasta = new JTextField("");
    
    private Panel panel = new Panel();//Se crea panel y se inicializa

    public JTextField getDesde() {
        return desde;
    }
    public JTextField getHasta() {
        return hasta;
    }
    public void setDesde(JTextField desde) {
        this.desde = desde;
    }
    public void setHasta(JTextField hasta) {
        this.hasta = hasta;
    }
    
    public Ventana(){
        //establece el tamaño de la ventana emergente
        this.setBounds(300, 50, 800, 600);
        //para cerrar la ventana cuando se oprime la x de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //invoca los componentes para aparecer en la pantalla
        this.initComponents();
        this.setVisible(true);
    }
    
    private void initComponents(){
        this.boton.setBounds(10, 20, 120, 30);
        this.boton.setBackground(Color.BLACK);
        this.boton.setForeground(Color.WHITE);
        this.add(boton);
        //this.setBackground(Color.WHITE);
        //this.boton.setForeground(Color.WHITE);
        
        this.operacion.setBounds(10,140, 120, 30);
        this.operacion.setBackground(Color.BLACK);
        this.operacion.setForeground(Color.WHITE);
        this.add(operacion);
        //this.setBackground(Color.WHITE);
        //this.boton.setForeground(Color.WHITE);
                
        this.panel.setBounds(150,0,600,600);
        this.add(panel);
        
        
        Font letra1= new Font("Times New Roman",Font.CENTER_BASELINE,20);
        desdeTexto.setFont(letra1);
        desdeTexto.setBounds(10, 60, 100, 20);
        this.add(desdeTexto);
        
        hastaTexto.setFont(letra1);
        hastaTexto.setBounds(10, 100, 100, 20);
        this.add(hastaTexto);
        
        this.desde.setBounds(75,63,20,20);
        this.desde.setCaretColor(Color.DARK_GRAY);
        this.desde.setForeground(Color.DARK_GRAY);
        this.add(desde);
        this.hasta.setBounds(75,103,20,20);
        this.hasta.setCaretColor(Color.DARK_GRAY);
        this.hasta.setForeground(Color.DARK_GRAY);
        this.add(hasta);
    }
    
    public void updateLabel(String s){
    //    this.labelA.setText(s);
    }
    
    //Recibe el controlador y se le entrega al boton
    public void setContoler(Controler cont){
        this.c=cont;
        this.boton.addActionListener(this.c);
        this.operacion.addActionListener(this.c);
    }
    // Permitir al modelo acceder al panel
    public Panel getPanel(){
        return panel;
    }
}
