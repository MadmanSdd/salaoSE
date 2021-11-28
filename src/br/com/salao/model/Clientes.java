/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dragon ball gt
 */

@Entity
@Table(name="Clientes")
public class Clientes implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    //No-Owner da relação
    @OneToOne(mappedBy = "clientes")
    private Agendamentos Agendamentos;

    @Column
    private String nome;
    
    @Column
    private String tel;
    
    @Column
    private String cel;
    
    @Column
    private String rua;
    
    @Column
    private String numero;
    
    @Column
    private String bairro;
    
    public Clientes(){}

    public Clientes( String nome, String tel, String cel, String rua, String numero, String bairro) {
        this.nome = nome;
        this.tel = tel;
        this.cel = cel;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }
    
    public Clientes( int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public Agendamentos getAgendamentos() {
        return Agendamentos;
    }

    public void setAgendamentos(Agendamentos Agendamentos) {
        this.Agendamentos = Agendamentos;
    }
}
