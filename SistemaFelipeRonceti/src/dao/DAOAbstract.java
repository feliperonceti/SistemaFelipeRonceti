/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Felipe Ronceti
 */
public abstract class DAOAbstract {
   
    Session session;
    public DAOAbstract(){
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    session = sessionFactory.openSession();
    }
   
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int id);
    public abstract List listAll();
  
}
