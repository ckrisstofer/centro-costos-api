package centro.costos.api.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository dao;
	
	public Usuario save(Usuario usuario){
		return dao.saveAndFlush(usuario);
	}
	
	public List<Usuario> listAll() {
		return dao.findAll();
	}

	public Usuario findById(Long id) {
		return dao.findOne(id);
	}
}
