/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sp.senac.entidades.Produto;

/**
 *
 * @author andre.rpinto
 */
@Stateless
public class ProdutoEJB implements ProdutoEJBLocal {

    @PersistenceContext 
    private EntityManager em;
    
    @Override
    public void cadastrar(Produto produto) {
        em.persist(produto);
    }
    
    @Override
    public List<Produto> buscarPorNomeProduto(String nome) {
        
        Query query = em.createNamedQuery("produto.buscarPorNomeProduto");
        query.setParameter("nomeProduto","%"+nome+"%");//NOME DA COLUNA QUE QUERO TRAZER
        return query.getResultList();
        
    }

    @Override
    public List<Produto> buscarTodosProdutos() {
        Query query = em.createQuery("select p from Produto p");
        return query.getResultList();
    }

    @Override
    public Produto obterProduto(long id) {
        Query query = em.createNamedQuery("produto.obterProduto");
        query.setParameter("idProduto", id);
        return (Produto) query.getSingleResult();
    }
    

    
}
