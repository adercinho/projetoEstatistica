package br.com.estatistica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DIMENSAO")
public class Dimensao {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COD_DIMENSAO")
	private Integer id;
	@Column(name = "NOME")
	private String nome;
	@OneToMany(cascade=CascadeType.ALL)
	private List<TipoDimensao> tiposDimensoes = new ArrayList<TipoDimensao>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TipoDimensao> getTiposDimensoes() {
		return tiposDimensoes;
	}

	public void setTiposDimensoes(List<TipoDimensao> tiposDimensoes) {
		this.tiposDimensoes = tiposDimensoes;
	}
	
	

}
