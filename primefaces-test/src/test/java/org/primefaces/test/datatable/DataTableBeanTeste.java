package org.primefaces.test.datatable;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Data Table Bean")
class DataTableBeanTeste {
	
	private DataTableBean bean;
	private DataTableTestRegistros registros;
	
	@BeforeAll
	void setUpAll() {
		registros = new DataTableTestRegistros();
	}
	
	@BeforeEach
	void setUp() {
		bean = new DataTableBean();
	}
	
	@Test @DisplayName("Adicionar contato único.")
	void adicionarContatoUnico() {
		bean.setContato(registros.getContato1());
		
		bean.adicionarContato();
		
		assertEquals(1, bean.getContatos().size());
		assertEquals(registros.getContato1().getNome(), bean.getContatos().get(0).getNome());
		assertEquals(registros.getContato1().getCidade(), bean.getContatos().get(0).getCidade());
		assertNull(bean.getContato().getNome());
		assertNull(bean.getContato().getCidade());
	}
	
	@Test @DisplayName("Adicionar contato múltiplo.")
	void adicionarContatoMultiplo() {
		bean.setContato(registros.getContato1());
		bean.adicionarContato();
		assertNull(bean.getContato().getNome());
		assertNull(bean.getContato().getCidade());
		
		bean.setContato(registros.getContato2());
		bean.adicionarContato();
		assertNull(bean.getContato().getNome());
		assertNull(bean.getContato().getCidade());
		
		bean.setContato(registros.getContato3());
		bean.adicionarContato();
		assertNull(bean.getContato().getNome());
		assertNull(bean.getContato().getCidade());
		
		assertEquals(3, bean.getContatos().size());
		assertEquals(registros.getContato1().getNome(), bean.getContatos().get(0).getNome());
		assertEquals(registros.getContato1().getCidade(), bean.getContatos().get(0).getCidade());
		assertEquals(registros.getContato2().getNome(), bean.getContatos().get(1).getNome());
		assertEquals(registros.getContato2().getCidade(), bean.getContatos().get(1).getCidade());
		assertEquals(registros.getContato3().getNome(), bean.getContatos().get(2).getNome());
		assertEquals(registros.getContato3().getCidade(), bean.getContatos().get(2).getCidade());
	}
}