package Ejercicio1;
/*
 * Clase Duck4 que contiene metodos de duck4, display, swim, quack, fly 
 * @author Laura Sofia Ojeda Leon & Daniel Velásquez Rincón
 * @since 5-11-2020
 * @version 4
 */

public class Duck4 extends Duck implements IFly, IQuack{

	/*
	 * Metodo que regresa una instancia de cadena de caracteres indicando que es un pato
	 */
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display();
	}
	/*
	 * Metodo que regresa una instancia de cadena de caracteres indicando que es un pato que puede nadar
	 */
	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return super.swim();
	}
	/*
	 * Metodo que regresa una instancia de cadena de caracteres indicando que es un pato que puede hacer quack
	 */
	@Override
	public String metodoQuack() {
		// TODO Auto-generated method stub
		return this.QUACK;
	}
	/*
	 * Metodo que regresa una instancia de cadena de caracteres indicando que es un pato que puede volar
	 */
	@Override
	public String metodoFly() {
		// TODO Auto-generated method stub
		return this.FLY;
	}

}
