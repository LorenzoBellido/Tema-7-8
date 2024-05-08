package ej04_Exception;

public class ExceptionPrecioVenta extends Exception{

	@Override
	public String toString() {
		return "El precio de venta no puede ser negativo.";
	}
}
