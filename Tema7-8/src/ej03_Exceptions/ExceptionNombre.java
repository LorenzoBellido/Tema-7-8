package ej03_Exceptions;

public class ExceptionNombre extends Exception{

	@Override
	public String toString() {
		return "El nombre no puede estar vacio";
	}
}
