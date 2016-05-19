/*
 * The MIT License
 *
 * Copyright 2016 Fernando.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.senac.tads.dsw.lojinha.common.service.jpaimpl;

import br.senac.tads.dsw.lojinha.common.service.ProdutoService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sp.senac.entidades.Produto;

/**
 *
 * @author Fernando
 */
public class ProdutoServiceJPAImpl implements ProdutoService {

    private EntityManagerFactory emFactory
            = Persistence.createEntityManagerFactory("PI004-ejbPU");

    @Override
    public Produto obter(long idProduto) {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Produto p "
                    + "WHERE p.id = :idProduto")
                    .setParameter("idProduto", idProduto);
            Produto resultado = (Produto) query.getSingleResult();
            return resultado;
        } finally {
            em.close();
        }
    }

    @Override
    public void incluir(Produto p) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();

        transacao.begin();

        em.persist(p);
        transacao.commit();

    }

    @Override
    public void alterar(Produto p) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();

        transacao.begin();

        em.merge(p);
        transacao.commit();

    }

    @Override
    public void remover(long idProduto) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            Produto p = em.find(Produto.class, idProduto);
            em.remove(p);
            transacao.commit();
        } catch (Exception e) {
            transacao.rollback();
        } finally {
            em.close();
        }
    }

}
