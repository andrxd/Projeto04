/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DANIEL
 */

@Entity
@Table(name="Usuario")
@NamedQueries(
        @NamedQuery(name = "usuario.autenticar",//NOME DA QUERY
                query = "select u from Usuario u where UPPER(u.login) = UPPER(:login) and u.senha = :senha"))
public class Usuario implements Serializable{
    
    @Id 
    @GeneratedValue  
    private int id;
    
    @Column(name="Nome")
    private String nome;
    
    @Column(name="Login")
    private String login;
    
    @Column(name="Senha")
    private String senha;
    
    @Column(name="Email")
    private String email;
    
    @Column(name="RG")
    private String rg;
    
    @Column(name="dtNacimento")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    
    @Column(name="CPF")
    private String cpf;
    
    @Column(name="Sexo")
    private String sexo;
    
    @Column(name="Telefone")
    private String tel;
    
    @Column(name="Celular")
    private String cel;
    
    @Column(name="tipoUsuario")
    private String tipo;
    
    @Column(name="Cargo")
    private String cargo;
    
    @Column(name="CEP")
    private String CEP;
    
    @Column(name="RUA")
    private String rua;
    
    @Column(name="NumeroEndereco")
    private int num;
    
    @Column(name="ComplementoEndereco")
    private String complemento;
    
    @Column(name="Bairro")
    private String bairro;

    
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
            
            
    
    
    
    
    
}


