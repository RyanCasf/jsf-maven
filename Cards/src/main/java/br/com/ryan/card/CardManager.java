package br.com.ryan.card;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.ryan.config.RealTime;

@ManagedBean @ViewScoped
public class CardManager implements Serializable {
	private static final long serialVersionUID = 6529389085942394974L;
	
	public CardManager() {
		RealTime.inicialize("Construtor", "CardManager");
	}
	
	public String getTitle() {
		RealTime.inicialize("GET", "T�tulo");
		return "Gerente";
	}

	public String getSubtitle() {
		RealTime.inicialize("GET", "Subt�tulo");
		return "Ger�ncia geral";
	}
}