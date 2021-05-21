/*
Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as informações dos personagens desse game. 

O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.

siga  exatamente esse passo a passo:

Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos relevantes da classe para se trabalhar com o serviço desse  game Online.

Crie uma tabela tb_personagem  e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online (não esqueça de criar a foreign key de tb_classe nesta tabela).

Popule esta tabela classe com até 5 dados.

Popule esta tabela personagem com até 8 dados.

Faça um select que retorne os personagens com o poder de ataque maior do que 2000.

Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000.

Faça um select  utilizando LIKE buscando os personagens com a letra C.

Faça um um select com Inner join entre  tabela classe e personagem.

Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).


*/


CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_personagem(

	id_char INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome_char VARCHAR(100),
    nivel_char INT,
    pet VARCHAR (100),
    poder_ataque INT,
    poder_defesa INT,
    id INT NOT NULL,
    FOREIGN KEY(id) REFERENCES tb_classe (id_class)
);

CREATE TABLE tb_classe(
	
    id_class INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome_class VARCHAR(50),
    arma VARCHAR(100)
);

INSERT INTO tb_classe (nome_class, arma) VALUES ("Ladino", "Adagas");
INSERT INTO tb_classe (nome_class, arma) VALUES ("Guerreiro", "Espada de duas mãos");
INSERT INTO tb_classe (nome_class, arma) VALUES ("Mago", "Cajado");
INSERT INTO tb_classe (nome_class, arma) VALUES ("Bruxo", "Grimório");
INSERT INTO tb_classe (nome_class, arma) VALUES ("Espadachim", "Espada de uma mão");



INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Erik_Gameplays", 89,"Lobo Sombrio", 3698, 2356, 2);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Cortana", 56, "", 2985, 2546, 5);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Alighiere", 92,"Gato da montanha", 4026, 3688, 1);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("GameplayRJ", 32, "", 1222, 1066, 3);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Alice_22", 12, "", 68, 23, 1);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Cain", 35,"Coelho", 1198, 1082, 4);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Enzo", 42, "", 1552, 1026, 4);
INSERT INTO tb_personagem (nome_char, nivel_char, pet, poder_ataque, poder_defesa, id) VALUES ("Memories", 67,"Cão-Selvagem", 3259, 2456, 2);



SELECT * FROM tb_personagem WHERE poder_ataque > 2000;
SELECT * FROM tb_personagem WHERE poder_defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagem WHERE nome_char LIKE "c%";


SELECT nome_char AS Nome, nivel_char AS Nivel, nome_class AS Classe, arma AS Arma, pet AS Pet
FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.id = tb_classe.id_class;

SELECT nome_char AS NOME, nome_class AS CLASSE FROM tb_personagem
INNER JOIN  tb_classe ON tb_personagem.id = 1 = tb_classe.id_class;