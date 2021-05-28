package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.model.postagem;
import java.util.List;
import org.generation.blogPessoal.reposiroy.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class postagemController {
	
	@Autowired
	private PostagemRepository repo;
	
	@GetMapping
	public ResponseEntity<List<postagem>> GetAll(){
		
		return	ResponseEntity.ok(repo.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<postagem> GetById(@PathVariable long id)
	{
		return repo.findById(id).map((resp -> ResponseEntity.ok(resp))).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<postagem>> GetByTitulo(@PathVariable String titulo)
	{
		return ResponseEntity.ok(repo.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<postagem> post (@RequestBody postagem novoPost)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(novoPost));
	}
	
	@PutMapping
	public ResponseEntity<postagem> put (@RequestBody postagem novoPost)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repo.save(novoPost));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repo.deleteById(id);
	}
	
	
}
