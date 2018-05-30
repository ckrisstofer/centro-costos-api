package centro.costos.api.usuario;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import centro.costos.api.perfil.Perfil;

@Entity
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;

	private String nombreUsuario;
	private String nombrePila;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Perfil perfil;
	
	public Usuario() {
		super();
	}

	public Usuario(Long id, String nombreUsuario, String nombrePila, String apellidoPaterno, String apellidoMaterno, Perfil perfil) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.nombrePila = nombrePila;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.perfil = perfil;
	}
	
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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
}
