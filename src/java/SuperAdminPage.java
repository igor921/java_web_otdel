
import User.UsersData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Users;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;
import services.App1ServiceImpl;
import services.App2ServiceImpl;
import services.App3ServiceImpl;
import services.App4ServiceImpl;
import services.App5ServiceImpl;
import services.App6ServiceImpl;
import services.UserServiceImpl;
import services.UserSevice;

@ManagedBean
@ViewScoped
public class SuperAdminPage implements Serializable {

    UserSevice userService = new UserServiceImpl();
    App1ServiceImpl app1service;
    App2ServiceImpl app2service;
    App3ServiceImpl app3service;
    App4ServiceImpl app4service;
    App5ServiceImpl app5service;
    App6ServiceImpl app6service;
    List<UsersData> usersDataList;
    List<Users> usersPrava;
    UsersData selectedUser;
    
    String[] userTypes;
    
    @PostConstruct
    public void init() {
        this.userTypes = new String[2];
        userTypes[0] = "REGISTRED";
        userTypes[1] = "ADMIN";
        this.app1service = new App1ServiceImpl();
        this.app2service = new App2ServiceImpl();
        this.app3service = new App3ServiceImpl();
        this.app4service = new App4ServiceImpl();
        this.app5service = new App5ServiceImpl();
        this.app6service = new App6ServiceImpl();
        this.usersDataList = new ArrayList<>();
        usersPrava = userService.getAllRegistredUsers();
        for (Users item : userService.getAdmin()) {
            usersPrava.add(item);
        }
        List<Users> users = userService.getAllRegistredUsers();
        for (Users user : users) {
            usersDataList.add(new UsersData(user, app1service.getallAppsByOwner(user.getId()), app2service.getallAppsByOwner(user.getId()), app3service.getallAppsByOwner(user.getId()),
                    app4service.getallAppsByOwner(user.getId()), app5service.getallAppsByOwner(user.getId()), app6service.getallAppsByOwner(user.getId())));
        }
    }

    public void clearTable(int tableIndex) {
        switch (tableIndex) {
            case 1:
                app1service.Clear(selectedUser.getApp1List());
                selectedUser.getApp1List().clear();
                break;
            case 2:
                app2service.Clear(selectedUser.getApp2List());
                selectedUser.getApp2List().clear();
                break;
            case 3:
                app3service.Clear(selectedUser.getApp3List());
                selectedUser.getApp3List().clear();
                break;
            case 4:
                app4service.Clear(selectedUser.getApp4List());
                selectedUser.getApp4List().clear();
                break;
            case 5:
                app5service.Clear(selectedUser.getApp5List());
                selectedUser.getApp5List().clear();
                break;
            case 6:
                selectedUser.getApp6List().clear();
                app6service.Clear(selectedUser.getApp6List());
                break;
        }
    }

    public String[] getUserTypes() {
        return userTypes;
    }

    public void onCellEdit(CellEditEvent event) {
       userService.updAllUsers(usersPrava);
    }

    public List<Users> getUsersPrava() {
        return usersPrava;
    }

    public void setUsersPrava(List<Users> usersPrava) {
        this.usersPrava = usersPrava;
    }
    
    
    
    public void changeDataInTable(CellEditEvent event) {
        app1service.saveAll(selectedUser.getApp1List());
    }

    public void changeDataInTable2(CellEditEvent event) {
        app2service.saveAll(selectedUser.getApp2List());
    }

    public void changeDataInTable3(CellEditEvent event) {
        app3service.saveAll(selectedUser.getApp3List());
    }

    public void changeDataInTable4(CellEditEvent event) {
        app4service.saveAll(selectedUser.getApp4List());
    }

    public void changeDataInTable5(CellEditEvent event) {
        app5service.saveAll(selectedUser.getApp5List());
    }

    public void changeDataInTable6(CellEditEvent event) {
        app6service.saveAll(selectedUser.getApp6List());
    }

    public void delSelectedUser() {
        userService.delUser(selectedUser.getUser());
        selectedUser = null;
        init();
    }

    public List<UsersData> getUsersDataList() {
        return usersDataList;
    }

    public void setUsersDataList(List<UsersData> usersDataList) {
        this.usersDataList = usersDataList;
    }

    public UsersData getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(UsersData selectedUser) {
        this.selectedUser = selectedUser;
    }

    public void onRowSelect(SelectEvent event) {
        UsersData ud = (UsersData) event.getObject();

    }

}
