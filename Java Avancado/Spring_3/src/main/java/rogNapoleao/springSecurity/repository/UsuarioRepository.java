package rogNapoleao.springSecurity.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import rogNapoleao.springSecurity.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByLogin(String login);

}
