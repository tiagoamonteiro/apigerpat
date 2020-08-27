package br.com.navita.apigerpat.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PATRIMONIO")
public class Patrimonio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroTombo;
	private String nome;
	private String descricao;
	
	@ManyToOne
    @JoinColumn(name="marca_id")
	private Marca marcaId;
	
	public Patrimonio() {
		
	}
	
	public Patrimonio(String nome, String descricao, Marca marcaId) {
		this.nome = nome;
		this.descricao = descricao;
		this.marcaId = marcaId;
	}
	
	public Long getNumeroTombo() {
		return numeroTombo;
	}
	public void setNumeroTombo(Long numeroTombo) {
		this.numeroTombo = numeroTombo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Marca getMarcaId() {
		return marcaId;
	}
	public void setMarcaId(Marca marcaId) {
		this.marcaId = marcaId;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
