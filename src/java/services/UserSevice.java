
package services;

import model.Users;


public interface UserSevice {
    public boolean addUser(Users user);
    public Users login(String login, String password);
}
