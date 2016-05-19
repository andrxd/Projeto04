/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import br.senac.tads.dsw.lojinha.common.service.ProdutoService;
import br.senac.tads.dsw.lojinha.common.service.jpaimpl.ProdutoServiceJPAImpl;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import sp.senac.ejb.ProdutoEJBLocal;
import sp.senac.entidades.Produto;

/**
 *
 * @author Andre
 */
@ManagedBean
@RequestScoped
public class ProdutoBean {

    private Produto produto;
    
    private Produto prodTeste;
    @EJB
    private ProdutoEJBLocal produtoEJB;
    private String nomeProduto;
    private List<Produto> listaProdutos;

    @ManagedProperty(value = "#{param.id}")
    private Long idProduto;

    public Produto getProduto() {
        //Produto teste = obterProduto(getIdProduto());
        //prodTeste = produto;
        return obterProduto(getIdProduto());
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

    public List<Produto> listarTodosProdutos() {
        return produtoEJB.buscarTodosProdutos();
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

    /**
     * @return the idProduto
     */
    public Long getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    private Produto obterProduto(long idProduto) {
        return produtoEJB.obterProduto(idProduto);
    }

    public Produto obter(long idProduto) {
        ProdutoService service = new ProdutoServiceJPAImpl();
        return service.obter(idProduto);
    }
    
}
