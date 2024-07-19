package rogNapoleao.springSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rogNapoleao.springSecurity.entity.PermissaoPerfilRecursoEntity;

public interface PermissaoPerfilRecursoRepository extends JpaRepository
        <PermissaoPerfilRecursoEntity, Long> {
}
