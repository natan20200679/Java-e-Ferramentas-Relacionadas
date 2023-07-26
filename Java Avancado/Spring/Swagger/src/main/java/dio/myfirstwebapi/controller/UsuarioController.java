package dio.myfirstwebapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dio.myfirstwebapi.model.Usuario;
import dio.myfirstwebapi.repository.UsuarioRepository;

@RestController
// @RequestMapping("/users") -> caso esta notação seja usada, dispensa uso do parâmetro "/users" 
// nas anotações dos mapeamentos abaixo
public class UsuarioController {
	@Autowired
	private UsuarioRepository repository;
	@GetMapping("/users")
	public List<Usuario> getUsers(){
		return repository.findAll();
	}
	@GetMapping("/users/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	@PostMapping("/users")
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	@PutMapping()
	public void putUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}
