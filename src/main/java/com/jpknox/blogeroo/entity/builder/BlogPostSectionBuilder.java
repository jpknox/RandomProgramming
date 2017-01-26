package com.jpknox.blogeroo.entity.builder;

import com.jpknox.blogeroo.entity.BlogPostParagraph;

public class BlogPostSectionBuilder {

	BlogPostParagraph blogPostParagraph;
	
	
	public BlogPostSectionBuilder() {
		blogPostParagraph = new BlogPostParagraph();
	}
	
	
	public BlogPostSectionBuilder setParagraph1(String paragraphText) {
		blogPostParagraph.setText(paragraphText);
		return this;
	}
	
	public BlogPostParagraph build() {
		return blogPostParagraph;
	}
	
}
