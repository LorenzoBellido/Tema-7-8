package ej03_exceptions;

public class Main {

	public static void main(String[] args) {
		try {
			CuentaCorriente cuenta = new CuentaCorriente("123456789E", "Hector", 3000);
			cuenta.mostrarInformacion();
			cuenta.sacarDinero(1000);
			cuenta.ingresarDinero(100);
			cuenta.mostrarInformacion();
		}catch(ExceptionDni d) {
			System.out.println(d);
		}catch(ExceptionNombre n) {
			System.out.println(n);
		}catch(ExceptionSaldo s) {
			System.out.println(s);
		}
	
		
	}

}
