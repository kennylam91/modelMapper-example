package com.spring.modelMapper.domain;

import java.util.Date;

import com.spring.modelMapper.dto.PostDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date createdTime;
	
	public PostDTO convertToDto(Post post) {
		PostDTO postDTO = new PostDTO();
		postDTO.setId(post.getId());
		postDTO.setTitle(post.getTitle());
		postDTO.setContent(post.getContent());
		postDTO.setCreatedTime(post.getCreatedTime());
		return postDTO;
	}
}
