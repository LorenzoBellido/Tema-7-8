package ej03_Exceptions;

public class ExceptionDni extends Exception{

	@Override
	public String toString() {
		return "El DNI tiene más de 9 caracteres.";
	}
}
