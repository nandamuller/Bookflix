package bookflix;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Obra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String titulo;

	@ManyToOne
	@RestResource (exported = false)
	private Autor autor;
	
	@OneToMany (mappedBy = "obra")
	private Set<Trecho> trechos = new HashSet<Trecho>();

	protected Obra() {}
	
	public Obra(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
