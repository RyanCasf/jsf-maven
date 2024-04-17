package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import lombok.Data;

@Data @Named @ViewScoped
public class AutoCompleteBean implements Serializable {
	
	private String texto;
	
	public List<String> complete(String in) {
		System.out.println(in);
		return new ArrayList<>(Arrays.asList("0", "1", "2", in));
	}
	
	public void itemSelect(SelectEvent	evento) {
		System.out.println("itemSelect: " + evento.getObject());
	}
	
	public void itemUnselect(UnselectEvent evento) {
		System.out.println("itemUnselect");
	}
}