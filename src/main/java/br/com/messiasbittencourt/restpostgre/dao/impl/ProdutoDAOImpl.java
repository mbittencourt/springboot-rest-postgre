package br.com.messiasbittencourt.restpostgre.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.messiasbittencourt.restpostgre.dao.ProdutoDAO;
import br.com.messiasbittencourt.restpostgre.model.Produto;

@Repository
public class ProdutoDAOImpl implements ProdutoDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Transactional
	public List<Produto> recuperaProduto(){
		return entityManager.createQuery("from Produto").getResultList();
	}
	
	@Transactional
	public List<Produto> recuperaProdutoFiltro(Produto produto){
		String hql = "from Produto p where p.descricao = :valorDescricao ";
		Query q = entityManager.createQuery(hql);
		q.setParameter("valorDescricao", produto.getDescricao());
		return q.getResultList();
	}
	
	@Transactional
	public void gravaProduto(Produto produto){
		entityManager.persist(produto);
	}

}
