package com.algaworks.algafood.domain.exception;

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
