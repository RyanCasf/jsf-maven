package org.primefaces.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Test View")
class TestViewTest {
	
	private TestView bean;
	
	@BeforeEach
	void setUp() {
		bean = new TestView();
	}
	
	@Test @DisplayName("Construtor.")
	void construtor() {
		assertNotNull(bean.getTimeline());
		assertNotNull(bean.getStart());
		assertNotNull(bean.getEnd());
	}
}