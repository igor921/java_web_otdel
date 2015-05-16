
package services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.App4;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import util.HibernateUtil;

public class App4ServiceImpl implements App4Service{

    @Override
    public boolean addApp4(App4 app) {
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
public boolean Clear(List<App4> apps) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            for (App4 app : apps) {
                session.delete(app);
            }
            session.getTransaction().commit();

        } catch (Exception e) {
            return false;
        }
        return true;
    }
    @Override
    public List<App4> getallApps() {
        Session session = null;
            List<App4> apps  = new ArrayList<App4>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App4.class).list() ;
               
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
    public List<App4> getallAppsByOwner(int ownerId) {
        Session session = null;
            List<App4> apps  = new ArrayList<App4>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App4.class).add( Expression.eq("ownerid", ownerId) ).list() ;
               
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
    public boolean saveAll(List<App4> apps) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                for (App4 app : apps) {
                session.update(app);
                }
                session.getTransaction().commit();
               
            } catch (Exception e) {
                return false;
            }
             return true;
    }
    
}
