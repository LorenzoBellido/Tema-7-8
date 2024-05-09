package ej04_exception;

public class ExceptionPrecioCompra extends Exception{

	@Override
	public String toString() {
		return "El precio de compra no puede ser negativo.";
	}
}
