package ej04_exception;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;
		int modificar = 0;
		int codigo;
		int cantidad;

		do {
			menu();
			System.out.println("Introduzca una opción: ");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1 -> {
				Gestisimal.listado();
			}
			case 2 -> {
				try {
					if (Gestisimal.alta(datos())) {
					System.out.println("Articulo añadido");
				} else {
					System.out.println("Articulo no añadido");
				}
				}catch(ExceptionCodigo c) {
					System.out.println(c);
				}catch(ExceptionDescripcion d) {
					System.out.println(d);
				}catch(ExceptionPrecioCompra pc) {
					System.out.println(pc);
				}catch(ExceptionPrecioVenta pv) {
					System.out.println(pv);
				}catch(ExceptionsStock s) {
					
				}
				
			}
			case 3 -> {
				if (Gestisimal.baja(codigo())) {
					System.out.println("Articulo eliminado");
				} else {
					System.out.println("Articulo no encontrado");
				}
			}
			case 4 -> {
				System.out.println("Introduzca el código");
				codigo = sc.nextInt();
				sc.nextLine();
				modif();
				System.out.println("Introduzca una opción: ");
				modificar = sc.nextInt();
				sc.nextLine();

				if (Gestisimal.modificacion(codigo, modificar)) {
					System.out.println("Modificado correctamente");
				} else {
					System.out.println("No se ha modificado");
					modificar = 4;
				}
			}
			case 5 -> {
				System.out.println("Introduzca el código");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca la cantidad");
				cantidad = sc.nextInt();
				sc.nextLine();
				if(Gestisimal.entradaMercancia(codigo, cantidad)) {
					System.out.println("Entrada completada");
				}else {
					System.out.println("Entrada fallida");
				}
			}
			case 6 -> {
				System.out.println("Introduzca el código");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduzca la cantidad");
				cantidad = sc.nextInt();
				sc.nextLine();
				if(Gestisimal.salidaMercancia(codigo, cantidad)) {
					System.out.println("Salida completada");
				}else {
					System.out.println("Salida fallida");
				}
				
			}
			case 7 -> {
				System.out.println("Saliendo....");
			}
			default -> {
				System.out.println("Valor no comprendido");
			}
			}
		} while (opc != 7);

		
		sc.close();

	}

	public static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de Mercancía");
		System.out.println("6. Salida de Mercancía");
		System.out.println("7. Salir");
	}

	public static void modif() {
		System.out.println("1. Descipción");
		System.out.println("2. Precio Compra");
		System.out.println("3. Precio Venta");
		System.out.println("4. Salir");
	}

	public static Articulo datos() {

		Articulo art;

		int codigo;
		String descripcion = "";
		double precioCompra;
		double precioVenta;
		int stock;

		System.out.println("Introduzca el código: ");
		codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca la descripción: ");
		descripcion = sc.nextLine();
		System.out.println("Introduzca el Precio Compra: ");
		precioCompra = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el Precio Venta: ");
		precioVenta = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el stock: ");
		stock = sc.nextInt();
		sc.nextLine();

		art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

		return art;
	}

	public static Articulo codigo() {

		Articulo art;

		int codigo;

		System.out.println("Introduzca el código: ");
		codigo = sc.nextInt();

		art = new Articulo(codigo);

		return art;
	}

}
