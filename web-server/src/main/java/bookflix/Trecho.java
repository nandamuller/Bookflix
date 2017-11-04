package bookflix;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trecho {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column( columnDefinition = "TEXT" )
	private String conteudo;
	private String autor;
	private String obra;
	
	protected Trecho() {}
	
	public Trecho(String conteudo, String autor, String obra) {
		this.conteudo = conteudo;
		this.autor = autor;
		this.obra = obra;
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
	public String getObra() {
		return obra;
	}
	public void setObra(String obra) {
		this.obra = obra;
	}
}
