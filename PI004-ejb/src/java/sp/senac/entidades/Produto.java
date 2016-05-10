package sp.senac.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DANIEL
 */
@Entity // INFORMA QUE É UMA ENTIDADE 
@Table(name = "Produto")
public class Produto implements Serializable {

    @Id
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

    @Temporal(TemporalType.DATE)
    private Date dtCadastroProduto;

    //private List<ImagemProduto> img;
    public Produto() {

    }

}