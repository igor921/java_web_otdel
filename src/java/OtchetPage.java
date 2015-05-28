
import ForReport.Table1;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.App2;
import model.App3;
import services.App2Service;
import services.App2ServiceImpl;
import services.App3Service;
import services.App3ServiceImpl;

@ManagedBean
@ViewScoped
public class OtchetPage {
    private List<App3> app3List;
    private List<App2> app2List;
    private App3Service app3Service;
    private App2Service app2Service;
    private List<Table1> table1;
    private int table1allCount;
    
    @PostConstruct
    public void init(){
        app2List = new ArrayList<>();
        app3List = new ArrayList<>();
        table1 = new ArrayList<>();
        app2Service = new App2ServiceImpl();
        app3Service = new App3ServiceImpl();
    }
    
    public void buildReport(){
        app2List = app2Service.getallApps();
        app3List = app3Service.getallApps();
        table1 = new ArrayList<>();
        table1allCount=0;
        for (int i=0; i<app3List.size(); i++) {
            Table1 tbl1 = new Table1(i,app3List.get(i).getDolzhnost(),Integer.parseInt(app3List.get(i).getAlls()),"",app3List.get(i).getPovishenieRazryadov().split("/")[1],"");
            table1allCount+=tbl1.getCount();
            table1.add(tbl1);
        }
    }

    public List<Table1> getTable1() {
        return table1;
    }

    public void setTable1(List<Table1> table1) {
        this.table1 = table1;
    }

    public int getTable1allCount() {
        return table1allCount;
    }
    
    
    
}
