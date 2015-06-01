
import ForReport.Table1;
import ForReport.Table5;
import java.util.ArrayList;
import java.util.HashMap;
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
    private List<Table1> table2;
    private List<Table1> table3;
    private List<Table1> table4;
    private List<Table5> table5_1;
    private List<Table5> table5_2;
    private List<Table5> table5_3;
    private List<Table5> table5_4;
    private HashMap<String, Integer> specialityCount;
    private HashMap<String, Integer> monthkvartal;
    private int table1allCount;
    private int table2allCount;
    private int table3allCount;
    private int table4allCount;
    private int table5_1allCount;
    private int table5_2allCount;
    private int table5_3allCount;
    private int table5_4allCount;

    @PostConstruct
    public void init() {
        app2List = new ArrayList<>();
        app3List = new ArrayList<>();
        table1 = new ArrayList<>();
        table2 = new ArrayList<>();
        table3 = new ArrayList<>();
        table4 = new ArrayList<>();
        table5_1 = new ArrayList<>();
        table5_2 = new ArrayList<>();
        table5_3 = new ArrayList<>();
        table5_4 = new ArrayList<>();
        app2Service = new App2ServiceImpl();
        app3Service = new App3ServiceImpl();
        monthkvartal = new HashMap<>();
        monthkvartal.put("январь", 1);
        monthkvartal.put("февраль", 1);
        monthkvartal.put("март", 1);
        monthkvartal.put("апрель", 2);
        monthkvartal.put("май", 2);
        monthkvartal.put("июнь", 2);
        monthkvartal.put("июль", 3);
        monthkvartal.put("август", 3);
        monthkvartal.put("сентябрь", 3);
        monthkvartal.put("октябрь", 4);
        monthkvartal.put("ноябрь", 4);
        monthkvartal.put("декабрь", 4);
    }

    public void buildReport() {
        app2List = app2Service.getallApps();
        app3List = app3Service.getallApps();
        table1 = new ArrayList<>();
        table2 = new ArrayList<>();
        table3 = new ArrayList<>();
        table4 = new ArrayList<>();
        table5_1 = new ArrayList<>();
        table5_2 = new ArrayList<>();
        table5_3 = new ArrayList<>();
        table5_4 = new ArrayList<>();
        specialityCount = new HashMap<String, Integer>();
        table4allCount = table3allCount = table2allCount = table1allCount = 0;
        table5_1allCount = table5_2allCount = table5_3allCount = table5_4allCount = 0;
        for (int i = 0; i < app3List.size(); i++) {
            String speciality = app3List.get(i).getDolzhnost();
            String podrazdelenie = app3List.get(i).getPodrazdelenie();
            String vtorayaSpec = app3List.get(i).getSeconddolzhost();
            String edubuild = app3List.get(i).getDrygieOrganiz();
            int count = Integer.parseInt(app3List.get(i).getAlls());
            //---------------------------------------------------------------------
            String razraydPovischSrok = app3List.get(i).getPovishenieRazryadov();
            String razryad = "", povisch = null, srok = "";
            String[] tmp = razraydPovischSrok.split("/");
            if (tmp.length == 1) {
                srok = tmp[0];
            } else if (tmp.length > 1) {
                srok = tmp[1];
                String[] tmps = tmp[0].split("-");
                razryad = tmps[0];
                if (tmps.length > 1) {
                    povisch = tmps[1];
                }
            }
            //---------------------------------------------------------------------
            if (edubuild.length() > 0) {
                Table1 tbl4 = new Table1(i, speciality, count, "", "", srok, "", podrazdelenie, "", edubuild);
                table4allCount += tbl4.getCount();
                table4.add(tbl4);
            }
            //---------------------------------------------------------------------
            if (vtorayaSpec.length() > 0) {
                Table1 tbl3 = new Table1(i, vtorayaSpec, count, "", "", srok, "", podrazdelenie, vtorayaSpec, "");
                table3allCount += tbl3.getCount();
                table3.add(tbl3);
            } else if (povisch == null) {
                Table1 tbl1 = new Table1(i, speciality, count, "", srok, "");
                table1allCount += tbl1.getCount();
                table1.add(tbl1);
            } else {
                Table1 tbl2 = new Table1(i, speciality, count, razryad, povisch, srok, "", podrazdelenie);
                table2allCount += tbl2.getCount();
                table2.add(tbl2);
            }
        }

        for (int i = 0; i < app2List.size(); i++) {
            if(!specialityCount.containsKey(app2List.get(i).getDolzhTabNumber()))
            {
                specialityCount.put(app2List.get(i).getDolzhTabNumber(), 1);
            }
            else
            {
                specialityCount.put(app2List.get(i).getDolzhTabNumber(), specialityCount.get(app2List.get(i).getDolzhTabNumber())+1);
            }
            Table5 tbl = new Table5(i+1, app2List.get(i).getQualificationDegreeTheme(), app2List.get(i).getPodrazdelenie(), 0, app2List.get(i).getQualificationDegreeBuild(), "");
            switch (monthkvartal.get(app2List.get(i).getMonthDegree())) {
                case 1:                   
                    table5_1.add(tbl);
                    table5_1allCount++;
                    break;
                case 2:
                    table5_2.add(tbl);
                    table5_2allCount++;
                    break;
                case 3:
                    table5_3.add(tbl);
                    table5_3allCount++;
                    break;
                case 4:
                    table5_4.add(tbl);
                    table5_4allCount++;
                    break;
            }
        }
    }

    public int getTable5_1allCount() {
        return table5_1allCount;
    }

    public void setTable5_1allCount(int table5_1allCount) {
        this.table5_1allCount = table5_1allCount;
    }

    public int getTable5_2allCount() {
        return table5_2allCount;
    }

    public void setTable5_2allCount(int table5_2allCount) {
        this.table5_2allCount = table5_2allCount;
    }

    public int getTable5_3allCount() {
        return table5_3allCount;
    }

    public void setTable5_3allCount(int table5_3allCount) {
        this.table5_3allCount = table5_3allCount;
    }

    public int getTable5_4allCount() {
        return table5_4allCount;
    }

    public void setTable5_4allCount(int table5_4allCount) {
        this.table5_4allCount = table5_4allCount;
    }

    
    
    public List<Table1> getTable4() {
        return table4;
    }

    public void setTable4(List<Table1> table4) {
        this.table4 = table4;
    }

    public int getTable4allCount() {
        return table4allCount;
    }

    public void setTable4allCount(int table4allCount) {
        this.table4allCount = table4allCount;
    }

    public List<Table1> getTable3() {
        return table3;
    }

    public void setTable3(List<Table1> table3) {
        this.table3 = table3;
    }

    public int getTable3allCount() {
        return table3allCount;
    }

    public void setTable3allCount(int table3allCount) {
        this.table3allCount = table3allCount;
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

    public List<Table1> getTable2() {
        return table2;
    }

    public void setTable2(List<Table1> table2) {
        this.table2 = table2;
    }

    public int getTable2allCount() {
        return table2allCount;
    }

    public void setTable2allCount(int table2allCount) {
        this.table2allCount = table2allCount;
    }

    public List<Table5> getTable5_1() {
        return table5_1;
    }

    public void setTable5_1(List<Table5> table5_1) {
        this.table5_1 = table5_1;
    }

    public List<Table5> getTable5_2() {
        return table5_2;
    }

    public void setTable5_2(List<Table5> table5_2) {
        this.table5_2 = table5_2;
    }

    public List<Table5> getTable5_3() {
        return table5_3;
    }

    public void setTable5_3(List<Table5> table5_3) {
        this.table5_3 = table5_3;
    }

    public List<Table5> getTable5_4() {
        return table5_4;
    }

    public void setTable5_4(List<Table5> table5_4) {
        this.table5_4 = table5_4;
    }

    public HashMap<String, Integer> getSpecialityCount() {
        return specialityCount;
    }

    public void setSpecialityCount(HashMap<String, Integer> specialityCount) {
        this.specialityCount = specialityCount;
    }
    
    
}
