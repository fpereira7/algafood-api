package com.algaworks.algafood.domain.exception;

public class FormaPagamentoNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	private static final String MSG_FORMA_PAGAMENTO_NAO_ENCONTRADO = "Não existe um cadastro de forma de pagamento com código %d";

	public FormaPagamentoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public FormaPagamentoNaoEncontradoException(Long cidadeId) {
		this(String.format(MSG_FORMA_PAGAMENTO_NAO_ENCONTRADO, cidadeId));
	}
	
}
