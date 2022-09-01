package br.com.ryan.config;

import java.util.ArrayList;
import java.util.List;

public class RealTime {
	private static List<RealTimeModel> chamadas = new ArrayList<RealTimeModel>();
	
	private RealTime() {
		throw new IllegalStateException("Classe Utilitária!");
	}
	
	public static synchronized void inicialize(String titulo, String chave) {
		chamadas.add(new RealTimeModel((titulo != null ? titulo.toUpperCase() : ""), (chave != null ? chave : "")));
	}

	public static List<RealTimeModel> getChamadas() {
		return chamadas;
	}
	
	public static void limpar() {
		if (chamadas != null && !chamadas.isEmpty()) {
			chamadas.clear();
		}
	}
}