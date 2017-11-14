package bookflix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Obra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	protected Obra() {}
	
	private String titulo;

	@JsonIgnore
	@ManyToOne
	private Autor autor;

	public Obra(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
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
