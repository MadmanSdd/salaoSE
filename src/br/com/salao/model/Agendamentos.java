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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dragon ball gt
 */

@Entity
@Table(name = "agendamentos")
public class Agendamentos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //OneToOne
    @OneToOne
    @JoinColumn(name = "clientes_id")
    private Clientes clientes;

    @Column
    private String data;
    
    @Column
    private String horario;
    
    @Column
    private Funcionarios Funcionarios;
    
    
    
    public Agendamentos(){}

    public Agendamentos(Clientes clientes, String data, String horario, Funcionarios Funcionarios) {
        this.clientes = clientes;
        this.data = data;
        this.horario = horario;
        this.Funcionarios = Funcionarios;
    }
    
    public Integer getId() {
        return id;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    
    
    
}
