package ej04_Exception;

public class ExceptionPrecioCompra extends Exception{

	@Override
	public String toString() {
		return "El precio de compra no puede ser negativo.";
	}
}
