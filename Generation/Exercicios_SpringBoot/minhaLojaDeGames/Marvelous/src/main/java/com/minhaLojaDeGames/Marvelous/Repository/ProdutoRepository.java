package com.minhaLojaDeGames.Marvelous.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.Marvelous.Model.Produtos;


public interface ProdutoRepository extends JpaRepository<Produtos, Long>{

	public List<Produtos> findAllByTituloContainingIgnoreCase(String titulo);
}
