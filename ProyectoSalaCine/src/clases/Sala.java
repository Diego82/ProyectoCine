package clases;

public class Sala {

	// Atributos
	private String nombre_sala;
	private int fila;
	private int columna;

	/**
	 * @param nombre_sala
	 * @param fila
	 * @param columna
	 */
	public Sala(String nombre_sala, int fila, int columna) {
		this.nombre_sala = nombre_sala;
		this.fila = fila;
		this.columna = columna;
	}

	public String getNombre_sala() {
		return nombre_sala;
	}

	public void setNombre_sala(String nombre_sala) {
		this.nombre_sala = nombre_sala;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String toString() {
		return "Sala [nombre_sala=" + nombre_sala + ", fila=" + fila + ", columna=" + columna + "]";
	}
}
