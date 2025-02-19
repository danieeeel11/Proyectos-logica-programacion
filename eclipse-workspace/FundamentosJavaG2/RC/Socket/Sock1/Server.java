package Sock1;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {
	private static ArrayList<Package> mensaje = new ArrayList<>();
	
	public static void paquetes() throws UnknownHostException{
        String msg = "Hola_mundo";
        InetAddress iaLocal = InetAddress.getLocalHost();
        char[] sepMsg = msg.toCharArray();
        String ip = iaLocal.toString();
        if(mensaje.size()==0) {
        	for (int i = 0; i < sepMsg.length; i++) {
	            mensaje.add(new Package(ip, ip, sepMsg.length, i,sepMsg[i]));
	        }
        }
        
        
    }
	
	public static void main(String args[]) {
		ServerSocket servidor;
        Socket theSocket;
        DataInputStream entrada;
        DataOutputStream salida;
        
        //int contador = 1;
        try {
            //Se crea un ServerSocket
        	paquetes();
            servidor = new ServerSocket(5543);
            while (true) {
            	System.out.println(":)");
                //Se establece la conexión
                theSocket = servidor.accept();
                //System.out.println("Conexion N°" + contador + " recibida de " + connection.getInetAddress().getHostName());
                //Se abren los canales de entrada y salida EyS
                entrada = new DataInputStream(theSocket.getInputStream());
                salida = new DataOutputStream(theSocket.getOutputStream());
                
                //Uso de metodos write y read
                String msg = "";
                for (int i = 0; i < mensaje.size(); i++) {
					msg += mensaje.get(i);
				}
                //output.writeUTF("connection sucessful ");
                System.out.println("d");
                salida.writeUTF(msg);
                System.out.println("Mensaje del cliente: " + entrada.readUTF());
                //Se cierra la conexion
                entrada.close();
                salida.close();
                theSocket.close();
                //contador++;
            }
        } catch (IOException e) {
        	System.out.println("fail");
        }
	}
}
