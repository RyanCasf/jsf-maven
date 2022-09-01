package br.com.ryan.card;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.ryan.config.RealTime;

@ManagedBean @ViewScoped
public class CardManager implements Serializable {
	private static final long serialVersionUID = 6529389085942394974L;
	
	public CardManager() {
		RealTime.inicialize("construtor do ", getClass().getName());
	}
	
	public String getTitle() {
		RealTime.inicialize("GET DO ", "Título");
		return "Gerente";
	}

	public String getSubtitle() {
		RealTime.inicialize("GET DO ", "Subtítulo");
		return "Gerência geral";
	}
}