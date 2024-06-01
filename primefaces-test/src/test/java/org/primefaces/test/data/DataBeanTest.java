package org.primefaces.test.data;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import javax.faces.context.FacesContext;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.MockedStatic;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Data Bean")
class DataBeanTest {
	
	private DataBean bean;
	
	@BeforeEach
	void setUp() {
		bean = new DataBean();
	}
	
	@Test
	@DisplayName("Selecionar data.")
	void selecionarData() {
		try (MockedStatic<FacesContext> facesContext = mockStatic(FacesContext.class)) {
			FacesContext facesContextMock = mock(FacesContext.class);
			facesContext.when(() -> FacesContext.getCurrentInstance()).thenReturn(facesContextMock);
			
			Assertions.assertDoesNotThrow(() -> bean.selecionarData());
		}
	}
}