package com.jpknox.blogeroo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BlogPost {

	@Id
	@GeneratedValue
	private Long id; // Unique DB identifier.

	public String title; // The heading title of the blog post.

	private String subtitle; // Will go underneath the heading title.

	private String headerImage; // Located underneath the title & subtitle.

	private String author; // The author of the blog post.

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "parentBlogPost")
	private List<BlogPostParagraph> blogPostBody; // All the div
													// paragraphs in the
													// body.

	
	public BlogPost() {
	}

	public BlogPost(BlogPost builtBlogPost) {
		this();
		this.title = builtBlogPost.getTitle();
		this.subtitle = builtBlogPost.getSubtitle();
		this.headerImage = builtBlogPost.getHeaderImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getHeaderImage() {
		return headerImage;
	}

	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<BlogPostParagraph> getBlogPostBody() {
		return blogPostBody;
	}

	public void setBlogPostBody(List<BlogPostParagraph> blogPostBody) {
		this.blogPostBody = blogPostBody;
	}

	@Override
	public String toString() {
		String stringForm = title + ", " + subtitle;

		return stringForm;
	}

}
