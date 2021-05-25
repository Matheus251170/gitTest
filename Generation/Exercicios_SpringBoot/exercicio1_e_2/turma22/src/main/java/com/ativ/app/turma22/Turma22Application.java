package com.ativ.app.turma22;
/*
 * Atividade 1 Spring-boot (minha primeira aplicação):
Crie uma aplicação spring de hello world.

A aplicação deverá conter um end-point que retorna
uma string com as habilidades e mentalidades que você
utilizou para realizar essa atividade.

Atividade 2 Spring-boot (minha segunda aplicação):
Crie uma aplicação spring de hello world.

A aplicação deverá conter um end-point que retorna
uma string com os seus objetivos de aprendizagem para
essa semana.
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Turma22Application {
	
	@GetMapping
	public String bsm()
	{
		return "BSMs: Persistência, Responsabilidade pessoal, Mentalidade de crescimento, proatividade orientação ao futuro e atenção aos detalhes";
	}
	
	@GetMapping
	public String objetivos()
	{
		return "Compreender SpringBoot, me aperfeiçoar em BD e desenvolver minhas habilidades interpessoais.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Turma22Application.class, args);
	}

}
