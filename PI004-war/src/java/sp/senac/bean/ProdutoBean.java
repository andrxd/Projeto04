/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sp.senac.ejb.ProdutoEJBLocal;
import sp.senac.entidades.Produto;

/**
 *
 * @author Andre
 */
@ManagedBean
@SessionScoped
public class ProdutoBean {

    private Produto produto;
    @EJB
    private ProdutoEJBLocal produtoEJB;
    private String nomeProduto;
    private List<Produto> listaProdutos;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ProdutoEJBLocal getProdutoEJB() {
        return produtoEJB;
    }

    public void setProdutoEJB(ProdutoEJBLocal produtoEJB) {
        this.produtoEJB = produtoEJB;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public ProdutoBean() {
        produto = new Produto();
    }
    
    public String cadastrar() {
       
        produtoEJB.cadastrar(produto);
 
        return "index";
    }
    
     public void listarTodosProdutos(){
        produtoEJB.buscarTodosProdutos();
    }
     
     public void recuperarProdutosNome() {
        listaProdutos = produtoEJB.buscarPorNomeProduto(nomeProduto);
    } 

    public List<Produto> getListaProduto() {
        return listaProdutos;
    }

    public void setListaProduto(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
     
}
