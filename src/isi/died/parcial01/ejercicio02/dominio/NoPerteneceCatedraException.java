package isi.died.parcial01.ejercicio02.dominio;

public class NoPerteneceCatedraException extends Exception{

	public NoPerteneceCatedraException() {
		super("El docente no pertenece a la catedra");
	}
}