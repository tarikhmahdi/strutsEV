/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Nazrul
 */
public class UserDao {
    Session session = HibernateUtil.getSessionFactory().openSession();
    public boolean find(String name, String password) {
        
        //session.beginTransaction();
        String sql = " from User u where u.name=:name and u.pass=:pass";
        Query query = session.createQuery(sql);
        query.setParameter("name", name);
        query.setParameter("pass", password);
        List<User> list = query.list();
        if (list.size() > 0) {
            session.close();
            return true; 
        }
        session.close();
        return false;
    }
    public boolean add(User u){
         try{
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
        return true;
         }catch(Exception e){
            e.printStackTrace();
            return false;
        }
         
    }
}
