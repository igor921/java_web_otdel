
package services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.App5;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import util.HibernateUtil;

public class App5ServiceImpl implements App5Service{

    @Override
    public boolean addApp5(App5 app) {
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
    public List<App5> getallApps() {
        Session session = null;
            List<App5> apps  = new ArrayList<App5>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App5.class).list() ;
               
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
    public List<App5> getallAppsByOwner(int ownerId) {
        Session session = null;
            List<App5> apps  = new ArrayList<App5>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App5.class).add( Expression.eq("ownerid", ownerId) ).list() ;
               
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
    public boolean saveAll(List<App5> apps) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                for (App5 app : apps) {
                session.update(app);
                }
                session.getTransaction().commit();
               
            } catch (Exception e) {
                return false;
            }
             return true;
    }
    
}
