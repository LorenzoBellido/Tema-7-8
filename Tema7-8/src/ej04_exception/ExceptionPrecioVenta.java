package ej04_exception;

public class ExceptionPrecioVenta extends Exception{

	@Override
	public String toString() {
		return "El precio de venta no puede ser negativo.";
	}
}
