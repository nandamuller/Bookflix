package bookflix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	protected Obra() {}
	
	private String titulo;

	public Obra(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
