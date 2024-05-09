package ej02_exceptions;

/**
 * Clase donde se recoge la hora, los minutos y los segundos
 */
public class HoraExacta extends Hora {

	/**
	 * Atributo para guardar los segundos
	 */
	private int segundos;

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora Número de horas
	 * @param minutos Número de minutos
	 * @param segundos Números de segundos
	 * @throws NegativeSecondException 
	 * @throws NegativeMinuteException 
	 * @throws NegativeHourException 
	 */
	public HoraExacta(int hora, int minutos, int segundos) throws NegativeSecondException, NegativeHourException, NegativeMinuteException {
		super(hora, minutos);
		if (segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		}else if(segundos < 0){
			throw new NegativeSecondException();
		}
	}

	/**
	 * Método que cambia el valor de los segundos
	 * @param valor Segundos introducidos
	 * @return Devuelve un booleano segun si se ha podido añadir o no
	 * @throws NegativeSecondException 
	 */
	boolean setSegundos(int valor) throws NegativeSecondException {
		boolean anadido = false;

		if (valor >= 0 && valor < 60) {
			this.segundos = valor;
			anadido = true;
		}else if(valor > 0){
			throw new NegativeSecondException();
		}

		return anadido;
	}

	/**
	 * Método que incrementa un segundo
	 */
	void inc() {
		if (this.segundos == 59) {
			this.segundos = 0;
			super.inc();
		} else {
			this.segundos++;
		}
	}

	/**
	 * Método para imprimir la hora, los minutos y los segundos
	 */
	@Override
	public String toString() {
		String hora = "";

		if (this.minutos >= 10 && this.segundos >= 10) {
			hora = "La hora es: " + this.hora + " : " + this.minutos + " : " + this.segundos;
		} else if (this.minutos >= 10 && this.segundos <= 10) {
			hora = "La hora es: " + this.hora + " : " + this.minutos + " : 0" + this.segundos;
		} else if (this.minutos <= 10 && this.segundos >= 10) {
			hora = "La hora es: " + this.hora + " : 0" + this.minutos + " : " + this.segundos;
		} else {
			hora = "La hora es: " + this.hora + " : 0" + this.minutos + " : 0" + this.segundos;
		}

		return hora;
	}
}
