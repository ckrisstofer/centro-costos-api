package centro.costos.api.perfil;

public class Perfil {

	private int id;
	private String nombre;
	
	
	public Perfil() {
		super();
	}

	public Perfil(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
