
import User.UserData.UserType;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Users;
import services.UserServiceImpl;


@ManagedBean
@ViewScoped
public class Registration {
    String login;
    String pass;
    String fio;
    String otdel;
    String dolszhnost;
    String userType = UserType.REGISTRED.toString();

    public void doReg(){
        if(login!=null && pass!=null)
        {
            Users user = new Users();
            user.setLogin(login);
            user.setPass(pass);
            user.setUserType(userType);
            user.setFio(fio);
            user.setOtdel(otdel);
            user.setDolzhnost(dolszhnost);
            UserServiceImpl userService = new UserServiceImpl();
            if(userService.addUser(user)){
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Успех", "авторизируйтесь через главную страницу");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
            else{
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ошибка", "регестрация не выполнена");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        }
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getOtdel() {
        return otdel;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }

    public String getDolszhnost() {
        return dolszhnost;
    }

    public void setDolszhnost(String dolszhnost) {
        this.dolszhnost = dolszhnost;
    }
    
    
}
