package br.com.ryan.home;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.ryan.util.Fetch;

@ManagedBean @ViewScoped
public class TabelaBean implements Serializable {
	private List<TabelaHome> lista;

	public List<TabelaHome> getLista() {
		if (lista == null)
			lista = Fetch.fetchList(TabelaHome.class, 5);
			
		return lista;
	}
}