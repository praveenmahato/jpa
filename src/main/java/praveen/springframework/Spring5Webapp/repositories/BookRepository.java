package praveen.springframework.Spring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import praveen.springframework.Spring5Webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
