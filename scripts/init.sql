create database filetester;
use database filetester;

create table cliente(
	identificacion varchar(12) primary key,
	nombres varchar(60) not null,
	apellidos varchar(60) not null,
	fechaNacimiento date not null);

insert into cliente(identificacion,nombres,apellidos,fechaNacimiento) values('0923817043','Jorge','Villavicencio','1984-06-14');
insert into cliente(identificacion,nombres,apellidos,fechaNacimiento) values('0923928393','Martha','Roldos','2017-11-01');
