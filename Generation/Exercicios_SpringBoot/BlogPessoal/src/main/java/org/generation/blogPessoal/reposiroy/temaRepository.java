package org.generation.blogPessoal.reposiroy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.generation.blogPessoal.model.Tema;

public interface temaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
