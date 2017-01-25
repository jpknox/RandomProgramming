package com.jpknox.blogeroo.entity.builder;

import com.jpknox.blogeroo.entity.BlogPost;

/**
 * A builder for use in building BlogPost entities prior to them being
 * persisted.
 * 
 * @author jpknox
 *
 */

public class BlogPostBuilder {

	private BlogPost blogPost;

	public BlogPostBuilder() {
		blogPost = new BlogPost();
	}

	public BlogPostBuilder setTitle(String title) {
		blogPost.setTitle(title);
		return this;
	}

	public BlogPostBuilder setSubtitle(String subtitle) {
		blogPost.setSubtitle(subtitle);
		return this;
	}

	public BlogPostBuilder setHeaderImage(String headerImage) {
		blogPost.setHeaderImage(headerImage);
		return this;
	}

	public BlogPost build() {
		return blogPost;
	}

}
