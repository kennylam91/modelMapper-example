package com.spring.modelMapper.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.spring.modelMapper.domain.Post;
import com.spring.modelMapper.dto.PostDTO;
import com.spring.modelMapper.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	private final List<PostDTO> postDTOList = new ArrayList<>();

	private void initPostDTOList() {
		Post post1 = new Post(1L,"Post 1","Content 1",null);
		Calendar cal = Calendar.getInstance();
		cal.set(1995, 5, 25, 04, 15, 20);
		cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		post1.setCreatedTime(cal.getTime());
		postDTOList.add(post1.convertToDto(post1));
	}
	
	public PostServiceImpl() {
		initPostDTOList();
	}


	@Override
	public List<PostDTO> getPosts() {
		return postDTOList;
	}


	
}
