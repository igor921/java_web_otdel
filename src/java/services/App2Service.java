
package services;

import java.util.List;
import model.App2;

public interface App2Service {
    public boolean addApp2(App2 app);
    public List<App2> getallApps();
    public List<App2> getallAppsByOwner(int ownerId);
    public boolean saveAll(List<App2> apps);
}
