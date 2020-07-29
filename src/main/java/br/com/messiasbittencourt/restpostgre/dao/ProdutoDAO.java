package br.com.messiasbittencourt.restpostgre.dao;

import java.util.List;

import br.com.messiasbittencourt.restpostgre.model.Produto;

public interface ProdutoDAO {
	
	public List<Produto> recuperaProduto();
	
	public void gravaProduto(Produto produto);

	public List<Produto> recuperaProdutoFiltro(Produto produto);
}
