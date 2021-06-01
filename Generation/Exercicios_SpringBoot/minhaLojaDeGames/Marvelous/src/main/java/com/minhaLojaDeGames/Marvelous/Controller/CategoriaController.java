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
	
	
	@GetMapping("/todas")
	public ResponseEntity<List<Categoria>> getAll()
	{
		return	ResponseEntity.ok(repository.findAll());
	}
	
	
	
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id)
	{
		return repository.findById(id).map((resp -> ResponseEntity.ok(resp))).orElse(ResponseEntity.notFound().build());
	}
	
	
	
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getByDescricao(@PathVariable String descricao)
	{
		return ResponseEntity.status(202).body(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping ("/novaCategoria")
	public ResponseEntity<Categoria> post(@RequestBody Categoria novaCategoria)
	{
		return ResponseEntity.status(201).body(repository.save(novaCategoria));
	}
	
	
	@PutMapping("/atualizar")
	public ResponseEntity<Categoria> put(@RequestBody Categoria novaCategoria)
	{
		return ResponseEntity.status(200).body(repository.save(novaCategoria));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCategoria(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
