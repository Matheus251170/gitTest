/*
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionaries desta empresa. 

Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.

Popule esta tabela com até 5 dados;

Faça um select que retorne os funcionaries com o salário maior do que 2000.

Faça um select que retorne os funcionaries com o salário menor do que 2000.

Ao término atualize um dado desta tabela através de uma query de atualização.

*/

CREATE DATABASE bd_empresa; -- criando database
USE bd_empresa; -- usando database


-- criando tabela de funcionaries

CREATE TABLE tb_func(

	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(250),
    salario DECIMAL(10, 2),
    funcao VARCHAR(250),
	idade INT
);

-- inserindo dados

INSERT INTO tb_func (nome, salario, funcao, idade) VALUES ("Cleber", 1500.53, "Atendimento ao CLiente", 26);
INSERT INTO tb_func (nome, salario, funcao, idade) VALUES ("Patricia", 5000, "Gerente", 30);
INSERT INTO tb_func (nome, salario, funcao, idade)VALUES ("Carla", 2833.56, "Scrum Master", 25);
INSERT INTO tb_func (nome, salario, funcao, idade) VALUES ("Marcio", 1992.81, "Programador Júnior", 23);
INSERT INTO tb_func (nome, salario, funcao, idade) VALUES ("Pablo",2756.95, "Desenvolvedor WEB", 27);


SELECT * FROM tb_func WHERE salario > 2000;
SELECT * FROM tb_func WHERE salario < 2000;

UPDATE tb_func
SET salario = 6000
WHERE id = 5;

SELECT * from tb_func;