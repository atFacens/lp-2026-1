create database bd_final_facens;

use bd_final_facens;

create table product (
	id  int auto_increment primary key,
	name varchar(120) not null,
    description varchar(255),
    value double
);