/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.util.List;
import javax.ejb.Local;
import sp.senac.entidades.Usuario;

/**
 *
 * @author andre.rpinto
 */
@Local
public interface UsuarioEJBLocal {
    
    public void cadastrar(Usuario usuario);
    
    public void alterar(Usuario usuario);
    
    public List<Usuario> buscarUsuarios();
    
    public Usuario autenticarUsuario(String login, String senha);
}
