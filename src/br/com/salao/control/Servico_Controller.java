/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.control;

import br.com.salao.model.Servico;
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
public class Servico_Controller {
    SessionFactory sessionFactory;
    Session session;
    
    public Servico_Controller(){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }
    
    public void gravar(Servico servico){
        Transaction tx = session.beginTransaction();
        session.save(servico);
        tx.commit();
        session.close();
    }
    
    public void editar(Servico sr){
        Transaction tx = session.beginTransaction();
        session.update(sr);
        tx.commit();
        session.close();
    }
    
    public void excluir(Servico id){
        Transaction tx = session.beginTransaction();
        session.delete(id);
        tx.commit();
        session.close();
    }
    
    //Lista de Todos os Serviços
    public List<Servico> lista_Servico(){
        Transaction tx = session.beginTransaction();
        SQLQuery query = session.createSQLQuery("Select * from servico")
                .addScalar("id",Hibernate.LONG)
                .addScalar("nome", Hibernate.STRING)
                .addScalar("obs", Hibernate.STRING)
                .addScalar("preco", Hibernate.STRING);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        
        tx.commit();
        session.close();
        return data;
    }
    
    //Buscar por nomes 
    public List<Servico> buscarPor_Nome(String nome){
        Transaction tx = session.beginTransaction();
        SQLQuery query = (SQLQuery) session.createSQLQuery("Select * from servico where nome like :key")
                .addScalar("id",Hibernate.LONG)
                .addScalar("nome",Hibernate.STRING)
                .addScalar("obs",Hibernate.STRING)
                .addScalar("preco",Hibernate.STRING)
                .setParameter("key", "%"+nome+"%");
                
        
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();
        
        tx.commit();
        session.close();
        return data;
    }
}
















