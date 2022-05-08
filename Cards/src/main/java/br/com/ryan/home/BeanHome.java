package br.com.ryan.home;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named @ViewScoped
public class BeanHome implements Serializable {
	private List<String> menu = new ArrayList<String>();
	private String header = "Produto";

	public BeanHome() {
		header = "Produto";
	}
	
	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}
}