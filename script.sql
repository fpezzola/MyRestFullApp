CREATE SCHEMA restapp;

use restapp;

create table user(
	id BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    password varchar(60) not null,
    email varchar(100) not null
    );


insert into user values (default,'Juan','Perez','passPerez','dummy@dummy.com');
insert into user values (default,'Martin','Gonzalez','passGonzalez','dummy@dummy.com');
insert into user values (default,'Fulano','Rodriguez','passRodriguez','dummy@dummy.com');
insert into user values (default,'Lucas','Gomez','passGomez','dummy@dummy.com');
insert into user values (default,'Alfredo','Lopez','passLopez','dummy@dummy.com');
insert into user values (default,'Roman','Riquelme','passRoman','dummy@dummy.com');