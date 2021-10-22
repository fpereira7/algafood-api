package com.algaworks.algafood.core.jackson;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.mixin.CidadeMixin;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Component
public class JacksonMixinModule extends SimpleModule{

	private static final long serialVersionUID = 1L;

	//adicionar as classes mixin
	public JacksonMixinModule() {
		setMixInAnnotation(Cidade.class, CidadeMixin.class);
	}
	
}
