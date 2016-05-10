/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
        //em.persist(cliente);
    }

    
}
