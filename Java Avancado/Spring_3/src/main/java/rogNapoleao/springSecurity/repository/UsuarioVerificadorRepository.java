package rogNapoleao.springSecurity.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import rogNapoleao.springSecurity.entity.UsuarioVerificadorEntity;

public interface UsuarioVerificadorRepository extends JpaRepository
        <UsuarioVerificadorEntity, Long> {

    public Optional<UsuarioVerificadorEntity> findByUuid(UUID uuid);

}
