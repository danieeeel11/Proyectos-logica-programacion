package personajes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopiadorArchivos {

	private static CopiadorArchivos instance;
	
	private CopiadorArchivos() {
	}
	
	public static CopiadorArchivos getInstance() {
		if(instance==null) {
			instance=new CopiadorArchivos();
		}
		
		return instance;
		
	}
	
	public void copia (String ficheroOriginal, String ficheroCopia)
	{
		ficheroCopia=Utils.URL_LOCAL+ficheroCopia;
		ficheroOriginal=Utils.URL_LOCAL+ficheroOriginal;
		try
		{
			
                        // Se abre el fichero original para lectura
			FileInputStream fileInput = new FileInputStream(ficheroOriginal);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
			
			// Se abre el fichero donde se hará la copia
			FileOutputStream fileOutput = new FileOutputStream (ficheroCopia,true);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
			
			// Bucle para leer de un fichero y escribir en el otro.
			byte [] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0)
			{
				bufferedOutput.write(array,0,leidos);
				leidos=bufferedInput.read(array);
			}

			// Cierre de los ficheros
			bufferedInput.close();
			bufferedOutput.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
