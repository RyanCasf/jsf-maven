package org.primefaces.test.datatable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_METHOD)
@DisplayName("Data Table Bean")
class DataTableBeanTeste {
	
	@InjectMocks
	private DataTableBean bean;
	
	@ParameterizedTest(name = "Valor.")
	@ArgumentsSource(DataTableTestRegistros.class)
	@DisplayName("Adicionar contato único.")
	void adicionarContatoUnico(Contato contato) {
		bean.setContato(contato);
		
		bean.adicionarContato();
		
		assertEquals(1, bean.getContatos().size());
		assertEquals(contato.getNome(), bean.getContatos().get(0).getNome());
		assertEquals(contato.getCidade(), bean.getContatos().get(0).getCidade());
		assertNull(bean.getContato().getNome());
		assertNull(bean.getContato().getCidade());
	}
}