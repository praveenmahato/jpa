package praveen.springframework.Spring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import praveen.springframework.Spring5Webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
