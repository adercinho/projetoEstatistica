package br.com.estatistica.mb;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import br.com.estatistica.dao.CaracteristicaDimensaoDAO;
import br.com.estatistica.dao.EstatisticaDAO;
import br.com.estatistica.dao.impl.CaracteristicaDimensaoDAOImpl;
import br.com.estatistica.dao.impl.EstatisticaDAOImpl;
import br.com.estatistica.entity.CaracteristicaDimensao;
import br.com.estatistica.util.JPAUtil;

@ManagedBean
@RequestScoped
public class LeitorEstatisticaBean implements Serializable{

	private List<CaracteristicaDimensao> listaCaracteristicasDimensao;
	private CaracteristicaDimensao caracteristicaDimensao = new CaracteristicaDimensao();
	private String cluster = new String();
	private String mensagem = "";
	private int resultado = 0;
	
	@PostConstruct
	public void inicializa() {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		CaracteristicaDimensaoDAO dao = new CaracteristicaDimensaoDAOImpl(CaracteristicaDimensao.class, em);
		// obtem todos os tipos de indicadores do banco
		this.listaCaracteristicasDimensao = dao.getTodosTiposIndicadores();
		em.getTransaction().commit();
		em.close();
	}

	public void quantidadeTipoIndicadorPorCluster() {
		try {
			EstatisticaDAO dao;
			dao = new EstatisticaDAOImpl();
			this.resultado = dao.getQuantidadeTipoIndicadorPorCluster(
					caracteristicaDimensao.getId(), cluster);
			setMensagem("Estatistica Gerada com sucesso!! ");
		} catch (IOException e) {
			setMensagem("Problemas ao gravar o arquivo! " + e.getMessage());
		}
		addInfo();
		
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


	public CaracteristicaDimensao getCaracteristicaDimensao() {
		return caracteristicaDimensao;
	}


	public void setCaracteristicaDimensao(
			CaracteristicaDimensao caracteristicaDimensao) {
		this.caracteristicaDimensao = caracteristicaDimensao;
	}


	public List<CaracteristicaDimensao> getListaCaracteristicasDimensao() {
		return listaCaracteristicasDimensao;
	} 

}
