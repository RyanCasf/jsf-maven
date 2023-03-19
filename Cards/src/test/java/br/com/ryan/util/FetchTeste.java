package br.com.ryan.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Fetch")
class FetchTeste {
	
	@Test @DisplayName("Fetch nulo.")
	void fetchNulo() {
		assertThrows(NullPointerException.class, () -> Fetch.fetchList(null, 0));
	}
	
	@Test @DisplayName("Fetch para lista com tamanho negativo.")
	void fetchTamanhoNegativo() {
		assertThrows(IllegalArgumentException.class, () -> Fetch.fetchList(String.class, -1));
	}
	
	@Test @DisplayName("Fetch para lista vazia.")
	void fetchVazio() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		List<String> lista = Fetch.fetchList(String.class, 0);
		assertTrue(lista.isEmpty());
	}
	
	@Test @DisplayName("Fetch para lista populada.")
	void fetchPopulado() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		final int SIZE = Math.abs(new Random().nextInt(100)) + 1;
		List<String> lista = Fetch.fetchList(String.class, SIZE);
		
		assertEquals(SIZE, lista.size());
	}
	
	@Test @DisplayName("Fetch para lista com E com construtor com parâmetro.")
	void fetchClasseComParametro() {
		final int SIZE = Math.abs(new Random().nextInt(100)) + 1;
		
		assertThrows(NoSuchMethodException.class, () -> Fetch.fetchList(ClasseSemConstrutorPadrao.class, SIZE));
	}
	
	@Test @DisplayName("Fetch para lista com E com construtor com parâmetro e com padrão.")
	void fetchClasseComParametroEPadrao() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		final int SIZE = Math.abs(new Random().nextInt(100)) + 1;
		List<ClasseConstrutoresPadraoEParametro> lista = Fetch.fetchList(ClasseConstrutoresPadraoEParametro.class, SIZE);
		
		assertEquals(SIZE, lista.size());
	}
	
	@Test @DisplayName("Fetch para lista com E com construtor com padrão.")
	void fetchClasseConstrutorPadrao() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		final int SIZE = Math.abs(new Random().nextInt(100)) + 1;
		List<ClasseConstrutorPadrao> lista = Fetch.fetchList(ClasseConstrutorPadrao.class, SIZE);
		
		assertEquals(SIZE, lista.size());
	}
	
	@Test @DisplayName("Fetch para lista com E na mesma classe.")
	void fetchClassePadraoEmMesmaClasse() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		final int SIZE = Math.abs(new Random().nextInt(100)) + 1;
		assertThrows(NoSuchMethodException.class, () -> Fetch.fetchList(ClassePadraoMesmaClasse .class, SIZE));
	}
	
	public class ClassePadraoMesmaClasse {}
	
	@Test @DisplayName("Fetch para lista com E.")
	void fetchClassePadrao() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		final int SIZE = Math.abs(new Random().nextInt(100)) + 1;
		List<ClassePadrao> lista = Fetch.fetchList(ClassePadrao .class, SIZE);
		
		assertEquals(SIZE, lista.size());
	}
}