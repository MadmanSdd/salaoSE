/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.control;

import br.com.salao.model.Clientes;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Diego Goncalves
 */
public class Clientes_Controller {
    SessionFactory conClos;
    Session con;
    
    public Clientes_Controller(){
        conClos = HibernateUtil.getSessionFactory();
        con = conClos.openSession();
    }
    
    public void gravar(Clientes client){
        Transaction tx = con.beginTransaction();
        con.save(client);
        tx.commit();
        con.close();
    }
    
    public void delete(Clientes id){
        Transaction tx = con.beginTransaction();
        con.delete(id);
        tx.commit();
        con.close();
    }
    
    public void editar(Clientes sr){
        Transaction tx = con.beginTransaction();
        con.update(sr);
        tx.commit();
        con.close();
    }
    
    public List<Clientes> lista_Clientes(){
        Transaction tx = con.beginTransaction();
        SQLQuery query = con.createSQLQuery("select * from Clientes")
                .addScalar("nome",Hibernate.STRING)
                .addScalar("tel",Hibernate.STRING)
                .addScalar("cel",Hibernate.STRING)
                .addScalar("rua",Hibernate.STRING)
                .addScalar("numero",Hibernate.STRING)
                .addScalar("bairro",Hibernate.STRING);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        
        tx.commit();
        con.close();
        return data;
    }
    
    //Buscar por nomes 
    public List<Clientes> buscarPor_Nome(String nome){
        Transaction tx = con.beginTransaction();
        SQLQuery query = (SQLQuery) con.createSQLQuery("Select * from Clientes where nome like :key")
                .addScalar("nome",Hibernate.STRING)
                .addScalar("tel",Hibernate.STRING)
                .addScalar("cel",Hibernate.STRING)
                .addScalar("rua",Hibernate.STRING)
                .addScalar("numero",Hibernate.STRING)
                .addScalar("bairro",Hibernate.STRING)
                .setParameter("key", "%"+nome+"%");
                
        
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        
        tx.commit();
        con.close();
        return data;
    }
}
