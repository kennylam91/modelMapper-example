package com.spring.modelMapper.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.modelMapper.domain.Post;
import com.spring.modelMapper.dto.PostDTO;
import com.spring.modelMapper.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	private final List<Post> postList = new ArrayList<>();

	private void initPostList() {
		Post post1 = new Post(1L,"Post 1","Content 1",null);
		Calendar cal = Calendar.getInstance();
		cal.set(1995, 5, 25, 04, 15, 20);
		cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		post1.setCreatedTime(cal.getTime());
		postList.add(post1);
		postList.add(new Post(2L,"Post2","Content 2",null));
		
	}

	public PostServiceImpl() {
		initPostList();
	}


	@Override
	public List<PostDTO> getPosts() {
		return postList.stream()
				.map(Post::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public Long createPost(PostDTO postDTO) {
		Post post = postDTO.convertToPost();
		Long randomId = Long.valueOf((new Random()).nextLong());
		post.setId(randomId);
		postList.add(post);
		return randomId;

	}


	
}
