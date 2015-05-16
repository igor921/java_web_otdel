
import User.UserData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import model.App1;
import model.App2;
import model.App3;
import model.App4;
import model.App5;
import model.App6;
import org.primefaces.event.CellEditEvent;
import services.App1ServiceImpl;
import services.App2ServiceImpl;
import services.App3ServiceImpl;
import services.App4ServiceImpl;
import services.App5ServiceImpl;
import services.App6ServiceImpl;

@ManagedBean
@ViewScoped
public class UserPage implements Serializable {

    @ManagedProperty("#{userData}")
    UserData userData;

    List<App1> app1List;
    App1 app1 = new App1();
    App1ServiceImpl app1service;

    List<App2> app2List;
    App2 app2 = new App2();
    App2ServiceImpl app2service;

    List<App3> app3List;
    App3 app3 = new App3();
    App3ServiceImpl app3service;

    List<App4> app4List;
    App4 app4 = new App4();
    App4ServiceImpl app4service;

    List<App5> app5List;
    App5 app5 = new App5();
    App5ServiceImpl app5service;

    List<App6> app6List;
    App6 app6 = new App6();
    App6ServiceImpl app6service;

    public UserPage() {
        this.app1List = new ArrayList<>();
        this.app2List = new ArrayList<>();
        this.app3List = new ArrayList<>();
        this.app4List = new ArrayList<>();
        this.app5List = new ArrayList<>();
        this.app6List = new ArrayList<>();
        this.app1service = new App1ServiceImpl();
        this.app2service = new App2ServiceImpl();
        this.app3service = new App3ServiceImpl();
        this.app4service = new App4ServiceImpl();
        this.app5service = new App5ServiceImpl();
        this.app6service = new App6ServiceImpl();
    }

    @PostConstruct
    public void init() {
        app1.setOwnerid(userData.getId());
        app2.setOwnerid(userData.getId());
        app3.setOwnerid(userData.getId());
        app4.setOwnerid(userData.getId());
        app5.setOwnerid(userData.getId());
        app6.setOwnerid(userData.getId());
        app1List = app1service.getallAppsByOwner(userData.getId());
        app2List = app2service.getallAppsByOwner(userData.getId());
        app3List = app3service.getallAppsByOwner(userData.getId());
        app4List = app4service.getallAppsByOwner(userData.getId());
        app5List = app5service.getallAppsByOwner(userData.getId());
        app6List = app6service.getallAppsByOwner(userData.getId());
    }

    public void changeDataInTable(CellEditEvent event) {
        app1service.saveAll(app1List);
    }

    public void changeDataInTable2(CellEditEvent event) {
        app2service.saveAll(app2List);
    }

    public void changeDataInTable3(CellEditEvent event) {
        app3service.saveAll(app3List);
    }

    public void changeDataInTable4(CellEditEvent event) {
        app4service.saveAll(app4List);
    }

    public void changeDataInTable5(CellEditEvent event) {
        app5service.saveAll(app5List);
    }

    public void changeDataInTable6(CellEditEvent event) {
        app6service.saveAll(app6List);
    }

    public void add(int index) {
        switch (index) {
            case 1:
                app1service.addApp1(app1);
                app1List.add(app1);
                break;

            case 2:
                app2service.addApp2(app2);
                app2List.add(app2);
                break;

            case 3:
                app3service.addApp3(app3);
                app3List.add(app3);
                break;
            case 4:
                app4service.addApp4(app4);
                app4List.add(app4);
                break;
            case 5:
                app5service.addApp5(app5);
                app5List.add(app5);
                break;
            case 6:
                app6service.addApp6(app6);
                app6List.add(app6);
                break;
        }
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public List<App1> getApp1List() {
        return app1List;
    }

    public void setApp1List(List<App1> app1List) {
        this.app1List = app1List;
    }

    public App1 getApp1() {
        return app1;
    }

    public void setApp1(App1 app1) {
        this.app1 = app1;
    }

    public List<App2> getApp2List() {
        return app2List;
    }

    public void setApp2List(List<App2> app2List) {
        this.app2List = app2List;
    }

    public App2 getApp2() {
        return app2;
    }

    public void setApp2(App2 app2) {
        this.app2 = app2;
    }

    public List<App3> getApp3List() {
        return app3List;
    }

    public void setApp3List(List<App3> app3List) {
        this.app3List = app3List;
    }

    public App3 getApp3() {
        return app3;
    }

    public void setApp3(App3 app3) {
        this.app3 = app3;
    }

    public List<App4> getApp4List() {
        return app4List;
    }

    public void setApp4List(List<App4> app4List) {
        this.app4List = app4List;
    }

    public App4 getApp4() {
        return app4;
    }

    public void setApp4(App4 app4) {
        this.app4 = app4;
    }

    public List<App5> getApp5List() {
        return app5List;
    }

    public void setApp5List(List<App5> app5List) {
        this.app5List = app5List;
    }

    public App5 getApp5() {
        return app5;
    }

    public void setApp5(App5 app5) {
        this.app5 = app5;
    }

    public List<App6> getApp6List() {
        return app6List;
    }

    public void setApp6List(List<App6> app6List) {
        this.app6List = app6List;
    }

    public App6 getApp6() {
        return app6;
    }

    public void setApp6(App6 app6) {
        this.app6 = app6;
    }

    
    
}
