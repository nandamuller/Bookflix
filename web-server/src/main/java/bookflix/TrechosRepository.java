package bookflix;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin( origins = {"*"} )
@RepositoryRestResource(collectionResourceRel = "trechos", path = "trechos")
public interface TrechosRepository extends PagingAndSortingRepository<Trecho, Long> {
	
	List<Trecho> findByConteudoContainingIgnoreCase(@Param("conteudo") String conteudo);
}
