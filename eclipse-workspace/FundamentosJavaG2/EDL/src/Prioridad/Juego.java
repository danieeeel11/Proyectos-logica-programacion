package Prioridad;

import java.util.ArrayList;
import java.util.Comparator;

public class Juego {
	private ArrayList<Bots> listaBots;
	private int codigo=100;
	
	public Juego() {
		listaBots=new ArrayList<Bots>();
	}
	
	public void crearList() {
		int elem = (int)(Math.random()*(20-10)+10);
		for (int i = 0; i < elem; i++) {
			codigo++;
			listaBots.add(new Bots(codigo,1,(int)(Math.random()*(100-10)+10)));
			
		}
		ordenar();
	}
	
	public void ordenar() {
		listaBots.sort(Comparator.comparingInt(Bots::getPorVida));
	}
	
	public void mostrar() {
		listaBots.forEach(System.out::println);
	}
	
	public void mostrar60() {
		//-> es un apuntador
		//listaBots.stream().filter(p->p.getPorVida()>=60).count();
		listaBots.stream().filter(p->p.getPorVida()>=60).forEach(System.out::println);;
		long cantidad60 = listaBots.stream().filter(p->p.getPorVida()>=60).count();
	}
	
	public void mostrarMenores() {
		
	}
	
	public void disminuir() {
		
	}
		
	
}
