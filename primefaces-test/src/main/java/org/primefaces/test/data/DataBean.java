package org.primefaces.test.data;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data @Named @ViewScoped
public class DataBean implements Serializable {
	
	private Date data;
}