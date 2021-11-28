/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.control;

import br.com.salao.model.Funcionarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author dragon ball gt
 */
public class Funcionarios_Controller {
    SessionFactory  sessionFactrory;
    Session session;
    
    public Funcionarios_Controller(){
        sessionFactrory = HibernateUtil.getSessionFactory();
        session = sessionFactrory.openSession();
    }
    
    public void gravar(Funcionarios func){
        Transaction tx = session.beginTransaction();
        session.save(func);
        tx.commit();
        session.close();
    }
    
}
