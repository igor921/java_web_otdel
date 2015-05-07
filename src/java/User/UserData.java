package User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserData {

    String login;
    String pass;
    UserType userType = UserType.UNREGISTRED;
    
    public enum UserType {

        UNREGISTRED,
        REGISTRED,
        ADMIN,
        MAIN_ADMIN
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    
    
}
