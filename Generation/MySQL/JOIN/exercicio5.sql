/*
Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema trabalhará com as informações dos produtos desta empresa. 

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

Siga  exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos (não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.

Faça um select  utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre  tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria hidráulica).

*/

CREATE DATABASE db_construindo_a_nossa_vida; -- criando database
USE db_construindo_a_nossa_vida; -- usando database


-- criando tabelas

CREATE TABLE tb_categoria(
	
    id_categoria INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome_categoria VARCHAR(50),
    estoque INT
);

CREATE TABLE tb_produto(

	id_produto INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome_produto VARCHAR(50),
    preco DOUBLE,
    qtd INT,
    fk_id INT,
    FOREIGN KEY (fk_id) REFERENCES tb_categoria(id_categoria)
);

-- inserindo dados na tabela de categoria

INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Cimento", 120);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Pedra Brita", 256);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Aditivos", 98);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Aço", 165);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Tijolo", 566);


-- inserindo dados na tabela produto

INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Cimento Portland", 69.69, 2, 1);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Aditivo plastificante", 78.99, 3, 3);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Pó de brita", 29.99, 6, 2);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Cimento Portland Branco", 89.65, 2, 1);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Aço de alto carbono", 24.96, 2, 4);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Aditivos retardadores de pega", 56.39, 2, 3);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Brita nº 1", 39.96, 3, 2);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Tijolo Ecológico", 26.64, 4, 5);

SELECT * FROM tb_produto WHERE preco > 50; -- buscando produtos com valor superior a 50
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60; -- buscando produtos com valor entre 3 e 60
SELECT * FROM tb_produto WHERE nome_produto LIKE "C%"; -- buscando produtos com a letra C


-- fazendo busca nas duas tabelas usando INNER JOIN	

SELECT nome_produto AS PRODUTO, nome_categoria AS CATEGORIA, preco AS 'PREÇO', qtd AS QUANTIDADE
FROM tb_produto AS p
INNER JOIN tb_categoria AS c ON p.fk_id = c.id_categoria;


-- buscando produtos da categoria CIMENTO
SELECT nome_produto AS PRODUTO, nome_categoria AS CATEGORIA, preco AS 'PREÇO', qtd AS QUANTIDADE
FROM tb_produto AS p
INNER JOIN tb_categoria AS c ON p.fk_id = c.id_categoria
WHERE nome_categoria IN ("Cimento");