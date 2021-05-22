/*
Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as informações dos produtos desta empresa. 

O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

siga  exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.

Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela pizza com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 45 reais.

Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.

Faça um select  utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre  tabela categoria e pizza.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).

*/

CREATE DATABASE db_pizzaria_legal; -- criando database
USE db_pizzaria_legal; -- usando database


-- criando tabelas

CREATE TABLE tb_categoria(
	
    id_categoria INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome_categoria VARCHAR(50),
    forma VARCHAR(50)
);

CREATE TABLE tb_pizza(
	
    id_pizza INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    preco DOUBLE,
	sabor VARCHAR(50),
    acompanhamento VARCHAR(50),
    fk_id INT NOT NULL,
    FOREIGN KEY (fk_id) REFERENCES tb_categoria(id_categoria)
);


-- inserindo dados da tabela categoria
INSERT INTO tb_categoria (nome_categoria, forma) VALUES ("Salgada", "Redonda");
INSERT INTO tb_categoria (nome_categoria, forma) VALUES ("Salgada", "Quadrada");
INSERT INTO tb_categoria (nome_categoria, forma) VALUES ("Doce", "Redonda");
INSERT INTO tb_categoria (nome_categoria, forma) VALUES ("Doce", "Quadrada");
INSERT INTO tb_categoria (nome_categoria, forma) VALUES ("Esfiha", "Redonda");


-- inserindo dados na tabela pizza
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (29.99, "Portuguesa", "Fanta Laranja", 1);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (59.99, "Metade Catupiry/Calabresa", "Coca-Cola", 1);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (35.60, "Chocolate", "Fanta Uva", 3);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (37.50, "Romeu e Julieta", "Guaraná Antartica", 4);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (10.00, "Frango com Catupiry", "Dolly", 5);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (10.00, "Chocolate", "Fanta Uva", 5);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (43.59, "Catupiry", "Fanta Laranja", 1);
INSERT INTO tb_pizza (preco, sabor, acompanhamento, fk_id) VALUES (42.22, "Calabresa", "Guaraná", 2);


SELECT * FROM tb_pizza WHERE preco > 45.00; -- buscando pizzas com valor superior a 45
SELECT * FROM tb_pizza WHERE preco BETWEEN 29.00 AND 60.00; -- buscando pizzas com valor entre 29 e 60
SELECT * FROM tb_pizza WHERE sabor LIKE 'C%'; -- buscando pizzas com a letra C


-- fazendo uma consulta nas duas tabelas usando INNER JOIN
SELECT sabor AS SABOR, nome_categoria AS CATEGORIA, acompanhamento AS ACOMPANHAMENTO, preco AS PRECO 
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_id = tb_categoria.id_categoria;

-- buscando pizzas salgadas
SELECT sabor AS SABOR, nome_categoria AS CATEGORIA
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_id = 1 = tb_categoria.id_categoria
WHERE nome_categoria IN ("Salgada");