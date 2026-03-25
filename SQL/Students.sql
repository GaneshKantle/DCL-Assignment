create database NOTHINGBRUH;

use NOTHINGBRUH;

	CREATE TABLE Students(
	s_name  varchar(30) not null,
	s_id int primary key,
	s_dob date not null,
	s_email varchar(30) default 'student.dcl@gmail.com',
	s_phone bigint(10) check(length(s_phone)=10)
	unique); 

CREATE TABLE Employee(
e_name  varchar(30) not null,
e_id int primary key,
e_dob date not null,
e_email varchar(30) default 'employee.dcl@gmail.com'
); 

CREATE TABLE Employee(
e_name  varchar(30) not null,
e_id int primary key,
e_dob date not null,
e_email varchar(30) default 'employee.dcl@gmail.com'
); 

CREATE TABLE Employee(
e_name  varchar(30) not null,
e_id int primary key,
e_dob date not null,
e_email varchar(30) default 'employee.dcl@gmail.com'
); 

CREATE TABLE Employee(
e_name  varchar(30) not null,
e_id int primary key,
e_dob date not null,
e_email varchar(30) default 'employee.dcl@gmail.com'
); 


