
import User.UserData;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Users;
import services.UserServiceImpl;


@ManagedBean
@ViewScoped
public class ForLogin implements Serializable{
   
    @ManagedProperty("#{userData}")
    UserData userData;
    
    public String login(){
        UserServiceImpl service = new UserServiceImpl();
        Users user = service.login(userData.getLogin(), userData.getPass());
        if(user!=null)
        {
            switch(user.getUserType())
            {
                case "REGISTRED":
                    userData.setUserType(UserData.UserType.REGISTRED);
                    userData.setId(user.getId());
                    return "user";
                case "ADMIN":
                    userData.setUserType(UserData.UserType.ADMIN);
                    userData.setId(user.getId());
                    return "admin";
                
                case "MAIN_ADMIN":
                    userData.setUserType(UserData.UserType.MAIN_ADMIN);
                    userData.setId(user.getId());
                    return "superadmin";
            }
            
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
