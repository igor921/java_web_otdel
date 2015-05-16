/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Users;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import util.HibernateUtil;

/**
 *
 * @author Admin
 */
public class UserServiceImpl implements UserSevice{

    @Override
    public boolean addUser(Users user) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(user);
                session.getTransaction().commit();
               
            } catch (Exception e) {
                return false;
            }
             return true;
    }

    @Override
    public Users login(String login, String password) {
        Session session = null;
            List<Users> userses  = new ArrayList<Users>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                userses = session.createCriteria(Users.class).add( Expression.eq("login", login) )
                        .add( Expression.eq("pass", password) ).list() ;
               
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
            } finally {
                
                if (session != null && session.isOpen()) {
                    //session.close();
                }
            }
            if(userses.size()==0)
                return null;
            return userses.get(0);   
    }

    @Override
    public List<Users> getAllUsers() {
        Session session = null;
            List<Users> apps  = new ArrayList<Users>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(Users.class).list() ;
               
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
            } finally {
                
                if (session != null && session.isOpen()) {
                    //session.close();
                }
            }
            
            return apps; 
    }

    @Override
    public List<Users> getAllRegistredUsers() {
        Session session = null;
            List<Users> userses  = new ArrayList<Users>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                userses = session.createCriteria(Users.class).add( Expression.eq("userType", "REGISTRED") ).list() ;
               
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
            } finally {
                
                if (session != null && session.isOpen()) {
                    //session.close();
                }
            }
            return userses;
    }

    @Override
    public boolean delUser(Users user) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.delete(user);
                session.getTransaction().commit();
               
            } catch (Exception e) {
                return false;
            }
             return true;
    }
    
}
