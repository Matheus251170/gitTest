/*
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos deste ecommerce. 

Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste ecommerce.

Popule esta tabela com até 8 dados;

Faça um select que retorne os produtos com o valor maior do que 500.

Faça um select que retorne os produtos com o valor menor do que 500.

Ao término atualize um dado desta tabela através de uma query de atualização.

*/
CREATE DATABASE db_estoque; -- criando database
USE db_estoque; -- usando database

-- criando tabelas

CREATE TABLE tb_produtos(

	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    preco DECIMAL(10, 2),
    marca VARCHAR(30) NOT NULL,
    qtd INT
);


-- inserindo dados

INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Sapato",500.53, "Nike", 250);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Camisa",58.18, "Nike", 300);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Meias",83.50, "Adidas", 201);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Meias",92.81, "Zara", 320);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Blusa",756.95, "Adidas", 456);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Tênis",360.56, "Zara", 123);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Sapato",261.16, "Gucci", 445);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Sapato",73.08, "Adidas", 222);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Meias",53.45, "Gucci", 154);
INSERT INTO tb_produtos (nome,preco,marca, qtd) VALUES ("Camisa",526.92, "Zara", 265);



SELECT * FROM tb_produtos WHERE preco > 500; -- mostrando preço maior que quinhentos
SELECT * FROM tb_produtos WHERE preco < 500; -- mostrando preço menor que quinhentos

-- atualizando dados

UPDATE tb_produtos
SET preco = 600
WHERE id = 6;


-- exibindo os dados da tabela

SELECT * from tb_func;
