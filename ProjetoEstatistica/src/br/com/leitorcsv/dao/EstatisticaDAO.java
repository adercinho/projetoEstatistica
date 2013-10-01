package br.com.leitorcsv.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.leitorcsv.model.Estatistica;

public class EstatisticaDAO {
	
	private static String FILE_NAME = "/home/adercio/teste.csv";  
	private List<Estatistica> listaEstatistica = new ArrayList<>();
	
	public EstatisticaDAO() throws IOException{
		LerArquivoEstatistica leitor = new LerArquivoEstatistica(FILE_NAME);
		this.listaEstatistica = leitor.getListaEstatistica();
	}
	
	public int getQuantidadeTipoIndicadorPorCluster(String tipoIndicador, String cluster){
		int count = 0;
		for(Estatistica e : this.listaEstatistica){
			if(e.getTipoMarcador().equals(tipoIndicador) && e.getCluster().equals(cluster)){
				count++;
			}
		}
		
		return count;
	}
}
