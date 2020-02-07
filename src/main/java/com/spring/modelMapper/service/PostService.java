package com.spring.modelMapper.service;

import java.util.List;

import com.spring.modelMapper.domain.Post;
import com.spring.modelMapper.dto.PostDTO;

public interface PostService {
	
	List<PostDTO> getPosts();
	
	
	

}
