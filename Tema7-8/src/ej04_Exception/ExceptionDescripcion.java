package ej04_Exception;

public class ExceptionDescripcion extends Exception{

	@Override
	public String toString() {
		return "La descripción no puede estar vacía";
	}
}
