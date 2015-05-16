
package services;

import java.util.List;
import model.App3;

public interface App3Service {
    public boolean addApp3(App3 app);
    public List<App3> getallApps();
    public List<App3> getallAppsByOwner(int ownerId);
    public boolean saveAll(List<App3> apps);
}
