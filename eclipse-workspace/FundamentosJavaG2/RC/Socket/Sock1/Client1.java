package Sock1;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client1 {
	public static void main(String args[]) throws Exception {
	    // La dirección IP y el puerto del servidor que se conectará
	    //String host = .getHostAddress();
	    int puerto = 5539;
	    // Establece una conexión con el servidor
	    Socket theSocket = new Socket(InetAddress.getLocalHost(), puerto);
	    // Obtenga el flujo de salida después de establecer la conexión
	    OutputStream salida = theSocket.getOutputStream();
	    String mensaje = "Hola_host";
	    theSocket.getOutputStream().write(mensaje.getBytes("UTF-8"));
	    // Los datos se han enviado a través del servidor de alta velocidad shutdownOutput, y los datos posteriores solo se pueden aceptar
	    theSocket.shutdownOutput();
	    
	    InputStream entrada = theSocket.getInputStream();
	    byte[] bytes = new byte[1024];
	    int len;
	    StringBuilder msgSr = new StringBuilder();
	    while ((len = entrada.read(bytes)) != -1) {
	    	// Preste atención al formato de codificación especificado, el remitente y el receptor deben estar unificados, se recomienda utilizar UTF-8
    		msgSr.append(new String(bytes, 0, len,"UTF-8"));
	    }
	    System.out.println("Mensaje del servidor: " + msgSr);
	    
	    entrada.close();
	    salida.close();
	    theSocket.close();
	  }
}
