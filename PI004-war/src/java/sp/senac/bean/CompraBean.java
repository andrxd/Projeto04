/*
 * The MIT License
 *
 * Copyright 2016 fernando.tsuda.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package sp.senac.bean;

import br.senac.tads.dsw.lojinha.common.service.ProdutoService;
import br.senac.tads.dsw.lojinha.common.service.jpaimpl.ProdutoServiceJPAImpl;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import sp.senac.ejb.CompraEJB;
import sp.senac.ejb.CompraEJBLocal;
import sp.senac.ejb.ProdutoEJBLocal;
import sp.senac.entidades.Compra;
import sp.senac.entidades.Produto;
import sp.senac.entidades.ProdutoQuantidade;

/**
 *
 * @author fernando.tsuda
 */
@ManagedBean
@SessionScoped
public class CompraBean implements Serializable {

    
    private Date data = new Date();
    
    @EJB
    private CompraEJBLocal compraEJB;
    
    private Set<ProdutoQuantidade> itens
            = new LinkedHashSet<ProdutoQuantidade>();
    
    private Compra compra = new Compra();
    
    private ProdutoQuantidade obterItem(Produto produto) {
        for (ProdutoQuantidade pq : itens) {
            if (pq.getProduto().getId()==(produto.getId())) {
                return pq;
            }
        }
        return null;
    }

    public String adicionarProduto(long idProduto, int quantidade) {
    // obter objeto produto a partir do id

        Produto prod = new Produto();
        int qtd = 1; 
        ProdutoService prodService = new ProdutoServiceJPAImpl();
        Produto p = prodService.obter(idProduto);

        ProdutoQuantidade pq = obterItem(p);
        if (pq == null) {
            // Cria um novo item para o produto e quantidade informados
            itens.add(new ProdutoQuantidade(p, quantidade));
           
        } else {
            // Altera a quantidade informada do produto
            pq.getQuantidade();
            qtd = pq.getQuantidade();
            qtd++;
            pq.setQuantidade(qtd);
        }

    // Mensagem de sucesso para usuário
        //Flash flash = FacesContext.getCurrentInstance()
        //        .getExternalContext().getFlash();
        //flash.put("mensagem", new Mensagem("Produto '" 
        //        + p.getNome() 
        //        + "' adicionado com sucesso", "success"));
        // Redireciona para tela de listagem de produtos
        return "carrinho.xhtml?faces-redirect=true";
    }

    // Converte Set em List senao nao funciona no ui:repeat
    public List<ProdutoQuantidade> getItens() {
        List<ProdutoQuantidade> lista
                = new ArrayList<ProdutoQuantidade>();
        lista.addAll(itens);
        return lista;
    }

    public BigDecimal getValorTotal() {
        BigDecimal total = new BigDecimal(0);
        for (ProdutoQuantidade pq : itens) {
            total = total.add(pq.getPreco());
        }
        return total;
    }
    
    public String registrarCompra(int idUsuario){
        Compra compra = new Compra();
        Date dt = new Date();
        compra.setIdUsuario(idUsuario);
        compra.setDataCompra(dt);
        compra.setValorTotal(getValorTotal());
        
        compraEJB.registrarCompra(compra);
        return "finalizarCompra.xhtml?faces-redirect=true";
    }

    /**
     * @return the compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
}
