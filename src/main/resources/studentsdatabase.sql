create table lectures(
lecture_id integer,
name VARCHAR(12),
second_name VARCHAR(12),
surname VARCHAR(12),
contact integer,
email VARCHAR(12),
gender VARCHAR(7),
title VARCHAR(5),
);

create table students(

student_no integer not null primary key,
name VARCHAR(12),
second_name VARCHAR(12),
surname VARCHAR(12),
contact integer,
email VARCHAR(12),
gender VARCHAR(7),
title VARCHAR(5),
parent_contact integer,
parent_email VARCHAR(12);

);

create table modules(
id integer;
module_id  VARCHAR(6),
module_name VARCHAR(25),
);
--create table products (
--	id serial not null primary key,
--    description text not null,
--	price decimal(10,2),
--	category_id int,
--	foreign key (category_id) references categories(id)
--);

--
--create table ** (
--	id serial not null primary key,
--    description text not null,
--	price decimal(10,2),
--	category_id int,
--	foreign key (category_id) references categories(id)
--);