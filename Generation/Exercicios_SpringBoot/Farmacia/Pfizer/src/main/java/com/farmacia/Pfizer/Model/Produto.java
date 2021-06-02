package com.farmacia.Pfizer.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;
	
	@ManyToOne
	//@JsonIgnoreProperties("categoriaProduto")
	private Categoria produtoCategoria;


	//getters and setters
	
	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria getProdutoCategoria() {
		return produtoCategoria;
	}

	public void setProdutoCategoria(Categoria produtoCategoria) {
		this.produtoCategoria = produtoCategoria;
	}
}
