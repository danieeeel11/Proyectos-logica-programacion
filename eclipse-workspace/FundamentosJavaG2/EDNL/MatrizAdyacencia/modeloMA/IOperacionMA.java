package modeloMA;

public interface IOperacionMA {
	public abstract void generarGrafo(int n);
	public abstract int[] busqueda(int arista);
	public abstract void verificarArista(int arista);
	public abstract void obtenerPesoArista(int a, int b);
	public abstract void imprimirAdyacencia();
	public abstract void imprimirIncidencia();
	public abstract void imprimirPesos();
	public abstract void removerArista(int arista);
	public abstract void liberarGrafo();
	
}
