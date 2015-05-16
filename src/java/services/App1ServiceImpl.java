
package services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.App1;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import util.HibernateUtil;

public class App1ServiceImpl implements App1Service{

    @Override
    public boolean addApp1(App1 app) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(app);
                session.getTransaction().commit();
               
            } catch (Exception e) {
                return false;
            }
             return true;
    }

    @Override
    public List<App1> getallApps() {
        Session session = null;
            List<App1> apps  = new ArrayList<App1>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App1.class).list() ;
               
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
    public List<App1> getallAppsByOwner(int ownerId) {
        Session session = null;
            List<App1> apps  = new ArrayList<App1>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App1.class).add( Expression.eq("ownerid", ownerId) ).list() ;
               
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
    public boolean saveAll(List<App1> apps) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                for (App1 app : apps) {
                session.update(app);
                }
                session.getTransaction().commit();
               
            } catch (Exception e) {
                return false;
            }
             return true;
    }
    
}
