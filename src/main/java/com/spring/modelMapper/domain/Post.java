package com.spring.modelMapper.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Post {

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date createdTime;
}
