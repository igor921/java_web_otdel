
import User.UserData;
import User.UsersData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import model.Person;
import model.Users;
import org.primefaces.event.CellEditEvent;
import services.App1ServiceImpl;
import services.App2ServiceImpl;
import services.App3ServiceImpl;
import services.App4ServiceImpl;
import services.App5ServiceImpl;
import services.App6ServiceImpl;
import services.PersonServiceImpl;
import services.UserServiceImpl;
import services.UserSevice;

@ManagedBean
@ViewScoped
public class AdminPage implements Serializable{
    
    @ManagedProperty("#{userData}")
    UserData userData;
    App1ServiceImpl app1service;
    App2ServiceImpl app2service;
    App3ServiceImpl app3service;
    App4ServiceImpl app4service;
    App5ServiceImpl app5service;
    App6ServiceImpl app6service;
    PersonServiceImpl personService = new PersonServiceImpl();
    List<Person> persons = new ArrayList<>();
    Map<String,String> personTypes = new HashMap<>();
    Person person;
    Person selectesPerson;
    UserSevice userService = new UserServiceImpl();
    List<UsersData> usersDataList;
    

    @PostConstruct
    public void init(){
        person = new Person();
        person.setOwnerid(userData.getId());
        persons = personService.getallAppsByOwner(userData.getId());
        personTypes.put("сотрудник", "сотрудник");
        personTypes.put("учащийся", "учащийся");
        this.usersDataList = new ArrayList<>();
        this.app1service = new App1ServiceImpl();
        this.app2service = new App2ServiceImpl();
        this.app3service = new App3ServiceImpl();
        this.app4service = new App4ServiceImpl();
        this.app5service = new App5ServiceImpl();
        this.app6service = new App6ServiceImpl();
        List<Users> users = userService.getAllRegistredUsers();
        for (Users user : users) {
            usersDataList.add(new UsersData(user, app1service.getallAppsByOwner(user.getId()), app2service.getallAppsByOwner(user.getId()), app3service.getallAppsByOwner(user.getId()),
                    app4service.getallAppsByOwner(user.getId()), app5service.getallAppsByOwner(user.getId()), app6service.getallAppsByOwner(user.getId())));
        }
    }
    
    public void changeDataInTable(CellEditEvent event) {
        personService.saveAll(persons);
    }
    
    public void add(){
        personService.addPerson(person);
        persons.add(person);
        person = new Person();
        person.setOwnerid(userData.getId());
    }

    public Map<String, String> getPersonTypes() {
        return personTypes;
    }

    public void setPersonTypes(Map<String, String> personTypes) {
        this.personTypes = personTypes;
    }
    
    
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getSelectesPerson() {
        return selectesPerson;
    }

    public void setSelectesPerson(Person selectesPerson) {
        this.selectesPerson = selectesPerson;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public List<UsersData> getUsersDataList() {
        return usersDataList;
    }

    public void setUsersDataList(List<UsersData> usersDataList) {
        this.usersDataList = usersDataList;
    }
    
    
}
