package org.primefaces.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.primefaces.event.timeline.TimelineAddEvent;
import org.primefaces.event.timeline.TimelineModificationEvent;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Test View")
class TestViewTest {
	
	private TestView bean;
	
	@BeforeEach
	void setUp() {
		bean = new TestView();
		
		assertNotNull(bean.getTimeline());
		assertNotNull(bean.getStart());
		assertNotNull(bean.getEnd());
	}
	
	@ParameterizedTest(name = "Valor: ''{0}''.")
	@NullSource
	@DisplayName("onAdd.")
	void onAdd(TimelineAddEvent timelineAddEvent) {
		assertDoesNotThrow(() -> bean.onAdd(null));
	}
	
	@ParameterizedTest(name = "Valor: ''{0}''.")
	@NullSource
	@DisplayName("onChange.")
	void onChange(TimelineModificationEvent timelineModificationEvent) {
		assertDoesNotThrow(() -> bean.onChange(null));
    }
	
	@ParameterizedTest(name = "Valor: ''{0}''.")
	@NullSource
	@DisplayName("onChanged.")
    void onChanged(TimelineModificationEvent timelineModificationEvent) {
		assertDoesNotThrow(() -> bean.onChanged(null));
    }
	
	@ParameterizedTest(name = "Valor: ''{0}''.")
	@NullSource
	@DisplayName("onEdit.")
	void onEdit(TimelineModificationEvent timelineModificationEvent) {
		assertDoesNotThrow(() -> bean.onEdit(null));
	}
	
	@ParameterizedTest(name = "Valor: ''{0}''.")
	@NullSource
	@DisplayName("onDelete.")
	void onDelete(TimelineModificationEvent timelineModificationEvent) {
		assertDoesNotThrow(() -> bean.onDelete(null));
	}
}