package Sock1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class Server1 {
	static ArrayList<Package> mensaje = new ArrayList<>();
	
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
	
	public static void main(String[] args) throws Exception {
		// escucha en el puerto especificado
		int puerto = 5538;
		ServerSocket servidor = new ServerSocket(puerto);
	   
        // El servidor siempre esperará a que llegue la conexión
        //System.out.println ("El servidor siempre esperará a que llegue la conexión");
        Socket theSocket = servidor.accept();
        // Después de establecer la conexión, obtenga el flujo de entrada del socket y establezca un búfer para leer
    	InputStream entrada = theSocket.getInputStream();
    	byte[] bytes = new byte[1024];
    	int len;
    	StringBuilder msgCl = new StringBuilder();
        // Solo cuando el cliente cierra su flujo de salida, el servidor puede obtener el final -1
    	while ((len = entrada.read(bytes)) != -1) {
            // Preste atención al formato de codificación especificado, el remitente y el receptor deben estar unificados, se recomienda utilizar UTF-8
    		msgCl.append(new String(bytes, 0, len, "UTF-8"));
    	}
    	//String sb = entrada.readUTF();
    	
    	System.out.println("Mensaje del cliente: " + msgCl);
	
    	OutputStream salida = theSocket.getOutputStream();
    	String msg = "";
        for (int i = 0; i < mensaje.size(); i++) {
			msg += mensaje.get(i);
		}
    	salida.write(msg.getBytes("UTF-8"));
	
    	entrada.close();
    	salida.close();
    	theSocket.close();
    	servidor.close();
 	}

}
