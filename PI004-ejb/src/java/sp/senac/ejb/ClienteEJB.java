/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sp.senac.entidades.Cliente;

/**
 *
 * @author tiago.bscarton
 */
@Stateless
public class ClienteEJB implements ClienteEJBLocal {

    @PersistenceContext 
    private EntityManager em;
    
    @Override
    public void cadastrar(Cliente cliente) {
        em.persist(cliente);
    }

    
}
