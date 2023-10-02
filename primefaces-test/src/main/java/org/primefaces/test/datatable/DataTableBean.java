package org.primefaces.test.datatable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data @Named @ViewScoped
public class DataTableBean implements Serializable {
	
	private List<Contato> contatos = new ArrayList<>();
	private Contato contato = new Contato();
	
	public void adicionarContato() {
		if (contato.getNome() == null || contato.getNome().trim().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso", "O campo 'Nome' está inválido!"));
			return;
		}
		
		if (contato.getCidade() == null || contato.getCidade().trim().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso", "O campo 'Cidade' está inválido!"));
			return;
		}
		
		if (contatos.contains(contato)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso", "Contato já existe na lista!"));
			return;
		}
		
		contatos.add(contato);
		contato = new Contato();
	}
}