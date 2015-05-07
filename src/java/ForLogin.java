
import User.UserData;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@ViewScoped
public class ForLogin {
   
    @ManagedProperty("#{userData}")
    UserData userData;
    
    public String login(){
        if(userData.getLogin().equals("user") && userData.getPass().equals("user")){
            userData.setUserType(UserData.UserType.REGISTRED);
            return "user";
        }
        if(userData.getLogin().equals("admin") && userData.getPass().equals("admin")){
            userData.setUserType(UserData.UserType.ADMIN);
            return "admin";
        }
        if(userData.getLogin().equals("superadmin") && userData.getPass().equals("superadmin")){
            userData.setUserType(UserData.UserType.MAIN_ADMIN);
            return "superadmin";
        }
         FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ошибка", "Не распознана комбинация логина и пароля");
         FacesContext.getCurrentInstance().addMessage(null, message);
        return "";
    }
    
    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
    
    
}
