
package services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.App3;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import util.HibernateUtil;

public class App3ServiceImpl implements App3Service{

    @Override
    public boolean addApp3(App3 app) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(app);
                session.getTransaction().commit();
               
            } catch (Exception e) {
                if(session!=null)
                session.close();
                return false;
            }
            if(session!=null)
                session.close();
             return true;
    }

    public boolean Clear(List<App3> apps) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            for (App3 app : apps) {
                session.delete(app);
            }
            session.getTransaction().commit();

        } catch (Exception e) {
            if(session!=null)
                session.close();
            return false;
        }
        if(session!=null)
                session.close();
        return true;
    }
    
    @Override
    public List<App3> getallApps() {
        Session session = null;
            List<App3> apps  = new ArrayList<App3>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App3.class).list() ;
               
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
            } finally {
                
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            
            return apps; 
    }

    @Override
    public List<App3> getallAppsByOwner(int ownerId) {
        Session session = null;
            List<App3> apps  = new ArrayList<App3>();
            try {
               
                session = HibernateUtil.getSessionFactory().openSession();
                apps = session.createCriteria(App3.class).add( Expression.eq("ownerid", ownerId) ).list() ;
               
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Ошибка"));
            } finally {
                
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            
            return apps;   
    }

    @Override
    public boolean saveAll(List<App3> apps) {
        Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                for (App3 app : apps) {
                session.update(app);
                }
                session.getTransaction().commit();
               
            } catch (Exception e) {
                if(session!=null)
                session.close();
                return false;
            }
            if(session!=null)
                session.close();
             return true;
    }
    
}
