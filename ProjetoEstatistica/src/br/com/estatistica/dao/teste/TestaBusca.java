package br.com.estatistica.dao.teste;

import java.io.IOException;

import javax.persistence.EntityManager;

import br.com.estatistica.dao.DAO;
import br.com.estatistica.dao.impl.DAOImpl;
import br.com.estatistica.entity.CaracteristicaDimensao;
import br.com.estatistica.util.JPAUtil;

public class TestaBusca {

	public static void main(String[] args) throws IOException {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		DAO<CaracteristicaDimensao, Integer> dao = new DAOImpl<CaracteristicaDimensao, Integer>(CaracteristicaDimensao.class, em);
		// BUSCA POR ID 21 DA CARACTERISTICA DA DIMENSAO
		CaracteristicaDimensao caracteristicaDimensao = dao.searchByID(21);
		
		// NOME DA CARACTERISTICA DA DIMENSAO e A QUAL TIPO DE DIMENSAO PERTENCE?
		System.out.println("NOME: "+caracteristicaDimensao.getNome()+", Pertence ao GRUPO: "+caracteristicaDimensao.getTipoDimensao().getNome() +
				", da DIMENSÃO: "+caracteristicaDimensao.getTipoDimensao().getDimensao().getNome());

		em.getTransaction().commit();
		em.close();
		

		}
		
}
