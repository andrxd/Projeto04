package sp.senac.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "ItemCompra")
public class ItemCompra implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "idCompra")
    private long idCompra;
    
    private Compra compra;

    @Column(name = "idProduto")
    private long idProduto;
    
    private Produto produto;

    @Column(name = "quantidade")
    private int quantidade = 0;

    public ItemCompra() {
    }

    public ItemCompra( Compra compra, Produto produto) {
        //this.id = id;
        this.compra = compra;
        idCompra = compra.getId();
        
        this.produto = produto;
        idProduto = produto.getId();
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

    /**
     * @return the idCOmpra
     */
    public long getIdCOmpra() {
        return idCompra;
    }

    /**
     * @return the idProduto
     */
    public long getIdProduto() {
        return idProduto;
    }

}
