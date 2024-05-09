package ej04_exception;

public class ExceptionsStock extends Exception{
	@Override
	public String toString() {
		return "El stock no puede ser negativo.";
	}
}
