package com.jpknox.blogeroo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpknox.blogeroo.entity.BlogPost;
import com.jpknox.blogeroo.entity.BlogPostParagraph;
import com.jpknox.blogeroo.entity.repo.BlogPostParagraphRepository;
import com.jpknox.blogeroo.entity.repo.BlogPostRepository;
import com.sun.glass.ui.Application;

@SpringBootApplication
public class BlogerooApplication {

	private static final Logger log =
			LoggerFactory.getLogger(Application.class);

	@Autowired
	BlogPostRepository blogPostRepository;
	
	@Autowired
	BlogPostParagraphRepository blogPostParagraphRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BlogerooApplication.class, args);
	}
	
	@PostConstruct													//Display to console all blog posts, after Spring starts up.
	void seeAllBlogPosts() {
		for (BlogPost blogPost: blogPostRepository.findAll()) {
			
			log.info("\t");
			log.info(blogPost.toString());
			for (BlogPostParagraph blogPostParagraph : blogPost.getBlogPostBody()) {
				log.info(blogPostParagraph.getText().toString());
			}
			log.info("\t");
			
		}
		
	}
}
