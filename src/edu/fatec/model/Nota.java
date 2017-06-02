package edu.fatec.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="nota")
public class Nota {
	
	private long id;
	private String titulo;
	private String descricao;
	private String cor;
	private TipoNota tipoNota;
	private List<Anexo> anexos;
	private List<Comentario> comentarios;
	private Usuario usuario;
	private boolean arquivado;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(length=255, columnDefinition="string")
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Column(columnDefinition="text")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(length=7, columnDefinition="string")
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@ManyToOne(targetEntity=TipoNota.class)
	public TipoNota getTipoNota() {
		return tipoNota;
	}
	public void setTipoNota(TipoNota tipoNota) {
		this.tipoNota = tipoNota;
	}
	
	@OneToMany(targetEntity=Anexo.class, mappedBy="anexo")
	public List<Anexo> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}
	
	@ManyToOne(targetEntity=Comentario.class)
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	@ManyToOne(targetEntity=Usuario.class)
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Column(columnDefinition="boolean")
	public boolean isArquivado() {
		return arquivado;
	}
	public void setArquivado(boolean arquivado) {
		this.arquivado = arquivado;
	}
	
}
