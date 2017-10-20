package am.profclub.school.repositories;

import am.profclub.school.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByFirstName(String firstName);

    List<User> findByLastName(String lastName);
}
