package modelo;

import vista.Ventana;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author User
 */
public class Op {
    private Ventana ventana = null;
    public Op(Ventana v){
        this.ventana=v;
    }
    
    public void dataNodos(){
        if(ventana.getPanel().getNodos().isEmpty()){
            ArrayList<Linea> vecA = new ArrayList<>();
            vecA.add(ventana.getPanel().getLineas().get(3));
            vecA.add(ventana.getPanel().getLineas().get(4));
            vecA.add(ventana.getPanel().getLineas().get(0));
            vecA.add(ventana.getPanel().getLineas().get(1));
            Nodo nA= new Nodo("A",vecA);
        
            ArrayList<Linea> vecB = new ArrayList<>();
            vecB.add(ventana.getPanel().getLineas().get(3));
            vecB.add(ventana.getPanel().getLineas().get(5));
            Nodo nB= new Nodo("B",vecB);
        
            ArrayList<Linea> vecC = new ArrayList<>();
            vecC.add(ventana.getPanel().getLineas().get(4));
            vecC.add(ventana.getPanel().getLineas().get(6));
            Nodo nC= new Nodo("C",vecC);
        
            ArrayList<Linea> vecD = new ArrayList<>();
            vecD.add(ventana.getPanel().getLineas().get(5));
            vecD.add(ventana.getPanel().getLineas().get(0));
            vecD.add(ventana.getPanel().getLineas().get(2));
            Nodo nD= new Nodo("D",vecD);
        
            ArrayList<Linea> vecE = new ArrayList<>();
            vecE.add(ventana.getPanel().getLineas().get(2));
            vecE.add(ventana.getPanel().getLineas().get(1));
            vecE.add(ventana.getPanel().getLineas().get(6));
            Nodo nE= new Nodo("E",vecE);
        
            ventana.getPanel().getNodos().add(nA);
            ventana.getPanel().getNodos().add(nB);
            ventana.getPanel().getNodos().add(nC);
            ventana.getPanel().getNodos().add(nD);
            ventana.getPanel().getNodos().add(nE);
        }
        
    }
    
    public void dataLineas(){
        if(ventana.getPanel().getLineas().isEmpty()){
            //de A a D
            Linea l1 = new Linea("A","D",9,315,65,115,415);
            //de A a E
            Linea l2 = new Linea("A","E",10,315,65,515,415);
            //de D a E
            Linea l3 = new Linea("D","E",8,115,415,515,415);
            //de B a A
            Linea l4 = new Linea("B","A",5,65,215,315,65);
            //de C a A
            Linea l5 = new Linea("C","A",3,565,215,315,65);
            //de B a D
            Linea l6 = new Linea("B","D",14,65,215,115,415);
            //de C a E
            Linea l7 = new Linea("C","E",2,565,215,515,415);
            
            ventana.getPanel().getLineas().add(l1);
            ventana.getPanel().getLineas().add(l2);
            ventana.getPanel().getLineas().add(l3);
            ventana.getPanel().getLineas().add(l4);
            ventana.getPanel().getLineas().add(l5);
            ventana.getPanel().getLineas().add(l6);
            ventana.getPanel().getLineas().add(l7);
        }
        ventana.getPanel().repaint();
        if(ventana.getPanel().getPuntos().isEmpty()){
            //A
            Punto p1 = new Punto(300,50);
            //B
            Punto p4 = new Punto(50,200);
            //C
            Punto p5 = new Punto(550,200);
            //D
            Punto p2 = new Punto(100,400);
            //E
            Punto p3 = new Punto(500,400);
            
            ventana.getPanel().getPuntos().add(p1);
            ventana.getPanel().getPuntos().add(p2);
            ventana.getPanel().getPuntos().add(p3);
            ventana.getPanel().getPuntos().add(p4);
            ventana.getPanel().getPuntos().add(p5);
        }
        ventana.getPanel().repaint();
    }
    
    public void recorrido(String desde, String hasta){
        System.out.println("Camino desde " + desde + " hasta " + hasta);
        ArrayList<Nodo> nodos = new ArrayList<>(ventana.getPanel().getNodos());
        ArrayList<Linea> lineas=null;
        ArrayList<Integer> valores=new ArrayList<>();
        
        if(!nodos.stream().filter(p->p.getNd().equals(desde)).findAny().isPresent()){
            System.out.println("Nodo " + desde + " no disponible");
        }else if(!nodos.stream().filter(p->p.getNd().equals(hasta)).findAny().isPresent()){
            System.out.println("Nodo " + hasta + " no disponible");
        }else{
            String pInicial = desde;
            Nodo nn = null;
            String ancla = null;
            boolean encontrado = false;
            Linea lAux=null;
            
            while(!encontrado){
                for (Nodo n : ventana.getPanel().getNodos()) {
                    if(n.getNd().equals(pInicial)){
                        nn=n;
                        lineas = new ArrayList<>(n.getVecinos());
                    }
                }
                lineas.remove(lAux);
                if(lineas.stream().filter(p->p.getDesde().equals(hasta)).findAny().isPresent()){
                    Linea l = lineas.stream().filter(p->p.getDesde().equals(hasta)).findAny().get();
                    valores.add(l.getValor());
                    encontrado = true;
                }
                if(lineas.stream().filter(p->p.getHasta().equals(hasta)).findAny().isPresent()){
                    Linea l = lineas.stream().filter(p->p.getHasta().equals(hasta)).findAny().get();
                    valores.add(l.getValor());
                    encontrado = true;
                }
                if(!encontrado){
                    Optional<Linea> menor = lineas.stream().min((p1,p2)->Integer.compare(p1.getValor(), p2.getValor()));
                    int caminoMenor = menor.get().getValor();
                    if(lineas.stream().filter(p->p.getValor()==caminoMenor).findAny().isPresent()){
                        Linea l = lineas.stream().filter(p->p.getValor()==caminoMenor).findAny().get();
                        if(!l.getDesde().equals(nn.getNd())){
                            valores.add(l.getValor());
                            ancla=l.getDesde();
                            pInicial=ancla;
                            lAux=l;
                        }
                        if(!l.getHasta().equals(nn.getNd())){
                            valores.add(l.getValor());
                            ancla=l.getHasta();
                            pInicial=ancla;
                            lAux=l;
                        }
                    }
                    
                }
            }
            way(valores,desde);
            valores.clear();
            lAux=null;
            pInicial=null;
            ancla=null;
        }
        
    }
    public void way(ArrayList<Integer> valores, String desde){
        String nodos = desde;
        String nodoAux=desde;
        int camino =0;
        for (int i = 0; i < valores.size(); i++) {
            for (Linea l : ventana.getPanel().getLineas()) {
                if(valores.get(i)==l.getValor()){
                    if(nodoAux.equals(l.getDesde())){
                        nodos+="-"+l.getHasta();
                        nodoAux=l.getHasta();
                    }else if(nodoAux.equals(l.getHasta())){
                        nodos+="-"+l.getDesde();
                        nodoAux=l.getDesde();
                    }
                }
            }
        }
        for (Integer v : valores) {
            System.out.println(v);
            camino+=v;
        }
        System.out.println("El total del camino es: " + camino);
        System.out.println("El camino es: "+nodos + "\n");
    }
}
    

