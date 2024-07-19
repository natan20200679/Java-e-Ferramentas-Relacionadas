package devSuperior.springJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import devSuperior.springJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}