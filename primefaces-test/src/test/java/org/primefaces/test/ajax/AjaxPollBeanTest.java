package org.primefaces.test.ajax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Ajax Poll Bean")
class AjaxPollBeanTest {
	
	private AjaxPollBean bean;
	
	@BeforeEach
	void setUp() {
		bean = new AjaxPollBean();
		assertEquals(0, bean.getCount());
	}
	
	@ParameterizedTest(name = "Valor: ''{0}''.")
	@ValueSource(ints = { 1 })
	@DisplayName("Incrementar.")
	void incrementar(int valor) {
		bean.incrementar();
		assertEquals(valor, bean.getCount());
	}
	
	@Test
	@DisplayName("Incrementar aleatório.")
	void incrementarAleatorio() {
		long numero = (long) Math.abs(Math.random()) + 1;
		
		for (long i=0; i<numero; i++) {
			bean.incrementar();
		}
		
		assertEquals(numero, bean.getCount());
	}
}