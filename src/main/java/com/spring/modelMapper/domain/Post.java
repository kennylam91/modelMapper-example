package com.spring.modelMapper.domain;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.modelMapper.config.ModelMapperFactory;
import com.spring.modelMapper.dto.PostDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	
	

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date createdTime;

	
	public PostDTO convertToDto() {
		return ModelMapperFactory.getModelMapper().map(this,PostDTO.class);
	}

	
}
