package com.algaworks.algafood.domain.exception;

public class UsuarioNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	private static final String MSG_USUARIO_NAO_ENCONTRADO = "Não existe um cadastro de usuário com código %d";

	public UsuarioNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioNaoEncontradoException(Long cidadeId) {
		this(String.format(MSG_USUARIO_NAO_ENCONTRADO, cidadeId));
	}
	
}
