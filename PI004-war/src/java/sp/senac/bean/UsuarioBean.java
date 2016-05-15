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

    public void listarTodosUsuarios() {
        usuarioEJB.buscarUsuarios();
    }

    private String login;
    private String senha;

    public String logout() {
        this.usuario = null;
        // Se der erro
        FacesMessage msg = new FacesMessage("Usuário fez logout",
                "INFO MSG");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return "/login.xhtml?faces-redirect=true";
    }

    public String autenticarUsuario() {
        Usuario usuario = usuarioEJB.autenticarUsuario(login, senha);
        if (usuario != null) {
            this.usuario = usuario;
            return "index.xhtml?faces-redirect=true";
        }
        // Se der erro
        FacesMessage msg = new FacesMessage("Erro de login", "ERROR MSG");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return "login.xhtml?faces-redirect=true";       
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

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
