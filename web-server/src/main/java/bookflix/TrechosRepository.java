package bookflix;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost", "http://localhost:8090"})
@RepositoryRestResource(collectionResourceRel = "trechos", path = "trechos")
public interface TrechosRepository extends PagingAndSortingRepository<Trecho, Long> {
	
	// TODO remover
	List<Trecho> findByAutor(@Param("nome") String nome);
	
	List<Trecho> findByConteudoContainingIgnoreCase(@Param("conteudo") String conteudo);
}
