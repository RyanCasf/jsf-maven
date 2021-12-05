package br.com.ryan.index;

import java.io.Serializable;

public class TabelaHome implements Serializable
{
	private String header;
	private String value;

	public TabelaHome() {}
	
	public TabelaHome(String header, String value)
	{
		this.header = header;
		this.value = value;
	}
	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}