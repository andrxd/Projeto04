/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sp.senac.ejb.UsuarioEJBLocal;
import sp.senac.entidades.Usuario;

/**
 *
 * @author tiago.bscarton
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {

    private Usuario usuario;
    @EJB
    private UsuarioEJBLocal usuarioEJB;
    
    public UsuarioBean() {
        usuario = new Usuario();
    }    

    public String cadastrar() {
        
        usuarioEJB.cadastrar(usuario);
     
        
        return "index";
    }

    public void listarTodosUsuarios(){
        usuarioEJB.buscarUsuarios();
    }
    
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioEJBLocal getUsuarioEJB() {
        return usuarioEJB;
    }

    public void setUsuarioEJB(UsuarioEJBLocal usuarioEJB) {
        this.usuarioEJB = usuarioEJB;
    }
    
    
    
}
