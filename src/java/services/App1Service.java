
package services;

import java.util.List;
import model.App1;

public interface App1Service {
    public boolean addApp1(App1 app);
    public List<App1> getallApps();
    public List<App1> getallAppsByOwner(int ownerId);
    public boolean saveAll(List<App1> apps);
}
