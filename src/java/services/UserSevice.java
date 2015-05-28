
package services;

import java.util.List;
import model.Users;


public interface UserSevice {
    public boolean addUser(Users user);
    public boolean updUser(Users user);
    public boolean updAllUsers(List<Users> user);
    public boolean delUser(Users user);
    public List<Users> getAllUsers();
    public List<Users> getAllRegistredUsers();
    public List<Users> getAdmin();
    public Users login(String login, String password);
}
