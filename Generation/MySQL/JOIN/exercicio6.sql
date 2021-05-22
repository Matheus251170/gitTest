/*
Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as informações dos produtos desta empresa. 

O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.

siga  exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.

Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.

Faça um select  utilizando LIKE buscando os Produtos com a letra J.

Faça um um select com Inner join entre  tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Java).

*/

CREATE DATABASE db_cursoDaMinhaVida; -- CRIANDO DATABSE
USE db_cursoDaMinhaVida; -- USANDO DATABASE

-- CRIANDO TABELAS

CREATE TABLE tb_categoria(

	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(50),
    vagas INT
);

CREATE TABLE tb_curso(
	
	id_curso INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_curso VARCHAR(50),
    turma INT,
    preco DOUBLE,
    fk_id INT,
    FOREIGN KEY (fk_id) REFERENCES tb_categoria (id_categoria)
);

-- INSERINDO DADOS NA TABELA CATEGORIA

INSERT INTO tb_categoria (nome_categoria, vagas) VALUES ("JAVA", 100);
INSERT INTO tb_categoria (nome_categoria, vagas) VALUES ("JavaScript", 60);
INSERT INTO tb_categoria (nome_categoria, vagas) VALUES ("C#", 70);
INSERT INTO tb_categoria (nome_categoria, vagas) VALUES ("React-Native", 50);
INSERT INTO tb_categoria (nome_categoria, vagas) VALUES ("LUA", 100);


-- INSERINDO DADOS NA TABELA CURSO

INSERT INTO tb_curso (nome_curso, turma, fk_id) VALUES ("Java Junior Full-Stack", 22, 1);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Desenvolvimento Web", 33, 26.99, 2);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Programação Orientada a Dados com LUA", 15, 56.79, 5);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Desenvolvimento Mobile", 18, 59.99, 4);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Criação de jogos com JS", 9, 34.99, 2);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Desenvolvimento Back-End", 7, 39.90, 3);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Desenvolvimento .NET", 7, 4.99, 3);
INSERT INTO tb_curso (nome_curso, turma, preco, fk_id) VALUES ("Aplicando API's com REACT", 20, 19.99, 4);



SELECT * FROM tb_curso WHERE preco > 50; -- SELECIONANDO CURSOS COM VALOR SUPERIOR A 50
SELECT * FROM tb_curso WHERE preco BETWEEN 3 AND 60; -- SELECIONANDO CURSOS COM VALOR ENTRE 3 E 60
SELECT * FROM tb_curso WHERE nome_curso LIKE 'J%'; -- SELECIONANDO CURSOS QUE COMEÇAM COM A LETRA J


-- SELECT NAS DUAS TABELAS USANDO INNER JOIN
SELECT nome_curso AS CURSO, nome_categoria AS LINGUAGEM, turma AS TURMA, preco AS 'PREÇO'
FROM tb_curso AS c
INNER JOIN tb_categoria AS cat ON c.fk_id = cat.id_categoria;


-- EXIBINDO CURSOS DA CATEGORIA C#
SELECT nome_curso AS CURSO, nome_categoria AS LINGUAGEM, turma AS TURMA, preco AS 'PREÇO'
FROM tb_curso AS c
INNER JOIN tb_categoria AS cat ON c.fk_id = cat.id_categoria
WHERE nome_categoria IN ('C#');