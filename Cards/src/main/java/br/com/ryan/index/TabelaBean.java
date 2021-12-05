package br.com.ryan.index;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean @ViewScoped
public class TabelaBean implements Serializable
{
	private static final long serialVersionUID = 8894993834590061631L;
	
	private List<TabelaHome> lista;
	
	private List<TabelaHome> fetchLista(int tamanho) {
		List<TabelaHome> temp = new ArrayList<TabelaHome>();
		for (int i=0; i<tamanho; i++) {
			temp.add(new TabelaHome("Title "+i, "V.: "+i));
		}
		return temp;
	}

	public List<TabelaHome> getLista() {
		if (lista == null) {
			lista = fetchLista(5);
		}
		return lista;
	}
}