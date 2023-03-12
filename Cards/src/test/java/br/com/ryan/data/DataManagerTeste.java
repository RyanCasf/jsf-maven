package br.com.ryan.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS) @DisplayName("Data Manager")
class DataManagerTeste {
	
	private DataManager manager;
	
	@BeforeEach
	void novo() {
		manager = new DataManager();
	}
	
	@Test @DisplayName("Pegar Data padrão em nova instância.")
	void getDataPadraoNula() {
		assertNull(manager.getDataPadrao());
	}
	
	@Test @DisplayName("Definir Data padrão.")
	void setDataPadrao() {
		assertNull(manager.getDataPadrao());
		
		final Date DATA = new Date();
		manager.setDataPadrao(DATA);
		assertEquals(DATA, manager.getDataPadrao());
	}
}