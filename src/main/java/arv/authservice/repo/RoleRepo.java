package arv.authservice.repo;

import arv.authservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 10.04.2022
 */
public interface RoleRepo extends JpaRepository<Role, Long> {
}
