
import User.UsersData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Users;
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
public class SuperAdminPage implements Serializable{
    UserSevice userService = new UserServiceImpl();
    App1ServiceImpl app1service;
    App2ServiceImpl app2service;
    App3ServiceImpl app3service;
    App4ServiceImpl app4service;
    App5ServiceImpl app5service;
    App6ServiceImpl app6service;
    List<UsersData> usersDataList;
    UsersData selectedUser;
    @PostConstruct
    public void init(){
        this.app1service = new App1ServiceImpl();
        this.app2service = new App2ServiceImpl();
        this.app3service = new App3ServiceImpl();
        this.app4service = new App4ServiceImpl();
        this.app5service = new App5ServiceImpl();
        this.app6service = new App6ServiceImpl();
        this.usersDataList = new ArrayList<>();
        List<Users> users = userService.getAllRegistredUsers();
        for (Users user : users) {
            usersDataList.add(new UsersData(user, app1service.getallAppsByOwner(user.getId()), app2service.getallAppsByOwner(user.getId()), app3service.getallAppsByOwner(user.getId()),
                                            app4service.getallAppsByOwner(user.getId()), app5service.getallAppsByOwner(user.getId()), app6service.getallAppsByOwner(user.getId())));
        }
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


