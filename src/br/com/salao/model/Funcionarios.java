/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dragon ball gt
 */

@Entity
@Table(name="Funcionarios")
public class Funcionarios implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
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
    
    @Column
    private char sexo;
    

    
    public Funcionarios(){}
    
    public Funcionarios(String nome, String tel, String cel, String rua, String numero,String bairro,char sexo) {
        this.nome = nome;
        this.tel = tel;
        this.cel = cel;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.sexo = sexo;
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

    
}


