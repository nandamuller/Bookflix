package bookflix;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost", "http://localhost:8090"})
@RepositoryRestResource(collectionResourceRel = "trechos", path = "trechos")
public interface TrechosRepository extends PagingAndSortingRepository<Trecho, Long> {

}
