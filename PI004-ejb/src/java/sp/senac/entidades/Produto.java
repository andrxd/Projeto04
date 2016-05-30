package sp.senac.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DANIEL
 */
@Entity // INFORMA QUE É UMA ENTIDADE 
@Table(name = "Produto")
@NamedQueries({
    @NamedQuery(name = "produto.buscarPorNomeProduto",//NOME DA QUERY
            query = "select p from Produto p where UPPER(p.nomeProduto) LIKE UPPER(:nomeProduto)"),
    @NamedQuery(name = "produto.obterProduto",//NOME DA QUERY
            query = "select p from Produto p where p.id = :idProduto")})
public class Produto implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "codProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private int codProduto;

    @Column(name = "nomeProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private String nomeProduto;

    @Column(name = "descricaoProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private String descricaoProduto;

    @Column(name = "valorProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private BigDecimal valorProduto;

    @Column(name = "fabricanteProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private String fabricanteProduto;

    @Column(name = "plataformaProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private String plataformaProduto;

    @Column(name = "qtdProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private int qtdProduto;

    @Column(name = "fxEtariaProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private int fxEtariaProduto;

    @Column(name = "categoriaProduto") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO 
    private String categoriaProduto;

    @Column(name = "imgCaminho")
    private String imgCaminho;

    @Temporal(TemporalType.DATE)
    private Date dtCadastroProduto;

    @Column(name = "linkVideo")
    private String linkVideo;

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    //private List<ImagemProduto> img;
    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }

    public String getPlataformaProduto() {
        return plataformaProduto;
    }

    public void setPlataformaProduto(String plataformaProduto) {
        this.plataformaProduto = plataformaProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public int getFxEtariaProduto() {
        return fxEtariaProduto;
    }

    public void setFxEtariaProduto(int fxEtariaProduto) {
        this.fxEtariaProduto = fxEtariaProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Date getDtCadastroProduto() {
        return dtCadastroProduto;
    }

    public void setDtCadastroProduto(Date dtCadastroProduto) {
        this.dtCadastroProduto = dtCadastroProduto;
    }

    public String getImgCaminho() {
        return imgCaminho;
    }

    public void setImgCaminho(String imgCaminho) {
        this.imgCaminho = imgCaminho;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", descricaoProduto=" + descricaoProduto + ", valorProduto=" + valorProduto + ", fabricanteProduto=" + fabricanteProduto + ", plataformaProduto=" + plataformaProduto + ", qtdProduto=" + qtdProduto + ", fxEtariaProduto=" + fxEtariaProduto + ", categoriaProduto=" + categoriaProduto + ", imgCaminho=" + imgCaminho + ", dtCadastroProduto=" + dtCadastroProduto + '}';
    }

    @ManyToMany
    @JoinTable(name = "ITEMCOMPRA",
            joinColumns = @JoinColumn(name = "PRODUTO_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPRA_ID"))
    private List<Compra> compras;

}
