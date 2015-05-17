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
import model.Person;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import util.HibernateUtil;

/**
 *
 * @author Admin
 */
public class PersonServiceImpl {


    public boolean addPerson(Person user) {
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

    public List<Person> getAllPersons() {
        Session session = null;
            List<Person> apps  = new ArrayList<Person>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(Person.class).list() ;
               
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
            } finally {
                
                if (session != null && session.isOpen()) {
                    //session.close();
                }
            }
            
            return apps; 
    }
    
    public List<Person> getallAppsByOwner(int ownerId) {
        Session session = null;
        List<Person> apps = new ArrayList<Person>();
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            apps = session.createCriteria(Person.class).add(Expression.eq("ownerid", ownerId)).list();

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
        } finally {

            if (session != null && session.isOpen()) {
                //session.close();
            }
        }

        return apps;
    }

    public void saveAll(List<Person> apps) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                for (Person app : apps) {
                session.update(app);
                }
                session.getTransaction().commit();
               
            } catch (Exception e) {
                
            }
    }
}
