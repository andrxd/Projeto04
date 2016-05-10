/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andre
 */
@Stateless
public class UsuarioEJB implements UsuarioEJBLocal {

    @PersistenceContext 
    private EntityManager em;

// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
