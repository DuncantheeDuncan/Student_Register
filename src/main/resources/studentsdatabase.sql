create table lectures(
lecture_id int,
 name, second_name, surname, contact, email, gender, title
	id serial not null primary key,
	description text not null
);

create table students(
student_no,
name,
second_name,
surname,
title,
gender,
contact,
email,
parent_contact,
parent_email;

);

create table modules(
module_id,
module_name,
);



create table products (
	id serial not null primary key,
    description text not null,
	price decimal(10,2),
	category_id int,
	foreign key (category_id) references categories(id)
);