package clases;

public class Cliente {

	private int identificador;
	private String usuario;
	private String password;
	private String email;
	/**
	 * @param identificador
	 * @param usuario
	 * @param password
	 * @param email
	 */
	public Cliente(int identificador, String usuario, String password, String email) {
		this.identificador = identificador;
		this.usuario = usuario;
		this.password = password;
		this.email = email;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [identificador=" + identificador + ", usuario=" + usuario + ", password=" + password
				+ ", email=" + email + "]";
	}
		
}
