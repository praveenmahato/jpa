package praveen.springframework.Spring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import praveen.springframework.Spring5Webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
