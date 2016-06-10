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
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

import sp.senac.ejb.ProdutoEJBLocal;
import sp.senac.entidades.Produto;

/**
 *
 * @author Andre
 */
@ManagedBean
@RequestScoped 
public class NovoProdutoBean {

    private Produto produto;

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
    @EJB
    private ProdutoEJBLocal produtoEJB;
  
    

   
  

  
    public String cadastrar() {

        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        
        if(!produto.getNomeProduto().equals("")){
        produtoEJB.cadastrar(produto);
        flash.put("msg", "Produto Cadastrado com Sucesso");
        flash.put("tipo","sucesso");
        produto = null;
        
        
        }else{
            
        flash.put("msg", "Erro na Validação dos campos");
        flash.put("tipo","erro");     
        
    }
        return "index.xhtml";
    
    }
    
}

