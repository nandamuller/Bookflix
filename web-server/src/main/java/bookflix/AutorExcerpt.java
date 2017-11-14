package bookflix;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "autorExcerpt", types = Autor.class)
public interface AutorExcerpt {

	String getNome();
	
	Set<Obra> getObras();
}
