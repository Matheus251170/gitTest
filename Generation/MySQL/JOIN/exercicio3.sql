/*
Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as informações dos produtos desta empresa. 

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga  exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.

Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.

Faça um select  utilizando LIKE buscando os Produtos com a letra B.

Faça um um select com Inner join entre  tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).

*/

CREATE DATABASE db_farmacia_do_bem; -- criando database
USE db_farmacia_do_bem; -- usando database

-- criando as tabelas

CREATE TABLE tb_categoria(

	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome_categoria VARCHAR(50),
	qtd INT
);

CREATE TABLE tb_produto(

	id_produto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(50),
    preco DOUBLE,
    brinde VARCHAR(50),
    fk_id INT,
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria) 
);


-- inserindo dados na tabela de categorias

INSERT INTO tb_categoria (nome_categoria, qtd) VALUES ("Cosméticos", 65);
INSERT INTO tb_categoria (nome_categoria, qtd) VALUES ("Analgésicos", 120);
INSERT INTO tb_categoria (nome_categoria, qtd) VALUES ("ácido acetilsalicílico", 98);
INSERT INTO tb_categoria (nome_categoria, qtd) VALUES ("Antibiótico", 102);
INSERT INTO tb_categoria (nome_categoria, qtd) VALUES ("Insulina", 96);


-- inserindo dados na tabela de produtos

INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Aspirina", 22.66, "Duas Caixas", 3);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Amoxicilina", 45.83, "Quatro Caixas", 4);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Paracetamol", 30.00, "Três Caixas", 2);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Insulina glargina", 39.90, "Duas Caixas", 5);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Antifebrin", 43.99, "Três Caixas", 3);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Mezlocilina", 4.08, "Uma Caixa", 4);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Creme Nivea", 10.69, "Uma únidade", 1);
INSERT INTO tb_produto (nome_produto, preco, brinde, fk_id) VALUES ("Dipirona", 69.99, "Cinco Caixas", 2);


SELECT * FROM tb_produto WHERE preco > 50; -- retornando produtos com valor maior que 50

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60; -- retornando produto com valor entre 3 e 60

SELECT * FROM tb_produto WHERE nome_produto LIKE "b%"; -- retorna todos os produtos com a letra B

SELECT nome_produto AS NOME, nome_categoria AS CATEGORIA, brinde AS COMPLEMENTO,  preco AS PRECO, qtd AS 'EM ESTOQUE'
FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.fk_id = tb_categoria.id_categoria; -- fazendo o INNER JOIN entre as duas tabelas


 -- mostrando produtos da categoria analgésicos
 
SELECT nome_produto AS NOME, nome_categoria AS CATEGORIA
FROM tb_produto AS p
INNER JOIN tb_categoria AS c ON p.fk_id = c.id_categoria
WHERE nome_categoria IN ("Analgésicos");