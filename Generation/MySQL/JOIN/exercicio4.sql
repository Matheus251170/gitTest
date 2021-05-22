/*
Crie um banco de dados para um serviço de um açougue ou uma quitanda, o nome do banco deverá ter o seguinte nome db_cidade_das_carnes ou db_cidade_das_frutas, onde o sistema trabalhará com as informações dos produtos desta empresa. 

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga  exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço desse açougue.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.

Faça um select  utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre  tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são aves ou legumes).

*/

CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

-- CRIANDO TABELA CATEGORIA

CREATE TABLE tb_categoria(

	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(50),
    estoque INT
);

-- CRIANDO TABELA PRODUTOS

CREATE TABLE tb_produtos(

	id_produto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(50),
	preco DOUBLE,
    qtd INT,
    fk_id INT,
	FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);


-- INSERINDO DADOS NA TABELA CATEGORIA

INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Frutas semiácidas", 64);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Legumes", 78);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Verduras", 78);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Frutas doces", 89);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Frutas ácidas", 65);


-- INSERINDO DADOS NA TABELA PRODUTOS

INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Ameixa", 22.66, 4, 1);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Abóbora", 53.56, 14, 2);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Cupuaçu", 25.65, 9, 5);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Cebolinha", 87.99, 16, 3);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Banana", 16.60, 6, 4);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Alface", 8.69, 8, 3);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Beterraba", 32.99, 11, 2);
INSERT INTO tb_produtos (nome_produto, preco, qtd, fk_id) VALUES ("Pêra", 34.99, 5, 1);

-- BUSCANDO PRODUTOS COM VALOR SUPERIOR A 50

SELECT * FROM tb_produtos WHERE preco > 50;

-- BUSCANDO PRODUTOS COM O VALOR ENTRE 3 E 60

SELECT * FROM tb_produtos WHERE preco BETWEEN 3 AND 60;

-- BUSCANDO PRODUTOS QUE COMEÇAM COM A LETRA C

SELECT * FROM tb_produtos WHERE nome_produto LIKE "C%";



-- FAZENOD UMA BUSCA NAS DUAS TABLEAS USANDO INNER JOIN

SELECT nome_produto AS PRODUTO, nome_categoria AS CATEGORIA, preco AS 'PREÇO', qtd AS VENDIDO, ESTOQUE AS ESTOQUE 
FROM tb_produtos AS p
INNER JOIN tb_categoria AS c ON p.fk_id = c.id_categoria;


-- BUSCANDO TODOS OS PRODUTOS DA CATEGORIA VERDURAS

SELECT nome_produto AS PRODUTO, nome_categoria AS CATEGORIA
FROM tb_produtos AS p
INNER JOIN tb_categoria AS c ON p.fk_id = c.id_categoria
WHERE nome_categoria IN ("Verduras");