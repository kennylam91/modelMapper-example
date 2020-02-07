package com.spring.modelMapper.config;

import org.modelmapper.ModelMapper;

public class ModelMapperFactory {
	
	private ModelMapperFactory() {
		super();
	}

	private static ModelMapper modelMapper = null;

	public static final ModelMapper getModelMapper() {
		if(modelMapper == null) {
			modelMapper = new ModelMapper();
		}
		return modelMapper;
	}
}
