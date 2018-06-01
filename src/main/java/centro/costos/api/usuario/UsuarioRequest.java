package centro.costos.api.usuario;

import javax.validation.constraints.NotNull;

public class UsuarioRequest {
	private Long id;

	@NotNull(message="El nombre de usuario es requerido")
	private String nombreUsuario;
	
	@NotNull(message="El nombre es requerido")
	private String nombrePila;
	
	@NotNull(message="El apellido paterno es requerido")
	private String apellidoPaterno;
	
	@NotNull(message="El apellido materno es requerido")
	private String apellidoMaterno;
	
	@NotNull(message="El la contraseña es requerida")
	private String password;
	
	private int idPerfil;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombrePila() {
		return nombrePila;
	}
	public void setNombrePila(String nombrePila) {
		this.nombrePila = nombrePila;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
}
