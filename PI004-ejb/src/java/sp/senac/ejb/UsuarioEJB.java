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
import sp.senac.entidades.Usuario;

/**
 *
 * @author tiago.bscarton
 */
@Stateless
public class UsuarioEJB implements UsuarioEJBLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void cadastrar(Usuario usuario) {
        em.persist(usuario);
        
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        Query query = em.createQuery("select u from Usuario u");
        
        List<Usuario> teste = query.getResultList();
        
        return query.getResultList();
    }

    @Override
    public Usuario autenticarUsuario(String login, String senha) {
        Query query = em.createNamedQuery("usuario.autenticar");
        query.setParameter("login",login);
        query.setParameter("senha",senha);
        
        Usuario teste = (Usuario)query.getSingleResult();
        return (Usuario)query.getSingleResult();
    }

}
