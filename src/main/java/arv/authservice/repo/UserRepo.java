package arv.authservice.repo;

import arv.authservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ArvikV
 * @version 1.0
 * @since 10.04.2022
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
