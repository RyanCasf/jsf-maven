package org.primefaces.test.datatable;

import lombok.Data;

@Data
public class DataTableTestRegistros {
	
	private Contato contato1;
	private Contato contato2;
	private Contato contato3;
	
	public DataTableTestRegistros() {
		contato1 = new Contato();
		contato1.setNome("Nome teste:1");
		contato1.setCidade("Cidade teste:1");
		
		contato2 = new Contato();
		contato2.setNome("Nome teste:2");
		contato2.setCidade("Cidade teste:2");
		
		contato3 = new Contato();
		contato3.setNome("Nome teste:3");
		contato3.setCidade("Cidade teste:3");
	}
}