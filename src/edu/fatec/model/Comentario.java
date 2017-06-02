package edu.fatec.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comentario")
public class Comentario {
	
	private long id;
	private Date dataCadastro;
	private Date dataEdicao;
	private String texto;
	private boolean exibe;
	
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
	
	@Column(columnDefinition="date")
	public Date getDataEdicao() {
		return dataEdicao;
	}
	public void setDataEdicao(Date dataEdicao) {
		this.dataEdicao = dataEdicao;
	}
	
	@Column(columnDefinition="text")
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Column(columnDefinition="boolean")
	public boolean isExibe() {
		return exibe;
	}
	public void setExibe(boolean exibe) {
		this.exibe = exibe;
	}
	
}
