package com.renanvanni.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renanvanni.workshopmongo.domain.Post;
import com.renanvanni.workshopmongo.repository.PostRepository;
import com.renanvanni.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post  findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
