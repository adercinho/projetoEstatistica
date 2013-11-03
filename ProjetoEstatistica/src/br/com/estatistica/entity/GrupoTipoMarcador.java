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
@Table(name = "GRUPO_TIPO_MARCADOR")
public class GrupoTipoMarcador {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CD_GRUPO_TP_MARCADOR")
	private Integer id;
	
	private String nome;
	@ManyToOne
	@JoinColumn(name="COD_MARCADOR")
	private Marcador marcador;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<TipoMarcador> tiposMarcadores = new ArrayList<TipoMarcador>();
	
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
	
	public Marcador getMarcador() {
		return marcador;
	}
	public void setMarcador(Marcador marcador) {
		this.marcador = marcador;
	}
	public List<TipoMarcador> getTiposMarcadores() {
		return tiposMarcadores;
	}
	public void setTiposMarcadores(List<TipoMarcador> tiposMarcadores) {
		this.tiposMarcadores = tiposMarcadores;
	}
	
	
}
