//DTO - Data Transfer Object(Classe para retornar apenas as categorias sem suas relacões)

package com.blascoweb.cursomc.dto;

import java.io.Serializable;


import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.blascoweb.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	//Para estas anotações foi necessario adicionar novas dependencias no pom.xml.
	@NotEmpty(message="Preenchimento Obrigatório")
	@Length(min=5, max=80, message="Tamanho deve ser entre 5 e 80 caracteres.")
	private String nome;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
