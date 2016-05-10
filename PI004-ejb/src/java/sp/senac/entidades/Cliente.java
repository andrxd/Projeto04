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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DANIEL
 */

@Entity
@Table(name="UZI_CLI")

public class Cliente implements Serializable{
    
    @Id
    private int id;
    
    @Column(name="NOME_CLI")
    private String nome;
    
    @Column(name="LOGIN_CLI")
    private String login;
    
    @Column(name="SENHA_CLI")
    private String senha;
    
    @Column(name="EMAIL_CLI")
    private String email;
    
    @Column(name="RG_CLI")
    private String rg;
    
    @Column(name="DT_NASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    
    @Column(name="CPF_CLI")
    private String cpf;
    
    @Column(name="SEXO_CLI")
    private String sexo;
    
    @Column(name="TEL_CLI")
    private String tel;
    
    @Column(name="CEL_CLI")
    private String cel;
    
    @Column(name="TIPO_USU")
    private String tipo;
    
    @Column(name="CARGO_USU")
    private String cargo;
    
    @Column(name="CEP_CLI")
    private String CEP;
    
    @Column(name="RUA_CLI")
    private String rua;
    
    @Column(name="NUM_ENDERECO_CLI")
    private int num;
    
    @Column(name="COMPL_ENDERECO_CLI")
    private String complemento;
    
    @Column(name="BAIRRO_CLI")
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


