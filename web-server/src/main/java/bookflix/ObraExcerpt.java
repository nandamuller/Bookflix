package bookflix;

import java.util.Set;

import org.springframework.data.rest.core.config.Projection;

@Projection (name = "obraTrechosExcerpt", types = Obra.class)
public interface ObraExcerpt {
	String getTitulo();
	
	Set<Trecho> getTrechos();
}
