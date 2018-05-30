package centro.costos.api.usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import centro.costos.api.perfil.Perfil;

@RestController
@RequestMapping()
public class UsuarioController {

	
	@RequestMapping(value="/usuarios/{nombreUsuario}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> getUsuario(@PathVariable("nombreUsuario") String nombreUsuario){
		return new ResponseEntity<Usuario>(new Usuario("ckriss", "Cristofer", "Herrera", "Rivera", new Perfil(1, "Admin")),HttpStatus.OK);
	}
	
	@RequestMapping(value="/usuarios/", method = RequestMethod.GET)
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("ckriss", "Cristofer", "Herrera", "Rivera", new Perfil(1, "Admin")));
		return usuarios;
	}
	
	
}
