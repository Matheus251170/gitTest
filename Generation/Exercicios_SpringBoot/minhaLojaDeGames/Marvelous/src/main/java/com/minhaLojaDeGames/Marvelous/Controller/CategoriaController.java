package com.minhaLojaDeGames.Marvelous.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojaDeGames.Marvelous.Model.Categoria;
import com.minhaLojaDeGames.Marvelous.Repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	private @Autowired CategoriaRepository repository;
	
	
	
	/**
	 * Método que busca por todas as categorias existentes no banco.
	 * @return Retorn odas as categorias cadastradas.
	 * @author Matheus
	 */
	
	@GetMapping("/todas")
	public ResponseEntity<List<Categoria>> getAll()
	{
		return	ResponseEntity.ok(repository.findAll());
	}
	
	
	
	
	/**
	 * Método que busca a categoria pelo ID.
	 * @param id
	 * @return Retorna a categoria referente ao ID inserido. 
	 * @author Matheus
	 */
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id)
	{
		return repository.findById(id).map((resp -> ResponseEntity.ok(resp))).orElse(ResponseEntity.notFound().build());
	}
	
	
	
	/**
	 * Método que faz busca pela descrição da categoria, buscando palavras em comum. CamelCase é ignorado.
	 * @param descricao
	 * @return Retorna todas as categorias que possuem resultado em comum ao parâmetro inserido.
	 * @author Matheus
	 */
	
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getByDescricao(@PathVariable String descricao)
	{
		return ResponseEntity.status(202).body(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	
	/**
	 * Método que adiciona uma nova categoria ao banco.
	 * @param novaCategoria
	 * @return Adiciona uma categoria ao banco e retorna status CREATED(201).
	 * @author Matheus
	 */
	
	@PostMapping ("/novaCategoria")
	public ResponseEntity<Categoria> post(@RequestBody Categoria novaCategoria)
	{
		return ResponseEntity.status(201).body(repository.save(novaCategoria));
	}
	
	/**
	 * Método responsavel por atualizar os dados de uma categoria já existente no banco de dados.
	 * @param novaCategoria
	 * @return Atualiza os dados de uma categoria especifica e retorna o status OK(200).
	 * @author Matheus
	 */
	
	@PutMapping("/atualizar")
	public ResponseEntity<Categoria> put(@RequestBody Categoria novaCategoria)
	{
		return ResponseEntity.status(200).body(repository.save(novaCategoria));
	}
	
	
	/**
	 * Método responsável por deletar dados do banco.
	 * @param id
	 * @author Matheus
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteCategoria(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
