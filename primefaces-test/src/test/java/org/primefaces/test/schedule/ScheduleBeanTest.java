package org.primefaces.test.schedule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Schedule Bean")
class ScheduleBeanTest {
	
	private ScheduleBean bean;
	
	@BeforeEach
	void setUp() {
		bean = new ScheduleBean();
	}
	
	@Test @DisplayName("Construtor.")
	void construtor() {
		assertNotNull(bean.getSchedule());
		assertNotNull(bean.getTimeline());
	}
}