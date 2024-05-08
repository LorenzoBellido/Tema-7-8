package ej04_Exception;

public class ExceptionsStock extends Exception{
	@Override
	public String toString() {
		return "El stock no puede ser negativo.";
	}
}
