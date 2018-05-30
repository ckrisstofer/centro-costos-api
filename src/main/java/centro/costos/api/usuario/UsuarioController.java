package centro.costos.api.usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import centro.costos.api.perfil.Perfil;

@RestController
@RequestMapping()
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value="/usuarios/{id}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> getUsuario(@PathVariable("id") Long id){
		Usuario usuario = usuarioService.findById(id);
		if(usuario == null) {
			return new ResponseEntity<Usuario>(usuario, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
	}
	
	@RequestMapping(value="/usuarios", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getUsuarios(){
		List<Usuario> usuarios = usuarioService.listAll();
		if(usuarios.isEmpty()) {
			return new ResponseEntity<List<Usuario>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/usuarios",method = RequestMethod.POST)
	public ResponseEntity<Void> crearUsuario(@RequestBody Usuario usuario,UriComponentsBuilder ucBuilder){
		Usuario usuarioIngresado = usuarioService.save(usuario);
		if(usuarioIngresado == null){
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
