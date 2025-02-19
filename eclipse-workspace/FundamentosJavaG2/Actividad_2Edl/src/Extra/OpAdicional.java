package Extra;

import java.util.ArrayList;

import Ejercicio1.OperacionEjercicio1;
import TDA.Tda;

public class OpAdicional {
	private Tda listaNum;
	private OperacionEjercicio1 op;
	public void agregarZero() {
		ArrayList<Integer> lista = listaNum.getLista();
		if(op.buscarNum(op.sumaItems()) != 0) {
				listaNum.addDespuesdeNodo(op.buscarNum(op.sumaItems()), 0);
		}
	}
}
