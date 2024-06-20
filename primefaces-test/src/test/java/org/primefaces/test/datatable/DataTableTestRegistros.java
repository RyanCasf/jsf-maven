package org.primefaces.test.datatable;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DataTableTestRegistros implements ArgumentsProvider {
	
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		Contato contato1 = new Contato();
		contato1.setNome("Nome teste:1");
		contato1.setCidade("Cidade teste:1");
		
		Contato contato2 = new Contato();
		contato2.setNome("Nome teste:2");
		contato2.setCidade("Cidade teste:2");
		
		Contato contato3 = new Contato();
		contato3.setNome("Nome teste:3");
		contato3.setCidade("Cidade teste:3");
		
		return Stream.of(contato1, contato2, contato3).map(Arguments::of);
	}
}