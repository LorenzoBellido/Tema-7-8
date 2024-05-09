package ej04_exception;

public class ExceptionCodigo extends Exception{

	@Override
	public String toString() {
		return "El código no puede ser negativo.";
	}
}
