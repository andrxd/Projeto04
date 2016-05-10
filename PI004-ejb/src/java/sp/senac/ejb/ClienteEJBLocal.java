/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Local;
import sp.senac.entidades.Cliente;

/**
 *
 * @author tiago.bscarton
 */
@Local
public interface ClienteEJBLocal {
    
    public void cadastrar(Cliente cliente);
    
}
