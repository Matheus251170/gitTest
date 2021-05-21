CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

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

-- inserindo dados nas tabelas

INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Cimento", 120);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Pedra Brita", 256);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Aditivos", 98);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Aço", 165);
INSERT INTO tb_categoria (nome_categoria, estoque) VALUES ("Tijolo", 566);

INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Cimento Portland", 69.69, 2, 1);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Aditivo plastificante", 78.99, 3, 3);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Pó de brita", 29.99, 6, 2);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Cimento Portland Branco", 89.65, 2, 1);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Aço de alto carbono", 24.96, 2, 4);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Aditivos retardadores de pega", 56.39, 2, 3);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Brita nº 1", 39.96, 3, 2);
INSERT INTO tb_produto (nome_produto, preco, qtd, fk_id) VALUES ("Tijolo Ecológico", 26.64, 4, 5);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome_produto LIKE "C%";

SELECT nome_produto AS PRODUTO, nome_categoria AS CATEGORIA, preco AS 'PREÇO', qtd AS QUANTIDADE
FROM tb_produto AS p
INNER JOIN tb_categoria AS c ON p.fk_id = c.id_categoria;

SELECT nome_produto AS PRODUTO, nome_categoria AS CATEGORIA, preco AS 'PREÇO', qtd AS QUANTIDADE
FROM tb_produto AS p
INNER JOIN tb_categoria AS c ON p.fk_id = 3 = c.id_categoria;