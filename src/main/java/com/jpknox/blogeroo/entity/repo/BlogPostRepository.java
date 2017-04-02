package com.jpknox.blogeroo.entity.repo;

import org.springframework.data.repository.CrudRepository;

import com.jpknox.blogeroo.entity.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{
	  
}
