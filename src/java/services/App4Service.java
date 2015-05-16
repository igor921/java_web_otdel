
package services;

import java.util.List;
import model.App4;

public interface App4Service {
    public boolean addApp4(App4 app);
    public List<App4> getallApps();
    public List<App4> getallAppsByOwner(int ownerId);
    public boolean saveAll(List<App4> apps);
}
