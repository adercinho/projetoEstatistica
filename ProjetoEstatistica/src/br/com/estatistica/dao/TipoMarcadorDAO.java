package br.com.estatistica.dao;

import java.util.List;

import br.com.estatistica.entity.TipoMarcador;

public interface TipoMarcadorDAO extends DAO<TipoMarcador, Integer>{
	List<TipoMarcador> getTodosTiposMarcadores();
}
