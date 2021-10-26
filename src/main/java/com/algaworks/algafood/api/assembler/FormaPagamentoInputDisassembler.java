package com.algaworks.algafood.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.api.model.input.FormaPagamentoInput;
import com.algaworks.algafood.domain.model.FormaPagamento;

@Component
public class FormaPagamentoInputDisassembler {

	@Autowired
	private ModelMapper modelmapper;
	
	public FormaPagamento toDomainObject(FormaPagamentoInput formaPagamentoInput) {
		return modelmapper.map(formaPagamentoInput, FormaPagamento.class);
	}
	
	public void copyToDomainObject(FormaPagamentoInput formaPagamentoInput, FormaPagamento formaPagamento) {
		modelmapper.map(formaPagamentoInput, formaPagamento);
	}
}
