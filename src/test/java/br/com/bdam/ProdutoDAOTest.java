package br.com.bdam;

import org.junit.Assert;
import org.junit.Test;

import br.com.bdam.dao.IProdutoDAO;
import br.com.bdam.dao.ProdutoDAO;
import br.com.bdam.domain.Produto;

public class ProdutoDAOTest {
	
	IProdutoDAO produtoDAO;
	
	public ProdutoDAOTest() {
		produtoDAO = new ProdutoDAO();
	}

	@Test
	public void cadastrarTest() {
		Produto prod = new Produto();
		prod.setCodigo("A1");
		prod.setNome("Produto Teste");
		produtoDAO.cadastrar(prod);
		Assert.assertNotNull(prod);
		Assert.assertNotNull(prod.getId());
		
		Produto prodBD = produtoDAO.buscarProId(prod.getId());
		Assert.assertNotNull(prodBD);
		Assert.assertNotNull(prodBD.getId());
		
		produtoDAO.excluir(prodBD);
		prodBD = produtoDAO.buscarProId(prod.getId());
		Assert.assertNull(prodBD);
	}
}
