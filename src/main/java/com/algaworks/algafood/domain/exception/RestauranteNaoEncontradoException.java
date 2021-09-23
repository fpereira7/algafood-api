package com.algaworks.algafood.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class RestauranteNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	private static final String MSG_RESTAURANTE_NAO_ENCONTRADO = "Não existe um cadastro de resturante com código %d";

	public RestauranteNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public RestauranteNaoEncontradoException(Long cidadeId) {
		this(String.format(MSG_RESTAURANTE_NAO_ENCONTRADO, cidadeId));
	}
	
}
