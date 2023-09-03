package org.primefaces.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarioUtil {
	
	public static Date dataOntem() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		return calendar.getTime();
	}
	
	public static Date dataAmanha() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
}