package br.com.estatistica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estatistica.dao.TipoMarcadorDAO;
import br.com.estatistica.entity.TipoMarcador;

public class TipoMarcadorDAOImpl extends DAOImpl<TipoMarcador, Integer> implements TipoMarcadorDAO{

	public TipoMarcadorDAOImpl(Class<TipoMarcador> entityClas, EntityManager em) {
		super(entityClas, em);

	}

	@Override
	public List<TipoMarcador> getTodosTiposMarcadores() {
		TypedQuery<TipoMarcador> query = this.em.createQuery("from TipoMarcador", TipoMarcador.class);
		return query.getResultList();
	}

}
