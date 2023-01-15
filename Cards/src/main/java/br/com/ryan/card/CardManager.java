package br.com.ryan.card;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean @ViewScoped
public class CardManager implements Serializable {
	private static final long serialVersionUID = 6529389085942394974L;
	
	public String getTitle() {
		return "Gerente";
	}

	public String getSubtitle() {
		return "Gerência geral";
	}
}