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
@Table(name="Servico")
public class Servico implements Serializable{
    
    private static Servico servico = null;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nome;
    
    @Column
    private String obs;
    
    @Column
    private String preco;

    public Servico() {
    }
    
    public Servico(Integer id){
        this.id = id;
    }

    public Servico(String nome, String obs, String preco) {
        this.nome = nome;
        this.obs = obs;
        this.preco = preco;
    }
    
     public Servico(Integer id,String nome, String obs, String preco) {
        this.id = id;
        this.nome = nome;
        this.obs = obs;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    public static Servico setServico(Servico servico){
        Servico.servico = servico;
        return Servico.servico; 
    }
    
    public static Servico getServico(){
       return Servico.servico;
    }
    
}


