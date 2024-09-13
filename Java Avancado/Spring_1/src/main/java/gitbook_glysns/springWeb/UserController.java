package gitbook_glysns.springWeb;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;
    
    @GetMapping
    public List<Usuario> list(){
    
        return repository.findAll();
    
    }
    
    @PostMapping
    public void save(@RequestBody User user){
    
        repository.save(user);
    
    }
    
    @PutMapping
    public void update(@RequestBody User user){
    
        repository.save(user);
    
    }
    
    @GetMapping("/{username}")
    public Usuario find(@PathVariable("/username") String username){
    
        return repository.findByUsername(username);
    
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
    
        repository.deleteById(id);
    
    }

}
