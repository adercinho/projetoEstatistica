package br.com.estatistica.entity;

import javassist.expr.Cast;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_MARCADOR")
public class TipoMarcador {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COD_TIPO_MARCADOR")
	private Integer id;
	private String nome;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CD_GRUPO_TP_MARCADOR")
	private GrupoTipoMarcador grupoTipoMarcador;
	
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
	public GrupoTipoMarcador getGrupoTipoMarcador() {
		return grupoTipoMarcador;
	}
	public void setGrupoTipoMarcador(GrupoTipoMarcador grupoTipoMarcador) {
		this.grupoTipoMarcador = grupoTipoMarcador;
	}
	
}
