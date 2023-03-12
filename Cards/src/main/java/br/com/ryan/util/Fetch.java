package br.com.ryan.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Fetch {
	
	private Fetch() {
		throw new IllegalStateException("Classe utilitária!");
    }
	
	public static <E> List<E> fetchList(Class<E> clazz, int size) {
		if (clazz == null) 
			throw new NullPointerException("Clazz is null.");
		
		if (size < 0)
			throw new IllegalArgumentException("Size is less zero.");
		
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