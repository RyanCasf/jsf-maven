package br.com.ryan.config;

import java.io.Serializable;

public class RealTimeModel implements Serializable {
	private static final long serialVersionUID = 5675742525557235927L;
	
	private String acao;
	private String localidade;
	
	public RealTimeModel(String acao, String localidade) {
		super();
		this.acao = acao;
		this.localidade = localidade;
	}

	public String getAcao() {
		return acao;
	}
	
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
}