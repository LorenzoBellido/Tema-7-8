package ej04_Exception;

public class ExceptionCodigo extends Exception{

	@Override
	public String toString() {
		return "El código no puede ser negativo.";
	}
}
