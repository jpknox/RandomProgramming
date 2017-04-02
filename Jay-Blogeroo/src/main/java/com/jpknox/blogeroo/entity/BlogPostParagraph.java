package com.jpknox.blogeroo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BlogPostParagraph {

	@Id @GeneratedValue
	private Long id;
	
	@Column( length = 1024)
	private String text;
	
	@ManyToOne
	private BlogPost parentBlogPost;

	
	public BlogPostParagraph() {
	}
	
	public BlogPostParagraph(BlogPostParagraph builtBlogPostSection) {
		this();
		this.text = builtBlogPostSection.getText();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String paragraph) {
		this.text = paragraph;
	}

	public BlogPost getParentBlogPost() {
		return parentBlogPost;
	}

	public void setParentBlogPost(BlogPost parentBlogPost) {
		this.parentBlogPost = parentBlogPost;
	}

	
	@Override
	public String toString() {
		return text + "\t";
	}
	
	
}
