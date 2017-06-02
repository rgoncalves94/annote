package edu.fatec.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="anexo")
public class Anexo {
	
	private long id;
	private Date dataCadastro;
	private String nomeArquivo;
	private String path;
	private String descricao;
	private String arquivado;
	private Usuario usuario;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(columnDefinition="date")
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	@Column(length=100,columnDefinition="string")
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Column(length=255, columnDefinition="string")
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Column(length=255, columnDefinition="string")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(columnDefinition="boolean")
	public String getArquivado() {
		return arquivado;
	}
	public void setArquivado(String arquivado) {
		this.arquivado = arquivado;
	}
	
	@ManyToOne(targetEntity=Usuario.class)
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
