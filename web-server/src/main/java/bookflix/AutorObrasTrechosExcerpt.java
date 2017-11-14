package bookflix;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "autorObrasTrechosExcerpt", types = Autor.class)
public interface AutorObrasTrechosExcerpt {

	String getNome();
	
	Set<ObraExcerpt> getObras();
}
