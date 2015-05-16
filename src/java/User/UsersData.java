
package User;

import java.util.List;
import model.App1;
import model.App2;
import model.App3;
import model.App4;
import model.App5;
import model.App6;
import model.Users;

public class UsersData{
    Users user;
    List<App1> app1List;
    List<App2> app2List;
    List<App3> app3List;
    List<App4> app4List;
    List<App5> app5List;
    List<App6> app6List;
    String color="black";
    
    public UsersData(Users user, List<App1> app1List, List<App2> app2List, List<App3> app3List, List<App4> app4List, List<App5> app5List, List<App6> app6List) {
        this.user = user;
        this.app1List = app1List;
        this.app2List = app2List;
        this.app3List = app3List;
        this.app4List = app4List;
        this.app5List = app5List;
        this.app6List = app6List;
    }

    public String getCount()
    {
        Integer countres=0;
        if(app1List!=null)
            if(app1List.size()>0)
                countres++;
        if(app2List!=null)
            if(app2List.size()>0)
                countres++;
        if(app3List!=null)
            if(app3List.size()>0)
                countres++;
        if(app4List!=null)
            if(app4List.size()>0)
                countres++;
        if(app5List!=null)
            if(app5List.size()>0)
                countres++;
        if(app6List!=null)
            if(app6List.size()>0)
                countres++;
        if(countres==6)
            color="green";
        else color = "red";
        return countres.toString();
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<App1> getApp1List() {
        return app1List;
    }

    public void setApp1List(List<App1> app1List) {
        this.app1List = app1List;
    }

    public List<App2> getApp2List() {
        return app2List;
    }

    public void setApp2List(List<App2> app2List) {
        this.app2List = app2List;
    }

    public List<App3> getApp3List() {
        return app3List;
    }

    public void setApp3List(List<App3> app3List) {
        this.app3List = app3List;
    }

    public List<App4> getApp4List() {
        return app4List;
    }

    public void setApp4List(List<App4> app4List) {
        this.app4List = app4List;
    }

    public List<App5> getApp5List() {
        return app5List;
    }

    public void setApp5List(List<App5> app5List) {
        this.app5List = app5List;
    }

    public List<App6> getApp6List() {
        return app6List;
    }

    public void setApp6List(List<App6> app6List) {
        this.app6List = app6List;
    }
    
    
}