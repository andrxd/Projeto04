package sp.senac.entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author andre.rpinto
 */
@Entity // INFORMA QUE É UMA ENTIDADE 
@Table(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    private int id;
    
    @Column(name = "nomeUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String nome;

    @Column(name = "loginUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String login;

    @Column(name = "senhaUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String senha;

    @Column(name = "emailUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String email;

    @Column(name = "telefoneUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String telefone;

    @Column(name = "celularUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String celular;

    @Column(name = "dtCadastroUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;

    @Column(name = "cargoUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String cargo;

    @Column(name = "rgUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String rg;

    @Column(name = "cpfUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String cpf;

    @Column(name = "sexoUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private String sexo;
    
    @Column(name = "dtNascimentoUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Column(name = "tipoUsuario") //DEFINE QUE A VARIAVEL VAI BUSCAR O NOME DA COLUNA NO BANCO
    private char tipoUsuario;
    
    @OneToMany(mappedBy = "usuario")
    private List<Object> endereco;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Object> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Object> endereco) {
        this.endereco = endereco;
    }

}