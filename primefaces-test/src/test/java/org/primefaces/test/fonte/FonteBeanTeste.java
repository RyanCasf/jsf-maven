package org.primefaces.test.fonte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Fonte Bean")
class FonteBeanTeste {
	
	private FonteBean bean;
	
	@BeforeEach
	void setUp() {
		bean = new FonteBean();
	}
	
	@Test
	@DisplayName("Escala fonte padrão.")
	void escalaFontePadrao() {
		Assertions.assertEquals(12, bean.getEscalaFonte());
	}
}