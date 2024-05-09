package ej03_exceptions;

public class ExceptionSaldo extends Exception{

	@Override
	public String toString() {
		return "El saldo no puede ser negativo.";
	}
}
