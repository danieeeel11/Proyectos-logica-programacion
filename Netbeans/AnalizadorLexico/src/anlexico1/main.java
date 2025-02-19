/*
 * Clase que se ejecuta para generar una clase lexer en base a la clase Lexxer.flex
 * Esta clase solo se ejecuta una vez al principio
 */
package anlexico1;

import java.io.File;

/**
 *
 * @author Laura Ojeda & Daniel Velasquez
 */
public class main {
    public static void main(String[] args) {
        //C:\Users\User\Documents\University Sergio Arboleda\Semester V\Programming Language and Translation\Corte 1\Parcial\Code\AnalizadorLexico\src\analizadorlexico\Lexxer.flex
        String ruta = "C:/Users/User/Documents/University Sergio Arboleda/Semester V/Programming Language and Translation/Corte 1/Parcial/Code/AnalizadorLexico/src/anlexico1/Lexxer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
