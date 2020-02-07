package com.spring.modelMapper.domain;

import java.util.Date;

import com.spring.modelMapper.dto.PostDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

	private Long id;
	
	private String title;
	
	private String content;
	
	private Date createdTime;
	
	public PostDTO convertToDto() {
		PostDTO postDTO = new PostDTO();
		postDTO.setId(this.getId());
		postDTO.setTitle(this.getTitle());
		postDTO.setContent(this.getContent());
		postDTO.setCreatedTime(this.getCreatedTime());
		return postDTO;
	}
}
