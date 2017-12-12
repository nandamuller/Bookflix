package bookflix;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Trecho {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column( columnDefinition = "TEXT" )
	private String conteudo;
	
	@ManyToOne ( fetch = FetchType.EAGER )
	@RestResource ( exported = false )
	private Obra obra;

	private String referencia;
	
	protected Trecho() {}
	
	public Trecho(String conteudo, Obra obra, String referencia) {
		this.conteudo = conteudo;
		this.obra = obra;
		this.setReferencia(referencia);
	}
	
	public long getId() {
		return id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Obra getObra() {
		return obra;
	}
	
	public void setObra(Obra obra) {
		this.obra = obra;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
}
