package org.primefaces.test.data;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.mockStatic;

import javax.faces.context.FacesContext;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Data Bean")
class DataBeanTest {
	
	@InjectMocks
	private DataBean bean;
	
	@Mock
	private FacesContext facesContextMock;
	
	@Test
	@DisplayName("Selecionar data.")
	void selecionarData() {
		try (MockedStatic<FacesContext> facesContext = mockStatic(FacesContext.class)) {
			facesContext.when(() -> FacesContext.getCurrentInstance()).thenReturn(facesContextMock);
			
			assertDoesNotThrow(() -> bean.selecionarData());
			
			facesContext.verify(() -> FacesContext.getCurrentInstance());
			facesContext.verifyNoMoreInteractions();
		}
	}
}