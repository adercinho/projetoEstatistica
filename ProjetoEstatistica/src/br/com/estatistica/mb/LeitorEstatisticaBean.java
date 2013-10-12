package br.com.estatistica.mb;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.estatistica.dao.EstatisticaDAO;
import br.com.estatistica.dao.impl.EstatisticaDAOImpl;

@ManagedBean
@RequestScoped
public class LeitorEstatisticaBean implements Serializable{

	private String tipoIndicador = new String();
	private String cluster = new String();
	private String mensagem = "";
	private int resultado = 0;

	public void quantidadeTipoIndicadorPorCluster() {
		try {
			EstatisticaDAO dao;
			dao = new EstatisticaDAOImpl();
			this.resultado = dao.getQuantidadeTipoIndicadorPorCluster(
					tipoIndicador, cluster);
			setMensagem("Estatistica Gerada com sucesso!! ");
		} catch (IOException e) {
			setMensagem("Problemas ao gravar o arquivo! " + e.getMessage());
		}
		addInfo();
		
	}

	public String getTipoIndicador() {
		return tipoIndicador;
	}

	public void setTipoIndicador(String tipoIndicador) {
		this.tipoIndicador = tipoIndicador;
	}

	public String getCluster() {
		return cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}
	
	/**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
	
	 public void addInfo() {  
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,null, getMensagem()));  
	    }

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	} 

}
