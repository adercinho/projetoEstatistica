package br.com.estatistica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estatistica.dao.CaracteristicaDimensaoDAO;
import br.com.estatistica.entity.CaracteristicaDimensao;

public class CaracteristicaDimensaoDAOImpl extends DAOImpl<CaracteristicaDimensao, Integer> implements CaracteristicaDimensaoDAO{

	public CaracteristicaDimensaoDAOImpl(Class<CaracteristicaDimensao> entityClas, EntityManager em) {
		super(entityClas, em);

	}

	@Override
	public List<CaracteristicaDimensao> getTodosTiposIndicadores() {
		TypedQuery<CaracteristicaDimensao> query = this.em.createQuery("from CaracteristicaDimensao", CaracteristicaDimensao.class);
		return query.getResultList();
	}

}
