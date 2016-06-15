/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import java.util.List;
import javax.ejb.Local;
import sp.senac.entidades.Produto;
import sp.senac.entidades.Relatorio;

/**
 *
 * @author Andre
 */
@Local
public interface ProdutoEJBLocal {

    public void cadastrar(Produto produto);

    public List<Produto> buscarPorNomeProduto(String nome);

    public List<Produto> buscarProdutos(String nome, String plataformaProduto, String categoriaProduto);

    public List<Produto> buscarTodosProdutos();

      public List<Produto> buscarTodosProdutosADM();
      
    public Produto obterProduto(long id);

    public List<Relatorio> relatorioVendas();

    public void alterar(Produto produto);

}
