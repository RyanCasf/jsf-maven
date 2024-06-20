package org.primefaces.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.MockedStatic;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Calendário Útil")
class CalendarioUtilTeste {
	
	private Clock clock = mock(Clock.class);
	private static final ZonedDateTime NOW = ZonedDateTime.of(2023, 2, 12, 12, 30, 30, 0, ZoneId.of("GMT"));
	
	@BeforeEach
	void setUpAll() {
		when(clock.getZone()).thenReturn(NOW.getZone());
		when(clock.instant()).thenReturn(NOW.toInstant());
	}
	
	@Test
	@DisplayName("Data de ontem.")
	void dataOntem() {
		try (MockedStatic<Clock> CLOCK_STATIC = mockStatic(Clock.class)) {
			CLOCK_STATIC.when(() -> Clock.systemDefaultZone()).thenReturn(clock);
			
			Date dataOntem = CalendarioUtil.dataOntem();
			
			LocalDate localDate = LocalDate.of(2023, 2, 11);
			Date esperado = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
			
			assertEquals(0, esperado.compareTo(dataOntem));
		}
	}
	
	@Test
	@DisplayName("Data de amanhã.")
	void dataAmanha() {
		try (MockedStatic<Clock> CLOCK_STATIC = mockStatic(Clock.class)) {
			CLOCK_STATIC.when(() -> Clock.systemDefaultZone()).thenReturn(clock);
		
			Date dataAmanha = CalendarioUtil.dataAmanha();
		
			LocalDate localDate = LocalDate.of(2023, 2, 13);
			Date esperado = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
			
			assertEquals(0, esperado.compareTo(dataAmanha));
		}
	}
}