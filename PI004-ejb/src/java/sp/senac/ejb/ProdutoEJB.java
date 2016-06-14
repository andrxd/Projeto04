/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sp.senac.entidades.Produto;
import sp.senac.entidades.Relatorio;

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
    public void alterar(Produto produto) {
        em.merge(produto);

        System.out.println("TESTE");
    }

    @Override
    public List<Produto> buscarPorNomeProduto(String nome) {

        Query query = em.createNamedQuery("produto.buscarPorNomeProduto");
        query.setParameter("nomeProduto", "%" + nome + "%");//NOME DA COLUNA QUE QUERO TRAZER
        return query.getResultList();

    }

    @Override
    public List<Produto> buscarProdutos(String nome, String plataformaProduto, String categoriaProduto) {

        Query query = em.createNamedQuery("produto.buscarProdutos");
        query.setParameter("nomeProduto", "%" + nome + "%");//NOME DA COLUNA QUE QUERO TRAZER
        query.setParameter("plataformaProduto", "%" + plataformaProduto + "%");//NOME DA COLUNA QUE QUERO TRAZER
        query.setParameter("categoriaProduto", "%" + categoriaProduto + "%");//NOME DA COLUNA QUE QUERO TRAZER
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

    @Override
    public List<Relatorio> relatorioVendas() {
        Query query = em.createNamedQuery("produto.relatorioVendas");
        List<Relatorio> itens = query.getResultList();
        
        return itens;
    }
}
