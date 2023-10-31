package org.primefaces.util;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class CalendarioUtil {
	
	private static Clock clock = Clock.systemDefaultZone();
	
	private CalendarioUtil() {
		throw new IllegalStateException("Classe utilitária");
	}
	
	public static Date dataOntem() {
		LocalDate ontem = LocalDate.now(clock).minusDays(1);
		return Date.from(ontem.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public static Date dataAmanha() {
		LocalDate ontem = LocalDate.now(clock).plusDays(1);
		return Date.from(ontem.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
}