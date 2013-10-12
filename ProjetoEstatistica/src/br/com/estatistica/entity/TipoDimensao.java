package br.com.estatistica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TIPO_DIMENSAO")
public class TipoDimensao {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COD_TIPO_DIMENSAO")
	private Integer id;
	private String nome;
	@ManyToOne
	@JoinColumn(name="COD_DIMENSAO")
	private Dimensao dimensao;
	@OneToMany(cascade=CascadeType.ALL)
	private List<CaracteristicaDimensao> caracteristicas = new ArrayList<CaracteristicaDimensao>();
	
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
	public List<CaracteristicaDimensao> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(List<CaracteristicaDimensao> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	
	
}
