package com.jpknox.blogeroo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpknox.blogeroo.entity.BlogPost;
import com.jpknox.blogeroo.entity.repo.BlogPostRepository;
import com.sun.glass.ui.Application;

@Controller
public class HomeController {

	private static final Logger log =
			LoggerFactory.getLogger(Application.class);
	
	@Autowired
	BlogPostRepository blogPostRepository;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("blogEntries", blogPostRepository.findAll());
		
		BlogPost blogPost = blogPostRepository.findOne(1L);
		
		log.info(blogPost.getTitle());
		
		return "index";
	}
	
}
