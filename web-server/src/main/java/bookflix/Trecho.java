package bookflix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trecho {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String conteudo;
	private String autor;
	
	protected Trecho() {}
	
	public Trecho(String conteudo, String autor) {
		this.conteudo = conteudo;
		this.autor = autor;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

}
