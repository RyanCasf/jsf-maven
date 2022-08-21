package br.com.ryan.config;

import java.util.Hashtable;
import java.util.Map;

public class RealTime {
	
	private static Map<String, String> chamadas = new Hashtable<String, String>();
	
	private RealTime() {
		throw new IllegalStateException("Classe Utilitária");
	}
	
	public static synchronized void inicialize(String titulo, String chave) {
		chamadas.put((titulo != null ? titulo.toUpperCase() : ""), (chave != null ? chave : ""));
	}

	public static Map<String, String> getChamadas() {
		return chamadas;
	}
}