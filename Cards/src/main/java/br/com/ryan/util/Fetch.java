package br.com.ryan.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import br.com.ryan.config.RealTime;

public class Fetch {
	
	private Fetch() {
		throw new IllegalStateException("Classe utilitária!");
    }
	
	public static <E> List<E> fetchList(Class<E> clazz, int size) {
		RealTime.inicialize("Fetch", "fetch");
		
		List<E> list = new ArrayList<E>();
		
		try {
			for (int i=0; i<size; i++) {
				list.add(clazz.getDeclaredConstructor().newInstance());
			}
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | RuntimeException e) {
			e.printStackTrace();
		}
		
	    return list;
	}
}