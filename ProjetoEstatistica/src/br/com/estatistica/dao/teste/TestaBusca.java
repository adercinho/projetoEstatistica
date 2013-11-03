package br.com.estatistica.dao.teste;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.estatistica.dao.EstatisticaDAO;
import br.com.estatistica.dao.TipoMarcadorDAO;
import br.com.estatistica.dao.DAO;
import br.com.estatistica.dao.impl.EstatisticaDAOImpl;
import br.com.estatistica.dao.impl.TipoMarcadorDAOImpl;
import br.com.estatistica.dao.impl.DAOImpl;
import br.com.estatistica.entity.TipoMarcador;
import br.com.estatistica.util.JPAUtil;

public class TestaBusca {

	public static void main(String[] args) throws IOException {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

//		DAO<TipoMarcador, Integer> dao = new DAOImpl<TipoMarcador, Integer>(TipoMarcador.class, em);
		// BUSCA POR ID 21 DA CARACTERISTICA DA DIMENSAO
//		TipoMarcador tipoMarcador = dao.searchByID(21);
		
		// NOME DA CARACTERISTICA DA DIMENSAO e A QUAL TIPO DE DIMENSAO PERTENCE?
//		System.out.println("NOME: "+tipoMarcador.getNome()+", Pertence ao GRUPO: "+tipoMarcador.getTipoDimensao().getNome() +
//				", da DIMENSÃO: "+tipoMarcador.getTipoDimensao().getDimensao().getNome());
		
		TipoMarcadorDAO dao = new TipoMarcadorDAOImpl(TipoMarcador.class, em);
		TipoMarcador tipoMarcador = dao.searchByID(2);
		System.out.println(tipoMarcador.getNome() + " - "+tipoMarcador.getId());
		EstatisticaDAO estatisticaDAO = new EstatisticaDAOImpl();
		int qtde = estatisticaDAO.getQuantidadeTipoIndicadorPorCluster(tipoMarcador.getId(), "cluster0");
		
		System.out.println("Quantidade : "+qtde);

		em.getTransaction().commit();
		em.close();
		

		}
		
}
