package org.primefaces.test.autocomplete;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("AutoComplete Bean")
@ExtendWith(MockitoExtension.class)
class AutoCompleteBeanTeste {
	
	@InjectMocks
	private AutoCompleteBean bean;
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	@DisplayName("Complete vazio.")
	void completeVazio(String value) {
		assertTrue(bean.complete(value).isEmpty());
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"String"})
	@DisplayName("Complete.")
	void complete(String value) {
		assertEquals(Arrays.asList("0", "1", "2", value), bean.complete(value));
	}
}