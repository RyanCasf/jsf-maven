package org.primefaces.test.autocomplete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import lombok.Data;

@Data @Named @ViewScoped
public class AutoCompleteBean implements Serializable {
	
	private String texto;
	
	public List<String> complete(String in) {
		if (in == null || in.trim().isEmpty()) {
			return Collections.emptyList();
		}
		
		System.out.println(in);
		return new ArrayList<>(Arrays.asList("0", "1", "2", in));
	}
	
	public void itemSelect(SelectEvent	evento) {
		System.out.println("itemSelect: " + evento.getObject());
	}
}