USE ecommerce;

CREATE TABLE users(
    id integer not null auto_increment,
    usuario VARCHAR(100) not null,
    email VARCHAR(150) not null,
    senha VARCHAR(50) not null,
    PRIMARY KEY(id)
);

INSERT INTO users (first_name, last_name, age) VALUES ('Pedro', 'Cabral', 25)