package br.com.estatistica.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.estatistica.dao.EstatisticaDAO;
import br.com.estatistica.entity.CaracteristicaDimensao;
import br.com.estatistica.io.leitor.LerArquivoEstatistica;
import br.com.estatistica.vo.Estatistica;

public class  EstatisticaDAOImpl implements EstatisticaDAO{

	private static String FILE_NAME = "/home/adercio/indicadores-nova-versao.csv";  
	private List<Estatistica> listaEstatistica = new ArrayList<Estatistica>();
	
	public EstatisticaDAOImpl() throws IOException{
		LerArquivoEstatistica leitor = new LerArquivoEstatistica(FILE_NAME);
		this.listaEstatistica = leitor.getListaEstatistica();
	}
	
	public int getQuantidadeTipoIndicadorPorCluster(Integer tipoIndicador, String cluster){
		int count = 0;
		for(Estatistica e : this.listaEstatistica){
			if(e.getTipoMarcador().equals(tipoIndicador) && e.getCluster().equals(cluster)){
				count++;
			}
		}
		
		return count;
	}

}
