package br.com.messiasbittencourt.restpostgre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.messiasbittencourt.restpostgre.dao.ProdutoDAO;
import br.com.messiasbittencourt.restpostgre.model.Produto;

@RestController
public class ProdutoController {

	@Autowired
	ProdutoDAO produtoDAO;
	
	@PostMapping("recuperaProdutoFiltro")
	public List<Produto> recuperaProdutoFiltro(@RequestBody Produto produto){
		return produtoDAO.recuperaProdutoFiltro(produto);
	}
	
	@GetMapping("recuperaProduto")
	public List<Produto> recuperaProduto(){
		return produtoDAO.recuperaProduto();
	}
	
	@PostMapping("gravaProduto")
	public void gravaProduto(@RequestBody Produto produto){
		produtoDAO.gravaProduto(produto);
	}
	
}
