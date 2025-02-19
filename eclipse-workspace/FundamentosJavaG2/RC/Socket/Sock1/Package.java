package Sock1;

public class Package {

	private String ipOrigen;
    private String ipDestino;
    private int longitud;
    private int sumVer;
    private char dato;
    public Package(String ipOrigen, String ipDestino, int longitud, int sumVer, char dato) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.longitud = longitud;
        this.sumVer = sumVer;
        this.dato = dato;
    }

    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getSumVer() {
        return sumVer;
    }

    public void setSumVer(int sumVer) {
        this.sumVer = sumVer;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "[" + "IP Origin: " + ipOrigen + ", IP Destination: " + ipDestino + ", Length: " + longitud + ", Checksum: " + sumVer + ", Data: " + dato + ']';
    }
    
}
