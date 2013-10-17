package br.com.estatistica.dao;

import java.util.List;

import br.com.estatistica.entity.CaracteristicaDimensao;

public interface CaracteristicaDimensaoDAO extends DAO<CaracteristicaDimensao, Integer>{
	List<CaracteristicaDimensao> getTodosTiposIndicadores();
}
