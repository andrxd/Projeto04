/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.util.List;
import javax.ejb.Local;
import sp.senac.entidades.Produto;

/**
 *
 * @author Andre
 */
@Local
public interface ProdutoEJBLocal {
    public void cadastrar(Produto produto);
    
    public List<Produto> buscarPorNomeProduto(String nome);
    
    public List<Produto> buscarTodosProdutos();
    
    public Produto obterProduto(int id);
    
}
