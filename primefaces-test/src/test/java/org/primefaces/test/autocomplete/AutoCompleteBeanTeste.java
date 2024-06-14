package org.primefaces.test.autocomplete;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("AutoComplete Bean")
class AutoCompleteBeanTeste {
	
	private AutoCompleteBean bean;
	
	@BeforeEach
	void setUp() {
		bean = new AutoCompleteBean();
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	@DisplayName("Complete vazio.")
	void completeVazio(String value) {
		Assertions.assertTrue(bean.complete(value).isEmpty());
	}
	
	@Test
	@DisplayName("Complete.")
	void complete() {
		String value = "strings";
		Assertions.assertEquals(Arrays.asList("0", "1", "2", value), bean.complete(value));
	}
}