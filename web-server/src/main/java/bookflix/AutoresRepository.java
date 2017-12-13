package bookflix;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"*"})
@RepositoryRestResource(collectionResourceRel = "autores", path = "autores")
public interface AutoresRepository extends PagingAndSortingRepository<Autor, Long> {
	
	List<Autor> findByNomeContainingIgnoreCase(@Param("nome") String nome);
}