
package services;

import java.util.List;
import model.App5;

public interface App5Service {
    public boolean addApp5(App5 app);
    public List<App5> getallApps();
    public List<App5> getallAppsByOwner(int ownerId);
    public boolean saveAll(List<App5> apps);
}
