package com.algaworks.algafood.api.model.input;

import com.algaworks.algafood.api.model.EnderecoModel;
import com.algaworks.algafood.api.model.FormaPagamentoModel;
import com.algaworks.algafood.api.model.UsuarioModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
public class PedidoResumoModel {

    private Long id;
    private BigDecimal subTotal;
    private BigDecimal taxaFrete;
    private BigDecimal valorTotal;
    private String status;
    private OffsetDateTime dataCriacao;
    //private FormaPagamentoModel formaPagamento;
    private RestauranteResumoModel restaurante;
    private UsuarioModel cliente;

}
