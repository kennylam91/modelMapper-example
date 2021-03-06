package com.spring.modelMapper.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.modelMapper.domain.Post;
import com.spring.modelMapper.dto.PostDTO;
import com.spring.modelMapper.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping
	public List<PostDTO> getPosts(){
		return postService.getPosts();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public void createPost(@RequestBody PostDTO postDTO) throws Exception {
		if(postDTO.getTitle() == null) {
			throw new Exception("Title is required");
		}
		postService.createPost(postDTO);
	}
	
}
