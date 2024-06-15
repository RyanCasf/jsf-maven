package org.primefaces.test.fonte;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data @Named @ViewScoped
public class FonteBean implements Serializable {
	
	private int escalaFonte = 12;
}