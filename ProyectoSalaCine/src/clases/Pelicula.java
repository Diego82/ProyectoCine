package clases;

public class Pelicula {
	
	private int id_pelicula;
	private String titulo;
	private String sinopsis;
	private String imagenCartel;
	/**
	 * @param id_pelicula
	 * @param nombre
	 * @param sinopsis
	 * @param imagenCartel
	 */
	public Pelicula(int id_pelicula, String titulo, String sinopsis, String imagenCartel) {
		super();
		this.id_pelicula = id_pelicula;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.imagenCartel = imagenCartel;
	}
	public int getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setNTitulo(String nombre) {
		this.titulo = nombre;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getImagenCartel() {
		return imagenCartel;
	}
	public void setImagenCartel(String imagenCartel) {
		this.imagenCartel = imagenCartel;
	}
	@Override
	public String toString() {
		return "Pelicula [id_pelicula=" + id_pelicula + ", nombre=" + titulo + ", sinopsis=" + sinopsis
				+ ", imagenCartel=" + imagenCartel + "]";
	}
}
