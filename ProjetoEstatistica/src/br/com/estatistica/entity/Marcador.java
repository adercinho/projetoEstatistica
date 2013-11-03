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
@Table(name = "MARCADOR")
public class Marcador {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "COD_MARCADOR")
	private Integer id;
	@Column(name = "NOME")
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<GrupoTipoMarcador> listaGrupoTipoMarcador = new ArrayList<GrupoTipoMarcador>();

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

	public List<GrupoTipoMarcador> getListaGrupoTipoMarcador() {
		return listaGrupoTipoMarcador;
	}

	public void setListaGrupoTipoMarcador(
			List<GrupoTipoMarcador> listaGrupoTipoMarcador) {
		this.listaGrupoTipoMarcador = listaGrupoTipoMarcador;
	}	

}
