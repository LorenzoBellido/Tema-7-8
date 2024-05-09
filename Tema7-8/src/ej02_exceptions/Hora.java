package ej02_exceptions;
/**
 * Clase donde se recoge la hora y los minutos
 */
public class Hora {

	/**
	 * Atributo para guardar las horas
	 */
	protected int hora;
	
	/**
	 * Atributo para guardar los minutos
	 */
	protected int minutos;

	/**
	 * Constructor con parámetros
	 * @param hora Número de horas
	 * @param minutos Número de minutos
	 * @throws NegativeHourException 
	 */
	public Hora(int hora, int minutos) throws NegativeHourException, NegativeMinuteException {
		if(hora >= 0 &&hora < 24) {
			this.hora = hora;
		}else if(hora < 0){
			throw new NegativeHourException();
		}
		
		if(minutos >= 0 &&minutos < 60) {
			this.minutos = minutos;
		}else if(minutos < 0){
			throw new NegativeMinuteException();
		}
	}
	
	/**
	 * Método que incrementa un minuto
	 */
	void inc() {
		if(minutos != 59) {
			this.minutos++;
		}else {
			this.minutos = 0;
			this.hora++;
			if(this.hora == 24) {
				this.hora = 0;
			}
		}
	}
	
	/**
	 * Método que cambia el valor de los minutos
	 * @param valor Minutos introducidos
	 * @return Devuelve un booleano segun si se ha podido añadir o no
	 * @throws NegativeHourException 
	 */
	 public boolean setMinutos(int valor) throws NegativeMinuteException {
		 boolean anadido = false;
		 
	        if(valor >= 0 && valor <= 59) { 
	        	this.minutos = valor;
	            anadido = true;
	        }else if(valor < 0){
	        	throw new NegativeMinuteException();
	        }
	        
	        return anadido;
	    }
	 
	 /**
		 * Método que cambia el valor de las horas
		 * @param valor Horas introducidas
		 * @return Devuelve un booleano segun si se ha podido añadir o no
	 * @throws NegativeMinuteException 
		 */
	 public boolean setHoras(int valor) throws NegativeHourException {
		 boolean anadido = false;
		 
		 if(valor >= 0 && valor < 24) {
			 this.hora = valor;
			 anadido = true;
		 }else if(valor < 0){
			 throw new NegativeHourException();
		 }
		 
		 return anadido;
	 }
	
	/**
	 * Método para imprimir la hora y los minutos
	 */
	@Override
	public String toString() {
		String hora = "";
		
		if(this.minutos >= 10) {
			hora = "La hora es: " + this.hora + " : " + this.minutos;
		}else {
			hora = "La hora es: " + this.hora + " : 0" + this.minutos;
		}
		
		
		return hora;
	}
}
