/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.entidades;

import java.math.BigDecimal;

/**
 *
 * @author andre.rpinto
 */
public class Relatorio {

    public Relatorio() {
    }

    long id;
    String nome;
    int quantidade;
    BigDecimal Valor;

    public Relatorio(long id, String nome, int quantidade, BigDecimal Valor) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.Valor = Valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return Valor;
    }

    public void setValor(BigDecimal Valor) {
        this.Valor = Valor;
    }

}
