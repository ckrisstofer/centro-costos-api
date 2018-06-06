package centro.costos.api.usuario;

import javax.validation.constraints.NotNull;

import centro.costos.api.perfil.Perfil;

public class UsuarioRequest {

	@NotNull(message="El nombre de usuario es requerido")
	private String nombreUsuario;
	
	@NotNull(message="El nombre es requerido")
	private String nombrePila;
	
	@NotNull(message="El apellido paterno es requerido")
	private String apellidoPaterno;
	
	@NotNull(message="El apellido materno es requerido")
	private String apellidoMaterno;
	
	@NotNull(message="La contraseña es requerida")
	private String password;
	
	@NotNull(message="El perfil es requerido")
	private Perfil perfil;
	
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
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
