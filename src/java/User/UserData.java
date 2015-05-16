package User;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class UserData implements Serializable{

    String login;
    String pass;
    int id;
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

    public String myPage() {
        if (login == null) {
            return "";
        }
        switch (userType.ordinal()) {
            case 0:
               return "/pages/index.xhtml";
            case 1:
                return "/pages/user.xhtml";
            case 2:
                return "/pages/admin.xhtml";
            case 3:
                return "/pages/superadmin.xhtml";
        }
        return "/pages/index.xhtml"; 
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
