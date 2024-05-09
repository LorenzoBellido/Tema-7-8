package ej04_exception;

public class Articulo {

	private int codigo;

	private String descripcion = "";

	private double precioCompra;

	private double precioVenta;

	private int stock;

	public Articulo() {

	}

	public Articulo(int codigo) throws ExceptionCodigo {
		if (codigo > 0) {
			this.codigo = codigo;
		} else {
			throw new ExceptionCodigo();
		}
	}

	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock)
			throws ExceptionCodigo, ExceptionDescripcion, ExceptionPrecioCompra, ExceptionPrecioVenta, ExceptionsStock {
		if (codigo > 0) {
			this.codigo = codigo;
		} else {
			throw new ExceptionCodigo();
		}
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		} else if (descripcion == null || descripcion.equals("")) {
			throw new ExceptionDescripcion();
		}
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		} else {
			throw new ExceptionPrecioCompra();
		}
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		} else {
			throw new ExceptionPrecioVenta();
		}
		if (stock >= 0) {
			this.stock = stock;
		} else {
			throw new ExceptionsStock();
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	@Override
	public String toString() {
		String cadena = "------------ \n";
		cadena += "Código: " + this.codigo + "\n";
		cadena += "Descripcion: " + this.descripcion + "\n";
		cadena += "Precio Compra: " + this.precioCompra + "\n";
		cadena += "Precio Venta: " + this.precioVenta + "\n";
		cadena += "Stock: " + this.stock + "\n";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		Articulo art = (Articulo) obj;

		if (this.codigo == art.codigo) {
			iguales = true;
		}

		return iguales;
	}

}
