package ej04_exception;

public class ExceptionDescripcion extends Exception{

	@Override
	public String toString() {
		return "La descripción no puede estar vacía";
	}
}
