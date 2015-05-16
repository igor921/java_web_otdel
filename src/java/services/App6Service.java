
package services;

import java.util.List;
import model.App6;

public interface App6Service {
    public boolean addApp6(App6 app);
    public List<App6> getallApps();
    public List<App6> getallAppsByOwner(int ownerId);
    public boolean saveAll(List<App6> apps);
}
