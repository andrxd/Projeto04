/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sp.senac.entidades.Compra;
import sp.senac.entidades.ProdutoQuantidade;

/**
 *
 * @author temp.cas
 */
@Stateless
public class CompraEJB implements CompraEJBLocal {

    @PersistenceContext 
    private EntityManager em;
    
    @Override
    public void registrarCompra(Compra compra) {
        em.persist(compra);
    }

    @Override
    public void registrarItens(Set<ProdutoQuantidade> itens) {
         for (ProdutoQuantidade pq : itens) {
            em.persist(pq);
        }
    }
    
    

    
}
