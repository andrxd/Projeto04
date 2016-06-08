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
package sp.senac.entidades;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Transient;
import sp.senac.entidades.Produto;
/**
 *
 * @author fernando.tsuda
 */
public class ProdutoQuantidade implements Serializable {

  private Produto produto;
  private int quantidade;
  private Date dtInclusao;
  private  BigDecimal result;
  //nao vai persist
  @Transient
  private BigDecimal subtotal;

  public ProdutoQuantidade(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
    this.dtInclusao = new Date();
  }
  
  public void calcular(){
      result = getProduto().getValorProduto().multiply(new BigDecimal(quantidade));
  } 
  
  
  public BigDecimal getPreco() {
    // Preco * quantidade
    return getProduto().getValorProduto().multiply(new BigDecimal(quantidade));
  }

  public Produto getProduto() {
    return produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public Date getDtInclusao() {
    return dtInclusao;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + Objects.hashCode(this.getProduto());
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final ProdutoQuantidade other = (ProdutoQuantidade) obj;
    if (!Objects.equals(this.produto, other.produto)) {
      return false;
    }
    return true;
  }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getSubtotal() {
        return getProduto().getValorProduto().multiply(new BigDecimal(quantidade));
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
  
  

}
