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


insert into blog_post
(id, title, subtitle, author)
values
(3, 'Building an Android app with Java', 'Where should I start?', 'Joao Paulo Knox');

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(7, 'Skip the Java bit and go straight to React-Native.', 3);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(8, 'Only kidding.', 3);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(9, 'Learn the absolute basics of Android development using Java then move to React-Native', 3);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(10, 'Doing so will allow a developer to debug the transpiled output with more precision.', 3);


insert into blog_post
(id, title, subtitle, author)
values
(4, 'Top Notch Filler Text', 'Hot off the presses', 'Joao Paulo Knox');

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(11, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vitae laoreet mauris. Sed efficitur, magna id vestibulum aliquet, purus mi venenatis ex, efficitur tristique massa purus id lacus. Proin vel bibendum lorem. Nunc nunc felis, vestibulum in augue ac, suscipit fringilla mauris. Nullam vel faucibus odio, vitae mattis leo. Morbi sit amet gravida justo. Sed ullamcorper et libero vitae molestie. Ut auctor posuere sollicitudin.', 4);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(12, 'Maecenas mollis commodo lorem ut auctor. Cras neque erat, volutpat sed iaculis vitae, ullamcorper eu nisl. Pellentesque ut ex non augue laoreet laoreet et sit amet nulla. Quisque sed tellus tempor, semper ipsum sit amet, molestie nisl. Suspendisse potenti. Nunc ac metus vel eros dictum tincidunt quis id leo. Quisque volutpat interdum dui blandit lobortis. Integer sagittis mauris a tellus dapibus suscipit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nunc quis metus non nisl dignissim ultricies. Sed augue nunc, suscipit a mi non, congue ultricies ex. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.', 4);

insert into blog_post_paragraph
(id, text, parent_blog_post_id) values
(13, 'Vivamus ultrices velit ipsum, vel lacinia ipsum auctor vitae. Nunc condimentum dignissim mauris ac laoreet. Etiam nec dolor et arcu accumsan sollicitudin at vitae lectus. Duis ac aliquet dolor. Nulla commodo, elit eu aliquam convallis, nisl justo feugiat felis, at tempor nisi urna quis turpis. Vivamus commodo semper facilisis. Sed ut justo pellentesque arcu vulputate dignissim vel sit amet enim. Suspendisse a convallis dui. Donec laoreet ligula hendrerit quam luctus, in dictum dui posuere. Morbi vitae placerat orci.', 4);

