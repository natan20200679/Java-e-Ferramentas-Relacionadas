package rogNapoleao.springSecurity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rogNapoleao.springSecurity.dto.PermissaoPerfilRecursoDTO;
import rogNapoleao.springSecurity.entity.PermissaoPerfilRecursoEntity;
import rogNapoleao.springSecurity.repository.PermissaoPerfilRecursoRepository;

@Service
public class PermissaoPerfilRecursoService {

    @Autowired
    private PermissaoPerfilRecursoRepository permissaoPerfilRecursoRepository;

    public List<PermissaoPerfilRecursoDTO> listarTodos(){
        
        List<PermissaoPerfilRecursoEntity> permissaoPerfilRecusos = permissaoPerfilRecursoRepository.findAll();
        
        return permissaoPerfilRecusos.stream().map(PermissaoPerfilRecursoDTO::new).toList();
    
    }

    public void inserir(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
    
        PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity = new PermissaoPerfilRecursoEntity(permissaoPerfilRecurso);
    
        permissaoPerfilRecursoRepository.save(permissaoPerfilRecursoEntity);
    
    }

    public PermissaoPerfilRecursoDTO alterar(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
    
        PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity = new PermissaoPerfilRecursoEntity(permissaoPerfilRecurso);
    
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.save(permissaoPerfilRecursoEntity));
    
    }

    public void excluir(Long id) {
    
        PermissaoPerfilRecursoEntity permissaoPerfilRecurso = permissaoPerfilRecursoRepository.findById(id).get();
    
        permissaoPerfilRecursoRepository.delete(permissaoPerfilRecurso);
    
    }

    public PermissaoPerfilRecursoDTO buscarPorId(Long id) {
    
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.findById(id).get());
    
    }

}
