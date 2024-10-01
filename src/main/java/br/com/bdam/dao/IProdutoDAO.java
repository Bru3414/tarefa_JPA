package br.com.bdam.dao;

import br.com.bdam.domain.Produto;

public interface IProdutoDAO {
	
	public Produto cadastrar(Produto produto);
	
	public Produto buscarProId(Long id);
	
	public void excluir(Produto produto);
}
