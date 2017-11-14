package bookflix;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "autorObrasExcerpt", types = Autor.class)
public interface AutorExcerpt {

	String getNome();
	
	Set<Obra> getObras();
}
