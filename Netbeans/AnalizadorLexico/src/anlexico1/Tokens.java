/*
 * Esta clase refiere a los tokens que establecimos en la clase Lexxer.flex
 */
package anlexico1;

/**
 *
 * @author Laura Ojeda & Daniel Velasquez
 */
public enum Tokens {
    Reservada,
    Igual,
    Suma,
    Resta,
    Multiplicacion,
    Division,
    Exponenciacion,
    Menor_Que,
    Menor_o_Igual_Que,
    Mayor_Que,
    Mayor_o_Igual_Que,
    Modulo,
    Es_Igual,
    Es_Distinto,
    And,
    Or,
    Not,
    Incremento,
    Decremento,
    Parentesis_Abierto,
    Parentesis_Cerrado,
    Fin_Linea,
    Identificador,
    Numero,
    ERROR
}
