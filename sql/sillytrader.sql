create database sillytrader;
show databases;
use sillytrader;
create table sillytrader.user
(
    id bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username varchar(255),
    password varchar(255),
    email varchar(255),
    phone varchar(255),
    role varchar(255)

);

show tables;