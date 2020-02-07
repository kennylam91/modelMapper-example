package com.spring.modelMapper.dto;

import java.util.Date;

import com.spring.modelMapper.domain.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date createdTime;
	
	public Post convertToPost() {
		Post post = new Post();
		post.setId(id);
		post.setTitle(title);
		post.setContent(content);
		post.setCreatedTime(createdTime);
		return post;
	}
}
