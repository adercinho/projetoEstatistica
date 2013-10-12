package br.com.estatistica.dao;


public interface EstatisticaDAO {
	
	int getQuantidadeTipoIndicadorPorCluster(String tipoIndicador, String cluster);
}
