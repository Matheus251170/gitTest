/*

Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos alunos deste registro dessa escola. 

Crie uma tabela alunos/a/e e utilizando a habilidade de abstração e determine 5 atributos relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;

Faça um select que retorne o/as alunos/a/e com a nota maior do que 7.

Faça um select que retorne o/as alunos/a/e com a nota menor do que 7.

Ao término atualize um dado desta tabela através de uma query de atualização.

Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos alunos deste registro dessa escola. 

Crie uma tabela alunos/a/e e utilizando a habilidade de abstração e determine 5 atributos relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;

Faça um select que retorne o/as alunos/a/e com a nota maior do que 7.

Faça um select que retorne o/as alunos/a/e com a nota menor do que 7.

Ao término atualize um dado desta tabela através de uma query de atualização.

*/

CREATE DATABASE bd_escola; -- criando database
USE bd_escola; -- usando database


-- criando tabela
CREATE TABLE tb_alunes(

	cod INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(250),
    turma CHAR,
    materia VARCHAR(250),
    notas DECIMAL(10, 2)
);

-- inserindo dados

INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Matheus", "A", "Programação Java", 10);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Kaio", "A", "Desenvolvimento Web", 8.6);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Cleber", "D", "Banco de Dados", 5.8);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Marcela", "E", "Mobile", 6.7);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Rebeca", "C", "Programação C#", 7.5);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Marcela", "C", "Programação C#", 9.8);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Kátia", "D", "Mobile", 10);
INSERT INTO tb_alunes (nome, turma, materia, notas) VALUES ("Yuri", "E", "Banco de Dados", 8.3);



SELECT * FROM tb_alunes WHERE notas > 7; -- mostrando notas maiores que sete
SELECT * FROM tb_alunes WHERE notas < 7; -- mostrando notas menores que sete

-- atualizando dados

UPDATE tb_alunes
SET notas = 6.6
WHERE cod = 6;

-- exibindo os dados da tabela
SELECT * FROM tb_alunes;