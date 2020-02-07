package com.spring.modelMapper.dto;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.modelMapper.config.ModelMapperFactory;
import com.spring.modelMapper.domain.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostDTO {

	@JsonProperty(value = "id")
	private Long id;
	
	@JsonProperty(value = "title")
	private String title;
	
	@JsonProperty(value = "content")
	private String content;
	
	@JsonProperty(value = "createdTime")
	private Date createdTime;


	public Post convertToPost() {
		return ModelMapperFactory.getModelMapper().map(this, Post.class);
	}
}
