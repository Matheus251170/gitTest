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

import com.minhaLojaDeGames.Marvelous.Model.Produtos;
import com.minhaLojaDeGames.Marvelous.Repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	private @Autowired ProdutoRepository repository;
	
	
	/**
	 * Método que busca por todos os produtos existentes no banco.
	 * @return Retorna todos os produtos cadastrados.
	 * @author Matheus
	 */
	
	@GetMapping("/todos")
	public ResponseEntity<List<Produtos>> getAll()
	{
		return	ResponseEntity.ok(repository.findAll());
	}
	
	
	/**
	 * Método que busca o produto pelo ID.
	 * @param id
	 * @return Retorna o produto referente ao ID inserido. 
	 * @author Matheus
	 */
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Produtos> getById(@PathVariable long id)
	{
		return repository.findById(id).map((resp -> ResponseEntity.ok(resp))).orElse(ResponseEntity.notFound().build());
	}
	
	
	/**
	 * Método que faz busca pelo titulo do produto, buscando palavras em comum. CamelCase é ignorado.
	 * @param titulo
	 * @return Retorna todos os produtos que possuem resultado em comum ao parâmetro inserido.
	 * @author Matheus
	 */
	
	@GetMapping("titulo/{titulo}")
	public ResponseEntity<List<Produtos>> getByDescricao(@PathVariable String titulo)
	{
		return ResponseEntity.status(202).body(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	
	/**
	 * Método que adiciona um novo produto ao banco.
	 * @param novoProduto
	 * @return Adiciona um novo produto ao banco e retorna status CREATED(201).
	 * @author Matheus
	 */
	
	@PostMapping ("/novoProduto")
	public ResponseEntity<Produtos> post(@RequestBody Produtos novoProduto)
	{
		return ResponseEntity.status(201).body(repository.save(novoProduto));
	}
	
	
	/**
	 * Método responsavel por atualizar os dados de um produto já existente no banco de dados.
	 * @param novoProduto
	 * @return Atualiza os dados de um produto especifico e retorna o status OK(200).
	 * @author Matheus
	 */
	
	@PutMapping("/atualizar")
	public ResponseEntity<Produtos> put(@RequestBody Produtos novoProduto)
	{
		return ResponseEntity.status(200).body(repository.save(novoProduto));
	}
	
	
	/**
	 * Método responsável por deletar dados do banco.
	 * @param id
	 * @author Matheus
	 */
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduto(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
