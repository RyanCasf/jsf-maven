package br.com.ryan.data;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean @ViewScoped
public class DataManager implements Serializable {
	private static final long serialVersionUID = 4465136805007413709L;

	private Date dataPadrao;
	
	public Date getDataPadrao() {
		return dataPadrao;
	}

	public void setDataPadrao(Date dataPadrao) {
		this.dataPadrao = dataPadrao;
	}
}