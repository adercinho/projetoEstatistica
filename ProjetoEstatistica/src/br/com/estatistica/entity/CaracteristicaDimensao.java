package br.com.estatistica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARACTERISTICA_DIMENSAO")
public class CaracteristicaDimensao {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COD_CARACTERISTICA_DIMENSAO")
	private Integer id;
	private String nome;
	@ManyToOne
	@JoinColumn(name="COD_TIPO_DIMENSAO")
	private TipoDimensao tipoDimensao;
	
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
	public TipoDimensao getTipoDimensao() {
		return tipoDimensao;
	}
	public void setTipoDimensao(TipoDimensao tipoDimensao) {
		this.tipoDimensao = tipoDimensao;
	}
}
