
package sp.senac.entidades;

import java.io.Serializable;

/**
 *
 * @author Fernando
 */
public class ItemCompra implements Serializable {

  private Long id;

  private Compra compra;

  private Produto produto;

  private int quantidade = 0;

  public ItemCompra() {
  }

  public ItemCompra(Long id, Compra compra, Produto produto) {
    this.id = id;
    this.compra = compra;
    this.produto = produto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Compra getCompra() {
    return compra;
  }

  public void setCompra(Compra compra) {
    this.compra = compra;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "ItemCompra{" + "id=" + id + ", compra=" + compra + ", produto=" + produto + ", quantidade=" + quantidade + '}';
  }

}
