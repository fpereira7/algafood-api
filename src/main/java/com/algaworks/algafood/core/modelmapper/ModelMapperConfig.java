package com.algaworks.algafood.core.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.api.model.EnderecoModel;
import com.algaworks.algafood.api.model.RestauranteDTO;
import com.algaworks.algafood.api.model.RestauranteModel;
import com.algaworks.algafood.domain.model.Endereco;
import com.algaworks.algafood.domain.model.Restaurante;

@Configuration
public class ModelMapperConfig {

	//config para personalizar nome de atributos com mapper
	
	@Bean
	public ModelMapper modelMapper() {
		var modelMapper = new ModelMapper();
		var enderecoToEnderecoModelTypeMap = modelMapper.createTypeMap(Endereco.class, EnderecoModel.class);
		
		enderecoToEnderecoModelTypeMap.<String>addMapping(
				enderecoSrc -> enderecoSrc.getCidade().getEstado().getNome(),
				(enderecoModelDest, value) -> enderecoModelDest.getCidade().setEstado(value));
		
		modelMapper.createTypeMap(Restaurante.class, RestauranteModel.class)
			.addMapping(Restaurante::getTaxaFrete, RestauranteModel::setPrecoFrete);
		
		
		modelMapper.createTypeMap(Restaurante.class, RestauranteDTO.class)	
			.addMapping(Restaurante::getTaxaFrete, RestauranteDTO::setMeupauFrete);
		
		
		return modelMapper;
	}
	
}
