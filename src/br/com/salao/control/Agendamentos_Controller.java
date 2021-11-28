/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.control;

import br.com.salao.model.Agendamentos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author dragon ball gt
 */
public class Agendamentos_Controller {
 
    SessionFactory conClos;
    Session session;
    
    public Agendamentos_Controller(){
        conClos = HibernateUtil.getSessionFactory();
        session = conClos.openSession();
    }
    
    public void graver(Agendamentos agendamentos){
        Transaction tx = session.beginTransaction();
        session.save(agendamentos);
        tx.commit();
        session.close();
    }
}
