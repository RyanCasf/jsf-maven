package org.primefaces.test.datatable;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @EqualsAndHashCode(of = "nome")
public class Contato implements Serializable {
	
	private Long chave;
	private String nome;
	private String cidade;
	private UnidadeFederativa unidadeFederativa;
}