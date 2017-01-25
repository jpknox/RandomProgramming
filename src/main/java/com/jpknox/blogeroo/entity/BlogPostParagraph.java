package com.jpknox.blogeroo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BlogPostParagraph {

	@Id @GeneratedValue
	private Long id;
	
	private String paragraphText;
	
	@ManyToOne
	private BlogPost parentBlogPost;

	
	public BlogPostParagraph() {
	}
	
	public BlogPostParagraph(BlogPostParagraph builtBlogPostSection) {
		this();
		this.paragraphText = builtBlogPostSection.getParagraph();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParagraph() {
		return paragraphText;
	}

	public void setParagraph(String paragraph) {
		this.paragraphText = paragraph;
	}

	public BlogPost getParentBlogPost() {
		return parentBlogPost;
	}

	public void setParentBlogPost(BlogPost parentBlogPost) {
		this.parentBlogPost = parentBlogPost;
	}

	
	@Override
	public String toString() {
		return paragraphText + "\t";
	}
	
	
}
