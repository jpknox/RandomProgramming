insert into blog_post
(id, title, subtitle, author)
values
(1, 'Learning Spring Boot', 'A how-to guide', 'Joao Paulo Knox');

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(1, 'This is the text which makes up the first paragraph.', 1);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(2, 'I am the contents of the second paragraph.', 1);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(3, 'This makes up paragraph 3.', 1);


insert into blog_post
(id, title, subtitle, author)
values
(2, 'Building My Blog', 'A case study', 'Joao Paulo Knox');

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(4, 'Getting over the initial hump of technological inexperience is the hardest bit.', 2);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(5, 'That and HTML & CSS.', 2);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(6, 'Though, after a while, it becomes very enjoyable.', 2);