/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuarioFgv;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Felipe Ronceti
 */
public class Usuario_DAO extends DAOAbstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioFgv.class);
        criteria.add(Restrictions.eq("idusuarioFgv", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioFgv.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return (ArrayList) lista;
    }

    public UsuarioFgv fazerLogin(String apelidoFgv, String senhaFgv) {
    try {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioFgv.class);
        criteria.add(Restrictions.eq("apelidoFgv", apelidoFgv));
        criteria.add(Restrictions.eq("senhaFgv", senhaFgv));

        UsuarioFgv usuarioFgv = (UsuarioFgv) criteria.uniqueResult();

        session.getTransaction().commit();

        return usuarioFgv;
    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}
    
}
