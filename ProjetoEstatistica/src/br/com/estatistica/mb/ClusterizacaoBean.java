package br.com.estatistica.mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

@ManagedBean
public class ClusterizacaoBean {
	
	private String tipoClusterizacao;

	public void clusterizacaoTemporalmente(){
		System.out.println("Clusterizacao Temporalmente");
	}
	
	public void clusterizacaoEspacial(){
		System.out.println("Clusterizacao Espacial");
	}
	
	public void handleFileUpload(FileUploadEvent event) {  
        FacesMessage msg = new FacesMessage("Upload do arquivo, ", event.getFile().getFileName() + " realizado com sucesso! ");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }

	public String getTipoClusterizacao() {
		return tipoClusterizacao;
	}

	public void setTipoClusterizacao(String tipoClusterizacao) {
		this.tipoClusterizacao = tipoClusterizacao;
	}
}
