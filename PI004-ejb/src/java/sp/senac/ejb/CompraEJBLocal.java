/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.util.List;
import java.util.Set;
import javax.ejb.Local;
import sp.senac.entidades.Compra;
import sp.senac.entidades.ProdutoQuantidade;

/**
 *
 * @author temp.cas
 */
@Local
public interface CompraEJBLocal {

    public void registrarCompra(Compra compra);

    public void registrarItens(Set<ProdutoQuantidade> compra);
    
    public Compra buscarUltimaCompra();
        
    
}
