package Sock1;

import java.io.*;
import java.net.*;
public class Client {
    public static void main(String args[]) {
        Socket client;
        DataOutputStream output;
        DataInputStream input;
        try {
            //Se crea el socket para establecer la conexión
            client = new Socket(InetAddress.getLocalHost(), 5543);
            //Se abren los canales de entrada y salida EyS
            input = new DataInputStream(client.getInputStream());
            output = new DataOutputStream(client.getOutputStream());
            //Uso de metodos write y read
            System.out.println("Mensaje del servidor: " + input.readUTF());
            output.writeUTF("Mensaje recibido, gracias! ");
            //Se cierra la conexión
            client.close();
            
        }catch (IOException e) {
        	System.out.println("fail");
        }
    }
}