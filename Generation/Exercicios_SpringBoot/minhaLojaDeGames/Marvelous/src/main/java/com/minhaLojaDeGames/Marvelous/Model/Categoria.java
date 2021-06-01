package com.minhaLojaDeGames.Marvelous.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3, max = 20)
	private String categoria;
	
	@OneToMany(mappedBy = "produtoCategoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"categoriaProduto", "descricao", "categoria"})
	private List<Produtos> categoriaProduto;


	@NotNull
	@Size(min = 5, max = 100)
	private String descricao;


	
	
	//getters and setters
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public List<Produtos> getCategoriaProduto() {
		return categoriaProduto;
	}


	public void setCategoriaProduto(List<Produtos> categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
