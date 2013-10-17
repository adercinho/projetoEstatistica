package br.com.estatistica.dao;



public interface EstatisticaDAO{
	
	int getQuantidadeTipoIndicadorPorCluster(Integer tipoIndicador, String cluster);
}
