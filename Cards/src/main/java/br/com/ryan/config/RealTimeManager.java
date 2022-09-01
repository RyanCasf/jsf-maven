package br.com.ryan.config;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean @ViewScoped
public class RealTimeManager implements Serializable {
	private static final long serialVersionUID = -5290337170591285464L;
	
	public List<RealTimeModel> getChamadas() {
		return RealTime.getChamadas();
	}
	
	public void limparChamadas() {
		RealTime.limpar();
	}
}