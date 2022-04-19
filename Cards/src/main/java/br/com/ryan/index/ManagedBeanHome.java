package br.com.ryan.index;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean @ViewScoped
public class ManagedBeanHome implements Serializable {
	private final String title = "Gerente";
	private final String subtitle = "Gerência geral";
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSubtitle() {
		return this.subtitle;
	}
}