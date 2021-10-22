package com.algaworks.algafood.api.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.algaworks.algafood.core.validation.Groups;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoModel {

	@NotNull(groups = Groups.EstadoId.class)
	private Long id;
	
	@NotBlank
	private String nome;
}
