package sp.senac.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "Compra")

public class Compra implements Serializable {

    @Id
    @GeneratedValue    
    private Long id;

    @Column(name = "dataCriacao")
    @Temporal(TemporalType.DATE)
    private Date dtCriacao;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dataCompra")
    private Date dtCompra;
    
    private Usuario usuario;

    @Column(name = "idUsuario")
    private int idUsuario;
    
    @Column(name = "valorTotal")
    private BigDecimal valorTotal;
    
    private List<ItemCompra> itensCompra;

    public Compra() {

    }

    public Compra(Long id, Date dtCompra, Usuario usuario) {       
        
        this.id = id;        
        this.dtCriacao = new Date();
        this.dtCompra = dtCompra;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dtCompra = dataCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dtCompra=" + dtCompra + ", usuario=" + usuario + ", itensCompra=" + itensCompra + '}';
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the valorTotal
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
        
    @ManyToMany(mappedBy = "compras")
    private List<Produto> produtos;
    
    

}
